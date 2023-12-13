package com.testng_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Testng_Class2 {
	public static WebDriver driver;

	@BeforeClass
	public void browser_Launch() {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser launched");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test(priority = 1, timeOut = 6000)
	public void url_Launch() {
		driver.get("https://www.facebook.com/");
		System.out.println("Url launched");
	}
	@Test(priority = 2, dataProvider = "id")
	public void id(String id, String password) throws InterruptedException {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(id);
		System.out.println("Id is " + id);
		WebElement pw = driver.findElement(By.id("pass"));
		pw.sendKeys(password);
		System.out.println("Password is " + password);
Thread.sleep(2000);
////		WebElement logIn = driver.findElement(By.name("login"));
//		Thread.sleep(2000);
//		logIn.click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(4000);
//		email.click();
		email.clear();
//		pw.click();
pw.clear();

	}
	@DataProvider
	public Object[][] id() {
		return new Object[][] { { "sahana@gmail.com", "123" },{"dheera@jj","shdgsd"}};
	}
//	@AfterClass
//	public void close() {
//		driver.quit();
//		System.out.println("Quit");
//
//	}
}
