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

public class Amazon_Prog {
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\prashanth_workspace\\seleproj.zip_expanded\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.click();
		element.sendKeys("softtoys");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		List<WebElement> ele = driver.findElements(By.xpath(
				"//span[text()='RESULTS']//ancestor::div[@class=\"s-main-slot s-result-list s-search-results sg-row\"]//child::span[@class=\"a-size-base-plus a-color-base a-text-normal\"]"));
		for (WebElement toys : ele) {
			System.out.println(toys.getText());
		}
		driver.close();
	}
}
