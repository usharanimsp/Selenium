package com.Interviewjavaprograms;

import java.io.IOException;
import java.util.Scanner;

public class Perfect_Numbers {
	public static void solve(int N) {
	int sum=0;
	for (int i = 1; i < N; i++) {
		if (N%i==0) {
			sum=sum+i;
		}
	}
	if (sum==N) {
		System.out.println(N+" is a perfect number");
	}
	else {
		System.out.println(N+" is not a perfect number");
	}
		}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		String str = sc.nextLine();
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println();
			int N = Integer.parseInt(split[i]);
		solve(N);
	}
	}
}
