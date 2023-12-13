package com.multilevelinheritance;

public class Retailer extends Whole_Saler {
	public void retail_Product() {
		System.out.println("Electronics");
	}

	public static void main(String[] args) {
		Whole_Saler ws = new Whole_Saler();
		ws.wholesale_Products();
	}
}
