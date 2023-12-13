package com.pomNykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verification_Page {
	WebDriver driver;
	@FindBy(name = "emailMobile") private WebElement mobNo;
	@FindBy(id = "submitVerification") private WebElement submit;
	@FindBy(id = "otpField") private WebElement otp;	
	@FindBy(xpath = "//button[@type=\"submit\"]") private WebElement verify;
	public Verification_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);	}
	public WebElement getMobNo() {
		return mobNo;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getOtp() {
		return otp;
	}
	public WebElement getVerify() {
		return verify;
	}

}
