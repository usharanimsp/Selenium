package com.pageobjectManager;


import org.openqa.selenium.WebDriver;

import com.pomNykaa.Address_Page;
import com.pomNykaa.Home_Page;
import com.pomNykaa.PlaceOrder_Page;
import com.pomNykaa.Product_AddToCart_Page;
import com.pomNykaa.SighIn_Page;
import com.pomNykaa.Verification_Page;

public class Page_Object_Manager {
	WebDriver driver; 
	private SighIn_Page signIn;
	private Verification_Page verifyPage;
	private Home_Page homePage;
	private Product_AddToCart_Page addToCart;
	private Address_Page addressPage;
	private PlaceOrder_Page placeOrder;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}
	public SighIn_Page getSignIn(){
		if (signIn==null) {
			signIn=new SighIn_Page(driver);
		}
		return signIn;
	}
	public Verification_Page getverifyPage(){
		if (verifyPage==null) {
			verifyPage=new Verification_Page(driver);
		}
		return verifyPage;
	}
	public Home_Page gethomePage(){
		if (homePage==null) {
			homePage=new Home_Page(driver);
		}
		return homePage;
	}
	public Product_AddToCart_Page getaddToCart(){
		if (addToCart==null) {
			addToCart=new Product_AddToCart_Page(driver);
		}
		return addToCart;
	}
	public Address_Page getaddressPage(){
		if (addressPage==null) {
			addressPage=new Address_Page(driver);
		}
		return addressPage;
	}
	public PlaceOrder_Page getplaceOrder(){
		if (placeOrder==null) {
			placeOrder=new PlaceOrder_Page(driver);
		}
		return placeOrder;
	}

}
