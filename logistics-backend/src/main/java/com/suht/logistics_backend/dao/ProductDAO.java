package com.suht.logistics_backend.dao;

import java.util.List;


import com.suht.logistics_backend.dto.Product;

public interface ProductDAO {

	boolean add(Product Product);
	boolean update(Product Product);
	boolean delete(Product Product);
	List<Product> list();
	Product get(int id);
}
