package com.Interviewjavaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class String_To_Arraylist_Reverse {
public static List<Integer> li1=new ArrayList<>();
public static List<Integer> li2=new ArrayList<>();

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Input : ");
String s1 = sc.nextLine();
sc.close();
String[] split = s1.split(" ");
for (int i = 0; i < split.length; i++) {
	int num = Integer.parseInt(split[i]);
	li1.add(num);
}
System.out.println("Reversed Output: "+reverse());
}
public static List<Integer> reverse() {
	for (int i = li1.size()-1; i>=0; i--) {
		li2.add(li1.get(i));
	}
//Collections.reverse(li1);
return li2;
}
}
