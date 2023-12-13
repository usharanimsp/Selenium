package com.abstractionpartialandoverriding;

public abstract class Atm_Details {

	public void atm_Details(int num1, int num2, int num3, int num4) {
		System.out.println("Bank name: Axis bank");
		System.out.println("Card holder name: Sahana");
		System.out.println("Card number: " + num1 + " " + num2 + " " + num3 + " " + num4);
	}

	public abstract void cvv_Num(int cvv);

	public abstract void pin_Num(int pin);

}
