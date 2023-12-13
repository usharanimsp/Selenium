package com.Interviewjavaprograms;

public class String_Reverse2 {
	public static void main(String[] args) {
		String s = "Hello Java abcd";
		String s1 = "";
		String[] sp = s.split(" ");
		for (String word : sp) {
			s1 = word+" "+s1;
		}
		System.out.println(s1);
	}
}
