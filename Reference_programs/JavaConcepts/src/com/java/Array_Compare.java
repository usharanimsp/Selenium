package com.java;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Array_Compare {
	public static void repetitiveCharacters() {
		String s = "sahana";
		char[] ch = s.toCharArray();
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		for (char check : ch) {
			if (charmap.containsKey(check)) {
				Integer it = charmap.get(check);
				charmap.put(check, it + 1);
			} else {
				charmap.put(check, 1);
			}
			
			}
		Set<java.util.Map.Entry<Character,Integer>> entrySet = charmap.entrySet();
		System.out.println("List of repetitive words count");
		 for (java.util.Map.Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry);
		}
		 
	}
	public static void repetitiveWords() {
		String s = "java is a programming language and python is also programming language";
		String[] str = s.split(" ");
		Map<String, Integer> strMap = new HashMap<String,Integer>();
		for (String strCheck : str) {
			if (strMap.containsKey(strCheck)) {
				Integer it = strMap.get(strCheck);
				strMap.put(strCheck, it+1);
			}
			else {
				strMap.put(strCheck, 1);
			}
		}
Set<java.util.Map.Entry<String,Integer>> entrySet = strMap.entrySet();
for (Map.Entry<String, Integer> entry : entrySet) {
	if (entry.getValue()>1) {
		String key = entry.getKey();
		Integer val = entry.getValue();
		System.out.println(key+"="+val);
	}
	
}
	}

	
	public static void main(String[] args) {
		
		repetitiveWords();

	}
}
