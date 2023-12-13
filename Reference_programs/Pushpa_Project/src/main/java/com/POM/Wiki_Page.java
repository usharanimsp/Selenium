package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wiki_Page {
	WebDriver driver;

@FindBy(id="searchInput") private WebElement wikiSearch;
@FindBy(xpath="//h3[text()='Pushpa: The Rise']") private WebElement pushpa_Select_Wiki;

public WebElement getPushpa_Select_Wiki() {
	return pushpa_Select_Wiki;
}
public WebElement getWikiSearch() {
	return wikiSearch;
}
public Wiki_Page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
}
