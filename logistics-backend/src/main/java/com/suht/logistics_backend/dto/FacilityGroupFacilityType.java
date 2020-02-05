package com.suht.logistics_backend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GROUP_OF_FACILITIES")
public class FacilityGroupFacilityType {
	@Id
	@Column(name="GOF_ID")
	int id;
	
	@Column(name="GOF_FACILITY_ID")
	Integer facilityTypeId;
	
	@Column(name="GOF_GRP_ID")
	Integer facilityGroupId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getFacilityTypeId() {
		return facilityTypeId;
	}

	public void setFacilityTypeId(Integer facilityTypeId) {
		this.facilityTypeId = facilityTypeId;
	}

	public Integer getFacilityGroupId() {
		return facilityGroupId;
	}

	public void setFacilityGroupId(Integer facilityGroupId) {
		this.facilityGroupId = facilityGroupId;
	}
	
	

}
