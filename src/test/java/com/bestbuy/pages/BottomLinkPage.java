package com.bestbuy.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Wrapper;

public class BottomLinkPage extends Wrapper {

	@FindBy(linkText = "United States")
	WebElement us;

	public void clickingUS() {
		waitForElement(us);
		clickAction(us);
	}

	@FindBy(linkText = "Accessibility")
	WebElement accessibility;

	public void scrollBottom() {
		waitForElement(accessibility);
		jsScrollUpToElement(accessibility);
	}

	@FindBy(linkText = "Top Deals")
	WebElement topDeals;

	public void scrollUp() {
		waitForElement(topDeals);
		jsScrollUpToElement(topDeals);
	}

	@FindBy(xpath = "//div[@class='flex justify-content-start']//a")
	List<WebElement> allLinks;

	public void gettingBottomLinks() {
		
		System.out.println("Total Links in Bottom :" + allLinks.size());
		for (WebElement link : allLinks) {

			String bottomLink = link.getAttribute("href");
			brokenLink(bottomLink);

		}
	}

}
