package com.Interviewjavaprograms;

import java.util.HashMap;
import java.util.Map;

public class Array_Addtoget_Target {
	public static void method1() {
		int []a= {2,3,6,5,4,8,1};
		int target=7;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]+a[j]==target) {
					System.out.println(a[i]+","+a[j]);
				}
			}
		}

	}
	public static void method2() {
		int []a= {2,3,6,5,4,8,1};
		int target=7,j=0;
		for (int i = 0; i < a.length; i++) {		
			if (a[i]+a[j]==target) {
				System.out.println(a[i]+","+a[j]);	
			}
			i--;													
			++j;									
			if (j==a.length) {
				i++;
				j=i;
			}
		}


	}
public static void main(String[] args) {
	method2();
	}
}
