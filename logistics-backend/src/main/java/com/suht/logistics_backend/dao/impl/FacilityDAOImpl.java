package com.suht.logistics_backend.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.suht.logistics_backend.dao.FacilityDAO;
import com.suht.logistics_backend.dto.Facility;

@Repository("facilityDAO")
@Transactional
public class FacilityDAOImpl implements FacilityDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override	
	public boolean add(Facility facility) {

		try {
			// ADD FACILITY TO DB
			sessionFactory.getCurrentSession().persist(facility);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public List<Facility> list() {		
		String activeFacilities = "from Facility f where f.active = :active ";
		Query query = sessionFactory.getCurrentSession().createQuery(activeFacilities);
		query.setParameter("active", "1");
		return query.getResultList();
	}

	/*
	 * GETTING SINGLE FACILITY BASED ON ID
	 */
	@Override
	public Facility get(int id) {
		return sessionFactory.getCurrentSession().get(Facility.class, id);
	}

	@Override
	public boolean update(Facility facility) {
		try {
			// update FACILITY TO DB
			sessionFactory.getCurrentSession().update(facility);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean delete(Facility facility) {
		facility.setActive("0");
		try {
			// update FACILITY TO DB
			sessionFactory.getCurrentSession().update(facility);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
