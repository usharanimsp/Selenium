package com.starpattern;


public class Star_Pattern_K {
public static void main(String[] args) {
int a =7;
System.out.println("===K Star pattern===");
for (int i = a; i >=1; i--) {
	for (int j = i; j >=1; j--) {
		System.out.print("*");
	}
	System.out.println();
}
for (int j = 1; j <=a; j++) {
	for (int j2 = 1; j2 <=j; j2++) {
		System.out.print("*");
	}
	System.out.println();
}
}
}
