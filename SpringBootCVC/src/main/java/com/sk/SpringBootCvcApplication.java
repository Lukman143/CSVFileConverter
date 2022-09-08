package com.sk;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.sk.model.DDDelivery;
import com.sk.model.DDDispatch;
import com.sk.model.DDOrder;

@SpringBootApplication
public class SpringBootCvcApplication {

	public static void main(String[] args) throws IOException {

		SpringApplication.run(SpringBootCvcApplication.class, args);

		List<DDOrder> dd_order = (List<DDOrder>) dd_order1("/home/lukman/dds/dd_order.csv", DDOrder.class);

		List<DDDispatch> dd_dispatch = (List<DDDispatch>) dd_order1("/home/lukman/dds/dd_dispatch.csv",
				DDDispatch.class);

		List<DDDelivery> dd_delivery = (List<DDDelivery>) dd_order1("/home/lukman/dds/dd_delivery.csv",
				DDDelivery.class);

		Map<String, List<DDDispatch>> ddDispatchMap = new HashMap<>();

		Map<String, List<DDDelivery>> ddDeliveryMap = new HashMap<>();

		Map<String, List<DDDelivery>> ddDispatchDeliveryMap = new HashMap<>();

		for (int i = 0; i < dd_order.size(); i++) {

			for (int j = 0; j < dd_dispatch.size(); j++) {

				if (Objects.equals(dd_order.get(i).getDocumentId(), dd_dispatch.get(j).getDocumentId())) {

					List<DDDispatch> ddDispatchModelList = new ArrayList<>();

					String key = dd_order.get(i).getControlId() + "-" + dd_order.get(i).getDocumentId();

					if (ddDispatchMap.containsKey(key)) {
						ddDispatchModelList = ddDispatchMap.get(key);
						ddDispatchModelList.add(dd_dispatch.get(j));

						ddDispatchMap.put(key, ddDispatchModelList);
					} else {
						ddDispatchModelList.add(dd_dispatch.get(j));
						ddDispatchMap.put(key, ddDispatchModelList);
					}

					for (int k = 0; k < dd_delivery.size(); k++) {
						if (Objects.equals(dd_dispatch.get(j).getShipmentId(), dd_delivery.get(k).getShipmentId())) {
							List<DDDelivery> dummyDeliveryList = new ArrayList<>();
							if (ddDeliveryMap.containsKey(key)) {
								dummyDeliveryList = ddDeliveryMap.get(key);
								dummyDeliveryList.add(dd_delivery.get(k));
								ddDeliveryMap.put(key, dummyDeliveryList);
							} else {
								dummyDeliveryList.add(dd_delivery.get(k));
								ddDeliveryMap.put(key, dummyDeliveryList);
							}

						}

					}
				}
			}
		}
		List<LinkedHashMap<String, Object>> ddResponse = new ArrayList<>();

		for (int l = 0; l < dd_order.size(); l++) {
			String key = dd_order.get(l).getControlId() + "-" + dd_order.get(l).getDocumentId();
			LinkedHashMap<String, Object> mappedItem = new LinkedHashMap<>();
			if (ddDispatchMap.containsKey(key)) {
				mappedItem.put("id", key);
				mappedItem.put("dd_order", dd_order.get(l));
				mappedItem.put("dd_dispatch", ddDispatchMap.get(key));
				if (ddDeliveryMap.containsKey(key)) {
					mappedItem.put("dd_delivery", ddDeliveryMap.get(key));
				}
			}
			if (!mappedItem.isEmpty()) {
				ddResponse.add(mappedItem);
			}
		}

		System.out.println(ddResponse);
	}
	/*
	 * ObjectMapper objectMapper = new ObjectMapper();
	 * 
	 * try { String json = objectMapper.writeValueAsString(ddDispatchMap);
	 * System.out.println(json);
	 * 
	 * 
	 * 
	 * } catch (JsonProcessingException e) { e.printStackTrace(); }
	 */

	static List<?> dd_order1(String path, Class c) {
		List<?> list = new ArrayList<>();
		File input = new File(path);
		try {
			CsvSchema csv = CsvSchema.emptySchema().withHeader();
			CsvMapper csvMapper = new CsvMapper();
			MappingIterator<?> mappingIterator = csvMapper.reader().forType(c).with(csv).readValues(input);
			list = mappingIterator.readAll();
			// System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
