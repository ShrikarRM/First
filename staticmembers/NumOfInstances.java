package com.account.staticmembers;

public class NumOfInstances {
	 static int count=0;
	NumOfInstances(){
		count++;
	}
	public static void main(String[] args) {
	
		NumOfInstances obj= new NumOfInstances();
		NumOfInstances obj1= new NumOfInstances();
		NumOfInstances obj2= new NumOfInstances();
		NumOfInstances obj3= new NumOfInstances();
	
	System.out.println("Number of objects= "+count);
	}

}
