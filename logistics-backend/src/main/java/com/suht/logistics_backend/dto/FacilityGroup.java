package com.suht.logistics_backend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GROUPS")
public class FacilityGroup {
	
	@Id
	@Column(name="GRP_ID")
	int id;
	
	@Column(name="GRP_DESC")
	String name;

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
	

}
