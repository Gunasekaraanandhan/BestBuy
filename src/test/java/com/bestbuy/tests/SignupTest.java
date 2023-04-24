package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bestbuy.pages.SignupPage;
import com.bestbuy.utils.Reports;
import com.bestbuy.utils.Wrapper;

@Listeners(Reports.class)
public class SignupTest extends Wrapper {
	
	Reports report = new Reports();
	@Test(priority = 1)
	public void signupBestBuy() {
		report.setTCDesc("Validate signup functionality");
		
		launchBrowser("https://www.bestbuy.com");
		SignupPage sp = PageFactory.initElements(driver, SignupPage.class);
		
		sp.clickingUS();
		sp.clickAccount();
		sp.clickCreateAccount();
		sp.setFirstName("Gunasekar");
		sp.setLastName("Aanandhan");
		sp.setEmail("gunasekaranandhan24@gmail.com");
		sp.setPassword("Two+four=6");
		sp.setRePassword("Two+four=6");
		sp.setPhoneNumber("9585148924");
		sp.clickCreateAccount1();
		System.out.println("Signup has been done suessfully");
		closeBrowser();
		
	}

}
