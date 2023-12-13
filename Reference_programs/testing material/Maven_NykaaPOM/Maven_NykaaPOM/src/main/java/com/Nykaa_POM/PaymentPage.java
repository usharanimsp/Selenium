package com.Nykaa_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	
	WebDriver driver;
	
	public PaymentPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath="//p[text()='Cash on delivery']")private WebElement cod;
	public WebElement getcod() {
		return cod;
	}
	
	
	@FindBy(xpath="//button[text()='Place order']")private WebElement placeOrder;
	public WebElement getplaceOrder() {
		return placeOrder;
	}
	
	
}
