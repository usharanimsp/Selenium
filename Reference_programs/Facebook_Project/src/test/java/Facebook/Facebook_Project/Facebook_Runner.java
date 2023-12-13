package Facebook.Facebook_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Facebook_Runner extends Facebook_Base {
public static void main(String[] args) throws InterruptedException {
	browser_Launch("chRomE");
	get_Url("https://www.facebook.com/");
	WebElement userName = driver.findElement(By.id("email"));
	pass_Inputs(userName, "sahana2gmail.com");
	thread_Wait();
	WebElement password = driver.findElement(By.id("pass"));
	pass_Inputs(password, "sana12345");
	WebElement login = driver.findElement(By.name("login"));
	click(login);
	thread_Wait();
	//close();
}
}
