package org.stepdefinition;

import java.util.List;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.page.PomSauceDemo;
import org.page.PomSauceDemo2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepdefinitionSaucedemo extends BaseClass {
	public static PomSauceDemo p;
	public static PomSauceDemo2 p1;
	@Given("The user should be in varified page")
	public void the_user_should_be_in_varified_page() {
		
	}

	@When("user pass the username {string} and password {string} and click login btn")
	public void user_pass_the_username_and_password_and_click_login_btn(String user, String pass) {
		  p=new PomSauceDemo();
		sendkeys(p.getUser(), user);
		sendkeys(p.getPass(), pass);
		click(p.getLog());
	}

@Then("to check assert current url and assert verification")
public void to_check_assert_current_url_and_assert_verification() {

	String currenturl = currenturl();
	boolean contains = currenturl.contains("demo");
	Assert.assertTrue("verufy url", contains);
	

}

	@When("User add a some products on homepage")
	public void user_add_a_some_products_on_homepage() {
       click(p.getAdd());
	}

	@When("user click add icon button")
	public void user_click_add_icon_button() {
     click(p.getAddicon());
	}

	@When("user click the check btn")
	public void user_click_the_check_btn() {
    click(p.getCheck());
	}

	@When("User click the continue btn for next billing section")
	public void user_click_the_continue_btn_for_next_billing_section() {
      p1=new PomSauceDemo2();
      click(p1.getConti());
	}

	@When("User pass the firstname,lastname and pincode options")
	public void user_pass_the_firstname_lastname_and_pincode_options(io.cucumber.datatable.DataTable data) {
     List<String> list = data.asList();
     sendkeys(p1.getFirst(), list.get(0));
     sendkeys(p1.getLast(), list.get(1));
     sendkeys(p1.getPin(), list.get(2));
	}

	@When("user click the btn")
	public void user_click_the_btn() {
    click(p1.getConti());
	}

	@When("user print in console bill")
	public void user_print_in_console_bill() {
     System.out.println(p1.getBill().getText());
	}

	@Then("user scrolldown and click finish button")
	public void user_scrolldown_and_click_finish_button() {
     click(p1.getFinish());
	}


}
