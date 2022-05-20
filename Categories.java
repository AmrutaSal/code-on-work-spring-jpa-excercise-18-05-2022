package com.spring.data.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "catagories")
public class Categories {
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private int id;
	
	@Column(name ="category_name" , length = 50)
	private String category_name;
	
	@Column(name = "description" ,length = 255)
	private String description;

	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categories(String category_name, String description) {
		super();
		this.category_name = category_name;
		this.description = description;
	}

	public int getCategory_id() {
		return  id;
	}

	public void setCategory_id(int category_id) {
		this.id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Categories [category_id=" + id + ", category_name=" + category_name + ", description="
				+ description + "]";
	}
	
	
	

}
