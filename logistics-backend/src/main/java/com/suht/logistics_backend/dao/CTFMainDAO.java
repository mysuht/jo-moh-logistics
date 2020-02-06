package com.suht.logistics_backend.dao;

import java.time.LocalDateTime;
import java.util.List;


import com.suht.logistics_backend.dto.CTFMain;
import com.suht.logistics_backend.dto.Facility;

public interface CTFMainDAO {

	boolean add(CTFMain CTFMain);
	boolean update(CTFMain CTFMain);
	boolean delete(CTFMain CTFMain);
	List<CTFMain> list();
	List<CTFMain> getCTFByDateBetween(LocalDateTime from, LocalDateTime to);
	List<CTFMain> getCTFByDateBetweenDescOrder(LocalDateTime from, LocalDateTime to);
	List<CTFMain> getCTFByDateBetweenAscOrder(LocalDateTime from, LocalDateTime to);
	
	List<CTFMain> getFacilityCTFByDateBetweenDescOrder(Facility facility, LocalDateTime from, LocalDateTime to);
	List<CTFMain> getFacilityCTFByDateBetweenAscOrder(Facility facility, LocalDateTime from, LocalDateTime to);
	CTFMain get(int id);
}
