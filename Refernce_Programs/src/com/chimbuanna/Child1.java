package com.chimbuanna;

import java.util.Scanner;

public class Child1 extends Parent{
	public void mul() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Multiplication");
		System.out.println("==============");
		System.out.println("Enter the first value:");
		int a = sc.nextInt();
		System.out.println("Enter the second value:");
		int b = sc.nextInt();
		int c= a*b;
		System.out.println("Multiplication of  "+a+" and "+b+" is	 :  "+c);

	}
	public static void main(String[] args) {
		Child1 c1=new Child1();
		c1.add();
		c1.sub();
		c1.mul();
	}
}
