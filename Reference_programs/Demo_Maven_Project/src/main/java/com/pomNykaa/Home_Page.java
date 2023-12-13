package com.pomNykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	WebDriver driver; //null
	@FindBy(xpath = "//div[@id=\"my-menu\"]//descendant::a[text()='hair']") private WebElement hair;
	@FindBy(xpath = "//a[text()='Dryers & Stylers']") private WebElement selectDryer;
	
	public Home_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getHair() {
		return hair;
	}
	public WebElement getSelectDryer() {
		return selectDryer;
	}
}
