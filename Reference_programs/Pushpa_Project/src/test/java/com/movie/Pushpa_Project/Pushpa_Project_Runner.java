package com.movie.Pushpa_Project;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.POM.Imdb_page;
import com.POM.Pushpa_Imdb;
import com.POM.Pushpa_Wiki;
import com.POM.Wiki_Page;

import java.awt.AWTException;


public class Pushpa_Project_Runner extends Base_Pushpa {
	@BeforeClass
	public void browser_Launch() {
		browser_Launch("chrome");
	}

	@Test(priority = 1)
	public void imdb_Launch() {
		url_Launch("https://www.imdb.com/");
	}

	@Test(priority = 2)
	public void imdb_Search() throws AWTException {
		Imdb_page imdbpage = new Imdb_page(driver);
		wait_Method();
		pass_Input(imdbpage.getImdbSearch(), "Pushpa");
		click_Element(imdbpage.getPushpa_Select());
		Pushpa_Imdb pimdb = new Pushpa_Imdb(driver);
		wait_Method();
		System.out.println("Imdb details about the Movie Pushpa:The Rise");
		scroll_Down(pimdb.getReleaseDateImdb());
		String imdbRelease = pimdb.getReleaseDateImdb().getText();
		String imdbCountry = pimdb.getCountryImdb().getText();
		System.out.println(imdbRelease);
		System.out.println(imdbCountry);
		wait_Method();
		navigate("https://www.wikipedia.org/");
		Wiki_Page wikipage = new Wiki_Page(driver);
		wait_Method();
		pass_Input(wikipage.getWikiSearch(), "Pushpa");
		robot_Click();
		Pushpa_Wiki pwiki = new Pushpa_Wiki(driver);
		wait_Method();
		System.out.println("Wikipedia details about the Movie Pushpa:The Rise");
		String wikiReleaseDate = pwiki.getReleaseDateWiki().getText();
		String wikiCountry = pwiki.getCountryWiki().getText();
		System.out.println(pwiki.getReleaseDateWiki().getText());
		System.out.println(pwiki.getCountryWiki().getText());
		//Assert.assertEquals(wikiReleaseDate, imdbRelease );
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(wikiReleaseDate, imdbRelease);
		Assert.assertEquals(wikiCountry, imdbCountry);
	}
	
	@AfterClass
	public void close_Driver() {
		wait_Method();
		close();
	}

}
