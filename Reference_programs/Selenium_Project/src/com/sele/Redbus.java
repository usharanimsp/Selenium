package com.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.manage().window().fullscreen();

		driver.findElement(By.id("src")).sendKeys("Chennai");
		driver.findElement(By.id("src")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("dest")).sendKeys("coimbatore");
		driver.findElement(By.id("dest")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
		driver.findElement(By.xpath("//td[text()='22']")).click();
		Thread.sleep(3000);

		WebElement buttonClick = driver.findElement(By.xpath("//button[@id='search_btn']"));
		buttonClick.click();
		Thread.sleep(6000);
		
		System.out.println("button is clicked");

		List<WebElement> allBusses = driver.findElements(By.xpath("//ul[@class=\"bus-items\"]//descendant::li[@class='row-sec clearfix']"));
		for (WebElement busList : allBusses) {
			System.out.println("==================================\n"+busList.getText());
		}
	}
}
