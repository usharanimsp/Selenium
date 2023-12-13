package com.pomNykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SighIn_Page {
WebDriver driver;
@FindBy(xpath = "//button[text()='Sign in']") 
private WebElement sigIn;
@FindBy(xpath = "//button[text()='Sign in with Mobile / Email']") 
private WebElement sigInWithMob;
public SighIn_Page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
public WebElement getSigIn() {
	return sigIn;
}
public WebElement getSigInWithMob() {
	return sigInWithMob;
}
}
