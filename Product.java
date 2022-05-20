package com.spring.data.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int product_id;
	
	@Column(name = "product_name",length=50)
	private String product_name;
	
	@Column(name = "price")
	private double price;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String product_name, double price) {
		super();
		this.product_name = product_name;
		this.price = price;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", price=" + price + "]";
	}
		
	

}
