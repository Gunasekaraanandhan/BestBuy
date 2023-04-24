package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.Wrapper;

public class AllmenuPage extends Wrapper {

	@FindBy(linkText = "United States")
	WebElement us;

	public void clickingUS() {
		waitForElement(us);
		clickAction(us);
	}

	@FindBy(linkText = "Top Deals")
	WebElement topDeal;

	public void clickTopDeal(String expectedTitle) {
		waitForElement(topDeal);
		clickAction(topDeal);
		validateTitle(expectedTitle);
		System.out.println("Top Deal Validation successfull");
	}

	@FindBy(linkText = "Deal of the Day")
	WebElement dealDay;

	public void clickDealOfTheDay(String expectedTitle) {
		waitForElement(dealDay);
		clickAction(dealDay);
		validateTitle(expectedTitle);
		System.out.println("Deal of the Day Validation successfull");
	}

	@FindBy(linkText = "Totaltech Membership")
	WebElement totalTech;

	public void clickTotalTechMembership(String expectedTitle) {
		waitForElement(totalTech);
		clickAction(totalTech);
		validateTitle(expectedTitle);
		System.out.println("TotalTech Validation successfull");
	}

	@FindBy(linkText = "Credit Cards")
	WebElement creditCards;

	public void clickCreditCards(String expectedTitle) {
		waitForElement(creditCards);
		clickAction(creditCards);
		validateTitle(expectedTitle);
		System.out.println("Credit Cards Validation successfull");
	}

	@FindBy(linkText = "Gift Cards")
	WebElement giftCards;

	public void clickGiftCards(String expectedTitle) {
		waitForElement(giftCards);
		clickAction(giftCards);
		validateTitle(expectedTitle);
		System.out.println("Gift Cards Validation successfull");
	}
	
	@FindBy(xpath="//span[text()='More']")
	WebElement more;
	
	public void clickMore() {
		waitForElement(more);
		clickAction(more);
	}
	
	@FindBy(linkText = "Gift Ideas")
	WebElement giftIdeas;

	public void clickGiftIdeas(String expectedTitle) {
		waitForElement(giftIdeas);
		clickAction(giftIdeas);
		validateTitle(expectedTitle);
		System.out.println("Gift Ideas Validation successfull");
	}
	
	@FindBy(linkText = "Health & Wellness")
	WebElement health;

	public void clickHealthAndWellness(String expectedTitle) {
		waitForElement(health);
		clickAction(health);
		validateTitle(expectedTitle);
		System.out.println("Health and Wellness Validation successfull");
	}
	
	@FindBy(linkText = "Best Buy Outlet")
	WebElement bbOutlet;

	public void clickBBOutlet(String expectedTitle) {
		waitForElement(bbOutlet);
		clickAction(bbOutlet);
		validateTitle(expectedTitle);
		System.out.println("Best Buy Outlet Validation successfull");
	}
	
	@FindBy(linkText = "Best Buy Business")
	WebElement bbusiness;

	public void clickBBBusiness(String expectedTitle) {
		waitForElement(bbusiness);
		clickAction(bbusiness);
		validateTitle(expectedTitle);
		System.out.println("Best Buy Business Validation successfull");
	}
}
