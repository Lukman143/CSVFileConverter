package com.sk.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "documentId", "status", "orderNumber", "orderDate", "invoiceNumber", "invoiceDate",
		"expectedDeliveryTime", "confirmationNumber", "purchaseOrderNumber", "comments", "customerName", "customerId",
		"sellFromId", "sellFromName", "shipFromId", "shipFromName", "shipFromAddress", "sellToId", "sellToName",
		"shipToId", "shipToName", "shipToAddress", "shipInstructions", "shipVia", "origin", "totalCount", "totalCost",
		"totalCore", "createdDate", "controlId", "uid" })
@Generated("jsonschema2pojo")
public class DDOrder {

	@JsonProperty("documentId")
	private String documentId;
	@JsonProperty("status")
	private String status;
	@JsonProperty("orderNumber")
	private String orderNumber;
	@JsonProperty("orderDate")
	private String orderDate;
	@JsonProperty("invoiceNumber")
	private String invoiceNumber;
	@JsonProperty("invoiceDate")
	private String invoiceDate;
	@JsonProperty("expectedDeliveryTime")
	private String expectedDeliveryTime;
	@JsonProperty("confirmationNumber")
	private String confirmationNumber;
	@JsonProperty("purchaseOrderNumber")
	private String purchaseOrderNumber;
	@JsonProperty("comments")
	private String comments;
	@JsonProperty("customerName")
	private String customerName;
	@JsonProperty("customerId")
	private String customerId;
	@JsonProperty("sellFromId")
	private String sellFromId;
	@JsonProperty("sellFromName")
	private String sellFromName;
	@JsonProperty("shipFromId")
	private String shipFromId;
	@JsonProperty("shipFromName")
	private String shipFromName;
	@JsonProperty("shipFromAddress")
	private String shipFromAddress;
	@JsonProperty("sellToId")
	private String sellToId;
	@JsonProperty("sellToName")
	private String sellToName;
	@JsonProperty("shipToId")
	private String shipToId;
	@JsonProperty("shipToName")
	private String shipToName;
	@JsonProperty("shipToAddress")
	private String shipToAddress;
	@JsonProperty("shipInstructions")
	private String shipInstructions;
	@JsonProperty("shipVia")
	private String shipVia;
	@JsonProperty("origin")
	private String origin;
	@JsonProperty("totalCount")
	private String totalCount;
	@JsonProperty("totalCost")
	private String totalCost;
	@JsonProperty("totalCore")
	private String totalCore;
	@JsonProperty("createdDate")
	private String createdDate;
	@Override
	public String toString() {
		return "DDOrder [documentId=" + documentId + ", status=" + status + ", orderNumber=" + orderNumber
				+ ", orderDate=" + orderDate + ", invoiceNumber=" + invoiceNumber + ", invoiceDate=" + invoiceDate
				+ ", expectedDeliveryTime=" + expectedDeliveryTime + ", confirmationNumber=" + confirmationNumber
				+ ", purchaseOrderNumber=" + purchaseOrderNumber + ", comments=" + comments + ", customerName="
				+ customerName + ", customerId=" + customerId + ", sellFromId=" + sellFromId + ", sellFromName="
				+ sellFromName + ", shipFromId=" + shipFromId + ", shipFromName=" + shipFromName + ", shipFromAddress="
				+ shipFromAddress + ", sellToId=" + sellToId + ", sellToName=" + sellToName + ", shipToId=" + shipToId
				+ ", shipToName=" + shipToName + ", shipToAddress=" + shipToAddress + ", shipInstructions="
				+ shipInstructions + ", shipVia=" + shipVia + ", origin=" + origin + ", totalCount=" + totalCount
				+ ", totalCost=" + totalCost + ", totalCore=" + totalCore + ", createdDate=" + createdDate
				+ ", controlId=" + controlId + ", uid=" + uid + "]";
	}

	@JsonProperty("controlId")
	private String controlId;
	@JsonProperty("uid")
	private String uid;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("documentId")
	public String getDocumentId() {
		return documentId;
	}

	@JsonProperty("documentId")
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("orderNumber")
	public String getOrderNumber() {
		return orderNumber;
	}

	@JsonProperty("orderNumber")
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	@JsonProperty("orderDate")
	public String getOrderDate() {
		return orderDate;
	}

	@JsonProperty("orderDate")
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@JsonProperty("invoiceNumber")
	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	@JsonProperty("invoiceNumber")
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	@JsonProperty("invoiceDate")
	public String getInvoiceDate() {
		return invoiceDate;
	}

	@JsonProperty("invoiceDate")
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	@JsonProperty("expectedDeliveryTime")
	public String getExpectedDeliveryTime() {
		return expectedDeliveryTime;
	}

