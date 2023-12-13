package com.Interviewjavaprograms;

public class Anagram_Program {
	public static void main(String[] args) {
		String s1 = "race";
		String s2 = "care";
		int c=0;
		if (s1.length() != s2.length()) {
			System.out.println("It is not anagram");
		} else {
			char[] ca = s1.toCharArray();
			char[] ca1 = s2.toCharArray();
			for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < s2.length(); j++) {
					if (ca[i] == ca1[j]) {
						c++;
					}
				}
			}
			if (c==s1.length()) {
				System.out.println("It is anagram");

			} else {
				System.out.println("It is not anagram");
			}
		}		

	}

}