package com.aaJavaprograms;

public class Method_Overloading {
	public void car_Details(String name) {
		System.out.println("       BMW");
		System.out.println("      *****");
		System.out.println("\nThe famous model is: " + name);
	}

	public void car_Details(float rating, int outOf) {
		System.out.println("The rating of BMW X1 is: " + rating + "/" + outOf);
	}
	
	public void car_Details(int rating, float outOf) {		//data order
		System.out.println("The rating of BMW XM is: " + rating + "/" + outOf);
	}
	
	public void car_Details(String mod1, String mod2) {		//data count
		System.out.println("The upcoming models are: " + mod1 + "," + mod2);
	}
	
	public void car_Details(double price) {					//data type
		System.out.println("The price is: ₹" + price + "lakhs");
	}

	public void car_Details(char a, int num, String expMod) {
		System.out.println("The expensive BMW model is: " + a + num + " " + expMod);
	}

	public static void main(String[] args) {
		Method_Overloading mo = new Method_Overloading();
		mo.car_Details("BMW X1");
		mo.car_Details(41.45);
		mo.car_Details(4.5f, 5);
		mo.car_Details("BMW XM", "BMW X7 Facelift");
		mo.car_Details(4, 5.0f);
		mo.car_Details('M', 8, "Coupe Competition");
	}
}
