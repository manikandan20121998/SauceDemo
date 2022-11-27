package org.page;

import org.base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomSauceDemo2 extends BaseClass {

	public PomSauceDemo2() {
PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="continue")
	private WebElement conti;
	
	@FindBy(id="first-name")
	private WebElement first;
	
	@FindBy(id="last-name")
	private WebElement last;
	
	@FindBy(id="postal-code")
	private WebElement pin;
	
	@FindBy(xpath="//div[@class='summary_info']")
	private WebElement bill;
	
	@FindBy(id="finish")
	private WebElement finish;
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getConti() {
		return conti;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getPin() {
		return pin;
	}

	public WebElement getBill() {
		return bill;
	}

	public WebElement getFinish() {
		return finish;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
