package com.Interviewjavaprograms;

import java.util.ArrayList;
import java.util.List;

public class Nearest_To_Fibonacci_Series {
public static void main(String[] args) {
	int a=0,b=1,c=0,target=4;
	List<Integer> li=new ArrayList<>();
//	System.out.println(a);
	for (int i = 0; i < 10; i++) {
		a=b;
		b=c;
		c=a+b;
//		System.out.println(c);
		li.add(c);
	}
	System.out.println(li);
	for (int i = 0; i < li.size(); i++) {
		if (li.get(i)==target+1||li.get(i)==target-1) {
		System.out.println(li.get(i));
		}
else if (li.get(i)==target+2||li.get(i)==target-2) {
	System.out.println(li.get(i));
		}
	}
}
}
