package com.aaJavaprograms;

import java.util.Scanner;

public class Scanner_Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = sc.next();
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your DOB :");
		String dob = sc.nextLine();
		System.out.println("Enter your Qualification :");
		String qual = sc.nextLine();
		System.out.println("=============================================");
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("Date of birth :" + dob);
		System.out.println("Qualification :" + qual);

	}

}
