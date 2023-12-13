package com.pomNykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {
	WebDriver driver;
	@FindBy(xpath = "//div[@class=\"css-1pan5g8 e1gecm6x0\"]") private WebElement newAddress;
	@FindBy(xpath = "//textarea[@placeholder=\"Road Name/ Area /Colony\"]") private WebElement area;
	@FindBy(xpath = "//input[@placeholder=\"House/ Flat/ Office No.\"]") private WebElement houseNo;	
	@FindBy(xpath = "//input[@placeholder=\"Pincode\"]") private WebElement pincode;
	@FindBy(xpath = "//input[@placeholder=\"Email ID (Optional)\"]") private WebElement email;
	@FindBy(xpath = "//input[@placeholder=\"Name\"]") private WebElement name;
	@FindBy(xpath = "//input[@placeholder=\"Phone\"]") private WebElement phone;
	@FindBy(xpath = "//button[text()='Ship to this address']") private WebElement shipToThisAddress;
	public Address_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		}
	public WebElement getNewAddress() {
		return newAddress;
	}
	public WebElement getArea() {
		return area;
	}
	public WebElement getHouseNo() {
		return houseNo;
	}
	public WebElement getPincode() {
		return pincode;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getShipToThisAddress() {
		return shipToThisAddress;
	}
}
