package com.seleniumprograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshot_Program {
	public static WebDriver driver;
	static String broserName="Edge";
	static String givenTitle = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
	
	public static void browser_Launch() {
		if (broserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}else if (broserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}		
	}
	public static void url_Launch() {
		driver.get("https://www.amazon.in/");
	}
	public static void mobile_Click() {
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		String mobilePageTitle = driver.getTitle();
		System.out.println("Given Title");
		System.out.println("============");
		System.out.println(givenTitle);
		System.out.println();
		System.out.println("Mobile Page Title");
		System.out.println("==================");
		System.out.println(mobilePageTitle);
		if (givenTitle.equals(mobilePageTitle)) {
			System.out.println();
			System.out.println("The given title and mobile page title are equal ");
		}
	}
	public static void take_Screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\sana_workspace\\Selenium_Project\\Screenshots\\Mobilepage.png");
		FileUtils.copyFile(source, destination);
	}
	public static void close() {
		driver.close();
	}
	public static void main(String[] args) throws IOException {
		browser_Launch();
		url_Launch();
		mobile_Click();
		take_Screenshot();
		close();
	}
}
