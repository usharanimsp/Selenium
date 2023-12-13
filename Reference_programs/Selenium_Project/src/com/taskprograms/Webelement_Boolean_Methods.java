package com.taskprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Boolean_Methods {
	public static WebDriver driver;

	public static void isSelected() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		WebElement gender = driver.findElement(By.xpath("//input[@value=\"1\"]"));
		System.out.println("Before Selecting: "+gender.isSelected());
		gender.click();
		System.out.println("After Selecting: "+gender.isSelected());
		driver.navigate().to("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//label[@id=\"searchDropdownDescription\"]"));
		System.out.println("isDisplayes is: "+search.isDisplayed());
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		isSelected();
	}
}
