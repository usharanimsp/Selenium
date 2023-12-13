package com.Nykaa_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToBagPage {

	public AddToBagPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	WebDriver driver;
	@FindBy(xpath="//span[text()='Add to Bag']") private WebElement addToBag;
	public WebElement getaddToBag(){
		return addToBag;
	}
	@FindBy(xpath="//span[@class='cart-count']") private WebElement bagSection;
	public WebElement getbagSection(){
		return bagSection;
	}
	@FindBy(xpath="//iframe") private WebElement iframe;
	public WebElement getiframe(){
		return iframe;
	}
	@FindBy(xpath="//div[@class='css-15vhhhd e25lf6d4']") private WebElement proceed;
	public WebElement getproceed(){
		return proceed;
	}
	
}
