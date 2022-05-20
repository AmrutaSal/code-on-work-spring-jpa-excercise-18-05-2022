package com.spring.data.jpa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductTest {

public static void main(String []arg) {
		
		AnnotationConfigApplicationContext appContext = 
				new AnnotationConfigApplicationContext();
		
         appContext.scan("com.spring.data.jpa");
		
		appContext.refresh();
		
		ProductService cs = (ProductService)appContext.getBean("ProductService");
		cs.test();
		
       }
}
