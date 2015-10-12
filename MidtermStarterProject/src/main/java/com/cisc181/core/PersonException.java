package com.cisc181.core;

import java.util.Date;

public class PersonException extends Exception {

public static void main(String[]args){
	
	 try
	 {		
		 Person p1 = new Employee();
			
		 
	     if(p1.PrintAge()>100)
	     {
	          throw new PersonException();
	     }
	 }
	 catch(Exception ex)
	 {
	      System.out.println("You inputed a date of birth that is out of range");
	 }
	
}
	}

