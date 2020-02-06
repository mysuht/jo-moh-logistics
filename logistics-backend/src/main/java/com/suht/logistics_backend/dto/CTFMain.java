package com.suht.logistics_backend.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CTF_MAIN")
public class CTFMain {
	@Id
	@Column(name="CTF_MAIN_ID")
	Long id;
	
	@Column(name="P_DATE")
	LocalDateTime productDate;
	
	@Column(name="FACILITY_ID")
	int facilityId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getProductDate() {
		return productDate;
	}

	public void setProductDate(LocalDateTime productDate) {
		this.productDate = productDate;
	}

	public int getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}
	
	
}
