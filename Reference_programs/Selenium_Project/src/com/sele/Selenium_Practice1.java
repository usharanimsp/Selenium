package com.sele;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Practice1 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("email"));
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("jahana");
		WebElement fbtext = driver.findElement(By.tagName("h2"));
		String text4 = fbtext.getText();
		System.out.println(text4);
		boolean displayed1 = fbtext.isDisplayed();
		System.out.println(displayed1);
		boolean selected2 = fbtext.isSelected();
		System.out.println(selected2);
		boolean enabled = fbtext.isEnabled();
		System.out.println(enabled);
		WebElement creacc = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
		creacc.click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		day.click();
		Select s = new Select(day);
		s.selectByVisibleText("17");
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		boolean selected = gender.isSelected();
		System.out.println(selected);
		gender.click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.navigate().to("http://www.seleniumframework.com/Practiceform/");
		driver.manage().window().maximize();
		WebElement alert = driver.findElement(By.id("alert"));
		alert.click();
	Alert a = driver.switchTo().alert();
		a.accept();
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe");
		WebElement text2 = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		text2.sendKeys("abc");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement ifrm = driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]"));
		ifrm.click();
		WebElement iframbutton = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(iframbutton);
		WebElement iframbutton2 = driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
		driver.switchTo().frame(iframbutton2);
		WebElement textboxx = driver.findElement(By.xpath("//input[@type=\"text\"]"));
			textboxx.sendKeys("buhahah");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\prashanth_workspace\\seleproj.zip_expanded\\Selenium_Project\\SS.png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(2000);

		driver.close();

	}
}
