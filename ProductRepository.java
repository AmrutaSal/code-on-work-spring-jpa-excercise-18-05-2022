package com.spring.data.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long>{
	
    @Query("from Product")
	List<Product> showAll();
	
	@Query("from Product p where p.product_name = ?1")
	List<Product> findAllByName(String product_name);
	
	
    @Query("from Product where id = ?1")
	List<Product> findById(int id);

}
