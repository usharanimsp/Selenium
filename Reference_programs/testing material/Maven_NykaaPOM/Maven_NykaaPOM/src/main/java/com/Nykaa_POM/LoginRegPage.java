package com.Nykaa_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginRegPage {
	
	public LoginRegPage(WebDriver driver2) {//constructor
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	WebDriver driver;
	@FindBy(name="emailMobile") private WebElement emailMobile;
	@FindBy(xpath="//button[text()='proceed']")private WebElement proceed;
	
	public WebElement getEmailMobile() {
		return emailMobile;
	}
	public WebElement getProceed() {
		return proceed;
	}

}
