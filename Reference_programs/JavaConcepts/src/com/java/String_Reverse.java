package com.java;

public class String_Reverse {
    public static void main(String[] args) {
String s ="m,hvm";
char[] c =s.toCharArray();
String s1="";
for(char word:c){
    s1=word+s1;
}
System.out.println(s1);
    }
}
