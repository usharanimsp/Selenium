package com.Interviewjavaprograms;

public class String_Reverse3 {
public static void main(String[] args) {
	String s = "Hello Java";
	String s1 = "";
	String s2 = "";
	String[] sp = s.split(" ");
	for (String word : sp) {
		s1="";
		for (int i = 0; i < word.length(); i++) {
			s1 = word.charAt(i) + s1;
		}
		s2 = s1+" " + s2;
	}
	System.out.println(s2);
}
}
