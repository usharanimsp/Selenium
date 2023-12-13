package com.aaJavaprograms;

public class Demo {
public static void main(String[] args) {
	String s= "Hello world";
	String s1=" ";
	String[] sp = s.split(" ");
	for (String sp1 : sp) {
		char[] ch = sp1.toCharArray();
		for (char c : ch) {
			s1=c+s1;
		}	
	}	
	System.out.println(s1);
}
	
			
}
