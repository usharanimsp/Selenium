package com.Nykaa_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class Nykaa_Practice {
	public static WebDriver driver;

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.nykaa.com/address");
	driver.findElement(By.xpath("//div[@class=\"css-1pan5g8 e1gecm6x0\"]")).click();
	driver.findElement(By.xpath("//input[placeholder=\"Road Name/ Area /Colony\"]")).sendKeys("Soolai");
	driver.findElement(By.xpath("//input[@placeholder=\"House/ Flat/ Office No.\"]")).sendKeys("10,Ram nagar");
	driver.findElement(By.xpath("//input[@placeholder=\"Pincode\"]")).sendKeys("638004");
	driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Sahana");
	driver.findElement(By.xpath("//input[@placeholder=\"Phone\"]")).sendKeys("8248965124");
	driver.findElement(By.xpath("//input[@placeholder=\"Email ID (Optional)\"]"))
			.sendKeys("sahanajagatheesan@gmail.com");
	driver.findElement(By.xpath("//button[text()='Ship to this address']")).click();
	driver.findElement(By.xpath("//div[@class=\"css-46b9vi efuv1qx0\"]//p[text()='Cash on delivery']")).click();

}
}
