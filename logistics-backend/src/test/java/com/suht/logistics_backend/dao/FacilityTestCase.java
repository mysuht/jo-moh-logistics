package com.suht.logistics_backend.dao;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suht.logistics_backend.dao.FacilityDAO;
import com.suht.logistics_backend.dto.Facility;

public class FacilityTestCase {

	private static AnnotationConfigApplicationContext context;
	private static FacilityDAO facilityDAO;
	private static Facility facility;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.suht.logistics_backend");
		context.refresh();
		
		facilityDAO = (FacilityDAO)context.getBean("facilityDAO");
		
		//LocalDateTime.of(2020,1,1, 24, 1);
	}
	
//	@Test
//	public void testAddFacility() {
//		facility = new Facility();
//		facility.setId(1000099);
//		
//		assertEquals("Successfully added facility ",true, facilityDAO.add(facility));
//	}
	
//	@Test
//	public void testGetFacility() {
//		facility = facilityDAO.get(1);
//		System.out.println(facility.getId());
//		assertEquals("Successfully get facility ",true, facility.isActive());
//	}
	
//	@Test
//	public void testUpdateFacility() {
//		facility = facilityDAO.get(809);
//		//facility.setActive(true);
//		facility.setCity("CHINA");
//		facility.setName("TEST - FACILITY - UPDATED " + new Date().getTime());
//		assertEquals("Successfully added facility ",true, facilityDAO.update(facility));
//	}
	
	
//	@Test
//	public void testDeleteFacility() {
//		facility = facilityDAO.get(809);
//		assertEquals("Successfully deleted facility -> 809 ",true, facilityDAO.delete(facility));
//	}
	
//	@Test
//	public void testGetFacilityList() {
//		List<Facility> facilityList = new ArrayList<Facility>();
//		facilityList = facilityDAO.list();
//		for (Facility facility : facilityList) {
//		System.out.println(" FACILITY NAME : " + facility.getName());
//		
//		}
	
	
	
	
	
//	@Test
//	public void testGetFacilitiesByLevel() {
//		List<Facility> facilityList = new ArrayList<Facility>();
//		facilityList = facilityDAO.getFacilitiesByLevel(String.valueOf(2));
//		for (Facility facility : facilityList) {
//		System.out.println(facility.toString());
//		
//		}
//	}
	
	
	@Test
	public void testGetFacilitiesByGroup() {
		List<Facility> facilityList = new ArrayList<Facility>();
		facilityList = facilityDAO.getFacilitiesByGroup(6);
		for (Facility facility : facilityList) {
		System.out.println(facility.toString());
		
		}
	}
//			
//		
//		assertEquals("Successfully deleted facility -> 809 ",true, facilityDAO.delete(facility));
//	}
}
