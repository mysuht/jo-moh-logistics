package com.suht.logistics_backend.dao;

import java.util.List;

import com.suht.logistics_backend.dto.Facility;

public interface FacilityDAO {

	boolean add(Facility facility);
	boolean update(Facility facility);
	boolean delete(Facility facility);
	List<Facility> list();
	public List<Facility> listOfActiveFacilities() ;
	List<Facility> getFacilitiesByLevel(String level);
	public List<Facility> getFacilitiesByGroup(int facilityGroupId) ;
	Facility get(int id);
}
