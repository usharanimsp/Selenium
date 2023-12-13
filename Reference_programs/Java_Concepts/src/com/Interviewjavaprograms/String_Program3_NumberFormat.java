package com.Interviewjavaprograms;

public class String_Program3_NumberFormat {
	public static void main(String[] args) {
		String s = "SanaPrash151";
		String chars = s.replaceAll("[^a-z,A-Z]", "");
		String nums = s.replaceAll("[^0-9]", "");
		int a = Integer.parseInt(nums);
		int sum = 0;
		while (a > 0) {
			int rem = a % 10;
			sum = sum + rem;
			a = a / 10;
		}
		System.out.println(chars + sum);
	}

}
