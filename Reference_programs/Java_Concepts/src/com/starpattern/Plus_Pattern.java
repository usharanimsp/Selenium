package com.starpattern;

public class Plus_Pattern {
public static void main(String[] args) {
	int a=5;
	for (int i = 1; i <=(a*2-1); i++) {
		if (i!=a) {
			for (int j = 1; j <=a-1; j++) {
				System.out.print(" ");
			}
			System.out.print("*");			
			}
		else {
			for (int j =1 ; j <=(a*2-1); j++) {
				System.out.print("*");
			}
		}
		System.out.println();	
		}		
	}
}
