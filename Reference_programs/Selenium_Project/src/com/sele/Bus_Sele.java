package com.sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bus_Sele {
	public static WebDriver driver;

	public static void browserlaunch() {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\prashanth_workspace\\seleproj.zip_expanded\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/bus-tickets/");
	}
public static void location() {
WebElement from = driver.findElement(By.id("fromCity"));
from.click();
from.sendKeys("delhi");

WebElement to = driver.findElement(By.id("toCity"));
to.click();
to.sendKeys("chennai");
}
public static void main(String[] args) {
	browserlaunch();
	location();
}
}
