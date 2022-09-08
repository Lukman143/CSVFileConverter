package com.sk.model;

import java.util.List;

import lombok.Data;

@Data
public class Response {

	List<DDOrder> dd_order;
	List<DDDispatch> dd_dispatch;
	List<DDDelivery> dd_delivery;
}
