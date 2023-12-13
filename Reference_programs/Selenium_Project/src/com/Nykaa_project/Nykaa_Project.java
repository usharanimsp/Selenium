package com.Nykaa_project;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nykaa_Project {
	public static WebDriver driver;

	public static void screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\sana_workspace\\Selenium_Project\\Nykaa_Screenshots" + name + ".png");
		FileUtils.copyFile(src, dest);
	}

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
	screenshot("Nykaa homepage");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//bu"
				+ "tton[text()='Sign in with Mobile / Email']")).click();
		driver.findElement(By.name("emailMobile")).sendKeys("8248965124");
		driver.findElement(By.id("submitVerification")).click();
		WebElement otp = driver.findElement(By.id("otpField"));
		Scanner sc = new Scanner(System.in);
		String otpNum = sc.next();
		otp.sendKeys(otpNum);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		sc.close();
	screenshot("Otp verification");
		WebElement hair = driver.findElement(By.xpath("//div[@id=\"my-menu\"]//descendant::a[text()='hair']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(hair).build().perform();
	screenshot("select from the list");
		driver.findElement(By.xpath("//a[text()='Dryers & Stylers']")).click();
		Set<String> win = driver.getWindowHandles();
		for (String string : win) {
			driver.switchTo().window(string);
		}
		WebElement dryer = driver.findElement(By.xpath(
				"//a[@href=\"/philips-hair-dryer-hp8100-46/p/1041154?productId=1041154&pps=1\"]//ancestor::div[@class=\"productWrapper css-xin9gt\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", dryer);
		WebElement d1 = driver.findElement(By.xpath(
				"//div[@id=\"product-list-wrap\"]//descendant::div[contains(text(),'GUBB GB-128 Hair Dryer')]//ancestor::div[@class=\"css-d5z3ro\"]//following-sibling::div[@class=\"showBottomAction hide\"]//button[@class=\" css-z2yxlz\"]//span[@class=\"btn-text\"]"));
		js.executeScript("arguments[0].click();", d1);
		driver.findElement(By.xpath("//button[@class=\"css-g4vs13\"]")).click();
		Thread.sleep(1500);
	screenshot("Cart");	
		WebElement fram = driver.findElement(By.xpath("//iframe[@class=\"css-acpm4k\"]"));
		driver.switchTo().frame(fram);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.findElement(By.xpath("//div[@class=\"css-1pan5g8 e1gecm6x0\"]")).click();
		driver.findElement(By.xpath("//textarea[@placeholder=\"Road Name/ Area /Colony\"]")).sendKeys("Soolai");
		driver.findElement(By.xpath("//input[@placeholder=\"House/ Flat/ Office No.\"]")).sendKeys("10,Ram nagar");
		driver.findElement(By.xpath("//input[@placeholder=\"Pincode\"]")).sendKeys("638004");
		WebElement email = driver.findElement(By.xpath("//input[@placeholder=\"Email ID (Optional)\"]"));
		js.executeScript("arguments[0].scrollIntoView();", email);
		email.sendKeys("sahanajagatheesan@gmail.com");
		WebElement name = driver.findElement(By.xpath("//input[@placeholder=\"Name\"]"));
		name.sendKeys("Sahana");
		WebElement phone=driver.findElement(By.xpath("//input[@placeholder=\"Phone\"]"));
		phone.sendKeys("8248965124");
		driver.findElement(By.xpath("//button[text()='Ship to this address']")).click();
	screenshot("Shipment details");
		WebElement cashOnDelivery = driver.findElement(By.xpath("//div[@class=\"side-navbar-layout css-11zya e7sm56z0\"]//descendant::p[text()='Cash on delivery']"));
		js.executeScript("arguments[0].scrollIntoView();", cashOnDelivery);
		WebDriverWait wb =new WebDriverWait(driver, 20);
		wb.until(ExpectedConditions.elementToBeClickable(cashOnDelivery));
		cashOnDelivery.click();
	screenshot("Payment mode");
		driver.findElement(By.xpath("//button[text()='Place order']")).click();
		Thread.sleep(2000);
	screenshot("Order placed ");
	}
}
