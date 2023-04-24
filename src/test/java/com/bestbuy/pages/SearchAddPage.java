package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Wrapper;

public class SearchAddPage extends Wrapper{
	
	@FindBy(linkText="United States")
	WebElement us;
	
	public void clickingUS() {
		waitForElement(us);
		clickAction(us);
	}
	
	@FindBy(name="st")
	WebElement search;
	
	public void searchProduct(String user) {
		waitForElement(search);
		typeText(search, user);
	}
	
	@FindBy(xpath="//button[@title='submit search']")
	WebElement search1;
	
	public void clickSearch() {
		waitForElement(search1);
		clickAction(search1);
	}
	
	@FindBy(linkText="SanDisk - 256GB iXpand Flash Drive Luxe for iPhone Lightning and Type-C Devices - Black")
	WebElement sanDisk;
	
	public void clickSanDisk() {
		waitForElement(sanDisk);
		clickAction(sanDisk);
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
	WebElement goToCart;
	
	public void clickGoToCart() {
		waitForElement(goToCart);
		clickAction(goToCart);
	}

}
