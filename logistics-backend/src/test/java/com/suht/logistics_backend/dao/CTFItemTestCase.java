package com.suht.logistics_backend.dao;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suht.logistics_backend.dao.CTFItemDAO;
import com.suht.logistics_backend.dto.CTFItem;
import com.suht.logistics_backend.dto.CTFMain;
import com.suht.logistics_backend.dto.Product;
import com.suht.logistics_backend.dao.ProductDAO;

public class CTFItemTestCase {

	private static AnnotationConfigApplicationContext context;
	private static CTFItemDAO CTFItemDAO;
	private static CTFMainDAO CTFMainDAO;
	private static ProductDAO ProductDAO;
	private static CTFItem CTFItem;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.suht.logistics_backend");
		context.refresh();

		CTFItemDAO = (CTFItemDAO) context.getBean("CTFItemDAO");
		CTFMainDAO = (CTFMainDAO) context.getBean("CTFMainDAO");
		ProductDAO = (ProductDAO) context.getBean("ProductDAO");

	}
	
	@Test
	public void testFunctions() {
		//testAddCTFItem();
		//testGetCTFItem();
		//testUpdateCTFItem();
		//testDeleteCTFItem();
		//testGetCTFItemList();
		getProductsByCTFMain();
	}

//	public void testAddCTFItem() {
//		CTFItem = new CTFItem();
//		CTFItem.setId(1000099);
//		CTFItem.setName("SUHT-FACILITY-TYPE-NEW : " + new Date().getTime());
//		CTFItem.setType("x");
//		assertEquals("Successfully added facility ", true, CTFItemDAO.add(CTFItem));
//	}

	public void testGetCTFItem() {
		CTFItem = CTFItemDAO.get(37);
		assertEquals("Successfully get facility Type ", true, CTFItem.getProductId() == 3);
	}

	public void testUpdateCTFItem() {
		CTFItem = CTFItemDAO.get(37);
		CTFItem.setProductId(3);
		assertEquals("Successfully added facility ", true, CTFItemDAO.update(CTFItem));
	}

	public void testDeleteCTFItem() {
		CTFItem = CTFItemDAO.get(37);
		assertEquals("Successfully deleted facility type -> 37 ", true, CTFItemDAO.delete(CTFItem));
	}

	public void testGetCTFItemList() {
		List<CTFItem> CTFItemList = new ArrayList<CTFItem>();
		CTFItemList = CTFItemDAO.list();
		for (CTFItem CTFItem : CTFItemList) {
			System.out.println(" FACILITY TYPE NAME : " + CTFItem.getProductId());
		}

		//assertEquals("Successfully deleted facility Type -> 1 ", true, CTFItemDAO.delete(CTFItem));
	}
	
	public void getProductsByCTFMain() {
		List<CTFItem> CTFItemList = new ArrayList<CTFItem>();
		CTFMain ctfMain = CTFMainDAO.get(2115L);
		System.out.println(ctfMain.toString());
		CTFItemList = CTFItemDAO.getProductsByCTFMain(ctfMain);
		for (CTFItem CTFItem : CTFItemList) {
			//System.out.println(CTFItem.toString() );
			Product product = ProductDAO.get(CTFItem.getProductId()); 
			CTFItem item = CTFItemDAO.getProductItem(ctfMain, product);
			System.out.println(item.toString());
		}
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		//CTFItem item = CTFItemDAO.getProductItem(ctfMain, product)

		//assertEquals("Successfully deleted facility Type -> 1 ", true, CTFItemDAO.delete(CTFItem));
	}
}
