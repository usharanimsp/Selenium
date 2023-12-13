package com.java;

import java.util.Iterator;
import java.util.Scanner;

public class Test_Prog {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int a = s.nextInt();
int sum=0;

for (int i = 1; i < a; i++) {
	if (a%i==0) {
		sum=sum+i;
	}
}
	if(sum==a) {
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
}
	

}

