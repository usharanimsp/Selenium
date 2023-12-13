package com.Nykaa_SeleniumBase;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NykaaBase {
	
	public static WebDriver driver;//null driver
	
	/**
	 * @description Launches Chrome browser
	 * @param browser
	 * @return
	 */
	public static WebDriver browserLaunch(String browser) {
		System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			return driver;
	}
	
	/**
	 * @description Launches the URL
	 * @param url
	 */
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	
	/**
	 * @description Performs sendKeys action on WebElement
	 * @param input
	 * @param value
	 */
	public static void inputElement(WebElement input, String value) {
		input.sendKeys(value);
	}
	
	/**
	 * @description Performs Click action on WebElement
	 * @param clickbutton
	 */
	 public static void clickElement(WebElement clickbutton) {
	 clickbutton.click(); 
	 }
	 
	 /**
	  * @description Get input from Console
	  * @return input
	  */
	 public static String scannerinput() {
		 Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
			System.out.print("Enter the OTP within 30 seconds: ");  
			String input= sc.nextLine();
			return input;
	 }
	 
	 /**
	  * @description Takes Screenshots in png format
	  * @param ssname
	  * @throws IOException
	  */
	 public static void screenShots(String ssname) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File scr = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\Nancy Lawrence\\JavaTraining\\Maven_NykaaPOM\\Maven_NykaaPOM\\NykaaScreenshots\\"+ssname+".png");
			FileUtils.copyFile(scr,dest);
		}
	 
	 /**
	  * @description Performs mouse actions like moveToElement & click
	  * @param input
	  * @param action
	  */
	 public static void actions(WebElement input, String action) {
		 Actions act=new Actions(driver);
		 if (action=="moveToElement") {
			 act.moveToElement(input).build().perform();
			 }
		 if (action=="click") {
			 act.moveToElement(input).click().build().perform();
			 }
		 }
	
	 /**
	  * @description Moves to next Window tab
	  */
	public static void windowHandles() {
		Set <String> newurl = driver.getWindowHandles();
		for (String windows : newurl) {
		driver.switchTo().window(windows);
			}
		}
	
	//not working
	public static void javaScriptExecutor(WebElement input, String action) {
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		//js.executeScript(Script,Arguments);
		if(action.equalsIgnoreCase("scroll")) {
			js.executeScript("arguments[0].scrollIntoView();", input);
		}
		if(action.equalsIgnoreCase("click")) {
			js.executeScript("arguments[0].click;", input);	
			}
	 	}
	
	/**
	 * @description Moves to iframes
	 * @param iframe
	 */
	public static void iframes(WebElement iframe) {
		WebElement frame = iframe;
		driver.switchTo().frame(frame);
	}
	

}
