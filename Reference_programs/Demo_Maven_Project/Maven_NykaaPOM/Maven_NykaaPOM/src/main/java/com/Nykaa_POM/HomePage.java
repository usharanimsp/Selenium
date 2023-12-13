package com.Nykaa_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	WebDriver driver;
	@FindBy(xpath="(//a[text()='skin'])[2]") private WebElement Skin;
	@FindBy(css="#my-menu > ul > li:nth-child(2) > ul > li > div > div:nth-child(1) > div > ul:nth-child(4) > li:nth-child(1) > a") private WebElement FaceWash;
	
	public WebElement getSkin(){
		return Skin;
	}
	
	public WebElement getFaceWash() {
		return FaceWash;
	}
	
	
	

}
