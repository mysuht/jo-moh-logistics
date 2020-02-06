package com.suht.logistics_backend;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suht.logistics_backend.dao.CTFMainDAO;
import com.suht.logistics_backend.dto.CTFMain;

public class CTFMainTestCase {

	private static AnnotationConfigApplicationContext context;
	private static CTFMainDAO CTFMainDAO;
	private static CTFMain CTFMain;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.suht.logistics_backend");
		context.refresh();

		CTFMainDAO = (CTFMainDAO) context.getBean("CTFMainDAO");

	}
	
	@Test
	public void testFunctions() {
		//testAddCTFMain();
		//testGetCTFMain();
		//testUpdateCTFMain();
		//testDeleteCTFMain();
		//testGetCTFMainList();
		testGetCTFMainByDatesList();
	}

//	public void testAddCTFMain() {
//		CTFMain = new CTFMain();
//		CTFMain.setId(1000099);
//		CTFMain.setName("SUHT-FACILITY-TYPE-NEW : " + new Date().getTime());
//		CTFMain.setType("x");
//		assertEquals("Successfully added facility ", true, CTFMainDAO.add(CTFMain));
//	}

	public void testGetCTFMain() {
		CTFMain = CTFMainDAO.get(37);
		assertEquals("Successfully get facility Type ", true, CTFMain.getFacilityId() == 3);
	}

	public void testUpdateCTFMain() {
		CTFMain = CTFMainDAO.get(37);
		CTFMain.setFacilityId(3);
		assertEquals("Successfully added facility ", true, CTFMainDAO.update(CTFMain));
	}

	public void testDeleteCTFMain() {
		CTFMain = CTFMainDAO.get(37);
		assertEquals("Successfully deleted facility type -> 37 ", true, CTFMainDAO.delete(CTFMain));
	}

	public void testGetCTFMainList() {
		List<CTFMain> CTFMainList = new ArrayList<CTFMain>();
		CTFMainList = CTFMainDAO.list();
		for (CTFMain CTFMain : CTFMainList) {
			System.out.println(" FACILITY TYPE NAME : " + CTFMain.getFacilityId());
		}

		//assertEquals("Successfully deleted facility Type -> 1 ", true, CTFMainDAO.delete(CTFMain));
	}
	
	public void testGetCTFMainByDatesList() {
		List<CTFMain> CTFMainList = new ArrayList<CTFMain>();
		CTFMainList = CTFMainDAO.getCTFByDateBetween(LocalDateTime.of(2016, 1, 1, 0,0), LocalDateTime.of(2016, 2, 1, 0,0));
		for (CTFMain CTFMain : CTFMainList) {
			System.out.println(" P_DATE : " + CTFMain.getProductDate() + " - FACILITY_ID : " + CTFMain.getFacilityId() );
		}

		//assertEquals("Successfully deleted facility Type -> 1 ", true, CTFMainDAO.delete(CTFMain));
	}
}
