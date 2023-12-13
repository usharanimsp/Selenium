package com.seleniumprograms;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Webtable_Program {
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
		driver.get("https://letcode.in/table");
	}

	public static void webtable_Method() {
		List<WebElement> datas = driver.findElements(By.xpath("//table[@id=\"simpletable\"]//td"));
for (WebElement names : datas) {
	if (names.getText().equalsIgnoreCase("Koushik")) {
		driver.findElement(By.xpath("//table[@id=\"simpletable\"]//tr[1]/td/input")).click();
		System.out.println("Koushik is clicked");
	}if (names.getText().equalsIgnoreCase("Yashwanth")) {
		driver.findElement(By.xpath("//table[@id=\"simpletable\"]//tr[2]/td/input")).click();
		System.out.println("Yashwanth is clicked");
	}if (names.getText().equalsIgnoreCase("Iron")) {
		driver.findElement(By.xpath("//table[@id=\"simpletable\"]//tr[3]/td/input")).click();
		System.out.println("Iron is clicked");
	}
}
		
	}

	public static void close() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		browser_Launch();
		url_Launch();
		webtable_Method();
		// close();
	}
}
