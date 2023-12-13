package com.aaJavaprograms;

public class String_Literal {
	public static void main(String[] args) {
		String s = "Sana";
		String s1 = "Sana";
		System.out.println("s: " + s);
		System.out.println("s1: " + s1);
		System.out.println("s memory value: " + System.identityHashCode(s));
		System.out.println("s1 memory value: " + System.identityHashCode(s1));
		System.out.println(s.equals(s1));
		System.out.println(s == s1);
	}

}
