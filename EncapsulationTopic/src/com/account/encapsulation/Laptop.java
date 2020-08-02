package com.account.encapsulation;

public class Laptop {
private int ram =8;
private String model;
private double price;

public void displayRam(String model){
	System.out.println("the ram of this laptop :"+model+" is "+ram);
}
public void costOfLaptop(double price){
	System.out.println("cost of the laptop is "+ price);
}
}
