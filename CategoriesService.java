package com.spring.data.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("categoriesService")
public class CategoriesService {

	@Autowired
	private CategoriesRepository rep;
	public void test() {
		Categories c1 = new Categories("Beverages", "Soft drinks, coffees, teas, beers, and ales");
		Categories c2 = new Categories("Condiments", "Sweet and savory sauces, relishes, spreads, and seasonings");
		Categories c3 = new Categories("Confections", "Desserts, candies, and sweet breads");
		Categories c4 = new Categories("Dairy Products", "Cheeses");
		Categories c5 = new Categories("Grains/Cereals", "Breads, crackers, pasta, and cereal");
		Categories c6 = new Categories("Meat/Poultry", "Prepared meats");
		Categories c7 = new Categories("Produce", "Dried fruit and bean curd");
		Categories c8 = new Categories("Seafood", "Seaweed and fish");
		
		
		List<Categories> categories = new ArrayList<>();
		
		categories.add(c1);
		categories.add(c2);
		categories.add(c3);
		categories.add(c4);
		categories.add(c5);
		categories.add(c6);
		categories.add(c7);
		categories.add(c8);

		rep.saveAll(categories);
		
		List<Categories> categoriesList = rep.findById(5);
		categoriesList.forEach(c -> System.out.println(c));
		
		
	}
	
	
}
