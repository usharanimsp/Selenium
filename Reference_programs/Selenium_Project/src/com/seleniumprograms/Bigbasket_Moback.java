package com.seleniumprograms;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bigbasket_Moback {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-CBE&gclid=Cj0KCQiA-oqdBhDfARIsAO0TrGGqnDuC1FyjftQskDZgJKkqNTNXAtAuPoqjAiTeJno_23HXTpR_NpAaAnxJEALw_wcB");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class=\"dropdown-toggle meganav-shop\"]")).click();
		Thread.sleep(2000);
		List<WebElement> lists = driver
				.findElements(By.xpath("//ul[@id=\"navBarMegaNav\"]//child::li[@class=\"ng-scope\"]"));
		for (WebElement displayLists : lists) {
			System.out.println(displayLists.getText());
		}
		driver.findElement(By.xpath("(//ul[@id=\"navBarMegaNav\"]//child::li[@class=\"ng-scope\"])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("(//div[@class=\"item prod-deck row ng-scope\"])[1]//descendant::button[text()='Add ']"))
				.click();
		Thread.sleep(2000);

		driver.close();

	}
}
