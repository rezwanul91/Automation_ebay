package step_Definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verifying_Ebay_Home_Page extends Base {
	
	@Given("I am in Ebay Landing page")
	public void i_am_in_ebay_landing_page() throws InterruptedException {
		navigateUrl("https://www.ebay.com");
		Thread.sleep(2000);
	}

	@When("I Hover my mouse in Electronics Menu")
	public void i_hover_my_mouse_in_electronics_menu() throws InterruptedException {
		mouseHover(By.xpath("//li[@class='hl-cat-nav__js-tab'][2]/a"));
		Thread.sleep(2000);
	}

	@Then("I click on Camera and Photo")
	public void i_click_on_camera_and_photo() throws InterruptedException {
		
	//click(By.xpath("//a[@href='https://www.ebay.com/b/Cameras-Photo/625/bn_1865546']"));
		click(By.xpath("//a[@href='https://www.ebay.com/b/Cameras-Photo/625/bn_1865546'][@class='hl-cat-nav__js-link']"));
		Thread.sleep(2000);
	}

	@Then("I Click On DSLR Cameras")
	public void i_click_on_dslr_cameras() throws InterruptedException {
		Thread.sleep(2000);
		click(By.xpath("//div[text()='DSLR Cameras']"));
	}

	@Then("I click On Canon")
	public void i_click_on_canon() throws InterruptedException {
		Thread.sleep(2000);
		click(By.xpath("//p[text()='Canon']"));
	}

	@Then("I verify that i am in Canano DSLR Cameras Page")
	public void i_verify_that_i_am_in_canano_dslr_cameras_page() throws InterruptedException {
		Thread.sleep(2000);
		String actualCan = getElementText(By.xpath("//h1[@class='b-pageheader']/span"));
		assertEquals("Canon Digital SLR Cameras", actualCan);
	}

}// class
