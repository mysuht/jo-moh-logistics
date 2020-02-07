package com.suht.logistics_backend.dao;

import java.time.LocalDate;
import java.util.List;


import com.suht.logistics_backend.dto.CTFItem;
import com.suht.logistics_backend.dto.CTFMain;
import com.suht.logistics_backend.dto.Product;

public interface CTFItemDAO {

	boolean add(CTFItem CTFItem);
	boolean update(CTFItem CTFItem);
	boolean delete(CTFItem CTFItem);
	List<CTFItem> list();
	List<CTFItem> getProductsByCTFMain(CTFMain ctfMain);
	CTFItem get(int id);
	CTFItem getProductItem(CTFMain ctfMain, Product product);
}
