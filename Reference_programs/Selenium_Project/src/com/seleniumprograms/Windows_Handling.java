package com.seleniumprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
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
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
	}

	public static void url_Launch() {
		driver.get("https://www.amazon.com/");

	}

	public static void sda() throws AWTException {
		String win = driver.getWindowHandle();
		System.out.println(win);
		driver.switchTo().window(win);
		WebElement window_a = driver.findElement(By.xpath("//div[@id=\"glow-toaster-body\"]//following-sibling::div[@class=\"glow-toaster-footer\"]//descendant::input[@data-action-type=\"DISMISS\"]"));
		window_a.click();
		List<WebElement> all = driver.findElements(By.xpath("//div[@id=\"nav-xshop\"]//a[@class=\"nav-a  \"]"));
		for (WebElement webElement : all) {
			System.out.println(webElement.getText());
			Actions ac = new Actions(driver);
			ac.contextClick(webElement).build().perform();
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);

		}
	}

	public static void main(String[] args) throws AWTException {
		browser_Launch();
		url_Launch();
		sda();
	}

}
