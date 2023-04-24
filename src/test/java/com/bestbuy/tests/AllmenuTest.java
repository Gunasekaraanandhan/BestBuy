package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bestbuy.pages.AllmenuPage;
import com.bestbuy.utils.Reports;
import com.bestbuy.utils.Wrapper;

@Listeners(Reports.class)
public class AllmenuTest extends Wrapper{
	
	Reports report = new Reports();
	
	@Test(priority = 3)
	public void validateTitle() {
	
		try {
			report.setTCDesc("Validating Allmenu Title");
			
			launchBrowser("https://www.bestbuy.com");
			
			AllmenuPage ap = PageFactory.initElements(driver, AllmenuPage.class);
			ap.clickingUS();
			ap.clickTopDeal("Top Deals and Featured Offers on Electronics - Best Buy");
			Thread.sleep(3000);
			ap.clickDealOfTheDay("Deal of the Day: Electronics Deals - Best Buy");
			Thread.sleep(3000);
			ap.clickTotalTechMembership("Best Buy Totaltech™ – Best Buy");
			Thread.sleep(3000);
			ap.clickCreditCards("Best Buy Credit Card: Rewards & Financing");
			Thread.sleep(3000);
			ap.clickGiftCards("Gifts Cards and E-Gift Cards - Best Buy");
			Thread.sleep(3000);
			ap.clickMore();
			ap.clickGiftIdeas("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy");
			Thread.sleep(3000);
			ap.clickMore();
			ap.clickHealthAndWellness("Health & Wellness Solutions & Technology - Best Buy");
			Thread.sleep(3000);
			ap.clickMore();
			ap.clickBBOutlet("Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy");
			Thread.sleep(3000);
			ap.clickMore();
			ap.clickBBBusiness("Best Buy for Business - Best Buy");
			Thread.sleep(3000);
			
			System.out.println("All menu titles verified");
			closeBrowser();

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
