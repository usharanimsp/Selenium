package com.Nykaa_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OTPVerificationPage {
	
	public OTPVerificationPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	WebDriver driver;
	@FindBy(name="otpValue") private WebElement otpValue;//sendKeys
	@FindBy(xpath="//button[@type='submit']") private WebElement verify;//click
	
	public WebElement getOtpValue() {
		return otpValue;
	}
	public WebElement getVerify() {
		return verify;
	}

}
	
