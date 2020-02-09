package com.suht.logistics_backend.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="CTF_MAIN")
public class CTFMain {
	@Id
	@Column(name="CTF_MAIN_ID")
	Long id;
	
	@Column(name="P_DATE")
	@DateTimeFormat(pattern = "mm/yyyy")
	LocalDate productDate;
	
	@Column(name="FACILITY_ID")
	int facilityId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getProductDate() {
		return productDate;
	}

	public void setProductDate(LocalDate productDate) {
		this.productDate = productDate;
	}

	public int getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}

	@Override
	public String toString() {
		return "CTFMain [id=" + id + ", productDate=" + productDate + ", facilityId=" + facilityId + "]";
	}
	
	
	
	
}
