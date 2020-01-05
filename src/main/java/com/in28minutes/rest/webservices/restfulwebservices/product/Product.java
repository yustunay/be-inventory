package com.in28minutes.rest.webservices.restfulwebservices.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private long id;
	private String barcode;
    private String name;
    private int quantity;

	public Product() {
		super();
	}

	public Product(String barcode, String name, int quantity) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.quantity = quantity;
	}

	public Product(long id, String barcode, String name, int quantity) {
		super();
		this.id = id;
		this.barcode = barcode;
		this.name = name;
		this.quantity = quantity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [barcode=" + barcode + ", name=" + name + ", quantity=" + quantity + "]";
	}
    
}
