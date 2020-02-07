package com.suht.logistics_backend.dao;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
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
		CTFMain = CTFMainDAO.get(37L);
		assertEquals("Successfully get facility Type ", true, CTFMain.getFacilityId() == 3);
	}

	public void testUpdateCTFMain() {
		CTFMain = CTFMainDAO.get(37L);
		CTFMain.setFacilityId(3);
		assertEquals("Successfully added facility ", true, CTFMainDAO.update(CTFMain));
	}

	public void testDeleteCTFMain() {
		CTFMain = CTFMainDAO.get(37L);
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
		CTFMainList = CTFMainDAO.getCTFByDateBetweenDescOrder(LocalDate.of(2014, 1, 1), LocalDate.of(2014, 2, 1));
		for (CTFMain CTFMain : CTFMainList) {
			System.out.println(CTFMain.toString() );
		}

		//assertEquals("Successfully deleted facility Type -> 1 ", true, CTFMainDAO.delete(CTFMain));
	}
}
