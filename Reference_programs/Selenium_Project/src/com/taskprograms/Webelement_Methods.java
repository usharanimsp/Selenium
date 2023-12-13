package com.taskprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods {
	public static WebDriver driver;
public static void clearAndGetLocation() throws AWTException, InterruptedException {
	driver.get("https://www.facebook.com/");
	WebElement email = driver.findElement(By.id("email"));
	Thread.sleep(1000);
	email.sendKeys("sahanajagatheesan@gmail.com");
	Thread.sleep(1000);
	email.clear();
	Thread.sleep(1000);
	email.sendKeys("123456789");
	WebElement login = driver.findElement(By.name("login"));
	Point axis = login.getLocation();
	int xVal = axis.getX();
	int yVal = axis.getY();
	Robot r=new Robot();
	r.mouseMove(xVal,yVal);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);	
}
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	clearAndGetLocation();
}
}
