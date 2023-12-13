package com.taskprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_PartialLink_Task {
	public static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Men")).click();
	driver.findElement(By.partialLinkText("Living")).click();
}
}
