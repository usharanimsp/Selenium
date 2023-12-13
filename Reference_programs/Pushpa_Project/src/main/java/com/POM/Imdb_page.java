package com.POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.movie.Pushpa_Project.Base_Pushpa;

public class Imdb_page {
	WebDriver driver;
	@FindBy(xpath = "//input[@name=\"q\"]") private WebElement imdbSearch;
	@FindBy(xpath = "//div[text()='Pushpa: The Rise - Part 1']")
	private WebElement pushpa_Select;
	
	public WebElement getImdbSearch() {
		return imdbSearch;
	}

	public WebElement getPushpa_Select() {
		return pushpa_Select;
	}

	public Imdb_page(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver,this);
	}
}
