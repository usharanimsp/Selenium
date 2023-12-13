package com.taskprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart_DynamicXpath {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		WebElement electronics = driver.findElement(By.xpath(
				"//div[text()='Mobiles']//parent::a//parent::div[@class=\"eFQ30H\"]//following-sibling::div[contains(@data-tkid,'JKA0LKU8OMVP')]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(electronics).build().perform();
	}
}
