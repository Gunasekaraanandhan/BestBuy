package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bestbuy.pages.BottomLinkPage;
import com.bestbuy.utils.Reports;
import com.bestbuy.utils.Wrapper;

@Listeners(Reports.class)
public class BottomLinkTest extends Wrapper {
	
	Reports report = new Reports();

	@Test(priority = 4)
	public void scrollBottomLink() {

		try {
			report.setTCDesc("Validate Bottom links");
			
			launchBrowser("https://www.bestbuy.com");

			BottomLinkPage bp = PageFactory.initElements(driver, BottomLinkPage.class);

			bp.clickingUS();

			bp.scrollBottom();
			Thread.sleep(3000);

			bp.gettingBottomLinks();
			Thread.sleep(3000);

			bp.scrollUp();
			
			System.out.println("The Bottom link has been validated and printed successfully");
			
			closeBrowser();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
