package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pushpa_Imdb {
	WebDriver driver;

	@FindBy(xpath = "//a[text()='December 17, 2021 (United States)']")
	private WebElement releaseDateImdb;
	@FindBy(xpath = "//a[text()='India']")
	private WebElement country;

	public WebElement getReleaseDateImdb() {
		return releaseDateImdb;
	}

	public WebElement getCountryImdb() {
		return country;
	}

	public Pushpa_Imdb(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
