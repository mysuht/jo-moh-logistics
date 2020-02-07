package com.suht.logistics_backend.dao.impl;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.suht.logistics_backend.dao.CTFItemDAO;
import com.suht.logistics_backend.dto.CTFItem;
import com.suht.logistics_backend.dto.CTFMain;
import com.suht.logistics_backend.dto.Product;

@Repository("CTFItemDAO")
@Transactional
public class CTFItemDAOImpl implements CTFItemDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override	
	public boolean add(CTFItem CTFItem) {

		try {
			// ADD FACILITY_TYPE TO DB
			sessionFactory.getCurrentSession().persist(CTFItem);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public List<CTFItem> list() {		
		String activeFacilities = "from CTFItem f ";
		Query query = sessionFactory.getCurrentSession().createQuery(activeFacilities);
		return query.getResultList();
	}

	/*
	 * GETTING SINGLE FACILITY BASED ON ID
	 */
	@Override
	public CTFItem get(int id) {
		return sessionFactory.getCurrentSession().get(CTFItem.class, Integer.valueOf(id));
	}

	@Override
	public boolean update(CTFItem CTFItem) {
		try {
			// update FACILITY_TYPE TO DB
			sessionFactory.getCurrentSession().update(CTFItem);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(CTFItem CTFItem) {
		CTFItem.setId(0L);
		try {
			// update FACILITY TO DB
			sessionFactory.getCurrentSession().update(CTFItem);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<CTFItem> getProductsByCTFMain(CTFMain ctfMain) {
		String activeFacilities = "from CTFItem f where f.ctfMainId = :ctfMainId ";
		Query query = sessionFactory.getCurrentSession().createQuery(activeFacilities);
		query.setParameter("ctfMainId", ctfMain.getId());
		return query.getResultList();
	}

	@Override
	public CTFItem getProductItem(CTFMain ctfMain, Product product) {
		String activeFacilities = "from CTFItem f where f.ctfMainId = :ctfMainId and productId =  :productId";
		Query query = sessionFactory.getCurrentSession().createQuery(activeFacilities);
		query.setParameter("ctfMainId", ctfMain.getId());
		query.setParameter("productId", product.getId());
		return (CTFItem) query.getSingleResult();
	}



}
