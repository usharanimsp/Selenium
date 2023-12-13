package com.Interviewjavaprograms;

public class Print_Duplicates_In_Array {
	public static void main(String[] args) {
int a[]= {10,30,50,50,10};
int count=0;
for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if(a[i]==a[j]) {
			System.out.println("duplicate number is "+a[i]);
			count++;
		}
	}	
}
if(count==0) {
	System.out.println("no duplicates found");
}
	}
}

