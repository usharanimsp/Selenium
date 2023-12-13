package com.hierachicalinheritance;

public class Employee_2 extends Employer {
	public void employee2_Details() {
		String name = "John";
		int id = 192;
		System.out.println("Employee name is: " + name);
		System.out.println("Employee id is: " + id);
	}

	public static void main(String[] args) {
		Employer em = new Employer();
		Employee_2 emp2 = new Employee_2();
		emp2.employee2_Details();
		em.salary_Emp2();
	}
}
