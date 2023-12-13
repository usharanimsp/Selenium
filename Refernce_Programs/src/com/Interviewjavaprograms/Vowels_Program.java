package com.Interviewjavaprograms;

public class Vowels_Program {
	public static void vowels_Or() {
		String s1 = "its hero time";
		char[] ca = s1.toCharArray();
		for (char c : ca) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				System.out.println(c);
			}
		}
	}

	public static void vowels_Switch() {
		String s1 = "its hero time";
		char[] ca = s1.toCharArray();
		for (char c : ca) {
			switch (c) {
			case 'a':
				System.out.println(c);
				break;
			case 'e':
				System.out.println(c);
				break;
			case 'i':
				System.out.println(c);
				break;
			case 'o':
				System.out.println(c);
				break;
			case 'u':
				System.out.println(c);
				break;
			}
		}
	}

	public static void main(String[] args) {
		vowels_Switch();
//		vowels_Or();
	}
}
