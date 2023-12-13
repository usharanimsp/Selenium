package com.seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url_Replace_Program {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String s = "www.google.com/hotels";
		String s1 = "";
		String final_Url = "";
		if (s.contains("com")) {
			s1 = s.replace("com", "org");
		}
			if (s.contains("/")) {
				int slash = s1.indexOf("/");
				String s2 = s1.substring(slash + 1, s1.length());
				final_Url = s1.replace(s2, "cars");
			
		
		System.out.println(final_Url);
		driver.get(final_Url);

	}
}
}
