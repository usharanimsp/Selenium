package com.taskprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Swiggy_Program {
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id=\"location\"]")).sendKeys("600040");
		driver.findElement(By.xpath("//span[contains(text(),'Tamil Nadu 600040')]")).click();
		driver.findElement(By.xpath("(//a[@href=\"/search\"])[1]")).click();
		driver.findElement(By.xpath("//input[@class=\"_2FkHZ\"]")).sendKeys("paneer butter masala");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("(//div[text()='ADD'])[1]")).click();
		WebElement cart = driver.findElement(By.xpath("//A[@href=\"/checkout\"]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(cart);
		Thread.sleep(2000);
		cart.click();
		driver.findElement(By.xpath("//div[@class=\"C6mS- y9pNN\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"mobile\"]")).sendKeys("8248965124");
		driver.findElement(By.xpath("//a[@class=\"_2REYC\"]")).click();
		WebElement otp = driver.findElement(By.xpath("//input[@id=\"otp\"]"));
		Scanner sc=new Scanner(System.in);
		String mobNo = sc.next();
		otp.sendKeys(mobNo);
		driver.findElement(By.xpath("//a[@class=\"_2REYC\"]")).click();
		driver.findElement(By.xpath("//div[text()='Deliver Here']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"_2ZJ0s _1gp0r\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='CANCEL PAYMENT']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Yes, Cancel']")).click();
	}
}
