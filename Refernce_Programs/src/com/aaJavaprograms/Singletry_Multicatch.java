package com.aaJavaprograms;

public class Singletry_Multicatch {
public static void main(String[] args) {
	try {
		int a=10;
		int b=a/0;
		System.out.println(b);
	} 
	catch (Exception e) {
		System.out.println("handled by parent");
			}	
//	catch (ArithmeticException e) {
//		System.out.println("handled by itself");
//			}
	System.out.println("================");
}
}
