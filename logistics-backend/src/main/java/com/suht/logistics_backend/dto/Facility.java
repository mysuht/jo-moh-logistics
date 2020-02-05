package com.suht.logistics_backend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FACILITY")
public class Facility {

	@Id
	@Column(name="FACILITY_ID")
	int id;
	
	@Column(name="FAC_CODE")
	String code;
	
	@Column(name="FAC_NAME")
	String name;
	
	@Column(name="FAC_TYPE_ID")
	Integer typeId;
	
	@Column(name="SUP_CODE")
	Integer supplierId;
	
	@Column(name="FAC_CONTACT")
	String contact;
	
	@Column(name="FAC_ADDRESS1")
	String address1;
	
	@Column(name="FAC_ADDRESS2")
	String address2;
	
	@Column(name="FAC_CITY")
	String city;
	
	@Column(name="FAC_STATE")
	String state;
	
	@Column(name="FAC_RESCODE")
	String rescode;
	
	@Column(name="FAC_PHONE")
	String phone;
	
	@Column(name="FAC_FAX")
	String fax;
	
	@Column(name="FIELD_DISPENSE")
	Integer fieldDespense;
	
	@Column(name="MAX_MOS")
	String maxMOS;
	
	@Column(name="MIN_MOS")
	String minMOS;
	
	@Column(name="ACTIVE")
	String active;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRescode() {
		return rescode;
	}

	public void setRescode(String rescode) {
		this.rescode = rescode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Integer getFieldDespense() {
		return fieldDespense;
	}

	public void setFieldDespense(Integer fieldDespense) {
		this.fieldDespense = fieldDespense;
	}

	public String getMaxMOS() {
		return maxMOS;
	}

	public void setMaxMOS(String maxMOS) {
		this.maxMOS = maxMOS;
	}

	public String getMinMOS() {
		return minMOS;
	}

	public void setMinMOS(String minMOS) {
		this.minMOS = minMOS;
	}

	public String isActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
	
	
}
