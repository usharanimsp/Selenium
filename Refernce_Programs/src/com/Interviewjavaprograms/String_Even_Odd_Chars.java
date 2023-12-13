package com.Interviewjavaprograms;

public class String_Even_Odd_Chars {
	public static void odd_Characters() {
		String s="javaprogram";
		char[] ca = s.toCharArray();
		System.out.println("Odd characters:");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(ca[i]);
			++i;
		}
	}
	public static void even_Characters() {
		String s="javaprogram";
		char[] ca = s.toCharArray();
		System.out.println("\nEven characters:");
		for (int i = 0; i < s.length()-1; i++) {
			++i;
			System.out.print(ca[i]);
			
		}
	}
public static void main(String[] args) {
odd_Characters();
even_Characters();
}
}
