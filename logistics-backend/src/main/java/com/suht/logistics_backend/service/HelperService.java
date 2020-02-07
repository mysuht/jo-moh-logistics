package com.suht.logistics_backend.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.suht.logistics_backend.dto.Facility;
import com.suht.logistics_backend.dto.FacilityGroup;
import com.suht.logistics_backend.dto.FacilityType;
import com.suht.logistics_backend.dto.Product;

public interface HelperService {
	BigDecimal OpenBalanceByFacilityProduct(Facility facility, Product product, LocalDate dateFrom, LocalDate dateTo);
	BigDecimal OpenBalanceByFacilityTypeProduct(FacilityType facilityType, Product product, LocalDate dateFrom, LocalDate dateTo);
	BigDecimal OpenBalanceByFacilityGroupProduct(FacilityGroup FacilityGroup, Product product, LocalDate dateFrom, LocalDate dateTo);
	
	BigDecimal ClosingBalanceByFacilityProduct(Facility facility, Product product, LocalDate dateFrom, LocalDate dateTo);
	BigDecimal ClosingBalanceByFacilityTypeProduct(FacilityType facilityType, Product product, LocalDate dateFrom, LocalDate dateTo);
	BigDecimal ClosingBalanceByFacilityGroupProduct(FacilityGroup FacilityGroup, Product product, LocalDate dateFrom, LocalDate dateTo);
	
	BigDecimal AvgMnthlyConsByFacilityProduct(Facility facility, Product product, LocalDate dateFrom, LocalDate dateTo);
	BigDecimal AvgMnthlyConsByFacilityTypeProduct(FacilityType facilityType, Product product, LocalDate dateFrom, LocalDate dateTo);
	BigDecimal AvgMnthlyConsByFacilityGroupProduct(FacilityGroup FacilityGroup, Product product, LocalDate dateFrom, LocalDate dateTo);
}
