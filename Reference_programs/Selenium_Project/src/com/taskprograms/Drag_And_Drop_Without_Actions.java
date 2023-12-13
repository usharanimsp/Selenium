package com.taskprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drag_And_Drop_Without_Actions {
	public static WebDriver driver;
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/dropable");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement dragMe = driver.findElement(By.xpath("//h2[text()='Target']"));
	Point loc = dragMe.getLocation();
	int xval = loc.getX();
	int yval = loc.getY();
	Robot r=new Robot();
	r.mouseMove(xval, yval);
	r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	WebElement drop = driver.findElement(By.xpath("//div[text()='TODO']"));
	Point loc1 = drop.getLocation();
	int x1 = loc1.getX();
	int y1 = loc1.getY();
	r.mouseMove(x1, y1);
	r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
}
}
