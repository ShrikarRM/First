package com.account.inheritance;

public class VehicleClass {

		
		   public void moving()
		   {
		     System.out.println("vehicles are moving");
		   }
		}
		Class Bike extends VehicleClass
		{
		public void ()
		{
		System.out.println("class Y method");
		}
		}
		Class Z extends Y
		{
		   public void methodZ()
		   {
		     System.out.println("class Z method");
		   }
		   public static void main(String args[])
		   {
		     Z obj = new Z();
		     obj.methodX(); //calling grand parent class method
		     obj.methodY(); //calling parent class method
		     obj.methodZ(); //calling local method
		  }
		}
	}

}
