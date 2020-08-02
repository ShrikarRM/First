package com.account.encapsulation;

public class Student {

	private int marks=40;
	private String name;
	
	public Student(String inName){
		name=inName;
	}
	public void displayMarks(String name){
		System.out.println("Marks of "+name+" is "+marks);
	}
public void inputMarks(int addmarks){
	if(marks<0)
	marks+=addmarks;
	else
		System.out.println("Entered wrong marks");
	
}
}
