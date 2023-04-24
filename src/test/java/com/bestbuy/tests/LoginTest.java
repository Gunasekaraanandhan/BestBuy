package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bestbuy.pages.LoginPage;
import com.bestbuy.utils.Reports;
import com.bestbuy.utils.Wrapper;

@Listeners(Reports.class)
public class LoginTest extends Wrapper{
	
	Reports report = new Reports();
	@Test(priority = 2)
	public void siginBestBuy() {
		
		report.setTCDesc("Validate Login functionality");
		
		launchBrowser("https://www.bestbuy.com");
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		
		lp.clickingUS();
		lp.clickAccount();
		lp.clickSigin();
		lp.typeEmail("gunasekaranandhan24@gmail.com");
		lp.typePassword("Two+four=6");
		lp.clickSingin1();
		System.out.println("Login has been done successfully");
		closeBrowser();
		
	}
	

}
