package com.aaJavaprograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input_Mismatch_Exception {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
		short val = sc.nextShort();
		System.out.println(val);
		int a=10;
		int b=a/0;
		System.out.println(b);
	} catch (ArithmeticException e) {
	System.out.println("Arithmetic");	
	}
	catch (InputMismatchException e) {
		System.out.println("input mismatch");	
		}
	catch (NumberFormatException e) {
		System.out.println("Numberformat");	
		}
	catch (Exception e) {
		System.out.println("Exception");	
		}
	sc.close();
}
}
