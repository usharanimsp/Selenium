package Testng_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class Testng_Suites {
	public static WebDriver driver;
@BeforeClass
public void browser_Launch() {
	System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
@Test(priority = 0,groups = "url")
public void urlLaunch() throws InterruptedException {
driver.get("https://www.facebook.com/");
}
@Test(priority = 1,groups = "login")
public void userName() {
driver.findElement(By.id("email")).sendKeys("gsjdhfgdjh");
}
@Test(priority = 2,groups = "login",timeOut = 1000,expectedExceptions = ThreadTimeoutException.class)
public void pw() throws InterruptedException {
driver.findElement(By.id("pass")).sendKeys("12345");
driver.findElement(By.name("login")).click();
Thread.sleep(2000);
}
@AfterClass
public void close() {
driver.close();
}
}
