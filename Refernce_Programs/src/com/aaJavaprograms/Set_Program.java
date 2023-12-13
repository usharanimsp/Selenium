package com.aaJavaprograms;

import java.util.HashSet;
import java.util.Set;

public class Set_Program {
	public static void set_Prog() {
		Set<Object> s = new HashSet<>();		//value based
		s.add(60);								//add()
		s.add(10);
		s.add(450);
		s.add("sana");
		s.add("Prash");
		s.add('d');
		System.out.println("set ="+s);
		Set<Object> s1 = new HashSet<>();
		s1.add(30);								//add()
		s1.add(20);
		s1.add(650);
		s1.add("sana");
		s1.add("Prash");
		s1.add('c');
		System.out.println("set1 ="+s1);
	System.out.println(s.size());				//size()
	System.out.println(s.contains("sana"));		//contains()
	s.remove(450);								//remove()-value
	System.out.println("set ="+s);
//	s.removeAll(s1);							//removeAll()
//	System.out.println("set ="+s);
	s.retainAll(s1);							//retainAll()
	System.out.println("set ="+s);
	s1.addAll(s);								//addAll()
	System.out.println("set1 ="+s1);
	s.clear();
	System.out.println("set ="+s);				//clear()
	}
public static void main(String[] args) {
	set_Prog();
}
}
