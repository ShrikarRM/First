package com.account.encapsulation;

public class SanitizerTester {

	public static void main(String[] args) {
		
		Sanitizer san= new Sanitizer();
		//san.setName("Dettol");
		san.setPrice(90.55);
		san.setQuantity(200);
		
//		System.out.println("Name is "+san.getName());
		System.out.println("Quantity is "+san.getQuantity());
		System.out.println("Price is "+san.getPrice());

		}

}
