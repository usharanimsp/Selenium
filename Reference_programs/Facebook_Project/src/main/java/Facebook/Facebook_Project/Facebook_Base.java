package Facebook.Facebook_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Base {
	public static WebDriver driver;
public static WebDriver browser_Launch(String name) {
if (name.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver","F:\\prashanth_workspace\\Facebook_Project\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
	else if (name.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","F:\\prashanth_workspace\\Facebook_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}
return driver;
}
public static void get_Url(String name) {
driver.get(name);
}
public static void click(WebElement element) {
element.click();
}
public static void pass_Inputs(WebElement element,String name) {
element.sendKeys(name);
}
public static void close() {
driver.close();
}
public static void thread_Wait() throws InterruptedException {
Thread.sleep(2000);
}
}
