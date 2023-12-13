package com.Interviewjavaprograms;

import java.util.HashMap;
import java.util.Map;

public class Substring_Occurence {
	public static void main(String[] args) {
		String s = "java is a prog lang python is also a prog lang";
		String[] sp = s.split(" ");
		Map<String, Integer> m = new HashMap<>();
		for (String c : sp) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
		}
		System.out.println(m);
	}
}
