package com.abstractionpartialandoverriding;

public class Otp extends Atm_Details {

	@Override
	public void cvv_Num(int cvv) {

		System.out.println("CVV number: " + cvv);
	}

	@Override
	public void pin_Num(int pin) {
		System.out.println("Pin number: " + pin);
	}

	public static void main(String[] args) {
		Otp ot = new Otp();
		ot.atm_Details(6543, 4758, 8265, 2876);
		ot.cvv_Num(452);
		ot.pin_Num(6931);
	}
}
