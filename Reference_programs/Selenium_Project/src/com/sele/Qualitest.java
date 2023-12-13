package com.sele;

import java.util.HashMap;
import java.util.Map;

public class Qualitest {
	public static void main(String[] args) {
		String s1= "java is a programming language";
		int count=0;
		Map<Character,Integer> jmap = new HashMap<Character,Integer>();
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='o') {
				System.out.println(s1.charAt(i));
				if (jmap.containsKey(s1.charAt(i))) {
					Integer co = jmap.get(s1.charAt(i));
					jmap.put(s1.charAt(i), co+1);
				}else {
					jmap.put(s1.charAt(i), 1);
				}
			}
		}
		System.out.println(jmap);

	}

}
