package com.suht.logistics_backend.dao;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suht.logistics_backend.dao.ProductDAO;
import com.suht.logistics_backend.dto.Product;

public class ProductTestCase {

	private static AnnotationConfigApplicationContext context;
	private static ProductDAO ProductDAO;
	private static Product Product;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.suht.logistics_backend");
		context.refresh();

		ProductDAO = (ProductDAO) context.getBean("ProductDAO");

	}
	
	@Test
	public void testFunctions() {
		//testAddProduct();
		//testGetProduct();
		//testUpdateProduct();
		//testDeleteProduct();

   		//testGetProductList();
	}

//	public void testAddProduct() {
//		Product = new Product();
//		Product.setId(1000099);
//		Product.setName("SUHT-FACILITY-TYPE-NEW : " + new Date().getTime());
//		Product.setType("x");
//		assertEquals("Successfully added facility ", true, ProductDAO.add(Product));
//	}

	public void testGetProduct() {
		Product = ProductDAO.get(3);
		assertEquals("Successfully get facility Type ", true, Product.getId() == 3);
	}

	public void testUpdateProduct() {
		Product = ProductDAO.get(37);
		Product.setActive("1");
		assertEquals("Successfully added facility ", true, ProductDAO.update(Product));
	}

	public void testDeleteProduct() {
		Product = ProductDAO.get(37);
		assertEquals("Successfully deleted facility type -> 37 ", true, ProductDAO.delete(Product));
	}

	public void testGetProductList() {
		List<Product> ProductList = new ArrayList<Product>();
		ProductList = ProductDAO.list();
		for (Product Product : ProductList) {
			System.out.println(" Product NAME : " + Product.getName()+" - CYP: " + Product.getCyp());
		}

		//assertEquals("Successfully deleted facility Type -> 1 ", true, ProductDAO.delete(Product));
	}
	
	
}
