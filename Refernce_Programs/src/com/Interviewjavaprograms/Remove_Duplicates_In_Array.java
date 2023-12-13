package com.Interviewjavaprograms;


public class Remove_Duplicates_In_Array {
	public static void remove_Duplicates1() {
		int a[]= {10,30,40,30,30,30};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[i]=-1;
				}
			}
		}
		for (int k = 0; k < a.length; k++) {
			if(a[k]!=-1) {
				System.out.println(a[k]);
			}
		}
	}
	public static void remove_Duplicates2() {
		int a[]= {10,10,60};
		int l = a.length;
		int []temp =new int[l];
		int j=0;
		for (int i = 0; i <l-1; i++) {
			if (a[i]!=a[i+1]) {
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[l-1];
		for (int i = 0; i <j; i++) {
			a[i]=temp[j];
		}
		for (int i = 0; i < l; i++) {
			System.out.println(a[i]);
		}
	}
public static void main(String[] args) {
remove_Duplicates1();
}
}