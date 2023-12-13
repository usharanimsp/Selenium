package com.aaJavaprograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Arun_Ipt {
public static void main(String[] args) {
	List<Object> l = new ArrayList<>(); 		// index based
	l.add(3); 									// add
	l.add("hi");
	l.add(7);
	l.add(9);
	List<Object> l1 = new LinkedList<>();
	l1.add(8); 									// add
	l1.add("hello");
	l1.add(1);
	l1.add(5);
	System.out.println(l);
	System.out.println(l.get(2));				// get-index
	System.out.println(l1.get(3));
	l.set(3, "hello"); 							// set-index
	System.out.println(l);
	System.out.println(l.indexOf("hi")); 		// indexOf-index
	System.out.println(l.contains(3)); 		// contains
	l.remove(1);								// remove-index
	System.out.println("l list=" + l);
	System.out.println("l1 list=" + l1);
	l.retainAll(l1);
	System.out.println(l);
	l.addAll(l1);
	System.out.println(l);
	l.clear();									// clear
	System.out.println(l);
}
}
