package com.taskprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_With_Robot {
	public static WebDriver driver;

public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Robot r=new Robot();
//	r.keyPress(KeyEvent.VK_CAPS_LOCK);
//	r.keyPress(KeyEvent.VK_CAPS_LOCK);
	r.keyPress(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_B);
	r.keyRelease(KeyEvent.VK_B);
	r.keyPress(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_C);
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_2);
	r.keyRelease(KeyEvent.VK_SHIFT);
	r.keyRelease(KeyEvent.VK_2);
	r.keyPress(KeyEvent.VK_G);
	r.keyRelease(KeyEvent.VK_G);
	r.keyPress(KeyEvent.VK_M);
	r.keyRelease(KeyEvent.VK_M);
	r.keyPress(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_I);
	r.keyRelease(KeyEvent.VK_I);
	r.keyPress(KeyEvent.VK_L);
	r.keyRelease(KeyEvent.VK_L);
	r.keyPress(KeyEvent.VK_PERIOD);
	r.keyRelease(KeyEvent.VK_PERIOD);
	r.keyPress(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_C);
	r.keyPress(KeyEvent.VK_O);
	r.keyRelease(KeyEvent.VK_O);
	r.keyPress(KeyEvent.VK_M);
	r.keyRelease(KeyEvent.VK_M);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_1);
	r.keyRelease(KeyEvent.VK_1);
	r.keyPress(KeyEvent.VK_2);
	r.keyRelease(KeyEvent.VK_2);
	r.keyPress(KeyEvent.VK_3);
	r.keyRelease(KeyEvent.VK_3);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
}
