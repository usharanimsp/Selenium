package com.taskprograms;

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

public class Dynamic_Screenshot {
	public static WebDriver driver;

	public static void screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\sana_workspace\\Selenium_Project\\Task_Screenshots" + name + ".png");
		FileUtils.copyFile(src, dest);
}
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	screenshot("home page");
		WebElement hair = driver.findElement(By.xpath("//div[@id=\"my-menu\"]//descendant::a[text()='hair']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(hair).build().perform();
	screenshot("categories");
		driver.findElement(By.xpath("//a[text()='Dryers & Stylers']")).click();
		Set<String> win = driver.getWindowHandles();
		for (String string : win) {
			driver.switchTo().window(string);
		}
	screenshot("dryer page");
		
	}
}