package com.suht.logistics_backend.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.suht.logistics_backend.dao.ProductDAO;
import com.suht.logistics_backend.dto.Product;

@Repository("ProductDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override	
	public boolean add(Product Product) {

		try {
			// ADD FACILITY_TYPE TO DB
			sessionFactory.getCurrentSession().persist(Product);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public List<Product> list() {		
		String activeFacilities = "from Product f ";
		Query query = sessionFactory.getCurrentSession().createQuery(activeFacilities);
		return query.getResultList();
	}

	/*
	 * GETTING SINGLE FACILITY BASED ON ID
	 */
	@Override
	public Product get(int id) {
		return sessionFactory.getCurrentSession().get(Product.class, Integer.valueOf(id));
	}

	@Override
	public boolean update(Product Product) {
		try {
			// update FACILITY_TYPE TO DB
			sessionFactory.getCurrentSession().update(Product);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Product Product) {
		Product.setActive("0");
		try {
			// update FACILITY TO DB
			sessionFactory.getCurrentSession().update(Product);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}


}
