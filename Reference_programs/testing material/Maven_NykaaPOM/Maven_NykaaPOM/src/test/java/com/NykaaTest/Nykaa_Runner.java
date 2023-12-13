package com.NykaaTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Nykaa_POM.AddToBagPage;
import com.Nykaa_POM.AddressPage;
import com.Nykaa_POM.FaceWashPage;
import com.Nykaa_POM.HomePage;
import com.Nykaa_POM.LoginRegPage;
import com.Nykaa_POM.OTPVerificationPage;
import com.Nykaa_POM.PaymentPage;
import com.Nykaa_POM.SignInPage;
import com.Nykaa_SeleniumBase.NykaaBase;

public class Nykaa_Runner extends NykaaBase {
	
	public static WebDriver driver= browserLaunch("chrome");
	public static SignInPage signin= new SignInPage(driver);
	public static LoginRegPage login= new LoginRegPage(driver);
	public static OTPVerificationPage otp= new OTPVerificationPage(driver);
	public static HomePage home= new HomePage(driver);
	public static FaceWashPage facewash= new FaceWashPage(driver);
	public static AddToBagPage addtobag= new AddToBagPage(driver);
	//public static AddressPage address= new AddressPage(driver);
	//public static PaymentPage payment= new PaymentPage(driver);

	public static void main(String[] args) throws IOException, InterruptedException {
		urlLaunch("https://www.nykaa.com/");
		clickElement(signin.getSignIn());
		clickElement(signin.getSigInMobileNum());
		inputElement(login.getEmailMobile(),"8884104781");
		clickElement(login.getProceed());
		inputElement(otp.getOtpValue(),scannerinput());
		clickElement(otp.getVerify());
		screenShots("OTP Verification");
		actions(home.getSkin(),"moveToElement");
		clickElement(home.getFaceWash());
		windowHandles();
		//actions(facewash.getNykaaFaceWash(),"click");
		//actions(facewash.getNeutrogenaFaceWash(),"click");
		actions(facewash.getNeutrogenaFaceWashele(),"moveToElement");
		actions(facewash.getNeutrogenaFaceWasha2b(),"click");
		driver.navigate().refresh();
		//windowHandles();
		//actions(addtobag.getaddToBag(),"click");
		//Thread.sleep(2000);
		actions(addtobag.getbagSection(),"click");
		//Thread.sleep(2000);
		screenShots("CartSection");
		//Thread.sleep(2000);
		iframes(addtobag.getiframe());
		Thread.sleep(2000);
		System.out.println("before proceed");
		Thread.sleep(2000);
		
		//actions(addtobag.getproceed(),"moveToElement");
		//actions(addtobag.getproceed(),"click");
		clickElement(addtobag.getproceed());
		//driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		//driver.switchTo().defaultContent();
		//Thread.sleep(2000);
		//windowHandles();
		System.out.println("after proceed");
		//Thread.sleep(2000);
		//driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		//driver.navigate().to(driver.getCurrentUrl());
		driver.findElement(By.xpath("//p[text()='Add New Address']")).click();
		//windowHandles();
		//driver.findElement(By.xpath("//p[text()='Add New Address']")).click();
		//clickElement(addtobag.getproceed());
		//driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
		//javaScriptExecutor(address.getdeliverhere(),"click");
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//driver.findElement(By.xpath("//div[@class='css-1pan5g8 e1gecm6x0']")).click();
		//WebElement newaddress= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='css-1pan5g8 e1gecm6x0']")));
		//newaddress.click();
		//driver.findElement(By.xpath("//p[text()='Add New Address']")).click();
		//clickElement(address.getdeliverhere());
		//driver.navigate().refresh();
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		WebElement deliver= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()='Deliver here'])[1]")));
//		deliver.click();
//		//elementToBeClickable
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//button[text()='Deliver here'])[1]")).click();
		//actions(address.getdeliverhere(),"click");
		//<button color="#ffffff" class="css-n7wnfc e8tshxd0">Deliver here<span class="css-abbvp6 ehes2bo0"><img src="https://adn-static1.nykaa.com/media/wysiwyg/Payments/desktop-icons/trailing-icon.svg" alt="Image" class="css-0 ek8d9s80"></span></button>
		//driver.findElement(By.className("css-n7wnfc e8tshxd0")).click();
		//driver.findElement(By.cssSelector("#app > div > div > div > div > div.css-1ve11tf.e1d2l6h70 > div.css-i0a6dx.e1d2l6h71 > div.css-1cxfx91.e1d2l6h72 > div > div.css-rpv3vl.e1ozvfuh0 > div:nth-child(2) > div.css-k7iyyk.e14b3ylv4 > div.css-70xe38.e14b3ylv5 > button")).click();
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]/button")).click();
		//clickElement(address.getdeliverhere());
//		actions(address.getnewAddress(),"click");
//		inputElement(address.getpincode(),"560024");
//		inputElement(address.gethouseno(),"113");
//		inputElement(address.getroad(),"Dasarahalli");
//		clickElement(address.getship());
		
		
		
		/*
		screenShots("Payment");
		actions(payment.getcod(),"click");
		screenShots("CashOnDelivery");
		actions(payment.getplaceOrder(),"click");
		screenShots("OderderPlaced");
		*/
	}
}
