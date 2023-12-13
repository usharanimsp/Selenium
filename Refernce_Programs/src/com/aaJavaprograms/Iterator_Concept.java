package com.aaJavaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Iterator_Concept {
public static void main(String[] args) {
	List<String> li=new ArrayList<>();
	li.add("sana");
	li.add("dheera");
	li.add("prash");
	System.out.println("====reverse sort and Iterator====");
	Collections.sort(li);
	Collections.reverse(li);
	Iterator<String> it = li.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());	
	}
}
}
