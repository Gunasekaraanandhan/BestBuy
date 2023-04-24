package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Wrapper;

public class DepartmentAddCartPage extends Wrapper{
	
	@FindBy(linkText="United States")
	WebElement us;
	
	public void clickingUS() {
		waitForElement(us);
		clickAction(us);
	}
	
	@FindBy(xpath="//button[text()='Menu']")
	WebElement menuAll;
	
	public void clickAllMenu() {
		waitForElement(menuAll);
		clickAction(menuAll);
	}
	
	@FindBy(xpath="//button[text()='Appliances']")
	WebElement appliance;
	
	public void clickAppliance() {
		waitForElement(appliance);
		clickAction(appliance);
	}

	@FindBy(xpath="//button[text()='Small Kitchen Appliances']")
	WebElement small;
	
	public void clicksmallKitchen() {
		waitForElement(small);
		clickAction(small);
	}
	
	@FindBy(linkText="Bar & Wine")
	WebElement barWine;
	
	public void clickbar_Wine() {
		waitForElement(barWine);
		clickAction(barWine);
	}
	
	//@FindBy(linkText="Epicureanist - Illuminati Red Wine Glasses (6-Pack) - Clear")
	//Cuisinart - Cordless Wine Opener with Vacuum Sealer - Black
	@FindBy(partialLinkText="Cuisinart - Cordless")
	WebElement cuisinart;
	
	public void clickCuisinart() {
		waitForElement(cuisinart);
		clickAction(cuisinart);
	}
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	WebElement addToCart;
	
	public void clickAddToCart() {
		waitForElement(addToCart);
		//clickAction(addToCart);
		//jsScrollUpToElement(addToCart);
		jsClick(addToCart);
	}
	
	@FindBy(linkText="Go to Cart")
	WebElement goCart;
	
	public void clickGoToCart() {
		waitForElement(goCart);
		clickAction(goCart);
	}
	
}
