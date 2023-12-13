package com.hierachicalinheritance;

public class Employee_1 extends Employer {
	public void employee1_Details() {
		String name = "Sam";
		int id = 185;
		System.out.println("Employee name is: " + name);
		System.out.println("Employee id is: " + id);
	}

	public static void main(String[] args) {
		Employer em = new Employer();
		Employee_1 emp1 = new Employee_1();
		emp1.employee1_Details();
		em.salary_Emp1();

	}
}
