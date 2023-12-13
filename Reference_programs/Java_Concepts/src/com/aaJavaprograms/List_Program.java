package com.aaJavaprograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_Program {
	public static void list_Prog() {
		List<Object> l = new ArrayList<>(); 		// index based
		l.add(20); 									// add
		l.add(50);
		l.add("hi");
		l.add(10);
		l.add(10);
		List<Object> l1 = new LinkedList<>();
		l1.add(80); 								// add
		l1.add(10);
		l1.add("hello");
		l1.add(10);
		l1.add(50);
		System.out.println(l);
		System.out.println(l.get(2));				// get-index
		System.out.println(l1.get(3));
		l.set(3, "hello"); 							// set-index
		System.out.println(l);
		System.out.println(l.indexOf("hi")); 		// indexOf-index
		System.out.println(l.contains(30)); 		// contains
		l.remove(4);								// remove-index
		System.out.println("l list=" + l);
		System.out.println("l1 list=" + l1);
//l1.removeAll(l);									//removeAll
//System.out.println(l1);
		System.out.println(l.retainAll(l1));		// retainAll
		System.out.println(l1.retainAll(l));
		System.out.println(l1);
		System.out.println(l);
		System.out.println(l.addAll(l1));			// addAll
		System.out.println(l);
		l.clear();									// clear
		System.out.println(l);
		
//List<Integer> l3 = Array.asList(2,3,4,5);
	}

	public static void main(String[] args) {
		list_Prog();
	}
}
