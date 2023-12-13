package com.seleniumprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dynamic_Xpath {
	public static WebDriver driver;
	static String broserName = "edge";

	public static void browser_Launch() {
		if (broserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"F:\\sana_workspace\\Selenium_Project\\driver\\msedgedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (broserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else {
			System.out.println("invalid");
		}
	}

	public static void url_Launch() {
		driver.get("https://www.amazon.in/");
	}

	public static void product_Dynamic() throws AWTException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 pro max");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//span[text()='RESULTS']//ancestor::div[contains(@class,'s-widget s-widget-spacing-large')]//following-sibling::div[@data-asin=\"B08L5TNJHG\"]//descendant::span[text()='Apple iPhone 12 (128GB) - Blue']")).click();
	}

	public static void main(String[] args) throws AWTException {
		browser_Launch();
		url_Launch();
		product_Dynamic();
	}
}
