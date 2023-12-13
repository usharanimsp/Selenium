package com.cucumberNykaaStepdef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.NykaaConfigProperty.Nykaa_Config_Manager;
import com.cucumberNykabaseclass.Base_Class;
import com.pageobjectManager.Page_Object_Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Def_Nykaa_Cucumber extends Base_Class  {
	public static WebDriver driver = Base_Class.driver;
	Page_Object_Manager pom=new Page_Object_Manager(driver);
	@Given("user Should Launch The Application")
	public void user_should_launch_the_application() throws IOException {
		url_Launch(Nykaa_Config_Manager.getInstanceManager().getInstanceConfifReader().getUrl());
	}
	@When("user Should Click The Signin button")
	public void user_should_click_the_signin_button() {
		implicit_Wait();
		click(pom.getSignIn().getSigIn());
	}
	@Then("user Should Click The Signin With Mobile button and Redirects To Verification Page")
	public void user_should_click_the_signin_with_mobile_button_and_redirects_to_verification_page() {
		click(pom.getSignIn().getSigInWithMob());		
	}
	@When("user Should Enter {string} In Mobile Number Field")
	public void user_should_enter_in_mobile_number_field(String string) {
		input(pom.getverifyPage().getMobNo(), string);

	}
//	@When("user Should Enter Mobile Number In Mobile Number Field")
//	public void user_should_enter_mobile_number_in_mobile_number_field() throws IOException {
//		input(pom.getverifyPage().getMobNo(), Nykaa_Config_Manager.getInstanceManager().getInstanceConfifReader().getVerifyMobileNo());
//	}
	@When("click The Verify button Otp Will Be Sent To The Mobile Number")
	public void click_the_verify_button_otp_will_be_sent_to_the_mobile_number() {
		click(pom.getverifyPage().getSubmit());

	}
	@When("enter The Otp In Console It Will Be Taken As Input In Otp Field")
	public void enter_the_otp_in_console_it_will_be_taken_as_input_in_otp_field() {
		input(pom.getverifyPage().getOtp(), scanner_Method());
	}
	@Then("user Click The Verify button It Redirects to Home Page")
	public void user_click_the_verify_button_it_redirects_to_home_page() {
		click(pom.getverifyPage().getVerify());
	}
	@When("user Move To The Categories In The Home Page")
	public void user_move_to_the_categories_in_the_home_page() {
		actions_Method(pom.gethomePage().getHair(), "movetoelement");
	}
	@Then("user Select The Product and It Redirects To The Product Page")
	public void user_select_the_product_and_it_redirects_to_the_product_page() {
		click(pom.gethomePage().getSelectDryer());
	}
	@When("scroll The Page To The Product and Click Add To Bag Option")
	public void scroll_the_page_to_the_product_and_click_add_to_bag_option() {
		windowHandles();
		javascriptExecutorMethod(pom.getaddToCart().getDryer(), "scroll");
		javascriptExecutorMethod(pom.getaddToCart().getAddToBag(), "click");
	}
	@When("user Click The Cart button and Product In Cart Appears")
	public void user_click_the_cart_button_and_product_in_cart_appears() throws InterruptedException {
		click(pom.getaddToCart().getCart());
		explicit_Wait(pom.getaddToCart().getCartFrame());
		frame_Method(pom.getaddToCart().getCartFrame());
		sleep();
	}
	@Then("click The Proceed button It Redirects To Address Page")
	public void click_the_proceed_button_it_redirects_to_address_page() {
		explicit_Wait(pom.getaddToCart().getProceed());
		click(pom.getaddToCart().getProceed());
	}
	@When("user Click New Address To Add Details")
	public void user_click_new_address_to_add_details() {
		click(pom.getaddressPage().getNewAddress());
	}
	@When("user Enter The Area In Area Field")
	public void user_enter_the_area_in_area_field() throws IOException {
		input(pom.getaddressPage().getArea(),Nykaa_Config_Manager.getInstanceManager().getInstanceConfifReader().getArea());
	}
	@When("user Enter The House No In House No Field")
	public void user_enter_the_house_no_in_house_no_field() throws IOException {
		input(pom.getaddressPage().getHouseNo(),Nykaa_Config_Manager.getInstanceManager().getInstanceConfifReader().getHouseNo());
	}
	@When("user Enter The Pincode In Pincode Field")
	public void user_enter_the_pincode_in_pincode_field() throws IOException {
		input(pom.getaddressPage().getPincode(),Nykaa_Config_Manager.getInstanceManager().getInstanceConfifReader().getPincode());
	}
	@When("user Enter The Email Id In Email Id Field")
	public void user_enter_the_email_id_in_email_id_field() throws IOException {
		javascriptExecutorMethod(pom.getaddressPage().getEmail(), "scroll");
		input(pom.getaddressPage().getEmail(),Nykaa_Config_Manager.getInstanceManager().getInstanceConfifReader().getEmail());
	}
	@When("user Enter The Name In Name Field")
	public void user_enter_the_name_in_name_field() throws IOException {
		input(pom.getaddressPage().getName(),Nykaa_Config_Manager.getInstanceManager().getInstanceConfifReader().getName());
	}
	@When("user Enter The Mobile Number In Mobile Number Field")
	public void user_enter_the_mobile_number_in_mobile_number_field() throws IOException {
		input(pom.getaddressPage().getPhone(),Nykaa_Config_Manager.getInstanceManager().getInstanceConfifReader().getMobileNo());
	}
	@Then("click Ship To This Address button and It Redirects To Payment Page")
	public void click_ship_to_this_address_button_and_it_redirects_to_payment_page() throws InterruptedException {
		click(pom.getaddressPage().getShipToThisAddress());	
		sleep();
	}
	@When("user Select The Payment Method As Cash On Delivery")
	public void user_select_the_payment_method_as_cash_on_delivery() {
		javascriptExecutorMethod(pom.getplaceOrder().getCashOnDelivery(), "scroll");
		click(pom.getplaceOrder().getCashOnDelivery());
	}
	@Then("click The Place Order button And It Redirects To Order Confirmed Page")
	public void click_the_place_order_button_and_it_redirects_to_order_confirmed_page() {
		click(pom.getplaceOrder().getPlaceOrder());
	}
}
