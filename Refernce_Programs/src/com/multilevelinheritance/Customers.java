package com.multilevelinheritance;

public class Customers extends Retailer {
	public static void customer_Owns() {
		System.out.println("Phone");
	}

	public static void main(String[] args) {
		Retailer r = new Retailer();
		r.wholesale_Products();
		r.retail_Product();
		customer_Owns();

	}
}
