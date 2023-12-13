	package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutor_Program {
	public static WebDriver driver;
	static String broserName = "chrome";

	public static void browser_Launch() {
		if (broserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"F:\\sana_workspace\\Selenium_Project\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		} else if (broserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	}

	public static void url_Launch() {
		driver.get("https://www.amazon.in/");
	}

	public static void java_Script() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		System.out.println("Scroll down");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-1000)");
		System.out.println("Scroll up");
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(0,0)");
		System.out.println("Top of the page");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println("Bottom of the page");
		Thread.sleep(5000);
		WebElement homeKitchen = driver.findElement(By.xpath("//a[text()='Home & Kitchen']"));
		js.executeScript("arguments[0].scrollIntoView();", homeKitchen);
		System.out.println("Scroll into view");
		Thread.sleep(4000);
		js.executeScript("arguments[0].click();", homeKitchen);
		System.out.println(" Element clicked");
		Thread.sleep(4000);
		js.executeScript("document.getElementById('twotabsearchtextbox').value='pot';");
		System.out.println("Value passed");
		Thread.sleep(4000);

	}

	public static void main(String[] args) throws InterruptedException {
		browser_Launch();
		url_Launch();
		java_Script();
	}
}
