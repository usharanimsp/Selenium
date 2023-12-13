package com.starpattern;

public class Star_Pattern_Pyramid {
	static int a=9;

	public static void pyramid() {
		System.out.println("===Pyramid pattern===");
		for (int i = 1; i <=9; i++) {
			for (int j = a; j>i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=(i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void invertedPyramid() {
		System.out.println();
		System.out.println("===Inverted Pyramid pattern===");
		System.out.println();
		for (int i = a; i >=1; i--) {
			for (int j = a; j>i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=(i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	pyramid();
	invertedPyramid();
	}
}
