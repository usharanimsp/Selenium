package com.Interviewjavaprograms;
public class Matrix_Addition {
	public static void main(String[] args) {
		int c[][]=new int [3][3];
		int a[][]=new int [3][3];
		a[0][0]=2;
		a[0][1]=3;
		a[0][2]=4;
		a[1][0]=2;
		a[1][1]=6;
		a[1][2]=1;
		a[2][0]=2;
		a[2][1]=5;
		a[2][2]=1;
		int b[][]=new int [3][3];
		b[0][0]=2;
		b[0][1]=5;
		b[0][2]=1;
		b[1][0]=3;
		b[1][1]=1;
		b[1][2]=3;
		b[2][0]=5;
		b[2][1]=1;
		b[2][2]=3;
		System.out.println("Array a:");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Array b:");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Addition of a and b:");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				
				System.out.print(c[i][j]+" ");
			}
		
			System.out.println();
		}
	}
}
