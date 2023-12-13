package com.aaJavaprograms;

public class Methods_Object {
	private int method_Mul() {
		int a = 4;
		int b = 7;
		int c = a * b;
		System.out.println("Multiplication of " + a + " * " + b + " is  : " + c);
		return c;
	}

	public static int method_Div() {
		int a = 10;
		int b = 2;
		int c = a / b;
		System.out.println("Division of " + a + " / " + b + " is       : " + c);
		return c;
	}

	public static void main(String[] args) {
		Methods_Object mo = new Methods_Object();
		mo.method_Mul();
		method_Div();
	}
}
