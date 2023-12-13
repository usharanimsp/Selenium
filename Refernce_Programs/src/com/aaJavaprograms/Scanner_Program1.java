package com.aaJavaprograms;

import java.util.Scanner;

public class Scanner_Program1 {
	static int a;
	static int b;
	
	public void add() {
		int c = a + b;
		System.out.println("Addition of "+a+" and "+b+" is  	 :  "+c);
	}
	public void sub() {
		int c = a - b;
		System.out.println("Subtraction of "+a+" and "+b+" is	 :  "+c);
	}
	public void mul() {
		int c = a * b;
		System.out.println("Multiplication of  "+a+" and "+b+" is	 :  "+c);
	}
	public void div() {

		int c = a / b;
		System.out.println("Division of "+a+" and "+b+" is		 :  "+c);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value:");
		a = sc.nextInt();
		System.out.println("Enter the second value:");
		b = sc.nextInt();
		Scanner_Program1 sc1 = new Scanner_Program1();
		sc1.add();
		sc1.sub();
		sc1.mul();
		sc1.div();
	}

}
