package com.seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Launch {
	public static WebDriver driver;
	static String broserName = "firefox";
public static void main(String[] args) {
	if (broserName.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver",
				"F:\\sana_workspace\\Selenium_Project\\driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
	} else if (broserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}else if (broserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver",
				"F:\\sana_workspace\\Selenium_Project\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
	}
}
}

