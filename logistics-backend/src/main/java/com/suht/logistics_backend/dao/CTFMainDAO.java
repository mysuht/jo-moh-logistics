package com.suht.logistics_backend.dao;

import java.time.LocalDate;
import java.util.List;


import com.suht.logistics_backend.dto.CTFMain;
import com.suht.logistics_backend.dto.Facility;

public interface CTFMainDAO {

	boolean add(CTFMain CTFMain);
	boolean update(CTFMain CTFMain);
	boolean delete(CTFMain CTFMain);
	List<CTFMain> list();
	List<CTFMain> getCTFByDateBetween(LocalDate from, LocalDate to);
	List<CTFMain> getCTFByDateBetweenDescOrder(LocalDate from, LocalDate to);
	List<CTFMain> getCTFByDateBetweenAscOrder(LocalDate from, LocalDate to);
	
	List<CTFMain> getFacilityCTFByDateBetweenDescOrder(Facility facility, LocalDate from, LocalDate to);
	List<CTFMain> getFacilityCTFByDateBetweenAscOrder(Facility facility, LocalDate from, LocalDate to);
	CTFMain get(Long id);
}
