package com.suht.log.web.bean;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

public class Report {
	@NotEmpty
	String category;
	List<String> facilityTypeOrGroupList;
	Date dateFrom;
	Date dateTo;
	
	
	public Report() {
		
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<String> getFacilityTypeOrGroupList() {
		return facilityTypeOrGroupList;
	}
	public void setFacilityTypeOrGroupList(List<String> facilityTypeOrGroupList) {
		this.facilityTypeOrGroupList = facilityTypeOrGroupList;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
}
