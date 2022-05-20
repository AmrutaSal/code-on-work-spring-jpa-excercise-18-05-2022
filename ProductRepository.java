package com.spring.data.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long>{
	
	@Query("from Product")
	List<Product> showAll();
	
	@Query("from Product where name = ?1")
	List<Product> findAllByName(String name);
	
	@Query("from Product where id =?")
	List<Product> findById(int id);

}
