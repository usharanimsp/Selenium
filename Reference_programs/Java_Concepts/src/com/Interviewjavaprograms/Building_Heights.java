package com.Interviewjavaprograms;

public class Building_Heights {
	public static void main(String[] args) {
		int a[] = { 100, 150, 200, 200, 300, 150 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] || a[j] < a[i]) {
					a[j] = -1;
				}
			}
		}
		System.out.println("Buildings that are visible:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] != -1) {
				System.out.println(a[i]);
			}
		}
	}
}
