package com.java;

import java.util.HashMap;

public class Mobile_Programming {
public static void main(String[] args) {
	String s = "manigandan";
	char[] ca = s.toCharArray();
	HashMap<Character, Integer> m = new HashMap<>();
	for (char c : ca) {
		if (m.containsKey(c)) {
			m.put(c, m.get(c)+1);
		}
		else {
			m.put(c, 1);
		}
	}
	System.out.println(m);
}
}
