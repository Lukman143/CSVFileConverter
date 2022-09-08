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
@JsonPropertyOrder({ "shipmentId", "vehicleId", "status", "timeStamp", "driver", "message", "expectedDeliveryTime",
		"actualDeliveryTime", "receivedBy", "latitude", "longitude", "createdDate", "controlId", "uid" })
@Generated("jsonschema2pojo")
public class DDDelivery {

	@JsonProperty("shipmentId")
	private String shipmentId;
	@JsonProperty("vehicleId")
	private String vehicleId;
	@JsonProperty("status")
	private String status;
	@JsonProperty("timeStamp")
	private String timeStamp;
	@JsonProperty("driver")
	private String driver;
	@JsonProperty("message")
	private String message;
	@JsonProperty("expectedDeliveryTime")
	private String expectedDeliveryTime;
	@JsonProperty("actualDeliveryTime")
	private String actualDeliveryTime;
	@JsonProperty("receivedBy")
	private String receivedBy;
	@JsonProperty("latitude")
	private String latitude;
	@JsonProperty("longitude")
	private String longitude;
	@JsonProperty("createdDate")
	private String createdDate;
	@JsonProperty("controlId")
	private String controlId;
	@JsonProperty("uid")
	private String uid;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	
	
	@Override
	public String toString() {
		return "DDDelivery [shipmentId=" + shipmentId + ", vehicleId=" + vehicleId + ", status=" + status
				+ ", timeStamp=" + timeStamp + ", driver=" + driver + ", message=" + message + ", expectedDeliveryTime="
				+ expectedDeliveryTime + ", actualDeliveryTime=" + actualDeliveryTime + ", receivedBy=" + receivedBy
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", createdDate=" + createdDate
				+ ", controlId=" + controlId + ", uid=" + uid + "]";
	}

	@JsonProperty("shipmentId")
	public String getShipmentId() {
		return shipmentId;
	}

	@JsonProperty("shipmentId")
	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}

	@JsonProperty("vehicleId")
	public String getVehicleId() {
		return vehicleId;
	}

	@JsonProperty("vehicleId")
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("timeStamp")
	public String getTimeStamp() {
		return timeStamp;
	}

	@JsonProperty("timeStamp")
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@JsonProperty("driver")
	public String getDriver() {
		return driver;
	}

	@JsonProperty("driver")
	public void setDriver(String driver) {
		this.driver = driver;
	}

	@JsonProperty("message")
	public String getMessage() {
		return message;
	}

	@JsonProperty("message")
	public void setMessage(String message) {
		this.message = message;
	}

	@JsonProperty("expectedDeliveryTime")
	public String getExpectedDeliveryTime() {
		return expectedDeliveryTime;
	}

	@JsonProperty("expectedDeliveryTime")
	public void setExpectedDeliveryTime(String expectedDeliveryTime) {
		this.expectedDeliveryTime = expectedDeliveryTime;
	}

	@JsonProperty("actualDeliveryTime")
	public String getActualDeliveryTime() {
		return actualDeliveryTime;
	}

	@JsonProperty("actualDeliveryTime")
	public void setActualDeliveryTime(String actualDeliveryTime) {
		this.actualDeliveryTime = actualDeliveryTime;
	}

	@JsonProperty("receivedBy")
	public String getReceivedBy() {
		return receivedBy;
	}

	@JsonProperty("receivedBy")
	public void setReceivedBy(String receivedBy) {
		this.receivedBy = receivedBy;
	}

	@JsonProperty("latitude")
	public String getLatitude() {
		return latitude;
	}

	@JsonProperty("latitude")
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@JsonProperty("longitude")
	public String getLongitude() {
		return longitude;
	}

	@JsonProperty("longitude")
	public void setLongitude(String longitude) {
		this.longitude = longitude;
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
