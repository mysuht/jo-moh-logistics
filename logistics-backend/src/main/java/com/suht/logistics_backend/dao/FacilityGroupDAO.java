package com.suht.logistics_backend.dao;

import java.util.List;

import com.suht.logistics_backend.dto.FacilityGroup;

public interface FacilityGroupDAO {

	boolean add(FacilityGroup FacilityGroup);
	boolean update(FacilityGroup FacilityGroup);
	boolean delete(FacilityGroup FacilityGroup);
	List<FacilityGroup> list();
	FacilityGroup get(int id);
}
