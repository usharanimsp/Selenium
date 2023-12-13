package com.practiceprograms;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Array programs");
		int a[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<=8;i++)
		{
			System.out.print(a[i]+"    ");
			if(a[i]==3)
			{
				System.out.println();
			}
			if(a[i]==6)
			{
				System.out.println();
			}
							
				
		}
		
		//Memory address systax
		
		//same Memory address
		
		java.lang.String g="abc";
		java.lang.String g1="abc";
		int y = System.identityHashCode(g);
		System.out.println(y);
		int y1 = System.identityHashCode(g1);
		System.out.println(y1);
				
		// different memory address
		StringBuffer ref=new StringBuffer("abc");
		System.out.println(System.identityHashCode(ref));
		StringBuilder ref1=new StringBuilder("abc");
		System.out.println(System.identityHashCode(ref1));
		
	}
}