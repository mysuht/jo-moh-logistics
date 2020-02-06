package com.suht.logistics_backend.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.suht.logistics_backend.dto.Facility;
import com.suht.logistics_backend.dto.FacilityGroup;
import com.suht.logistics_backend.dto.FacilityType;
import com.suht.logistics_backend.dto.Product;

public interface HelperService {
	BigDecimal OpenBalanceByFacilityProduct(Facility facility, Product product, LocalDateTime dateFrom, LocalDateTime dateTo);
	BigDecimal OpenBalanceByFacilityTypeProduct(FacilityType facilityType, Product product, LocalDateTime dateFrom, LocalDateTime dateTo);
	BigDecimal OpenBalanceByFacilityGroupProduct(FacilityGroup FacilityGroup, Product product, LocalDateTime dateFrom, LocalDateTime dateTo);
	
	BigDecimal ClosingBalanceByFacilityProduct(Facility facility, Product product, LocalDateTime dateFrom, LocalDateTime dateTo);
	BigDecimal ClosingBalanceByFacilityTypeProduct(FacilityType facilityType, Product product, LocalDateTime dateFrom, LocalDateTime dateTo);
	BigDecimal ClosingBalanceByFacilityGroupProduct(FacilityGroup FacilityGroup, Product product, LocalDateTime dateFrom, LocalDateTime dateTo);
	
	BigDecimal AvgMnthlyConsByFacilityProduct(Facility facility, Product product, LocalDateTime dateFrom, LocalDateTime dateTo);
	BigDecimal AvgMnthlyConsByFacilityTypeProduct(FacilityType facilityType, Product product, LocalDateTime dateFrom, LocalDateTime dateTo);
	BigDecimal AvgMnthlyConsByFacilityGroupProduct(FacilityGroup FacilityGroup, Product product, LocalDateTime dateFrom, LocalDateTime dateTo);
}
