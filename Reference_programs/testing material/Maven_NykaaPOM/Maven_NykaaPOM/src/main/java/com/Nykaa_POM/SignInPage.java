package com.Nykaa_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	WebDriver driver;
	public SignInPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);//***********initializing the driver
	}
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement signIn;
	@FindBy(xpath="//button[text()='Sign in with Mobile Number']")
	private WebElement sigInMobileNum;
	
	public WebElement getSignIn() {
		return signIn;
	}
	public WebElement getSigInMobileNum() {
		return sigInMobileNum;
	}
}
