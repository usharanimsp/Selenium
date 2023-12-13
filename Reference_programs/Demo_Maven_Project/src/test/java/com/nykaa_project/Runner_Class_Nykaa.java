package com.nykaa_project;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

import com.pageobjectManager.Page_Object_Manager;
import com.pomNykaa.Address_Page;
import com.pomNykaa.Home_Page;
import com.pomNykaa.PlaceOrder_Page;
import com.pomNykaa.Product_AddToCart_Page;
import com.pomNykaa.SighIn_Page;
import com.pomNykaa.Verification_Page;

public class Runner_Class_Nykaa extends Base_Class {
	public static WebDriver driver = browser_Launch("chrome");
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	public static SighIn_Page sigIn=new SighIn_Page(driver);
	public static Verification_Page verifyPage=new Verification_Page(driver);
	public static Home_Page homePage=new Home_Page(driver);
	public static Product_AddToCart_Page addToCart =new Product_AddToCart_Page(driver);
	public static Address_Page addressPage= new Address_Page(driver);
	public static PlaceOrder_Page placeOrder=new PlaceOrder_Page(driver);
	public static void main(String[] args) throws IOException, InterruptedException {
		url_Launch("https://www.nykaa.com/");
		implicit_Wait();
		click(pom.getSignIn().getSigIn());
		click(sigIn.getSigInWithMob());		
		input(verifyPage.getMobNo(), "8248965124");
		click(verifyPage.getSubmit());
		input(verifyPage.getOtp(), scanner_Method());
		click(verifyPage.getVerify());
		screenShot("Otp verification");
		actions_Method(homePage.getHair(), "movetoelement");
		click(homePage.getSelectDryer());
		windowHandles();
		javascriptExecutorMethod(addToCart.getDryer(), "scroll");
		javascriptExecutorMethod(addToCart.getAddToBag(), "click");
		click(addToCart.getCart());
		explicit_Wait(addToCart.getCartFrame());
		frame_Method(addToCart.getCartFrame());
		sleep();
		explicit_Wait(addToCart.getProceed());
		click(addToCart.getProceed());
		click(addressPage.getNewAddress());
		input(addressPage.getArea(), "Soolai");
		input(addressPage.getHouseNo(), "10,Ram nagar");
		input(addressPage.getPincode(), "638004");
		javascriptExecutorMethod(addressPage.getEmail(), "scroll");
		input(addressPage.getEmail(), "sahanajagatheesan@gmail.com");
		input(addressPage.getName(), "Sahana");
		input(addressPage.getPhone(), "8248965124");
		click(addressPage.getShipToThisAddress());
		sleep();
		javascriptExecutorMethod(placeOrder.getCashOnDelivery(), "scroll");
		click(placeOrder.getCashOnDelivery());
		click(placeOrder.getPlaceOrder());
	}
}
