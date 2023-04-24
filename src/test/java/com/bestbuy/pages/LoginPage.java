package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Wrapper;

public class LoginPage extends Wrapper {
	
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
	
	@FindBy(linkText="Sign In")
	WebElement singin;
	
	public void clickSigin() {
		waitForElement(singin);
		clickAction(singin);
	}
	
	@FindBy(id="fld-e")
	WebElement email;
	
	public void typeEmail(String user) {
		waitForElement(email);
		typeText(email, user);
	}
	
	@FindBy(id="fld-p1")
	WebElement password;
	
	public void typePassword(String user) {
		waitForElement(password);
		typeText(password, user);
	}
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement singin1;
	
	public void clickSingin1() {
		waitForElement(singin1);
		clickAction(singin1);
	}

}
