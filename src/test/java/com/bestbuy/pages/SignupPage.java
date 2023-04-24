package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Wrapper;

public class SignupPage extends Wrapper{
	
	@FindBy(linkText="United States")
	WebElement us;
	
	public void clickingUS() {
		waitForElement(us);
		clickAction(us);
	}
	
	@FindBy(xpath="//span[text()='Account']")
	WebElement account;
	
	public void clickAccount() {
		waitForElement(account);
		clickAction(account);
	}
	
	@FindBy(linkText="Create Account")
	WebElement createAccount;
	
	public void clickCreateAccount() {
		waitForElement(createAccount);
		clickAction(createAccount);
	}
	
	@FindBy(id="firstName")
	WebElement fname;
	
	public void setFirstName(String user) {
		waitForElement(fname);
		typeText(fname, user);
	}
	
	@FindBy(id="lastName")
	WebElement lname;
	
	public void setLastName(String user) {
		waitForElement(lname);
		typeText(lname, user);
	}
	
	@FindBy(id="email")
	WebElement email;
	
	public void setEmail(String user) {
		waitForElement(email);
		typeText(email, user);
	}
	
	@FindBy(id="fld-p1")
	WebElement password;
	
	public void setPassword(String user) {
		waitForElement(password);
		typeText(password, user);
	}
	
	@FindBy(id="reenterPassword")
	WebElement rePassword;
	
	public void setRePassword(String user) {
		waitForElement(rePassword);
		typeText(rePassword, user);
	}
	
	@FindBy(id="phone")
	WebElement number;
	
	public void setPhoneNumber(String user) {
		waitForElement(number);
		typeText(number, user);
	}
		
	@FindBy(xpath="//button[text()='Create an Account']")
	WebElement createAccount1;
	
	public void clickCreateAccount1() {
		waitForElement(createAccount1);
		clickAction(createAccount1);
	}

}
