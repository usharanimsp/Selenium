package com.pomNykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_AddToCart_Page {
	WebDriver driver;
	@FindBy(xpath = "//a[@href=\"/syska-hd1610-hair-dryer/p/266127?productId=266127&pps=7\"]")
	private WebElement dryer;
	@FindBy(xpath = "//a[@href=\"/syska-hd1610-hair-dryer/p/266127?productId=266127&pps=7\"]//ancestor::div[@class=\"css-d5z3ro\"]//following-sibling::div[@class=\"showBottomAction hide\"]//descendant::span[text()='Add to Bag']")
	private WebElement addToBag;
	@FindBy(xpath = "//button[@class=\"css-g4vs13\"]")
	private WebElement cart;
	@FindBy(xpath = "//iframe[@class=\"css-acpm4k\"]")
	private WebElement cartFrame;
	@FindBy(xpath = "//span[text()='Proceed']")
	private WebElement proceed;
	public Product_AddToCart_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getDryer() {
		return dryer;
	}
	public WebElement getAddToBag() {
		return addToBag;
	}
	public WebElement getCart() {
		return cart;
	}
	public WebElement getCartFrame() {
		return cartFrame;
	}
	public WebElement getProceed() {
		return proceed;
	}
}
