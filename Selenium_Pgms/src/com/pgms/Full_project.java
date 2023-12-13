package com.pgms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Full_project {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\eclipse-workspace\\Selenium_Pgms\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.nykaa.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Mouse  Hover");
		WebElement mouse = driver.findElement(By.xpath("//*[@id=\"my-menu\"]//descendant::a[text()=\"makeup\"]"));
		Actions a= new Actions(driver);
		a.moveToElement(mouse).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Lipstick\"]")).click();
		Set<String> wins = driver.getWindowHandles();	
		for (String win : wins)
		{
			driver.switchTo().window(win);
		}
		Thread.sleep(2000);
		/*WebElement lipstick = driver.findElement(By.xpath("//*[text()=\"Nykaa Cosmetics Matte Luxe Lipstick\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		System.out.println("scroll");
		js.executeScript("arguments[0].scrollIntoView;",lipstick);*/
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath("//*[text()=\"Lakme 9 To 5 Primer + Shine Lipstick\"]")).click();
		System.out.println("choose color");
		Set<String> wins1 = driver.getWindowHandles();	
		for (String win1 : wins1)
		{
			driver.switchTo().window(win1);
		}
		Thread.sleep(2000);
		WebElement img1 = driver.findElement(By.xpath("//div[@class=\"css-1spe0o5\"]//child::button[@id=\"variant_11936304\"]//descendant::span[@class=\" css-10ht89k\"]"));
		img1.click();	
		driver.findElement(By.xpath("//*[@class=\"css-f81pz4\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"css-aesrxy\"]")).click();
		WebElement fram = driver.findElement(By.xpath("//iframe[@src=\"/mobileCartIframe?ptype=customIframeCart\"]"));
		driver.switchTo().frame(fram);
		System.out.println("into frame");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Proceed']//ancestor::button[@class=\"css-1h4559r e8tshxd0\"]")).click();
		
	}

}
