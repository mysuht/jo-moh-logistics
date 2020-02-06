package com.suht.logistics_backend.service;

import java.math.BigInteger;

import com.suht.logistics_backend.dto.Facility;

public interface HelperService {
	BigInteger OpenBalanceValue(Facility facility);
}
