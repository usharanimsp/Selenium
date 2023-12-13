package com.chimbuanna;

import java.util.Scanner;

public class Child2 extends Parent {
	public void div() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Division");
		System.out.println("=========");
		System.out.println("Enter the first value:");
		int a = sc.nextInt();
		System.out.println("Enter the second value:");
		int b = sc.nextInt();
		int c= a/b;
		System.out.println("Division of "+a+" and "+b+" is :  "+c);
	}
	public static void main(String[] args) {
		Child2 c2=new Child2();
		c2.add();
		c2.sub();
		c2.div();

	}
}
