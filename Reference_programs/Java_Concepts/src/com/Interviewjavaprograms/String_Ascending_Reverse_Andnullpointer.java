package com.Interviewjavaprograms;

public class String_Ascending_Reverse_Andnullpointer {
public static void main(String[] args) {
	String s="java is a programming language";
	char temp;
	char[] ca = s.toCharArray();
	for (int i = 0; i < ca.length; i++) {
		for (int j = i+1; j < ca.length; j++) {
			if (ca[i]>ca[j]) {
				temp=ca[i];
				ca[i]=ca[j];
				ca[j]=temp;	
			}
		}
		
	}
	for (int i = ca.length-1; i>=0; i--) {
		if (ca[i]!=' ') {
			System.out.print(ca[i]);
		}
	}
}
}
