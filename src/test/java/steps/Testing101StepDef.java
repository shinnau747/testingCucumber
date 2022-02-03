package steps;

import pages.Testing101Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
//import org.junit.Before;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;
import org.junit.Assert; 
import pages.TestBAse;

//@SuppressWarnings("deprecation")
public class Testing101StepDef extends TestBAse {
	
	Testing101Page Test101Page;
	
	@Before
	public void beforeRun() {
		init();
		Test101Page = PageFactory.initElements(driver, Testing101Page.class);	
	}

	@Given("^User is on the Testing101 page$")
	public void user_is_on_the_testing101_page() throws Throwable{
		driver.get("https://techfios.com/test/101/index.php");
		Thread.sleep(3000);

	}
	
	@Given("^Set SkyBlue Background button exists$")
	public void set_skyBlue_background_button_exists() throws Throwable {
		
		//boolean actual = 
		//Test101Page.assertBlueButtonexists();
		Assert.assertEquals(Test101Page.assertBlueButtonexists(), false);
		Thread.sleep(2000);


	}
	
	@When("^I click on the button$")
	public void i_click_on_the_button() throws Throwable{
		Test101Page.clickOnBlueBG();
		Thread.sleep(2000);

	}
	
	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		WebElement Bg = Test101Page.checkBGColor();
		String color = Bg.getCssValue("background-color");
		String actual = Color.fromString(color).asHex();
		String expected = "#87ceeb";
		Assert.assertEquals(actual, expected);
		
		
		
	}
	
	
	@Given("^Set white Background button exists$")
	public void set_white_Background_button_exists() throws Throwable {
		
		//boolean actual = 
		//Test101Page.assertBlueButtonexists();
		//Assert.assertEquals(Test101Page.assertBlueButtonexists(), false);
		Thread.sleep(2000);


	}
	
	@When("^I click on the button two$")
	public void i_click_on_the_button_two() throws Throwable{
		Test101Page.clickOnWhiteBG();
		Thread.sleep(2000);

	}
	
	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
		WebElement Bg = Test101Page.checkBGColor();
		String color = Bg.getCssValue("background-color");
		String actual = Color.fromString(color).asHex();
		String expected = "#ffffff";
		Assert.assertEquals(actual, expected);
		
		
		
	}
	






}
