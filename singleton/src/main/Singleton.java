package main;

import java.util.Scanner;

class UserName{    // Create helper class UserName
	private static UserName userName;  // Create static variable userName type of Singleton 
	private UserName() {  			   // Private constructor to restrict the class.	
		
	}
	public static UserName getObject() { // Create method to ensure only one instance is created.
		if(userName == null) {
			userName = new UserName();
		}
		return userName;				 // If already object is created then return it.
	}
	public static String getUserName(String name) { // 
		return "The User Name is  "+name;
	}
}
public class Singleton {
	public static void main(String[] args) {  // Main method of main class.
		UserName uName;					  	  
		uName = UserName.getObject();		 // Initializing singleton class with variable uName.	
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Enter the User Name: ");
		String name = scannerObject.nextLine();
		System.out.println(uName.getUserName(name)); 
	}
}