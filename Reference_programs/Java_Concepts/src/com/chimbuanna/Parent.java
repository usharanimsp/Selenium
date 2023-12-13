package com.chimbuanna;

import java.util.Scanner;

public class Parent {
public void add() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Addition");
	System.out.println("=========");
	System.out.println("Enter the first value:");
	int a = sc.nextInt();
	System.out.println("Enter the second value:");
	int b = sc.nextInt();
	int c = a+b;
	System.out.println("Addition of "+a+" and "+b+" is  	 :  "+c);
}
public void sub() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Subtraction");
	System.out.println("===========");
	System.out.println("Enter the first value:");
	int a = sc.nextInt();
	System.out.println("Enter the second value:");
	int b = sc.nextInt();
	int c= a-b;
	System.out.println("Subtraction of "+a+" and "+b+" is	 :  "+c);
}
}
