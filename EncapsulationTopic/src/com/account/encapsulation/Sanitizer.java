package com.account.encapsulation;

public class Sanitizer {
	private int quantity;
	private String name;
	private double price;

	void setQuantity(int inQuantity) {
		quantity = inQuantity;
	}

	int getQuantity() {
		System.out.println("quantity " + quantity);
		return quantity;
	}

	private void setName(String inName) {
		name = inName;
	}

	String getName() {
		System.out.println("Name is " + name);
		return name;
	}

	public void setPrice(double inPrice) {
		price = inPrice;
	}

	double getPrice() {
		System.out.println("price is " + price);
		return price;
	}
}
