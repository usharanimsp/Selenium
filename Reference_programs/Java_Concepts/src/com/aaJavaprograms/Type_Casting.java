package com.aaJavaprograms;

public class Type_Casting {
public static void main(String[] args) {
	for (int a = 0; a <= 511; a++) {
		float b=a;
		System.out.println("float  "+a);
		double c=b;
		System.out.println("double  "+c);
		byte d=(byte) c;
		System.out.println("byte  "+d);
		char e=(char) d;
		System.out.println(a+" "+e);
	}
	
}
}

