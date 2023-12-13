package com.seleniumprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snap_Deal {
	public static WebDriver driver;
public static void main(String[] args) throws AWTException, InterruptedException {

	System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("snapdeal");
	Actions ac=new Actions(driver);
	Robot rb=new Robot();
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	List<WebElement> sd = driver.findElements(By.xpath("//div[@role=\"listitem\"]/a[@data-agch=\"HJ3bqe\"]"));
for (WebElement we : sd) {	
	ac.contextClick(we).build().perform();
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
}
Set<String> wh = driver.getWindowHandles();
for (String win : wh) {
	driver.switchTo().window(win);
	Thread.sleep(2000);
	String winTitle = driver.getTitle();
	String s1="snapdeal - Google Search";
	System.out.println(winTitle);
	if (winTitle.equals(s1)) {
	continue;	
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder=\"Enter your pincode\"]")).sendKeys("638001");
	driver.findElement(By.xpath("//button[text()='Check']")).click();
	System.out.println("Delivery available\n");
}
}
}
