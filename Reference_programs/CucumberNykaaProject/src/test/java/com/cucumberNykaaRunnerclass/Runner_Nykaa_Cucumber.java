package com.cucumberNykaaRunnerclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.cucumberNykabaseclass.Base_Class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\cucumberNykaaFeaturefile", glue = "com\\cucumberNykaaStepdef")
public class Runner_Nykaa_Cucumber extends Base_Class {
	public static WebDriver driver;
@BeforeClass
public static void setUp() {
	driver=Base_Class.browser_Launch("chrome");
	System.out.println("Set up");
}
@AfterClass
public static void tearDown() {
Base_Class.quit();
System.out.println("Tear down");
}
}
