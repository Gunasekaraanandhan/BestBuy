package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Wrapper;

public class PaymentAndValidationPage extends Wrapper{
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkout;
	
	public void clickCheckout() {
		waitForElement(checkout);
		clickAction(checkout);
	}
	
	@FindBy(xpath="//button[text()='Continue as Guest']")
	WebElement guest;
	
	public void clickGuestButton() {
		waitForElement(guest);
		clickAction(guest);
	}
	
	@FindBy(id="user.emailAddress")
	WebElement enterEmail;
	
	public void enterEmail(String user) {
		waitForElement(enterEmail);
		typeText(enterEmail, user);
	}
	
	@FindBy(id="user.phone")
	WebElement enterNumber;
	
	public void enterNumber(String user) {
		waitForElement(enterNumber);
		typeText(enterNumber, user);
	}
	
	@FindBy(xpath="//span[text()='Continue to Payment Information']")
	WebElement continuePayment;
	
	public void clickContinuePayment() {
		waitForElement(continuePayment);
		jsScrollUpToElement(continuePayment);
		clickAction(continuePayment);
	}
	
	@FindBy(id="number")
	WebElement cardNumber;
	
	public void enterCardNumber(String user) {
		waitForElement(cardNumber);
		typeText(cardNumber, user);
	}
	
	@FindBy(id="first-name")
	WebElement fname;
	
	public void enterFirstName(String user) {
		waitForElement(fname);
		typeText(fname, user);
	}
	
	@FindBy(id="last-name")
	WebElement lname;
	
	public void enterLastName(String user) {
		waitForElement(lname);
		typeText(lname, user);
	}
	
	@FindBy(name="addressLine1")
	WebElement address;
	
	public void enterAddress(String user) {
		waitForElement(address);
		typeText(address, user);
	}
	
	@FindBy(name="city")
	WebElement city;
	
	public void enterCity(String user) {
		waitForElement(city);
		typeText(city, user);
	}
	
	@FindBy(id="state")
	WebElement state;
	
	public void selectState(String user) {
		waitForElement(state);
		selectDDByVisibleText(state, user);
	}
	
	@FindBy(name="postalCode")
	WebElement postal;
	
	public void enterPostalCode(String user) {
		waitForElement(postal);
		typeText(postal, user);
	}
	
	@FindBy(xpath="//span[text()='Place Your Order']")
	WebElement placeOrder;
	
	public void clickPlaceOrder() {
		waitForElement(placeOrder);
		clickAction(placeOrder);
	}

}
