package com.aaJavaprograms;

import java.util.HashSet;
import java.util.Set;

public class Set_Arun_Ipt {
public static void main(String[] args) {
	Set<Object> s = new HashSet<>();		//value based
	s.add(60);								//add()
	s.add(10);
	s.add(6);
	s.add("sana");
	s.add("dheera");
	s.add('d');
	System.out.println("set ="+s);
	Set<Object> s1 = new HashSet<>();
	s1.add(30);								//add()
	s1.add(6);
	s1.add(650.89);
	s1.add("sana");
	s1.add("dheera");
	s1.add('c');
	System.out.println("set1 ="+s1);
System.out.println(s.size());				//size()
System.out.println(s.contains("sana"));		//contains()
s.remove(450);								//remove()-value
System.out.println("set ="+s);
//s.removeAll(s1);							//removeAll()
//System.out.println("set ="+s);
s.retainAll(s1);							//retainAll()
System.out.println("set ="+s);
s1.addAll(s);								//addAll()
System.out.println("set1 ="+s1);
s.clear();
System.out.println("set ="+s);	
}
}
