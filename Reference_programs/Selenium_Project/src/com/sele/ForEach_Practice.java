package com.sele;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEach_Practice {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\prashanth_workspace\\seleproj.zip_expanded\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Automation");
		List<WebElement> suggs = driver.findElements(By.xpath("//div[@class=\"OBMEnb\"]//descendant::li[@role=\"presentation\"]"));
		for (WebElement refname : suggs) {
			System.out.println("============================================\n"+refname.getText());
		}
		driver.close();
	}
}