	@JsonProperty("expectedDeliveryTime")
	public void setExpectedDeliveryTime(String expectedDeliveryTime) {
		this.expectedDeliveryTime = expectedDeliveryTime;
	}

	@JsonProperty("confirmationNumber")
	public String getConfirmationNumber() {
		return confirmationNumber;
	}

	@JsonProperty("confirmationNumber")
	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	@JsonProperty("purchaseOrderNumber")
	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}

	@JsonProperty("purchaseOrderNumber")
	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}

	@JsonProperty("comments")
	public String getComments() {
		return comments;
	}

	@JsonProperty("comments")
	public void setComments(String comments) {
		this.comments = comments;
	}

	@JsonProperty("customerName")
	public String getCustomerName() {
		return customerName;
	}

	@JsonProperty("customerName")
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@JsonProperty("customerId")
	public String getCustomerId() {
		return customerId;
	}

	@JsonProperty("customerId")
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@JsonProperty("sellFromId")
	public String getSellFromId() {
		return sellFromId;
	}

	@JsonProperty("sellFromId")
	public void setSellFromId(String sellFromId) {
		this.sellFromId = sellFromId;
	}

	@JsonProperty("sellFromName")
	public String getSellFromName() {
		return sellFromName;
	}

	@JsonProperty("sellFromName")
	public void setSellFromName(String sellFromName) {
		this.sellFromName = sellFromName;
	}

	@JsonProperty("shipFromId")
	public String getShipFromId() {
		return shipFromId;
	}

	@JsonProperty("shipFromId")
	public void setShipFromId(String shipFromId) {
		this.shipFromId = shipFromId;
	}

	@JsonProperty("shipFromName")
	public String getShipFromName() {
		return shipFromName;
	}

	@JsonProperty("shipFromName")
	public void setShipFromName(String shipFromName) {
		this.shipFromName = shipFromName;
	}

	@JsonProperty("shipFromAddress")
	public String getShipFromAddress() {
		return shipFromAddress;
	}

	@JsonProperty("shipFromAddress")
	public void setShipFromAddress(String shipFromAddress) {
		this.shipFromAddress = shipFromAddress;
	}

	@JsonProperty("sellToId")
	public String getSellToId() {
		return sellToId;
	}

	@JsonProperty("sellToId")
	public void setSellToId(String sellToId) {
		this.sellToId = sellToId;
	}

	@JsonProperty("sellToName")
	public String getSellToName() {
		return sellToName;
	}

	@JsonProperty("sellToName")
	public void setSellToName(String sellToName) {
		this.sellToName = sellToName;
	}

	@JsonProperty("shipToId")
	public String getShipToId() {
		return shipToId;
	}

	@JsonProperty("shipToId")
	public void setShipToId(String shipToId) {
		this.shipToId = shipToId;
	}

	@JsonProperty("shipToName")
	public String getShipToName() {
		return shipToName;
	}

	@JsonProperty("shipToName")
	public void setShipToName(String shipToName) {
		this.shipToName = shipToName;
	}

	@JsonProperty("shipToAddress")
	public String getShipToAddress() {
		return shipToAddress;
	}

	@JsonProperty("shipToAddress")
	public void setShipToAddress(String shipToAddress) {
		this.shipToAddress = shipToAddress;
	}

	@JsonProperty("shipInstructions")
	public String getShipInstructions() {
		return shipInstructions;
	}

	@JsonProperty("shipInstructions")
	public void setShipInstructions(String shipInstructions) {
		this.shipInstructions = shipInstructions;
	}

	@JsonProperty("shipVia")
	public String getShipVia() {
		return shipVia;
	}

	@JsonProperty("shipVia")
	public void setShipVia(String shipVia) {
		this.shipVia = shipVia;
	}

	@JsonProperty("origin")
	public String getOrigin() {
		return origin;
	}

	@JsonProperty("origin")
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@JsonProperty("totalCount")
	public String getTotalCount() {
		return totalCount;
	}

	@JsonProperty("totalCount")
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	@JsonProperty("totalCost")
	public String getTotalCost() {
		return totalCost;
	}

	@JsonProperty("totalCost")
	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}

	@JsonProperty("totalCore")
	public String getTotalCore() {
		return totalCore;
	}

	@JsonProperty("totalCore")
	public void setTotalCore(String totalCore) {
		this.totalCore = totalCore;
	}

	@JsonProperty("createdDate")
	public String getCreatedDate() {
		return createdDate;
	}

	@JsonProperty("createdDate")
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@JsonProperty("controlId")
	public String getControlId() {
		return controlId;
	}

	@JsonProperty("controlId")
	public void setControlId(String controlId) {
		this.controlId = controlId;
	}

	@JsonProperty("uid")
	public String getUid() {
		return uid;
	}

	@JsonProperty("uid")
	public void setUid(String uid) {
		this.uid = uid;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}