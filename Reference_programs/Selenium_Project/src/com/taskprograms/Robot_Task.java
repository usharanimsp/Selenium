package com.taskprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Task {
	public static WebDriver driver;
	
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("twotabsearchtextbox")).click();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CAPS_LOCK);
	r.keyPress(KeyEvent.VK_I);
	r.keyRelease(KeyEvent.VK_I);
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_P);
	r.keyPress(KeyEvent.VK_H);
	r.keyRelease(KeyEvent.VK_H);
	r.keyPress(KeyEvent.VK_O);
	r.keyRelease(KeyEvent.VK_O);
	r.keyPress(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_N);
	r.keyPress(KeyEvent.VK_E);
	r.keyRelease(KeyEvent.VK_E);
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_SPACE);
	r.keyPress(KeyEvent.VK_1);
	r.keyRelease(KeyEvent.VK_1);
	r.keyPress(KeyEvent.VK_4);
	r.keyRelease(KeyEvent.VK_4);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
}
