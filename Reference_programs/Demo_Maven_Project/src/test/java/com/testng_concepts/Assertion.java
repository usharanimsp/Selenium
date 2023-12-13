package com.testng_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	public static WebDriver driver;
	@BeforeClass
	public void browser_Launch() {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test
	public void assert_Method() {
		System.out.println("Facebook and Instagram Buttons Assertion");
		System.out.println("****************************************");
		driver.get("https://www.instagram.com/");
		String loginInsta = driver.findElement(By.xpath("//button[@type=\"submit\"]")).getText();
		String forgotPwInsta = driver.findElement(By.xpath("//a[text()='Forgot password?']")).getText();
		driver.navigate().to("https://www.facebook.com/");
		String loginFb = driver.findElement(By.name("login")).getText();
		String forgotPwFb = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(forgotPwInsta, forgotPwFb);
		System.out.println(forgotPwInsta+"="+forgotPwFb);
		Assert.assertEquals(loginInsta, loginFb);
		System.out.println(loginInsta+"="+loginFb);
		System.out.println();
	}
	@AfterClass
	public void close() {
		driver.quit();
	}
}
