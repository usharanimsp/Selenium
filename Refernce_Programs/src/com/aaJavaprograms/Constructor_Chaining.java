package com.aaJavaprograms;

public class Constructor_Chaining {
public Constructor_Chaining() {
	this("in","it.");
	System.out.println("Thank you");
}
public Constructor_Chaining(char a,String name1,String name2) {
	System.out.print(a+" "+name1+" "+name2+" ");
}
public Constructor_Chaining(int num) {
	this('A',"car","has");
	System.out.print(num+" ");
}
public Constructor_Chaining(String a) {
	this(4);
	System.out.print(" "+a);
}
public Constructor_Chaining(String name1,String name2) {
	this("wheels");
	System.out.print(" "+name1+" "+name2+" \n");
}
public static void main(String[] args) {
	Constructor_Chaining cc = new Constructor_Chaining();
}
}

