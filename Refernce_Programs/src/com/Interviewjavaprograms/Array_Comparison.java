package com.Interviewjavaprograms;

public class Array_Comparison {
public static void main(String[] args) {
	int []a= {2,4,6,1,9};
	int []b= {9,4,6,1,2};
	int c=0;
	if (a.length!=b.length) {
		System.out.println("Array a and b are not equal");
	}else {
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
					c++;
				}
			}		
		}
		if (c==a.length) {
			System.out.println("Array a and b are equal");
		}else {
			System.out.println("Array a and b are not equal");
	}
}
}
}
