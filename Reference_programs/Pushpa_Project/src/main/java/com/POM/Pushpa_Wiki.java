package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pushpa_Wiki {
	WebDriver driver;

	@FindBy(xpath = "(//div[@class=\"plainlist\"])[4]")
	private WebElement releaseDateWiki;
	@FindBy(xpath = "//td[text()='India']")
	private WebElement country;

	public WebElement getReleaseDateWiki() {
		return releaseDateWiki;
	}

	public WebElement getCountryWiki() {
		return country;
	}

	public Pushpa_Wiki(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
}
