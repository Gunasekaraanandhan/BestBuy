package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bestbuy.pages.DepartmentAddCartPage;
import com.bestbuy.utils.Reports;
import com.bestbuy.utils.Wrapper;

@Listeners(Reports.class)
public class DepartmentAddCartTest extends Wrapper{

	Reports report = new Reports();
	@Test(priority = 6)
	public void departmentAddItem() {
		
		report.setTCDesc("Add to cart in Department");
		
		launchBrowser("https://www.bestbuy.com");
		
		DepartmentAddCartPage dsp = PageFactory.initElements(driver, DepartmentAddCartPage.class);
		
		dsp.clickingUS();
		
		dsp.clickAllMenu();
		
		dsp.clickAppliance();
		
		dsp.clicksmallKitchen();
		
		dsp.clickbar_Wine();
		
		dsp.clickCuisinart();
		
		dsp.clickAddToCart();
		
		dsp.clickGoToCart();
		
		screenShot("DepatAddCart");
		
		System.out.println("The cuisinart vaccum sealer added to cart successfully");
		
		closeBrowser();
		
	}
	
}
