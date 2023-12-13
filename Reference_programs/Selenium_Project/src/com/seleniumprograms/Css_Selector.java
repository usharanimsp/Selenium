package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Css_Selector {
	public static WebDriver driver;
	static String broserName = "chrome";

	public static void browser_Launch() {
		if (broserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"F:\\sana_workspace\\Selenium_Project\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		} else if (broserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	}
	public static void url_Launch() {
		driver.get("https://www.facebook.com/");
	}
	public static void cssSelector() {
driver.findElement(By.cssSelector("input#email")).sendKeys("sahanajagatheesan@gmail.com");
driver.findElement(By.cssSelector("input[type=password]")).sendKeys("123456");
driver.findElement(By.cssSelector("button[name=login]")).click();
	}
	public static void main(String[] args) {
		browser_Launch();
		url_Launch();
		cssSelector();
	}
}
