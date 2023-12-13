package com.aaJavaprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_To_List {
public static void main(String[] args) {
	Set<Integer> s=new HashSet<>();
	s.add(10);
	s.add(15);
	List<Integer> li=new ArrayList<>(s);
	System.out.println(li);
}
}
