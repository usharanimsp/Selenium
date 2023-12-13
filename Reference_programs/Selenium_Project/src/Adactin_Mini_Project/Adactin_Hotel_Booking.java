package Adactin_Mini_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adactin_Hotel_Booking {
	public static WebDriver driver;
	public static void screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\sana_workspace\\Selenium_Project\\Alert_Screenshot" + name + ".png");
		FileUtils.copyFile(src, dest);
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\Selenium_Project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("Sahanajagatheesan");
		driver.findElement(By.id("password")).sendKeys("Benjamintennyson10");
//		screenshot("login");
		driver.findElement(By.id("login")).click();
		WebElement location = driver.findElement(By.id("location"));
		Select selectLocation = new Select(location);
		selectLocation.selectByValue("Los Angeles");
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select selectHotels = new Select(hotels);
		selectHotels.selectByValue("Hotel Sunshine");
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select selectRoomType = new Select(roomType);
		selectRoomType.selectByValue("Deluxe");
		WebElement noOfRooms = driver.findElement(By.id("room_nos"));
		Select selectNoOfRooms = new Select(noOfRooms);
		selectNoOfRooms.selectByValue("3");
		WebElement checkInDate = driver.findElement(By.id("datepick_in"));
		checkInDate.clear();
		checkInDate.sendKeys("28/01/2023");
		WebElement checkOutDate = driver.findElement(By.id("datepick_out"));
		checkOutDate.clear();
		checkOutDate.sendKeys("31/01/2023");
		WebElement adultsPerRoom = driver.findElement(By.id("room_nos"));
		Select selectadultsPerRoom = new Select(adultsPerRoom);
		selectadultsPerRoom.selectByValue("2");
		WebElement childrenPerRoom = driver.findElement(By.id("room_nos"));
		Select selectchildrenPerRoom = new Select(childrenPerRoom);
		selectchildrenPerRoom.selectByValue("1");
//		screenshot("hotelbooking");
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
//		screenshot("Confirm hotel");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("Sahana");
		driver.findElement(By.id("last_name")).sendKeys("J");
		driver.findElement(By.id("address")).sendKeys("212/c Ram nagar, \nErode \n638004");
		driver.findElement(By.id("cc_num")).sendKeys("4657835890264478");
		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select selectCcType = new Select(ccType);
		selectCcType.selectByValue("VISA");
		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		Select selectExpMonth = new Select(expMonth);
		selectExpMonth.selectByValue("4");
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		Select selectExpYear = new Select(expYear);
		selectExpYear.selectByValue("2022");
		driver.findElement(By.id("cc_cvv")).sendKeys("177"); 
		driver.findElement(By.id("book_now")).click();
//		screenshot("credentials");
		driver.findElement(By.id("my_itinerary")).click();
		driver.findElement(By.id("btn_id_842045")).click();
//		WebDriverWait wb=new WebDriverWait(driver, 20);
		screenshot("cancelled");
//		wb.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();

		driver.findElement(By.id("logout")).click();
//		screenshot("logout");
		System.out.println("Congrats! Hotel booking is done");
	}
}
