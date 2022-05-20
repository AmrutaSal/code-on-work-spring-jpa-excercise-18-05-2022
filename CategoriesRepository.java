package com.spring.data.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CategoriesRepository extends CrudRepository<Categories,Long> {
	
	
	@Query("from Categories")
	List<Categories> showAll();
	
	@Query("from Categories where category_id = ?1")
	List<Categories> findById(int id);
	
	
	@Query("from Categories c where c.lastName Like '_%lastName'= ? 1")
	List<Categories> findAllWithLastNameEndsWith(String lastName);
	
	
	
	
	

}
