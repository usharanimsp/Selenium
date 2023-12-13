package com.taskprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone14_Count {
	public static WebDriver driver;
public static void main(String[] args) throws AWTException {
	int expectedTotal=17;
	System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone 14");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	List<WebElement> iphone14 = driver.findElements(By.xpath("//div[@class=\"sg-row\"]//span[contains(text(),'Apple iPhone 14 ')]"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	int actualTotal = iphone14.size();
	if (expectedTotal==actualTotal) {
		System.out.println("Total no of iphone 14 :"+actualTotal);
	}else {
		System.out.println("Invalid");
	}
}
}
