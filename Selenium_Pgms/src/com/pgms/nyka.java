package com.pgms;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class nyka {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\eclipse-workspace\\Selenium_Pgms\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.nykaafashion.com/?utm_content=ads&utm_source=GooglePaid&utm_medium=Search&utm_campaign=Search_NykaaFashion&utm_term=Brand_Core&gad_source=1&gclid=CjwKCAiAjrarBhAWEiwA2qWdCJNounLAaqF0uWiGK5pYaU7HUmUTto53Mv9F2LvS-Wnd2jug0gcG5RoCJdIQAvD_BwE");
		 List<WebElement> Header = driver.findElements(By.id("654b54e202cd7c0e2cea666a"));
		
		for (WebElement Heading : Header)
		{
			System.out.println(Heading.getText());
		}
		//driver.close();
		Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);	
		 WebElement findElement = driver.findElement(By.linkText("Men"));
		 Actions a= new Actions(driver);
		 a.moveToElement(findElement).build().perform();
		System.out.println("mouse hover to men");
		Thread.sleep(2000);
		WebElement findElement2 = driver.findElement(By.xpath("//*[text()=\"Sale\"]"));
		Actions b= new Actions(driver);
		b.moveToElement(findElement2).build().perform();
		System.out.println("mouse hover to sales");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Bags on Sale\"]")).click();
		System.out.println("mouse hover to Bags on sales");
		Set<String> win = driver.getWindowHandles();
		
		for (String newwindow : win) 
		{
			driver.switchTo().window(newwindow);
		}
		System.out.println("New window");
		Thread.sleep(2000);
		WebElement product = driver.findElement(By.xpath("//a[@aria-label=\"Uppercase - Daypack 01 Beige (M)\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",product);
		product.click();
		Set<String> win2 = driver.getWindowHandles();
		
		for (String newwindow2 : win2) 
		{
			driver.switchTo().window(newwindow2);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"color-item css-fcmx1j\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"color-item css-fcmx1j\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"addToBagButtonContainer css-osm75t\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"addToBagButtonContainer css-1p7rtgz\"]")).click();
		Thread.sleep(2000);
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@class=\"css-1b84mvw\"]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//button[@class=\"css-ygvu3o\"]")).click();
		System.out.println("Guest login");
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@class=\"css-1b84mvw\"]"));
		driver.switchTo().frame(frame3);
		//System.out.println("Guest login");
		Thread.sleep(2000);
		System.out.println("Guest login");	
		driver.findElement(By.xpath("//span[@class=\"css-5h2k1n\"]")).click();
		System.out.println("thank you");

	}		
}
