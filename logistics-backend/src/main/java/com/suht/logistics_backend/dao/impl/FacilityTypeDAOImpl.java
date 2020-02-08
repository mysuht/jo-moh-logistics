package com.suht.logistics_backend.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.suht.logistics_backend.dao.FacilityTypeDAO;
import com.suht.logistics_backend.dto.Facility;
import com.suht.logistics_backend.dto.FacilityType;

@Repository("facilityTypeDAO")
@Transactional
public class FacilityTypeDAOImpl implements FacilityTypeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override	
	public boolean add(FacilityType facilityType) {

		try {
			// ADD FACILITY_TYPE TO DB
			sessionFactory.getCurrentSession().persist(facilityType);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public List<FacilityType> list() {		
		String activeFacilities = "from FacilityType f ";
		Query query = sessionFactory.getCurrentSession().createQuery(activeFacilities);
		return query.getResultList();
	}

	/*
	 * GETTING SINGLE FACILITY BASED ON ID
	 */
	@Override
	public FacilityType get(int id) {
		return sessionFactory.getCurrentSession().get(FacilityType.class, Integer.valueOf(id));
	}

	@Override
	public boolean update(FacilityType facilityType) {
		try {
			// update FACILITY_TYPE TO DB
			sessionFactory.getCurrentSession().update(facilityType);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(FacilityType facilityType) {
		facilityType.setType("0");
		try {
			// update FACILITY TO DB
			sessionFactory.getCurrentSession().update(facilityType);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<FacilityType> getFacilityTypeByFacilityLevel(String facilityLevel) {
		String activeFacilities = "from FacilityType f where f.type = :type ";
		Query query = sessionFactory.getCurrentSession().createQuery(activeFacilities);
		query.setParameter("type", facilityLevel);
		return query.getResultList();
	}

	@Override
	public FacilityType getFacilityTypeHierarchy(int facilityId) {
		String activeFacilities = "select ft from FacilityType ft ";
		activeFacilities += " inner join Facility f ";
		activeFacilities += " on ft.id = f.typeId ";
		activeFacilities += " where f.id = :facilityId";
		Query query = sessionFactory.getCurrentSession().createQuery(activeFacilities);
		query.setParameter("facilityId", facilityId);
		return (FacilityType) query.getSingleResult();
	}
	

}
