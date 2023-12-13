package com.taskprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static WebDriver driver;

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}
}
