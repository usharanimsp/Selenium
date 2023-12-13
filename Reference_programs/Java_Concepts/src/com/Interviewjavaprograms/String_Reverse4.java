package com.Interviewjavaprograms;

public class String_Reverse4 {
public static void main(String[] args) {
	String s="hello world";
	String s1="";
	String s2="";
	char[] ca = s.toCharArray();
for (int i = s.length()-1; i >=0; i--) {
s1=s1+ca[i];
}
String[] split = s1.split(" ");
for (String word : split) {
	String word1 = word.substring(0,1).toUpperCase();
	String word2 = word.substring(1, word.length());
	s2=s2+word1+word2+" ";
}
System.out.println(s2);

	}
}

