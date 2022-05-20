package com.spring.data.jpa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CategoriesTest {

public static void main(String []arg) {
		
		AnnotationConfigApplicationContext appContext = 
				new AnnotationConfigApplicationContext();
		
         appContext.scan("com.spring.data.jpa");
		
		appContext.refresh();
		
		CategoriesService cs = (CategoriesService)appContext.getBean("categoriesService");
		cs.test();
		
	}

}
