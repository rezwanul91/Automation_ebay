package step_Definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verifying_Ebay_Search_Box extends Base{
	
	@Given("I am in Ebay Landing Page")
	public void i_am_in_ebay_landing_page() throws InterruptedException {
		Thread.sleep(2000);
	   navigateUrl("https://www.ebay.com/");
	}

	@When("I Type Toyota in search box")
	public void i_type_toyota_in_search_box() throws InterruptedException {
		Thread.sleep(2000);
	   sendkeys(By.id("gh-ac"), "Toyota");
	}
	
	@Then("I Click In the search")
	public void i_click_in_the_search() throws InterruptedException {
		Thread.sleep(2000);
		click(By.id("gh-btn"));
	}

	@Then("I Click In Toyota Pickup DLX")
	public void i_click_in_toyota_pickup_dlx() throws InterruptedException {
		Thread.sleep(2000);
	    click(By.xpath("//span[@class='BOLD'][text()='1982 Toyota Pickup DLX']"));
	}
	
	@Then("I use childWindow method")
	public void i_use_child_window_method() throws InterruptedException {
		Thread.sleep(2000);
		windowHandles();
	}

	@Then("I Enter another window")
	public void i_enter_another_window() throws InterruptedException {
		Thread.sleep(2000);
	    System.out.println("I am in second window");
	}

	@Then("I verify that i am in second window page")
	public void i_verify_that_i_am_in_second_window_page() throws InterruptedException {
		Thread.sleep(2000);
	   String actual = getElementText(By.xpath("//span[@class='ux-textspans ux-textspans--BOLD'][text()='1982 Toyota Pickup DLX']"));
	   assertEquals("1982 Toyota Pickup DLX", actual);
	}
	
	@Then("I Back in landing page")
	public void i_back_in_landing_page() {
	    backNev();
	}

}//class
