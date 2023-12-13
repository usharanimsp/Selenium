package com.Interviewjavaprograms;

public class String_Program2 {
	public static void solution_1() {
		String s = "Hello-Java-abcd";
		String substring1 = s.substring(0, 5);
		String substring2 = s.substring(6, 15);
		String[] split = substring2.split("-");
		String s1 = "";
		for (String word : split) {

			s1 = "-" + word + s1;
		}
		System.out.println(substring1 + s1);
	}
	public static void solution_2() {
		String s = "Hello-Java-abcd";
		String[] split = s.split("-");
		String s1 = "";
		String a = null;
		for (String word : split) {
			if (word.equals("Hello")) {
				a=word;
			}else {
				s1="-"+word+s1;
			}	
		}
		System.out.println(a+s1);

	}
	public static void main(String[] args) {
		solution_2();
	}
}
