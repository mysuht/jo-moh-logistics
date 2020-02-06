package com.suht.logistics_backend.dao;

import java.time.LocalDateTime;
import java.util.List;


import com.suht.logistics_backend.dto.CTFMain;

public interface CTFMainDAO {

	boolean add(CTFMain CTFMain);
	boolean update(CTFMain CTFMain);
	boolean delete(CTFMain CTFMain);
	List<CTFMain> list();
	List<CTFMain> getCTFByDateBetween(LocalDateTime from, LocalDateTime to);
	CTFMain get(int id);
}
