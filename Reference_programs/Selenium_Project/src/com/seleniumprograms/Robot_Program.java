package com.seleniumprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetElementLocation;

public class Robot_Program {
	public static WebDriver driver;
	static String broserName = "chrome";

	public static void browser_Launch() {
		if (broserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"F:\\sana_workspace\\Selenium_Project\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		} else if (broserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	}

	public static void url_Launch() {
		driver.get("https://www.abhibus.com/");
		
	}
	public static void robot_Method() throws InterruptedException, AWTException {
driver.findElement(By.id("twotabsearchtextbox")).click();
Robot r=new Robot();
r.keyPress(KeyEvent.VK_B);
r.keyRelease(KeyEvent.VK_B);
r.keyPress(KeyEvent.VK_O);
r.keyRelease(KeyEvent.VK_O);
r.keyPress(KeyEvent.VK_O);
r.keyRelease(KeyEvent.VK_O);
r.keyPress(KeyEvent.VK_K);
r.keyRelease(KeyEvent.VK_K);
r.keyPress(KeyEvent.VK_S);
r.keyRelease(KeyEvent.VK_S);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);
r.mouseMove(800, 400);
System.out.println("Mouse has been moved");
	
	}
	public static void close() {
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		browser_Launch();
		url_Launch();
		robot_Method();
		//close();
	}
}
