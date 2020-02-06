package com.suht.logistics_backend.service.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suht.logistics_backend.dao.CTFMainDAO;
import com.suht.logistics_backend.dao.FacilityDAO;
import com.suht.logistics_backend.dao.FacilityTypeDAO;
import com.suht.logistics_backend.dto.CTFMain;
import com.suht.logistics_backend.dto.Facility;
import com.suht.logistics_backend.dto.FacilityGroup;
import com.suht.logistics_backend.dto.FacilityType;
import com.suht.logistics_backend.dto.Product;
import com.suht.logistics_backend.service.HelperService;

@Service("HelperService")
public class HelperServiceImpl implements HelperService {

	@Autowired
	FacilityDAO facilityDAO;
	
	@Autowired
	FacilityTypeDAO facilityTypeDAO;
	
//	@Autowired
//	FacilityGroupDAO facilityGroupDAO;
	
	@Autowired
	CTFMainDAO ctfMainDAO;
	
	
	@Override
	public BigDecimal OpenBalanceByFacilityProduct(Facility facility, Product product, LocalDateTime dateFrom,
			LocalDateTime dateTo) {
		CTFMain ctf = null;
		List<CTFMain> ctfMainList = ctfMainDAO.getFacilityCTFByDateBetweenAscOrder(facility, dateFrom, dateTo);
		if(ctfMainList.size() > 0) {
			ctf = ctfMainList.get(0);
		}
		return BigDecimal.valueOf(0);
	}

	@Override
	public BigDecimal OpenBalanceByFacilityTypeProduct(FacilityType facilityType, Product product,
			LocalDateTime dateFrom, LocalDateTime dateTo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal OpenBalanceByFacilityGroupProduct(FacilityGroup FacilityGroup, Product product,
			LocalDateTime dateFrom, LocalDateTime dateTo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal ClosingBalanceByFacilityProduct(Facility facility, Product product, LocalDateTime dateFrom,
			LocalDateTime dateTo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal ClosingBalanceByFacilityTypeProduct(FacilityType facilityType, Product product,
			LocalDateTime dateFrom, LocalDateTime dateTo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal ClosingBalanceByFacilityGroupProduct(FacilityGroup FacilityGroup, Product product,
			LocalDateTime dateFrom, LocalDateTime dateTo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal AvgMnthlyConsByFacilityProduct(Facility facility, Product product, LocalDateTime dateFrom,
			LocalDateTime dateTo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal AvgMnthlyConsByFacilityTypeProduct(FacilityType facilityType, Product product,
			LocalDateTime dateFrom, LocalDateTime dateTo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal AvgMnthlyConsByFacilityGroupProduct(FacilityGroup FacilityGroup, Product product,
			LocalDateTime dateFrom, LocalDateTime dateTo) {
		// TODO Auto-generated method stub
		return null;
	}

}
