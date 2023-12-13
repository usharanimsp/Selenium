package com.pageobjectManager;


import org.openqa.selenium.WebDriver;

import com.pomNykaa.SighIn_Page;
import com.pomNykaa.Verification_Page;

public class Page_Object_Manager {
	WebDriver driver; //null
// pom-1/2 , singleton design pattern-1/2
	private SighIn_Page signIn;
	private Verification_Page verifyPage;
	
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
}
