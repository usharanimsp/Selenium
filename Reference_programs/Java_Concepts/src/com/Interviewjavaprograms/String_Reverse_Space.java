package com.Interviewjavaprograms;

public class String_Reverse_Space {
	public static void main(String[] args) {
		String s="Hi welcome to java";
		char[] s1 = s.toCharArray();
		 char c[]=new char[s.length()];
		    int j = s.length() - 1;
		    for (int i = 0; i < s1.length; i++)
		        if (s1[i] == ' ') {
		            c[i] = ' ';						
		        }
		    for (int i = 0; i < s1.length; i++) {
		        if (s1[i] != ' ') {
		            if(c[j] == ' ')
		                j--;
		            c[j] = s1[i];
		            j--;
		        
		        }
		    }
		System.out.println(c);
}
}
