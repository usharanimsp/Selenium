package com.testng_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Parallel_Test {
	public static WebDriver driver;

	@BeforeClass
	public void browser_Launch() {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void url_Launch1() {
		driver.get("https://www.facebook.com/");
		System.out.println("facebook Url launched");
}
	@Test
	public void url_Launch2() {
		driver.get("https://www.instagram.com/");
		System.out.println("instagram Url launched");
	}
	@AfterClass
	public void close() {
		driver.quit();

	}
}
