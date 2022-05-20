package com.spring.data.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CategoriesRepository extends CrudRepository<Categories,Long> {
	
	
	@Query("from Categories")
	List<Categories> showAll();
	
	
	@Query("from Categories where id = ?1")
	List<Categories> findById(int id);
	
	
	@Query("from Categories c where UPPER(c.category_name) Like %?#{[0].toUpperCase()}%")
	List<Categories> findAllCategoriesNameStartWith(String category_name);

	@Query("from Categories c where LOWER(c.category_name) Like %?#{[0].toLowerCase()}")
	List<Categories> findAllCategoriesNameEndWith(String category_name);
	
	
	

}
