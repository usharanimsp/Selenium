package com.starpattern;

public class Hour_Glass_Pattern {
public static void main(String[] args) {
	int a=8;
	for (int i = 1; i <=a; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(" ");
		}
		for (int j = i; j <=a; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	for (int i = a; i >=1; i--) {
		for (int j = 1; j <=i; j++) {
			System.out.print(" ");
		}
		for (int j = i; j <=a; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}

}
}
