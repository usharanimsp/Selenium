package com.practiceprograms;

public class String {
	public void method1() {

	}

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		java.lang.String s1 ="set of programs   ";
		java.lang.String s2 ="Set of programs";
		java.lang.String s3 ="";
		
		System.out.println("string lenght :" +s1.length());
		System.out.println("Check both s1 and S2 equals :" +s1.equals(s2));
		System.out.println("Check both s1 and S2 equals : " +s1.equalsIgnoreCase(s2));
		System.out.println("Lower case to upper case : "+s1.toUpperCase());
		System.out.println("Starts with  : " +s1.startsWith("e"));
		System.out.println("Ends with  : " +s1.endsWith("s"));
		System.out.println("contains  : " +s1.contains(s2));
		System.out.println("Index of  : " +s1.indexOf('e'));
		System.out.println("Char at: " +s1.charAt(5));
		System.out.println("Replace  : " +s1.replace('o', '*'));
		System.out.println("substring:" +s1.substring(2,6));
		System.out.println("Is Empty  : " +s3.isEmpty());
		System.out.println("Is trim : "+ s1.trim());
		System.out.println("Reverse the string");
		
		
	}

}
