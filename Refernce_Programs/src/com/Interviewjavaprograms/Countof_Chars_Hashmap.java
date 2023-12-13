package com.Interviewjavaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Countof_Chars_Hashmap {
	public static void main(String[] args) {
		String s="programming";
		char[] ca = s.toCharArray();
		Map<Character, Integer> m=new HashMap<>();
		for (char c : ca) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c)+1);
		}else {
			m.put(c, 1);
		}	
		}
//		System.out.println("===Map values execution===");
//		System.out.println(m+"\n");
		Set<Entry<Character, Integer>> es = m.entrySet();
		System.out.println("===Duplicate characters in the string===");
		
		for (Entry<Character, Integer> entry : es) {
			if (entry.getValue()!=1) {
				Character k = entry.getKey();
				Integer val = entry.getValue();
				System.out.print(k+"="+val+" ");
			}
					}
		}
		
	}


