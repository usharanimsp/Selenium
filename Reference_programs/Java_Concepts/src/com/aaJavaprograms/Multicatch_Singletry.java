package com.aaJavaprograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multicatch_Singletry {
public static void main(String[] args) {
	try {
		int a=10;
		int b=a/0;
		System.out.println(b);
	}
	finally {
		System.out.println("Run anyway");
	}
	
}
}
