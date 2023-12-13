package com.taskprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWithoutSelect {
	public static WebDriver driver;
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	boolean a =true;
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	driver.findElement(By.xpath("//select")).click();
	List<WebElement> options = driver.findElements(By.xpath("//select//option"));
	for (WebElement webElement : options) {
		Robot r=new Robot();
		if (webElement.getText().equalsIgnoreCase("austria")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			a=false;
		}
		if (a==false)
			break;
		else
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);	
	}
}
}
