package com.pgms;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_screenshot {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\eclipse-workspace\\Selenium_Pgms\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.myntra.com/");
		List<WebElement> heading = driver.findElements(By.xpath("//*[@class=\"desktop-navContent\"]"));
		for (WebElement headers : heading)
		{
			System.out.println(headers.getText());
		}
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("F:\\Usha doc\\g.jpeg"));
		
		

	}

}

