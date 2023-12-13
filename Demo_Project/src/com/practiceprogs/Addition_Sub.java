package com.practiceprogs;

import java.util.Scanner;

import com.practiceprograms.String;

public class Addition_Sub {
	static int a, b, c;

//	public void add() {
//
//		c = a+b;
//		System.out.println("Addition: "+c);
//
//	}
//
//	public void sub() {
//
//		c = a-b;
//		System.out.println("Subtraction: "+c);
//
//
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First value:");
		a = sc.nextInt();
		System.out.println("Enter the Second value:");
		b = sc.nextInt();
		sc.close();
		Add_Sub a1 = new Add_Sub();
		a1.add();
		a1.sub();
	}
}
