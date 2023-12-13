package com.seleniumprograms;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Program {
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

	public static void single_Dropdown() throws InterruptedException {
		WebElement amazonAll = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(amazonAll);
		s.selectByVisibleText("Books");
//		s.deselectByVisibleText("Books");
		System.out.println("Books is selected");
		System.out.println();
	}

	public static void multiple_Dropdown() throws InterruptedException {
		driver.navigate().to("https://letcode.in/test");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Dialog']")).click();
//		driver.findElement(By.id("prompt")).click();
//
//		Alert aa = driver.switchTo().alert();
//		aa.sendKeys("sana");
//		aa.accept();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Drop-Down']")).click();
		WebElement superHero = driver.findElement(By.id("superheros"));
		Select s = new Select(superHero);
	List<WebElement> opt = s.getOptions();
	for (WebElement webElement : opt) {
//		System.out.println(webElement.getText());
		if (webElement.getText().equalsIgnoreCase("Batman")) {
			s.selectByVisibleText(webElement.getText());
		}
	}
//		s.selectByIndex(2);
//		s.selectByIndex(1);
//		s.deselectByIndex(1);
		System.out.println("Superheros selected");
		System.out.println();
		Thread.sleep(2000);
		List<WebElement> superHeros = driver.findElements(By.id("superheros"));
		for (WebElement heros : superHeros) {
//			System.out.println(heros.getText());
		}
	}

	public static void close() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		browser_Launch();
		url_Launch();
//		single_Dropdown();
		multiple_Dropdown();
		close();

	}

}
