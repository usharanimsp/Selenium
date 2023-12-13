package com.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class Assert_Example {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\prashanth_workspace\\seleproj.zip_expanded\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		search.click();
		search.sendKeys("soft toys");
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		List<WebElement> results = driver.findElements(By.xpath(
				"//span[text()='RESULTS']//ancestor::span[@data-component-type=\"s-search-results\"]//descendant::div[@cel_widget_id=\"MAIN-SEARCH_RESULTS-7\"]"));
		for (WebElement products : results) {
			driver.findElement(By.xpath(""))
			System.out.println(products.getText());

		}
//		WebElement jam = driver.findElement(By.xpath("(//span[text()='RESULTS']//ancestor::span[@data-component-type=\"s-search-results\"]//descendant::span[text()='380'])[1]"));
//		System.out.println(jam.getText());
//		Assert.assertEquals("380", jam.getText());
//		System.out.println("success");


	
	
	}
}
