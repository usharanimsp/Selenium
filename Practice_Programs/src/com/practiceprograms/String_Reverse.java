package com.practiceprograms;
import java.lang.String;

public class String_Reverse {
public static void main(String[] args) {
	String s1="Hello world";
	String r = "";
	
	/*for (int i = s1.length()-1; i >=0; i--) 
	{
		System.out.print(s1.charAt(i));
	}
	*/
	for (int i1=s1.length()-1;i1>=0;i1--)
	{
		 r=r+s1.charAt(i1);
	}
	System.out.println(r);
}


}
