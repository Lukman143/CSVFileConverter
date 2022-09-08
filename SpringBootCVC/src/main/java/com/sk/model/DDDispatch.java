
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
@JsonPropertyOrder({
"documentId",
"documentLineNo",
"status",
"brand",
"lineCode",
"partNumber",
"originalPartNumber",
"orginalLineCode",
"description",
"message",
"unitOfMeasure",
"originalQty",
"actualQty",
"costPrice",
"coreCost",
"costOther",
"costOtherDesc",
"vehicleId",
"shipmentId",
"createdDate",
"controlId",
"uid"
})
@Generated("jsonschema2pojo")
public class DDDispatch {

@JsonProperty("documentId")
private String documentId;
@JsonProperty("documentLineNo")
private String documentLineNo;
@JsonProperty("status")
private String status;
@JsonProperty("brand")
private String brand;
@JsonProperty("lineCode")
private String lineCode;
@JsonProperty("partNumber")
private String partNumber;
@JsonProperty("originalPartNumber")
private String originalPartNumber;
@JsonProperty("orginalLineCode")
private String orginalLineCode;
@JsonProperty("description")
private String description;
@JsonProperty("message")
private String message;
@JsonProperty("unitOfMeasure")
private String unitOfMeasure;
@JsonProperty("originalQty")
private String originalQty;
@JsonProperty("actualQty")
private String actualQty;
@JsonProperty("costPrice")
private String costPrice;
@JsonProperty("coreCost")
private String coreCost;
@JsonProperty("costOther")
private String costOther;
@JsonProperty("costOtherDesc")
private String costOtherDesc;
@JsonProperty("vehicleId")
private String vehicleId;
@JsonProperty("shipmentId")
private String shipmentId;
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
	return "DDDispatch [documentId=" + documentId + ", documentLineNo=" + documentLineNo + ", status=" + status
			+ ", brand=" + brand + ", lineCode=" + lineCode + ", partNumber=" + partNumber + ", originalPartNumber="
			+ originalPartNumber + ", orginalLineCode=" + orginalLineCode + ", description=" + description
			+ ", message=" + message + ", unitOfMeasure=" + unitOfMeasure + ", originalQty=" + originalQty
			+ ", actualQty=" + actualQty + ", costPrice=" + costPrice + ", coreCost=" + coreCost + ", costOther="
			+ costOther + ", costOtherDesc=" + costOtherDesc + ", vehicleId=" + vehicleId + ", shipmentId=" + shipmentId
			+ ", createdDate=" + createdDate + ", controlId=" + controlId + ", uid=" + uid + "]";
}

@JsonProperty("documentId")
public String getDocumentId() {
return documentId;
}

@JsonProperty("documentId")
public void setDocumentId(String documentId) {
this.documentId = documentId;
}

@JsonProperty("documentLineNo")
public String getDocumentLineNo() {
return documentLineNo;
}

@JsonProperty("documentLineNo")
public void setDocumentLineNo(String documentLineNo) {
this.documentLineNo = documentLineNo;
}

@JsonProperty("status")
public String getStatus() {
return status;
}

@JsonProperty("status")
public void setStatus(String status) {
this.status = status;
}

@JsonProperty("brand")
public String getBrand() {
return brand;
}

@JsonProperty("brand")
public void setBrand(String brand) {
this.brand = brand;
}

@JsonProperty("lineCode")
public String getLineCode() {
return lineCode;
}

@JsonProperty("lineCode")
public void setLineCode(String lineCode) {
this.lineCode = lineCode;
}

@JsonProperty("partNumber")
public String getPartNumber() {
return partNumber;
}

@JsonProperty("partNumber")
public void setPartNumber(String partNumber) {
this.partNumber = partNumber;
}

@JsonProperty("originalPartNumber")
public String getOriginalPartNumber() {
return originalPartNumber;
}

@JsonProperty("originalPartNumber")
public void setOriginalPartNumber(String originalPartNumber) {
this.originalPartNumber = originalPartNumber;
}

@JsonProperty("orginalLineCode")
public String getOrginalLineCode() {
return orginalLineCode;
}

@JsonProperty("orginalLineCode")
public void setOrginalLineCode(String orginalLineCode) {
this.orginalLineCode = orginalLineCode;
}

@JsonProperty("description")
public String getDescription() {
return description;
}

@JsonProperty("description")
public void setDescription(String description) {
this.description = description;
}

@JsonProperty("message")
public String getMessage() {
return message;
}

@JsonProperty("message")
public void setMessage(String message) {
this.message = message;
}

@JsonProperty("unitOfMeasure")
public String getUnitOfMeasure() {
return unitOfMeasure;
}

@JsonProperty("unitOfMeasure")
public void setUnitOfMeasure(String unitOfMeasure) {
this.unitOfMeasure = unitOfMeasure;
}

@JsonProperty("originalQty")
public String getOriginalQty() {
return originalQty;
}

@JsonProperty("originalQty")
public void setOriginalQty(String originalQty) {
this.originalQty = originalQty;
}

@JsonProperty("actualQty")
public String getActualQty() {
return actualQty;
}

@JsonProperty("actualQty")
public void setActualQty(String actualQty) {
this.actualQty = actualQty;
}

@JsonProperty("costPrice")
public String getCostPrice() {
return costPrice;
}

@JsonProperty("costPrice")
public void setCostPrice(String costPrice) {
this.costPrice = costPrice;
}

@JsonProperty("coreCost")
public String getCoreCost() {
return coreCost;
}

@JsonProperty("coreCost")
public void setCoreCost(String coreCost) {
this.coreCost = coreCost;
}

@JsonProperty("costOther")
public String getCostOther() {
return costOther;
}

@JsonProperty("costOther")
public void setCostOther(String costOther) {
this.costOther = costOther;
}

@JsonProperty("costOtherDesc")
public String getCostOtherDesc() {
return costOtherDesc;
}

@JsonProperty("costOtherDesc")
public void setCostOtherDesc(String costOtherDesc) {
this.costOtherDesc = costOtherDesc;
}

@JsonProperty("vehicleId")
public String getVehicleId() {
return vehicleId;
}

@JsonProperty("vehicleId")
public void setVehicleId(String vehicleId) {
this.vehicleId = vehicleId;
}

@JsonProperty("shipmentId")
public String getShipmentId() {
return shipmentId;
}

@JsonProperty("shipmentId")
public void setShipmentId(String shipmentId) {
this.shipmentId = shipmentId;
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