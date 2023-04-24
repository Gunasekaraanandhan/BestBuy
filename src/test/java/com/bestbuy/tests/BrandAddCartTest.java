package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bestbuy.pages.BrandAddCartPage;
import com.bestbuy.utils.Reports;
import com.bestbuy.utils.Wrapper;

@Listeners(Reports.class)
public class BrandAddCartTest extends Wrapper{
	
	Reports report = new Reports();
	@Test(priority = 7)
	public void brandAddToCart() {
		
		try {
			report.setTCDesc("Add to cart in Brands");
			
			launchBrowser("https://www.bestbuy.com");
			
			BrandAddCartPage bp = PageFactory.initElements(driver, BrandAddCartPage.class);
			
			bp.clickingUS();
			bp.clickAllMenu();
			bp.clickBrands();
			bp.clickApple();
			bp.clickAirPods();
			bp.clickAirPodsMax();
			bp.clickAddToCart();
			bp.clickGoToCart();
			screenShot("BrandAddCart");
			System.out.println("Apple Airpod added to cart successfully");
			
			closeBrowser();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
