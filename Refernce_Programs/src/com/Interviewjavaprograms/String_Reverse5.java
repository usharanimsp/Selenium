package com.Interviewjavaprograms;

public class String_Reverse5 {
public static void main(String[] args) {
	String s="Hi there hello";
    char[] ca = s.toCharArray();  
    char[] ca1 = new char[ca.length]; 
    int j=0;

    for (int i = 0; i < ca.length; i++) {  //0
        if (ca[i] == ' ') {  				
            ca1[i] = ' ';  
        }  
    }  
    j = ca1.length - 1;  
    for (int i = 0; i < ca.length; i++) {  
        if (ca[i] != ' ') {  
            if (ca1[j] == ' ') {  
                j--;  
            }  
            ca1[j] = ca[i];  
            j--;  
        }  
    }  
    System.out.println(ca1);  
}  
	}


