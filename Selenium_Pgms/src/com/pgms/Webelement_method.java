package com.pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_method {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\durga\\eclipse-workspace\\Selenium_Pgms\\Driver\\chromedriver.exe");	
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		boolean enabled = driver.findElement(By.id("email")).isEnabled();
		System.out.println(enabled);
		driver.close();
	}

}
