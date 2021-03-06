package com.suht.logistics_backend.dao;

import java.util.List;

import com.suht.logistics_backend.dto.Facility;
import com.suht.logistics_backend.dto.FacilityType;

public interface FacilityTypeDAO {

	boolean add(FacilityType facilityType);
	boolean update(FacilityType facilityType);
	boolean delete(FacilityType facilityType);
	List<FacilityType> list();
	List<FacilityType> getFacilityTypeByFacilityLevel(String facilityLevel);
	FacilityType get(int id);
	FacilityType getFacilityTypeHierarchy(int facilityId);
}
