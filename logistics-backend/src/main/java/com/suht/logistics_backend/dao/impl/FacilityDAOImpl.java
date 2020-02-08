package com.suht.logistics_backend.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.suht.logistics_backend.dao.FacilityDAO;
import com.suht.logistics_backend.dto.Facility;

@SuppressWarnings({ "rawtypes", "unchecked" })
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
	public List<Facility> listOfActiveFacilities() {
		String activeFacilities = "from Facility f where f.active = :active ";
		Query query = sessionFactory.getCurrentSession().createQuery(activeFacilities);
		query.setParameter("active", "1");
		return query.getResultList();
	}
	
	@Override
	public List<Facility> list() {
		String activeFacilities = "from Facility f ";
		Query query = sessionFactory.getCurrentSession().createQuery(activeFacilities);
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

	@Override
	public List<Facility> getFacilitiesByLevel(String level) {
		String activeFacilities = "";
		activeFacilities += " select f from ";
		activeFacilities += " Facility f inner join FacilityType ft on f.typeId = ft.id ";
		activeFacilities += " where f.active = :active ";
		activeFacilities += " and ft.type = :typeHierarchy ";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(activeFacilities);
		query.setParameter("active", "1");
		query.setParameter("typeHierarchy", level);
		return query.getResultList();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Facility> getFacilitiesByGroup(int facilityGroupId) {
		String activeFacilities = "";
		activeFacilities += " select f from ";
		activeFacilities += " Facility f inner join FacilityType ft on f.typeId = ft.id ";
		activeFacilities += " inner join FacilityGroupFacilityType ftg on ftg.facilityTypeId = ft.id ";
		activeFacilities += "  join FacilityGroup fg on fg.id = ftg.facilityGroupId ";
		activeFacilities += " where ";
		activeFacilities += " f.active = 1 ";
		activeFacilities += " and fg.id = :facilityGroupId ";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(activeFacilities);
		query.setParameter("facilityGroupId", facilityGroupId);
		return query.getResultList();
	}

}
