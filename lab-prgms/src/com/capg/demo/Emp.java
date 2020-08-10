
package com.capg.demo;


import java.util.Scanner; 
public class Emp {



public static void main(String[] args) 
{ try
{ 
	Scanner sc=new Scanner(System.in); 
	System.out.println("enter first emp name:");
	String firstName=sc.nextLine(); 
	System.out.println("enter second emp name:");
	String lastName=sc.nextLine(); 
	if(firstName.length()==0 || lastName.length()==0) { 
throw new MyException("name is blank"); 
 
 
} } catch(MyException e) { System.out.println(e); } 
 
} 
} class MyException extends Exception{ MyException(String msg){ super(msg); } } 

