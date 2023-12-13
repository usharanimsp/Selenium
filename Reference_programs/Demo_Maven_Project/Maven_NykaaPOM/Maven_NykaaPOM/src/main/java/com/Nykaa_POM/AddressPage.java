package com.Nykaa_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	
	WebDriver driver;

	public AddressPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath="//button[@color='#ffffff']")private WebElement deliverhere; //click
	public WebElement getdeliverhere() {
		return deliverhere;
	} 
	
	/*
	@FindBy(xpath="//button[text()='Deliver here']") private WebElement deliverhere;//click
	public WebElement getdeliverhere() {
		return deliverhere;
	}
	
	
	@FindBy(xpath="//p[text()='Add New Address']") private WebElement newAddress;//click
	public WebElement getnewAddress() {
		return newAddress;
	}
	
	@FindBy(xpath="//input[@placeholder='Pincode']")private WebElement pincode;
	public WebElement getpincode() {
		return pincode;
	}
	
	@FindBy(xpath="//input[@placeholder='House/ Flat/ Office No.']")private WebElement houseno;
	public WebElement gethouseno() {
		return houseno;
	}
	
	@FindBy(xpath="//input[@placeholder='Road Name/ Area /Colony']")private WebElement road;
	public WebElement getroad() {
		return road;
	}
	
	@FindBy(xpath="//button[text()='Ship to this address']")private WebElement ship;
	public WebElement getship() {
		return ship;
	}
	*/
}
