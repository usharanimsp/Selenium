package com.seleniumprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exterro_Practice {
	public static WebDriver driver;

	public static void takesScreenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\sana_workspace\\Selenium_Project\\Screenshots_Sana" + name + ".png");
		FileUtils.copyFile(src, dest);
	}

	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement uname = driver.findElement(By.id("email"));
		uname.click();
		uname.sendKeys("prasi");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.click();
		pass.sendKeys("123");
		//takesScreenshot("demo");
		WebElement forgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		Actions ac = new Actions(driver);
		ac.contextClick(forgot).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Set<String> wh = driver.getWindowHandles();
		for (String wh2 : wh) {
			System.out.println(wh2);
			driver.switchTo().window(wh2);

		}
	}

}
