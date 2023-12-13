package com.aaJavaprograms;

public class String_Functions {
	public static void main(String[] args) {
		String s="BENJAMIN";
		String s1="benjamin";
		int l = s.length();
		System.out.println("Length of string s: "+l);
		boolean equals = s.equals(s1);
		System.out.println("Case sensitivity equal? :"+equals);
		boolean ignoreCase = s.equalsIgnoreCase(s1);
		System.out.println("No case sensitivity equal? :"+ignoreCase);
		String lowerCase = s.toLowerCase();
		System.out.println("Lowercase :"+lowerCase);
		String upperCase = s1.toUpperCase();
		System.out.println("Uppercase :"+upperCase);
		boolean startsWith = s.startsWith("B");
		System.out.println("Starts with given letter :"+startsWith);
		boolean endsWith = s1.endsWith("n");
		System.out.println("Ends with given letter :"+endsWith);
		boolean contains = s.contains("J");
		System.out.println("Contains given letter :"+contains);
	}
}
