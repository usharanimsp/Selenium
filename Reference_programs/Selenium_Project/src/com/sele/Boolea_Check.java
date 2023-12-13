package com.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.AllArguments;

public class Boolea_Check {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
//		WebElement username = driver.findElement(By.id("email"));
//		username.sendKeys("jahana");
//		boolean displayed = username.isDisplayed();
//		System.out.println("is displayed:"+displayed);
//		boolean enabled = username.isEnabled();
//		System.out.println("is enabled: "+enabled);
//		driver.close();
		WebElement element = driver.findElement(By.xpath("//div[@class=\"nav-logo-base nav-sprite\"]"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

		WebElement element2 = driver.findElement(By.xpath("//h2[text()='Today’s Deals']"));
		js.executeScript("arguments[0].scrollIntoView();", element2);
		//Thread.sleep(2000);
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjErbv7o9_7AhVnJrcAHRRpDLMQPAgI");
		WebElement gmai = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Thread.sleep(2000);

		Actions a = new Actions(driver);
		a.contextClick(gmai).build().perform();
		Thread.sleep(2000);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		

		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}