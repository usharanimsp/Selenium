package com.seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Navigate_methods {
	public static WebDriver driver;

	public static void browser_Launch() {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void url_Launch() {
		driver.get("https://www.facebook.com/");
	}

	public static void webdriver_Methods() {
		System.out.println("Page Title");
		System.out.println("~~~~~~~~~~");
		System.out.println(driver.getTitle());
		System.out.println();
		System.out.println("Current URL");
		System.out.println("~~~~~~~~~~~~");
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		System.out.println("Window ID");
		System.out.println("~~~~~~~~~~");
		System.out.println(driver.getWindowHandle());
	}

	public static void navigate_Methods() throws InterruptedException {
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	public static void close() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		browser_Launch();
		url_Launch();
		webdriver_Methods();
		navigate_Methods();
		close();
	}
}
