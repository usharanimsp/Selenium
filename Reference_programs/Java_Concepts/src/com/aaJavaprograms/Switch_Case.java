package com.aaJavaprograms;

import java.util.Scanner;

public class Switch_Case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int a = sc.nextInt();
		System.out.println("Enter the second value: ");
		int b = sc.nextInt();
		System.out.println("Select an operation: \n1-addition\n2-subtraction\n3-multiplication\n4-division\n5-modulus");
		 int calculation1 = sc.nextInt();
		switch (calculation1) {
		case 1:
			int add = a + b;
			System.out.println("Addition of " + a + "+" + b + " is: " + add);
			break;
		case 2:
			int sub = a - b;
			System.out.println("Subtraction of " + a + "-" + b + " is: " + sub);
			break;
		case 3:
			int mul = a * b;
			System.out.println("Multiplication of " + a + "*" + b + " is: " + mul);
			break;
		case 4:
			int div = a / b;
			System.out.println("Division of " + a + "/" + b + " is: " + div);
			break;
		case 5:
			int mod = a % b;
			System.out.println("Modulus of " + a + "%" + b + " is: " + mod);
			break;
		default:
			System.out.println("Invalid calculation");
			break;
		}
		sc.close();
	}
}
