package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bestbuy.pages.BrandAddCartPage;
import com.bestbuy.pages.DepartmentAddCartPage;
import com.bestbuy.pages.PaymentAndValidationPage;
import com.bestbuy.pages.SearchAddPage;
import com.bestbuy.utils.Reports;
import com.bestbuy.utils.Wrapper;

@Listeners(Reports.class)
public class PaymentAndValidationTest extends Wrapper{

	Reports report = new Reports();
	@Test(priority = 8)
	public void dummyPayments() {

		try {
			report.setTCDesc("Payment and validation");
			
			launchBrowser("https://www.bestbuy.com");
			
			SearchAddPage sap = PageFactory.initElements(driver, SearchAddPage.class);
			sap.clickingUS();
			sap.searchProduct("pendrives ");
			sap.clickSearch();
			sap.clickSanDisk();
			sap.clickAddToCart();
			sap.clickGoToCart();

			BrandAddCartPage bp = PageFactory.initElements(driver, BrandAddCartPage.class);
			bp.clickAllMenu();
			bp.clickBrands();
			bp.clickApple();
			bp.clickAirPods();
			bp.clickAirPodsMax();
			bp.clickAddToCart();
			bp.clickGoToCart();
			Thread.sleep(5000);

			DepartmentAddCartPage dsp = PageFactory.initElements(driver, DepartmentAddCartPage.class);
			dsp.clickAllMenu();
			dsp.clickAppliance();
			dsp.clicksmallKitchen();
			dsp.clickbar_Wine();
			dsp.clickCuisinart();
			dsp.clickAddToCart();
			dsp.clickGoToCart();
			Thread.sleep(5000);
			screenShot("3AddCart");
			
			PaymentAndValidationPage pv = PageFactory.initElements(driver, PaymentAndValidationPage.class);
			pv.clickCheckout();
			pv.clickGuestButton();
			pv.enterEmail("guna@gmail.com");
			pv.enterNumber("9585148924");
			pv.clickContinuePayment();
			screenShot("ErrorInPayent");
			
			//while running thru code/script---> website is not working after clicking the Payment option clicking!!! 
			//Error am getting is: "Sorry, there was a problem. Please try that again." in the website... 
			//But manually this website is working fine
			
		/*	pv.enterCardNumber("2222333344445555");
			pv.enterFirstName("Gunasekar");
			pv.enterLastName("Aanandhan");
			pv.enterAddress("Newyork");
			pv.enterCity("Newyork");
			pv.selectState("TN");
			pv.enterPostalCode("12345");
			pv.clickPlaceOrder();
		*/	
			System.out.println("The payment button has been clicked successfully");
			System.out.println("There was problem in this stage in website so we can't verify that the order was placed successfully");
			closeBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
