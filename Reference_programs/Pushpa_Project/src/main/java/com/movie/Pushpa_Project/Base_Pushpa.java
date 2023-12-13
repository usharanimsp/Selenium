package com.movie.Pushpa_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Pushpa {
	public static WebDriver driver;

	public WebDriver browser_Launch(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\prashanth_workspace\\Pushpa_Project\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			// driver.get("");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"F:\\prashanth_workspace\\Pushpa_Project\\driver\\chromedriver.exe");
			driver = new FirefoxDriver();
			// driver.get("");
			driver.manage().window().maximize();

		}
		return driver;
	}
public void wait_Method() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
	public void url_Launch(String url) {
		driver.get(url);
	}

	public void pass_Input(WebElement element, String name) {
		element.sendKeys(name);
	}

	public void click_Element(WebElement element) {
		element.click();
	}

	public void scroll_Down(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
public void robot_Click() throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}

	public void navigate(String naviUrl) {
		driver.navigate().to(naviUrl);
	}

	public void close() {
		driver.quit();
	}
}
