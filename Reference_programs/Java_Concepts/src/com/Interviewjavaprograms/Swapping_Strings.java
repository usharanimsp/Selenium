package com.Interviewjavaprograms;

public class Swapping_Strings {
	public static void single_String_Swap() {
		String s = "Sahana Prashanth";
		String[] split = s.split(" ");
		String temp = split[0];
		split[0] = split[1];
		split[1] = temp;
		for (String a : split) {
			System.out.print(a + " ");
		}
	}

	public static void double_String_Swap() {
		String s1 = "Sahana";
		String s2 = "Prashanth";
		String temp=null;
		System.out.println("Original string :" + s1 + " " + s2);
		temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("After swapping :" + s1 + " " + s2);
	}

	public static void main(String[] args) {
double_String_Swap();
	}

}
