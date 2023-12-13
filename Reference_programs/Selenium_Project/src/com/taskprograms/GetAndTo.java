package com.taskprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndTo {
	public static WebDriver driver;
	public static void method_1() {
		driver.get("https://www.abhibus.com/");
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().to("https://www.snapdeal.com/");	
	}
public static void method_2() {
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().to("https://www.snapdeal.com/");
	driver.get("https://www.abhibus.com/");
	driver.get("https://www.facebook.com/");
}
public static void method_3() {
	driver.navigate().to("https://www.amazon.in/");
	driver.get("https://www.abhibus.com/");
	driver.get("https://www.facebook.com/");
	driver.navigate().to("https://www.snapdeal.com/");	
}
public static void method_4() {
	driver.get("https://www.abhibus.com/");
	driver.navigate().to("https://www.snapdeal.com/");
	driver.get("https://www.facebook.com/");
}
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
//	method_1();
//	method_2();
//	method_3();
	method_4();
}
}
