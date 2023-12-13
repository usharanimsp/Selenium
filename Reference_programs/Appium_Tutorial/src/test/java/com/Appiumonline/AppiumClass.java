package com.Appiumonline;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppiumClass {
	public static AndroidDriver driver;
public static void main(String[] args) throws MalformedURLException {
	DesiredCapabilities capabilities=new DesiredCapabilities();
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "11 RKQ1.200826.002");
	capabilities.setCapability("udid", "ed230338");
	capabilities.setCapability("deviceName", "Redmi K20 Pro");
	
	capabilities.setCapability("appPackage", "com.google.android.calculator");
	capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformName", "Android");

	URL url=new URL("http://0.0.0.0:4723/wd/hub");
	driver = new AndroidDriver(url, capabilities);
	
}
}
