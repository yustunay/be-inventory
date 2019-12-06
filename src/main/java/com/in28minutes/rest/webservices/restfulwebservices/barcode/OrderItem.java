package com.in28minutes.rest.webservices.restfulwebservices.barcode;

public class OrderItem {
	private String barcode;
	private String productName;
	private int quantity;
	
	public OrderItem(String barcode, String productName, int quantity) {
		super();
		this.barcode = barcode;
		this.productName = productName;
		this.quantity = quantity;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
