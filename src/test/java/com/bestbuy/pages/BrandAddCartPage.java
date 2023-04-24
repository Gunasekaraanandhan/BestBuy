package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Wrapper;

public class BrandAddCartPage extends Wrapper{
	
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
	
	@FindBy(xpath="//button[text()='Brands']")
	WebElement brands;
	
	public void clickBrands() {
		waitForElement(brands);
		clickAction(brands);
	}
	
	@FindBy(linkText="Apple")
	WebElement apple;
	
	public void clickApple() {
		waitForElement(apple);
		clickAction(apple);
	}
	
	@FindBy(linkText="AirPods")
	WebElement airPods;
	
	public void clickAirPods() {
		waitForElement(airPods);
		clickAction(airPods);
	}
	
	@FindBy(linkText="AirPods Max")
	WebElement airPodsMax;
	
	public void clickAirPodsMax() {
		waitForElement(airPodsMax);
		clickAction(airPodsMax);
	}
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	WebElement addToCart;
	
	public void clickAddToCart() {
		waitForElement(addToCart);
		//clickAction(addToCart);
		jsScrollUpToElement(addToCart);
		jsClick(addToCart);
	}
	
	@FindBy(linkText="Go to Cart")
	WebElement goCart;
	
	public void clickGoToCart() {
		waitForElement(goCart);
		clickAction(goCart);
	}
}
