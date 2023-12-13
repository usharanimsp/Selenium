package com.seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Frame_Program {

	public static WebDriver driver;
	static String broserName = "chrome";
static int count =0;
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
		driver.get("https://demo.automationtesting.in/Frames.html");
	}

	public static void frame_Method() throws InterruptedException {
		driver.switchTo().frame("singleframe");
		WebElement textBox1 = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		textBox1.sendKeys("sana");
		System.out.println("Single Frame input given Successfully");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement ifrm = driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]"));
		ifrm.click();
		WebElement parentFrame = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(parentFrame);
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
		driver.switchTo().frame(innerFrame);
		WebElement textBox2 = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		textBox2.sendKeys("Hello");
		System.out.println("Multiple Frame input given Successfully");

	}
	public static void close() {
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		browser_Launch();
		url_Launch();
		frame_Method();
		close();
	}
}
