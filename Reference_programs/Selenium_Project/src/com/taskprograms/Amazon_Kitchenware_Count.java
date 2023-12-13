package com.taskprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Kitchenware_Count {
	public static WebDriver driver;
public static void main(String[] args) {
	int totalProductsExpected=23;
	System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement kitchen = driver.findElement(By.xpath("//span[text()='Up to 50% off | Kitchen appliances, cookware & more']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",kitchen);
	List<WebElement> products = driver.findElements(By.xpath("//span[text()='Up to 50% off | Kitchen appliances, cookware & more']//parent::h2//parent::div//following-sibling::div//descendant::li[@class=\"feed-carousel-card\"]"));
	int totalProductsActual = products.size();
	if (totalProductsExpected==totalProductsActual) 
		System.out.println("Total products: "+totalProductsActual);
	else 
		System.out.println("Invalid match");	
}
}
