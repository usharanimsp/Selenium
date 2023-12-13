package com.seleniumprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa_LowestPrice {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
		List<Integer> li = new ArrayList<>();
		List<String> li1 = new ArrayList<>();
		int temp = 0;
		String temp1=null;
		WebElement hair = driver.findElement(By.xpath("//div[@id=\"my-menu\"]//descendant::a[text()='hair']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(hair).build().perform();
		driver.findElement(By.xpath("//a[text()='Dryers & Stylers']")).click();
		Set<String> win = driver.getWindowHandles();
		for (String string : win) {
			driver.switchTo().window(string);
		}
		List<WebElement> productPrices = driver
				.findElements(By.xpath("//div[@id=\"product-list-wrap\"]//descendant::span[@class=\"css-111z9ua\"]"));
		for (WebElement webElement : productPrices) {
			String text = webElement.getText();
			String price = text.replaceAll("[^0-9]", "");
			int priceInNum = Integer.parseInt(price);
			li.add(priceInNum);
		}
		List<WebElement> productNames = driver
				.findElements(By.xpath("//div[@id=\"product-list-wrap\"]//descendant::div[@class=\"css-xrzmfa\"]"));
		for (WebElement names : productNames) {
			String nameText = names.getText();
			li1.add(nameText);
		}
		int a[] = new int[li.size()];
		String b[] = new String[li1.size()];
		for (int i = 1; i < li.size(); i++) {
			a[i] = li.get(i);
		}
		for (int i = 1; i < li1.size(); i++) {
			b[i]=li1.get(i);
		}
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
		if (a[i]<a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			temp1=b[i];
			b[i]=b[j];
			b[j]=temp1;
		}
	}	
}
System.out.println("===Hair dryer price list low to high===");
System.out.println();
int i;
for (i = 1; i < a.length; i++) {
	System.out.println(a[i]+"=="+b[i]);
}
System.out.println("-------------------------------------------------------------");
System.out.println("Lowest price : "+a[1]+"=="+b[1]);
	}
}
