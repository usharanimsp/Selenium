package com.starpattern;

public class Star_Pattern_Diamond {
public static void main(String[] args) {
	int a=10;
for (int i = 1; i <=a; i++) {
	for (int j = a; j > i; j--) {
		System.out.print(" ");
	}
	for (int j = 1; j <=(i*2)-1; j++) {
		System.out.print("*");
	}
	System.out.println();
}
for (int i = a-1; i >=1; i--) {
	for (int j = a; j > i; j--) {
		System.out.print(" ");
	}
	for (int j = 1; j <=(i*2)-1; j++) {
		System.out.print("*");
	}
	System.out.println();
}
}
}
