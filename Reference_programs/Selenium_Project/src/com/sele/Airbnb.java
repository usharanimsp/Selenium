package com.sele;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Airbnb {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\prashanth_workspace\\seleproj.zip_expanded\\Selenium_Project\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.airbnb.co.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	List<WebElement> filters = driver.findElements(By.xpath("(//div[@role=\"radiogroup\"])[2]//descendant::button[@role=\"radio\"]"));
	for (WebElement lists : filters) {
		System.out.println("========================================\n"+lists.getText());
			}
	driver.close();
	}
	
}
