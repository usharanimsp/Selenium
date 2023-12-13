package com.Nykaa_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceWashPage {

	public FaceWashPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	WebDriver driver;
	@FindBy(xpath="//div[text()='Nykaa Naturals Face Wash']") private WebElement NykaaFaceWash;
	public WebElement getNykaaFaceWash(){
		return NykaaFaceWash;
	}
	
	@FindBy(xpath="//div[text()='Neutrogena Oil Free Acne Face Wash With 2.0% Salicylic Acid ...']") 
	private WebElement NeutrogenaFaceWash;
	public WebElement getNeutrogenaFaceWash(){
		return NeutrogenaFaceWash;
	}
	
	
	@FindBy(xpath="//div[@class='css-d5z3ro']") 
	private WebElement NeutrogenaFaceWashele;
	public WebElement getNeutrogenaFaceWashele() {
		return NeutrogenaFaceWashele;
	}
	
	@FindBy(xpath="//button[@class=' css-ii3nwj']") 
	private WebElement NeutrogenaFaceWasha2b;
	public WebElement getNeutrogenaFaceWasha2b() {
		return NeutrogenaFaceWasha2b;
	}
}
