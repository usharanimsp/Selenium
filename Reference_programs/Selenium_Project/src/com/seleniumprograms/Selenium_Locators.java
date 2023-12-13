package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Locators {
	public static WebDriver driver;

	public static void browser_Launch() {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void url_Launch() {
		driver.get("https://www.facebook.com/");
	}

	public static void login_Page() {
		driver.findElement(By.xpath("//input[contains(@name,'em')]")).sendKeys("sahanajagatheesan@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("1234356");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	}

	public static void close() {
		driver.quit();
	}

	public static void main(String[] args) {
		browser_Launch();
		url_Launch();
		login_Page();
		close();
	}
}
