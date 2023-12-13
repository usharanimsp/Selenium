package com.Interviewjavaprograms;

public class Array__Ascending {
public static void main(String[] args) {
	int []a= {5,3,2,6,1};	
	String []s= {"Mary","John","Sana","Dheera","Sam"};
	int temp=0;
	String temp1=null;
	for (int i = 0; i < a.length; i++) {	//i=0,i=1,i=2,i=3,i=4,i=5,i=6
		for (int j = i+1; j < a.length; j++) {	//j=1,j=2,j=3,j=4,j=5,j=6,j=2,j=3,j=4,j=5,j=6,j=3,j=4,j=5,j=6,j=4,j=5,j=6,j=5,j=6,j=6
			if (a[i]<a[j]) {	//5>4,4>6(f),4>1,1>3(f),1>7(f),5>6(f),5>4,4>3,3>7(f),6>5,5>4,4>7(f),6>5,5>7(f),6>7
				temp=a[i];		//5,4,5,4,6,5,6
				a[i]=a[j];		//a[i]=4,a[i]=1,a[i]=4,a[i]=3,a[i]=5,a[i]=4,a[i]=5
				a[j]=temp;		//a[j]=5,a[j]=4,a[j]=5,a[j]=4,a[j]=6,a[j]=5,a[j]=6
				//for sorting another array along with the normal
				temp1=s[i];		
				s[i]=s[j];
				s[j]=temp1;
			}	
		}
	}
	for (String a1 : s) {
		System.out.println(a1);
	}
		
	}
}

