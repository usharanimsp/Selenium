package com.pgms;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.lang.reflect.Field;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Pgms {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\durga\\eclipse-workspace\\Selenium_Pgms\\Driver\\chromedriver.exe");
    driver= new ChromeDriver();
    driver.manage().window().maximize();
    //driver.get("https://www.myntra.com/");
    driver.navigate().to("https://www.google.com/");
    Thread.sleep(5000);
    driver.findElement(By.id("APjFqb")).sendKeys("Facebook"); //send keys
    Thread.sleep(5000);
    driver.findElement(By.id("APjFqb")).clear(); //clear text
    Thread.sleep(5000);
    System.out.println("Get text");
    System.out.println(driver.findElement(By.className("gb_E")).getText());// get text
    Thread.sleep(5000);
  //  driver.findElement(By
    String title = driver.getTitle();
    System.out.println(title);
    Thread.sleep(5000);
    String currentUrl = driver.getCurrentUrl();
    System.out.println(currentUrl);
    Thread.sleep(5000);
   // System.out.println(driver.getPageSource());
    driver.navigate().back();
    Thread.sleep(5000);
    driver.quit();
  
}

}
