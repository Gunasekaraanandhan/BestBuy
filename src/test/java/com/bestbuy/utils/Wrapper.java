package com.bestbuy.utils;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wrapper {
	/*
	 * This class contains all the selenium re-usable methods
	 * 
	 * for update chrome browser ChromeOptions options = new ChromeOptions();
	 * options.addArguments("--remote-allow-origins=*"); driver = new
	 * ChromeDriver(options);
	 */
	public static WebDriver driver = null;

	public void launchBrowser(String url) {

		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
			Reports.reportStep("PASS", "Browser launched successfully with " + url);
		} catch (Exception ex) {
			System.out.println("Problem while launching Browser");
			Reports.reportStep("FAIL", "Problem while launching the browser with " + url);
			ex.printStackTrace();
		}
	}

	public void brokenLink(String url) {

		try {
			HttpURLConnection httpConnection = (HttpURLConnection) new URL(url).openConnection();
			httpConnection.connect();
			int respCode = httpConnection.getResponseCode();

			if (respCode >= 400) {
				System.out.println(url + " is broken and its responsecode is " + respCode);
				Reports.reportStep("PASS", "This " + url + " is broken");
			} else {
				System.out.println(url + " is Valid and its responsecode is " + respCode);
				Reports.reportStep("PASS", "This " + url + " is verified valid link");
			}
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while Verifing the " + url + " as broken link");
			ex.printStackTrace();
		}
	}

	public void quitBrowser() {
		try {
			driver.quit();
			Reports.reportStep("PASS", "Problem while closing All the Browsers");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while closing all the browsers");
			ex.printStackTrace();
		}
	}

	public void closeBrowser() {
		try {
			driver.close();
			Reports.reportStep("PASS", "Closing the active browser window");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Pooblem while closing the current browser window");
			ex.printStackTrace();
		}
	}

	public void validateTitle(String expectedTitle) {

		try {
			Assert.assertEquals(driver.getTitle(), expectedTitle);
			Reports.reportStep("PASS", "This " + expectedTitle + " has been verified successfully");
		} catch (Exception e) {
			Reports.reportStep("FAIL", "Problem while Verifing the " + expectedTitle);
			e.printStackTrace();
		}
	}

	public void typeText(WebElement ele, String text) {
		try {
			ele.clear();
			ele.sendKeys(text);
			Reports.reportStep("PASS", "The " + text + " was entered succesfully to the " + ele);
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "The " + text + " was not entered to the " + ele);
			ex.printStackTrace();
		}
	}

	public void clickAction(WebElement ele) {
		try {
			ele.click();
			Reports.reportStep("PASS", "The " + ele + " was clicked succesfully");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "The " + ele + " wasn't clicked");
			ex.printStackTrace();
		}
	}

	public void waitForElement(WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(ele));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			Reports.reportStep("PASS", "The " + ele + " waited successfully to meet the expected conditions");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while waiting for the " + ele);
			ex.printStackTrace();
		}

	}

	public void waitForElement(WebElement ele, int timeOut) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.visibilityOf(ele));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			Reports.reportStep("PASS",
					"The " + ele + " waited successfully to meet the expected conditions for " + timeOut);
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while waiting for the " + ele + " with " + timeOut);
			ex.printStackTrace();
		}

	}

	public void selectDDByValue(WebElement ele, String value) {
		try {
			Select sel = new Select(ele);
			sel.selectByValue(value);
			Reports.reportStep("PASS", "Selected the given " + value + " from the dropdown");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while selecting the given " + value + " from the dropdown");
			ex.printStackTrace();
		}

	}

	public void selectDDByIndex(WebElement ele, int index) {
		try {
			Select sel = new Select(ele);
			sel.selectByIndex(index);
			Reports.reportStep("PASS", "Selected the given " + index + " from the dropdown");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while selecting the given " + index + " from the dropdown");
			ex.printStackTrace();
		}

	}

	public void selectDDByVisibleText(WebElement ele, String VisibleText) {
		try {
			Select sel = new Select(ele);
			sel.selectByVisibleText(VisibleText);
			Reports.reportStep("PASS", "Selected the given " + VisibleText + " from the dropdown");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while selecting the given " + VisibleText + " from the dropdown");
			ex.printStackTrace();
		}
	}

	public void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Reports.reportStep("PASS", "Successfully accepted the alert");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while accepting the alert");
			ex.printStackTrace();
		}
	}

	public void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			Reports.reportStep("PASS", "Successfully dismiss the alert");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while dismiss the alert");
			ex.printStackTrace();
		}
	}

	// javasscriptexecutor (scroll up, down, click)
	public void jsScrollUpAndDown(int value) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0," + value + ")");
			Reports.reportStep("PASS", "Scroll action(up/down) has been done successfully with " + value);
		} catch (Exception e) {
			Reports.reportStep("FAIL", "Problem while doing Scroll action(up/down) with " + value);
			e.printStackTrace();
		}
	}

	public void jsScrollUpToElement(WebElement ele) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", ele);
			Reports.reportStep("PASS", "Scroll action has been done successfully upto finding that " + ele);
		} catch (Exception e) {
			Reports.reportStep("FAIL", "Problem while doing Scroll action upto find that " + ele);
			e.printStackTrace();
		}
	}

	public void jsClick(WebElement ele) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ele);
			Reports.reportStep("PASS", "The " + ele + " was clicked succesfully");
		} catch (Exception e) {
			Reports.reportStep("FAIL", "The " + ele + " wasn't clicked succesfully");
			e.printStackTrace();
		}

	}

	// screenshot
	public void screenShot(String ssname) {
		try {
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File dest = new File("./ssphotos/" + ssname + ".png");

			FileUtils.copyFile(source, dest);

			Reports.reportStep("PASS", "The ScreenShot has been done successfully");
		} catch (Exception e) {
			Reports.reportStep("FAIL", "Problem while taking the ScreenShot ");
			e.printStackTrace();
		}
	}
}
