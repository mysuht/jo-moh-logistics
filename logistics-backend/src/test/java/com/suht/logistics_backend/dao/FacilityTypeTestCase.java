package com.suht.logistics_backend.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suht.logistics_backend.dao.FacilityTypeDAO;
import com.suht.logistics_backend.dto.FacilityType;

public class FacilityTypeTestCase {

	private static AnnotationConfigApplicationContext context;
	private static FacilityTypeDAO facilityTypeDAO;
	private static FacilityType facilityType;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.suht.logistics_backend");
		context.refresh();

		facilityTypeDAO = (FacilityTypeDAO) context.getBean("facilityTypeDAO");

	}
	
//	@Test
//	public void testFunctions() {
//		//testAddFacilityType();
//		//testGetFacilityType();
//		//testUpdateFacilityType();
//		testDeleteFacilityType();
//		testGetFacilityTypeList();
//	}

	public void testAddFacilityType() {
		facilityType = new FacilityType();
		facilityType.setId(1000099);
		facilityType.setName("SUHT-FACILITY-TYPE-NEW : " + new Date().getTime());
		facilityType.setType("x");
		assertEquals("Successfully added facility ", true, facilityTypeDAO.add(facilityType));
	}

	public void testGetFacilityType() {
		facilityType = facilityTypeDAO.get(37);
		assertEquals("Successfully get facility Type ", true, facilityType.getType().equals("x"));
	}

	public void testUpdateFacilityType() {
		facilityType = facilityTypeDAO.get(37);
		facilityType.setName("TESTED FACILITY TYPE - SUHT " + new Date().getTime());
		assertEquals("Successfully added facility ", true, facilityTypeDAO.update(facilityType));
	}

	public void testDeleteFacilityType() {
		facilityType = facilityTypeDAO.get(37);
		assertEquals("Successfully deleted facility type -> 37 ", true, facilityTypeDAO.delete(facilityType));
	}

	public void testGetFacilityTypeList() {
		List<FacilityType> facilityTypeList = new ArrayList<FacilityType>();
		facilityTypeList = facilityTypeDAO.list();
		for (FacilityType facilityType : facilityTypeList) {
			System.out.println(" FACILITY TYPE NAME : " + facilityType.getName());
		}

		//assertEquals("Successfully deleted facility Type -> 1 ", true, facilityTypeDAO.delete(facilityType));
	}
}
