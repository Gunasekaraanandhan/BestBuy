package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bestbuy.pages.SearchAddPage;
import com.bestbuy.utils.Reports;
import com.bestbuy.utils.Wrapper;

@Listeners(Reports.class)
public class SearchAddTest extends Wrapper{
	
	Reports report = new Reports();
	@Test(priority = 5)
	public void searchAddPendrive() {
		
		//siginBestBuy();
		report.setTCDesc("Search pendrive to add one cart");
		
		launchBrowser("https://www.bestbuy.com");
		
		SearchAddPage sap = PageFactory.initElements(driver, SearchAddPage.class);
		
		sap.clickingUS();
		
		sap.searchProduct("pendrives ");
		
		sap.clickSearch();
		
		sap.clickSanDisk();
		
		sap.clickAddToCart();
		
		sap.clickGoToCart();
		
		screenShot("SearchAddCart");
		
		System.out.println("The SanDisk pendrive added to cart successfully");
		
		closeBrowser();
	}
	
	

}
