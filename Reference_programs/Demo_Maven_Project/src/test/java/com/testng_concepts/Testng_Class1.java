package com.testng_concepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public class Testng_Class1 {
	public static WebDriver driver;

	@BeforeClass
	public void browser_Launch() {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Facebook");
		System.out.println("=========");
		System.out.println("Browser launched");
	}

	@Test(priority = 1, invocationCount = 3)
	public void url_Launch() {
		driver.get("https://www.facebook.com/");
		System.out.println("Url launched");
	}
	@Test(priority = 2,groups = "Login")
	@Parameters({"id"})
	public void login_Email(String id) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(id);
		Thread.sleep(2000);
		System.out.println("Email");
	}
	@Test(priority = 3,groups = "Login")
	@Parameters({"password"})
	public void login_Password(String password) throws InterruptedException {
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		System.out.println("Password and Login");
	}
	@AfterClass
	public void close() {
		driver.quit();
		System.out.println("Quit");

	}
}
