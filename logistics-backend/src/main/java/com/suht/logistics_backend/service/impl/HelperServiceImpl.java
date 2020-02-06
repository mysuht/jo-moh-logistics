package com.suht.logistics_backend.service.impl;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suht.logistics_backend.dao.FacilityDAO;
import com.suht.logistics_backend.dto.Facility;
import com.suht.logistics_backend.service.HelperService;

@Service("HelperService")
public class HelperServiceImpl implements HelperService {

	@Autowired
	FacilityDAO facilityDAO;
	
	@Override
	public BigInteger OpenBalanceValue(Facility facility) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
