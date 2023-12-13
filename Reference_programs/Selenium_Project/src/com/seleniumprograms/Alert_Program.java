package com.seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Program {
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
		driver.get("https://letcode.in/test");
	}

	public static void simple_Alert() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Dialog']")).click();
		driver.findElement(By.id("accept")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println("It's a simple alert.");
	}

	public static void confirm_Alert() throws InterruptedException {
		//driver.findElement(By.xpath("//a[text()='Dialog']")).click();
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		System.out.println("It's a confirm alert.");
	}

	public static void prompt_Alert() throws InterruptedException {
		//driver.findElement(By.xpath("//a[text()='Dialog']")).click();
		driver.findElement(By.id("prompt")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("sana");
		a.accept();
		Thread.sleep(3000);
		System.out.println("It's a prompt alert.");
	}

	public static void close() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		browser_Launch();
		url_Launch();
		 simple_Alert();
		 confirm_Alert();
		 prompt_Alert();
		close();
	}
}
