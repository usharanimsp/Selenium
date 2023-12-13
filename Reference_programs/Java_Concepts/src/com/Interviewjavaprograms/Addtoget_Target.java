package com.Interviewjavaprograms;
public class Addtoget_Target {
public static void main(String[] args) {
	int []a= {2,1,4,0,5,3};
	int target=8,j=1;
	for (int i = 0; i < a.length; i++) {		
		if (a[i]+a[j]==target) {
			System.out.println(a[i]+","+a[j]);	
		}
		i--;													
		++j;									
		if (j==a.length) {
			i++;
			j=i+1;
			}
	}
}
}
