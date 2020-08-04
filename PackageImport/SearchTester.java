// com->companyName/Org->organization/ facebook->company name/ instagram->Projectname
package com.facebook.instagram.search;
 
import com.facebook.instagram.login.LoginValidation;
//import to get the visibility of the class from different packages
public class SearchTester {

	public static void main(String[] args) {
		
		//use fully qualified class name when class name are same but in different package
		 com.facebook.instagram.login.User user= new com.facebook.instagram.login.User();	
	
		 com.facebook.instagram.stories.User user2= new com.facebook.instagram.stories.User();
	}

}
