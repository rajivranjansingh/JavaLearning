package com.rajiv.basics.variable;

public class InBuild {
	
	int age=10;
	char character='a';
	float pie=3.14f;
	double salary= 1000000000;
	String name="Rajiv";
	Boolean status= true;
	
	
	public static void main(String[] args) {
		
		InBuild obj=new InBuild();
		System.out.println("Age as Int "+ obj.age);
		System.out.println("Character as Char "+ obj.character);
		System.out.println("Pie as Float "+ obj.pie);
		System.out.println("Salary as Double "+ obj.salary);
		System.out.println("Status as Boolean "+ obj.status);
		
		System.out.println("Size of byte: " + (Byte.SIZE/8) + " bytes.");
	    System.out.println("Size of short: " + (Short.SIZE/8) + " bytes.");
	    System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
	    System.out.println("Size of long: " + (Long.SIZE/8) + " bytes.");
	    System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
	    System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
	    System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");
		
	}
}
