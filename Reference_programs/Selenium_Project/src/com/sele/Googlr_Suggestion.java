package com.sele;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlr_Suggestion {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\prashanth_workspace\\seleproj.zip_expanded\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		element.click();
		element.sendKeys("sachin");
		Thread.sleep(2000);
		List<WebElement> Suggestions = driver.findElements(By.xpath("(//ul[@role=\"listbox\"])[1]//descendant::li[@role=\"presentation\"]"));
	for (WebElement lists : Suggestions) {
		System.out.println(lists.getText());
	}
	driver.close();
	}
}
