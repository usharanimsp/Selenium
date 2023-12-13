package com.starpattern;

public class Left_Triangle_Pattern {
	static int a = 6;
	public static void leftTriangle() {
		System.out.println("===Left triangle===");
		for (int i = 1; i <= a; i++) {
			for (int j = a; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void invertedLeftTriangle() {
		System.out.println();
		System.out.println("===Left Inverted triangle===");
		System.out.println();
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		leftTriangle();
		invertedLeftTriangle();
	}
}
