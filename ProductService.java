package com.spring.data.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productService")
public class ProductService {
	
	@Autowired
	private ProductRepository rep;
	
	public void test() {
		
		List<Product> products = new ArrayList<>();	
		products.add(new Product("Chai", 18));
		products.add(new Product("Chang", 19));
		products.add(new Product("Aniseed Syrup", 10));
		products.add(new Product("Chef Anton Cajun Seasoning", 22));
		products.add(new Product("Chef Antons Gumbo Mix", 21.35));
		products.add(new Product("Grandmas Boysenberry Spread", 25));
		products.add(new Product("Uncle Bobs Organic Dried Pears", 30));
		products.add(new Product("Northwoods Cranberry Sauce", 40));
		products.add(new Product("Mishi Kobe Niku", 97));
		products.add(new Product("Ikura", 31));
		products.add(new Product("Queso Cabrales", 21));
		products.add(new Product("Queso Manchego La Pastora", 38));
		products.add(new Product("Konbu", 6));
		products.add(new Product("Tofu", 23.25));
		products.add(new Product("Genen Shouyu", 15.5));
		
		rep.saveAll(products);
	/*
		List<Product> productsList = rep.showAll();
		productsList.forEach(a -> System.out.println(a));
	
	*/
		/*
		List<Product> productsList = rep.findAllByName("Queso");
	     productsList.forEach(a -> System.out.println(a));
		*/
		
     /*
		List<Product> productsList = rep.findById(5);
		productsList.forEach(a -> System.out.println(a));
		*/
	}

}
