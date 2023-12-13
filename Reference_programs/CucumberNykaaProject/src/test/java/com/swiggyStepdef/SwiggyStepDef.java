package com.swiggyStepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwiggyStepDef {
	public static WebDriver driver;

	@Given("user Should Launch The Swiggy Application")
	public void user_should_launch_the_swiggy_application() {
		System.setProperty("webdriver.chrome.driver", "F:\\sana_workspace\\CucumberNykaaProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("user Should Enter Location In Location Field")
	public void user_should_enter_location_in_location_field() {
		driver.findElement(By.xpath("//input[@id=\"location\"]")).sendKeys("600040");
	}

	@Then("user Should Click The Find Food Button And It Redirects To Home Page")
	public void user_should_click_the_find_food_button_and_it_redirects_to_home_page() {
		driver.findElement(By.xpath("//span[contains(text(),'Tamil Nadu 600040')]")).click();
	}

	@When("user Should Click Search Button")
	public void user_should_click_search_button() {
		driver.findElement(By.xpath("(//a[@href=\"/search\"])[1]")).click();
	}

	@When("user Type The Dish Name In Search Food And Click Enter")
	public void user_type_the_dish_name_in_search_food_and_click_enter() throws AWTException {
		driver.findElement(By.xpath("//input[@class=\"_2FkHZ\"]")).sendKeys("Grilled chicken");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("user Select A Dish And Click The Add Button")
	public void user_select_a_dish_and_click_the_add_button() {
		driver.findElement(By.xpath("//h3[text()='Grilled Chicken Full']//ancestor::div[@class=\"styles_detailsContainer__22vh8\"]//following-sibling::div[@class=\"styles_itemImageContainer__3Czsd styles_itemImageContainerNoImage__2PTSf\"]//child::div[@class=\"styles_itemAddButton__zJ7-R\"]//descendant::div[@class=\"_1RPOp\"]")).click();
	}

	@Then("click The Cart Button And It Redirects To Checkout Page")
	public void click_the_cart_button_and_it_redirects_to_checkout_page() throws InterruptedException {
		WebElement cart = driver.findElement(By.xpath("//A[@href=\"/checkout\"]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(cart);
		Thread.sleep(2000);
		cart.click();	
	}

	@When("user Should Click Login Button")
	public void user_should_click_login_button() {
		driver.findElement(By.xpath("//div[@class=\"C6mS- y9pNN\"]")).click();
	}

	@When("user Type The Phone Number In Number Field And Click Login")
	public void user_type_the_phone_number_in_number_field_and_click_login() {
		driver.findElement(By.xpath("//input[@id=\"mobile\"]")).sendKeys("8248965124");
		driver.findElement(By.xpath("//a[@class=\"_2REYC\"]")).click();
	}

	@When("user Type The Otp In Otp Field And Click Verify Otp")
	public void user_type_the_otp_in_otp_field_and_click_verify_otp() throws InterruptedException {
		Thread.sleep(1000);
		WebElement otp = driver.findElement(By.xpath("//input[@name=\"otp\"]"));
		Thread.sleep(1000);
		Scanner sc=new Scanner(System.in);
		String mobNo = sc.next();
		otp.sendKeys(mobNo);
		driver.findElement(By.xpath("//a[@class=\"_2REYC\"]")).click();
	}

	@When("user Choose The Address And Click Deliver Here Button")
	public void user_choose_the_address_and_click_deliver_here_button() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='Deliver Here']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"_2ZJ0s _1gp0r\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='CANCEL PAYMENT']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Yes, Cancel']")).click();
	}

	@When("user Click Pay Option In Pay Via Upi And Order will Be Placed")
	public void user_click_pay_option_in_pay_via_upi_and_order_will_be_placed() throws InterruptedException {
		Thread.sleep(1000);
	}
}
