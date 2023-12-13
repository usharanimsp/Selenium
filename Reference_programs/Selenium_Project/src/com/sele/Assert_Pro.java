package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assert_Pro {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().fullscreen();
	Thread.sleep(3000);
	WebElement username = driver.findElement(By.id("email"));
	WebDriverWait w = new WebDriverWait(driver, 20);
	w.until(ExpectedConditions.visibilityOf(username));
	username.sendKeys("jahana");
	WebElement fbtext = driver.findElement(By.tagName("h2"));
	String text4 = fbtext.getText();
	System.out.println(text4);
	//String expectect = ""
}
}
