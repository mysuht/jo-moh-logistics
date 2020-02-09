package com.suht.logistics_backend.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.suht.logistics_backend.dao.FacilityGroupDAO;
import com.suht.logistics_backend.dto.Facility;
import com.suht.logistics_backend.dto.FacilityGroup;

@Repository("FacilityGroupDAO")
@Transactional
public class FacilityGroupDAOImpl implements FacilityGroupDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override	
	public boolean add(FacilityGroup FacilityGroup) {

		try {
			// ADD FACILITY_TYPE TO DB
			sessionFactory.getCurrentSession().persist(FacilityGroup);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public List<FacilityGroup> list() {		
		String activeFacilities = "from FacilityGroup f ";
		Query query = sessionFactory.getCurrentSession().createQuery(activeFacilities);
		return query.getResultList();
	}

	/*
	 * GETTING SINGLE FACILITY BASED ON ID
	 */
	@Override
	public FacilityGroup get(int id) {
		return sessionFactory.getCurrentSession().get(FacilityGroup.class, Integer.valueOf(id));
	}

	@Override
	public boolean update(FacilityGroup FacilityGroup) {
		try {
			// update FACILITY_TYPE TO DB
			sessionFactory.getCurrentSession().update(FacilityGroup);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(FacilityGroup FacilityGroup) {
		//FacilityGroup.setType("0");
		try {
			// update FACILITY TO DB
			sessionFactory.getCurrentSession().update(FacilityGroup);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	

}
