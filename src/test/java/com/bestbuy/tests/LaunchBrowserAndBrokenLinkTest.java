package com.bestbuy.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bestbuy.utils.Wrapper;
import com.bestbuy.utils.Reports;

@Listeners(Reports.class)
public class LaunchBrowserAndBrokenLinkTest extends Wrapper {

	Reports report = new Reports();

	@Test(priority = 0)
	public void findBrokenlinkOrNot() {

		try {
			report.setTCDesc("Launching the website and validate the url is Broken or Not");
			launchBrowser("https://www.bestbuy.com");
			brokenLink("https://www.bestbuy.com");
			System.out.println("The Bestbuy ecom website navigated and validate the url is broken or not successfully");
			
			closeBrowser();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
