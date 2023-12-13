package com.aaJavaprograms;

public class String_Comparison {
public static void main(String[] args) {
	String s="sana";
	String s1="sana";
	String s2=new String("sana");
	String s3=new String("sana");
	StringBuffer sb=new StringBuffer("sana");
	StringBuffer sb1=new StringBuffer("sana");
	System.out.println(s==s1);
	System.out.println(s.equals(s1));
	System.out.println(s2==s3);
	System.out.println(s2.equals(s3));
	System.out.println(s2.equals(sb1));
	System.out.println(sb.equals(sb1));
	System.out.println(sb==sb1);
	System.out.println(s1.equals(s3));
}
}
