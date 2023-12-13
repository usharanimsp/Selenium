package com.pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Face_book {
	
	
	/////// drop down and radio button
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\eclipse-workspace\\Selenium_Pgms\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("eee");
//		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("mmm");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		//driver.close();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Usha");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Rani");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name=\"reg_email__\"]")).sendKeys("00000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name=\"reg_passwd__\"]")).sendKeys("Dreams@99");
		Thread.sleep(2000);
		Select date = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		date.selectByVisibleText("2");
		Thread.sleep(2000);
		Select month = new Select (driver.findElement(By.id("month")));
		month.selectByValue("5");
		Select year =new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		year.selectByValue("1990");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		

	}



}
