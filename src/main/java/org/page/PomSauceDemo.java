package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomSauceDemo extends BaseClass{

	public PomSauceDemo() {
      PageFactory.initElements(driver, this);
	}
	@FindBy(id="user-name")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login-button")
	private WebElement log;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement add;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement addicon;
	
	@FindBy(id="checkout")
	private WebElement check;
	
	
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLog() {
		return log;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getAddicon() {
		return addicon;
	}

	public WebElement getCheck() {
		return check;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
