package com.suht.logistics_backend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FAC_TYPE")
public class FacilityType {
	@Id
	@Column(name="FAC_TYPE_ID")
	int id;
	
	@Column(name="FAC_NAME")
	String name;
	
	@Column(name="TYPE_HIERARCHY")
	String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
		
}
