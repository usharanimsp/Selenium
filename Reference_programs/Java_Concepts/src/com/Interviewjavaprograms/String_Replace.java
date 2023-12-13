package com.Interviewjavaprograms;

public class String_Replace {
public static void main(String[] args) {
	String s="interview";
	char[] a = s.toCharArray();
	for (int i=0;i<a.length;i++) {
		if (a[i]=='i') {
			a[i]='e';
		}else if (a[i]=='e') {
			a[i]='i';
		}
	}
	System.out.println(a);
}
}
