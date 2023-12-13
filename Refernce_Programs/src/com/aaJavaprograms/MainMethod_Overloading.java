
package com.aaJavaprograms;

public class MainMethod_Overloading {
public static void main(int a) {
	System.out.println("Main method 2");
}
public static void main(String [] c) {
	System.out.println("Main method 1");
	main(5);
	main(2, 3);
}
public static void main(int a, int b) {
	System.out.println("Main method 3");
}
}
