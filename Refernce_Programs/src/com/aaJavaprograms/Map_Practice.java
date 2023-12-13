package com.aaJavaprograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Practice {
public static void main(String[] args) {
	Map<Integer, String> fp=new HashMap<>();
	String d = fp.put(1, "sana");
	String string = fp.get(1);
	int size = fp.size();
	Set<Integer> keySet = fp.keySet();
	Collection<String> values = fp.values();
	boolean containsKey = fp.containsKey(1);
	Set<Entry<Integer, String>> entrySet = fp.entrySet();
	
}
}
