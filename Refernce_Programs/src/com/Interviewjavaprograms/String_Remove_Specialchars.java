package com.Interviewjavaprograms;

public class String_Remove_Specialchars {
public static void main(String[] args) {
	String s = "Sana@#$%^&*(12345";
	String chars = s.replaceAll("[^a-z,A-Z,0-9]", "");
	System.out.println(chars);
}
}
