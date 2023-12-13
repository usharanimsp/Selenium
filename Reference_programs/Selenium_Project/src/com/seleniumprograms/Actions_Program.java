package com.seleniumprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Program {
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
		driver.get("https://www.snapdeal.com/");

	}

	public static void actions_Method() throws InterruptedException {
		Actions a = new Actions(driver);
		WebElement kids = driver.findElement(By.xpath("//span[text()=\"Toys, Kids' Fashion & more\"]"));
		a.contextClick(kids).build().perform();
		System.out.println("Context click is performed");
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.name("keyword"));
		a.click(search).sendKeys("mobile phones").build().perform();
		System.out.println("Click is performed");
		WebElement mensFashion = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		a.moveToElement(mensFashion).click().build().perform();
		System.out.println("Move to element is performed");

	}

	public static void close() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		browser_Launch();
		url_Launch();
		actions_Method();
		close();

	}
}
