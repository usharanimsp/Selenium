package com.starpattern;


public class Right_Triangle_Pattern {
	static int a= 8;
public static void rightTriangle() {
	System.out.println("===Right triangle===");
for (int i = 1; i <= a; i++) {
	for (int j = 1; j <=i; j++) {
		System.out.print("*");
	}
	System.out.println();
}
}
public static void invertedRightTriangle() {
	System.out.println();
	System.out.println("===Inverted Right Triangle===");
	System.out.println();
	for (int i = a; i >=1; i--) {
		for (int j = 1; j <=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	rightTriangle();
	invertedRightTriangle();
}
}
