package com.pomNykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder_Page {
WebDriver driver;
@FindBy(xpath = "(//div[@class=\"css-1b6qp80 epl0tdj0\"])[5]") private WebElement cashOnDelivery;
@FindBy(xpath = "//button[text()='Place order']") private WebElement placeOrder;
public PlaceOrder_Page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);}
public WebElement getCashOnDelivery() {
	return cashOnDelivery;
}
public WebElement getPlaceOrder() {
	return placeOrder;
}

}
