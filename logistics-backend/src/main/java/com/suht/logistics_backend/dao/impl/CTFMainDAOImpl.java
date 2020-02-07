package com.suht.logistics_backend.dao.impl;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.suht.logistics_backend.dao.CTFMainDAO;
import com.suht.logistics_backend.dto.CTFMain;
import com.suht.logistics_backend.dto.Facility;

@Repository("CTFMainDAO")
@Transactional
public class CTFMainDAOImpl implements CTFMainDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override	
	public boolean add(CTFMain CTFMain) {

		try {
			// ADD FACILITY_TYPE TO DB
			sessionFactory.getCurrentSession().persist(CTFMain);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public List<CTFMain> list() {		
		String activeFacilities = "from CTFMain f ";
		Query query = sessionFactory.getCurrentSession().createQuery(activeFacilities);
		return query.getResultList();
	}

	/*
	 * GETTING SINGLE FACILITY BASED ON ID
	 */
	@Override
	public CTFMain get(Long id) {
		return sessionFactory.getCurrentSession().get(CTFMain.class, Long.valueOf(id));
	}

	@Override
	public boolean update(CTFMain CTFMain) {
		try {
			// update FACILITY_TYPE TO DB
			sessionFactory.getCurrentSession().update(CTFMain);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(CTFMain CTFMain) {
		CTFMain.setId(0L);
		try {
			// update FACILITY TO DB
			sessionFactory.getCurrentSession().update(CTFMain);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<CTFMain> getCTFByDateBetween(LocalDate from, LocalDate to) {
		String activeFacilities = "from CTFMain f where f.productDate between :productDateFrom and :productDateTo ";
		Query query = sessionFactory.getCurrentSession().createQuery(activeFacilities);
		query.setParameter("productDateFrom", from);
		query.setParameter("productDateTo", to);
		return query.getResultList();
	}

	@Override
	public List<CTFMain> getCTFByDateBetweenDescOrder(LocalDate from, LocalDate to) {
		String activeFacilities = "from CTFMain f where f.productDate between :productDateFrom and :productDateTo order by id desc ";
		Query query = sessionFactory.getCurrentSession().createQuery(activeFacilities);
		query.setParameter("productDateFrom", from);
		query.setParameter("productDateTo", to);
		return query.getResultList();
	}

	@Override
	public List<CTFMain> getCTFByDateBetweenAscOrder(LocalDate from, LocalDate to) {
		String activeFacilities = "from CTFMain f where f.productDate between :productDateFrom and :productDateTo  order by id";
		Query query = sessionFactory.getCurrentSession().createQuery(activeFacilities);
		query.setParameter("productDateFrom", from);
		query.setParameter("productDateTo", to);
		return query.getResultList();
	}

	@Override
	public List<CTFMain> getFacilityCTFByDateBetweenDescOrder(Facility facility, LocalDate from, LocalDate to) {
		String activeFacilities = "from CTFMain f where f.productDate between :productDateFrom and :productDateTo order by id desc ";
		Query query = sessionFactory.getCurrentSession().createQuery(activeFacilities);
		query.setParameter("productDateFrom", from);
		query.setParameter("productDateTo", to);
		return query.getResultList();
	}

	@Override
	public List<CTFMain> getFacilityCTFByDateBetweenAscOrder(Facility facility, LocalDate from, LocalDate to) {
		String activeFacilities = "from CTFMain f where f.facilityId = :facilityId and f.productDate between :productDateFrom and :productDateTo order by id ";
		Query query = sessionFactory.getCurrentSession().createQuery(activeFacilities);
		query.setParameter("facilityId", facility.getId());
		query.setParameter("productDateFrom", from);
		query.setParameter("productDateTo", to);
		return query.getResultList();
	}

}
