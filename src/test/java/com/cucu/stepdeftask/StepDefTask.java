package com.cucu.stepdeftask;

import org.openqa.selenium.WebDriver;

import com.base.AmazonTask;
import com.base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefTask extends Base {
	
	static WebDriver driver;
	static AmazonTask A;
	
	
	@Given("^User launch the chrome browser$")
	public void user_launch_the_chrome_browser() throws Throwable {
		driver = launchDriver("Chrome");
		geturl("https://www.google.com/");
	    
	}

	@When("^User hit the amazon application$")
	public void user_hit_the_amazon_application() throws Throwable {
		getnavigate("https://www.amazon.in/");
		Implicitwait(10);
	    
	}

	@Given("^:Mouserover your order$")
	public void mouserover_your_order() throws Throwable {
	    A=new AmazonTask(driver);
	    Mouseover(A.getYourorders());
	}

	@Given("^Click the Signin Button$")
	public void click_the_Signin_Button() throws Throwable {
	    click(A.getSignin());
	    
	}

	@Given("^Enter  the Emailaddress$")
	public void enter_the_Emailaddress() throws Throwable {
	    Settext(A.getEnterEmail(), "msandhiya028@gmail.com");
	    
	}

	@Given("^Click the Continue Button$")
	public void click_the_Continue_Button() throws Throwable {
	    click(A.getClickcontinue());
	    
	}

	@Given("^Enter the password$")
	public void enter_the_password() throws Throwable {
	    Settext(A.getEnterpassword(), "password@123");
	    
	}

	@Given("^Mouseover the category Button$")
	public void mouseover_the_category_Button() throws Throwable {
	   click(A.getClicklogin());
	    
	}

	@Given("^mouseover the Mobiles,computers subcategory button$")
	public void mouseover_the_Mobiles_computers_subcategory_button() throws Throwable {
	    Mouseover(A.getMouseovercategory());
	    
	}

	@Given("^Click the powerbank button$")
	public void click_the_powerbank_button() throws Throwable {
	    Mouseover(A.getMouseoversubcategory());
	    
	}

	@Given("^Click the Intex power bank$")
	public void click_the_Intex_power_bank() throws Throwable {
	    click(A.getClickPowerbank());
	    click(A.getClickbank());
	}

	@Given("^Click Add to cart Button$")
	public void click_Add_to_cart_Button() throws Throwable {
	    click(A.getClickAddtocart());
	    
	}

	@Given("^Again mouseover the category button$")
	public void again_mouseover_the_category_button() throws Throwable {
	    
	    Mouseover(A.getMouseovercategory1());
	}

	@When("^Mouseover TV Appliances,Electronics Subcategory$")
	public void mouseover_TV_Appliances_Electronics_Subcategory() throws Throwable {
	    
	    Mouseover(A.getMouseoversubcategory1());
	}

	@When("^Click the Speakers button$")
	public void click_the_Speakers_button() throws Throwable {
	    
	   click(A.getClickSpeaker());
	   
	}

	@When("^Click Philips Speaker$")
	public void click_Philips_Speaker() throws Throwable {
	    click(A.getClickJBLGoPortableSpeakers());
	    
	}

	@When("^Click Add to cart$")
	public void click_Add_to_cart() throws Throwable {
	    click(A.getClickAddtocart1());
	    
	}

	@Given("^Click the Todays Deal option$")
	public void click_the_Todays_Deal_option() throws Throwable {
	    click(A.getClickTodaysdeal());
	    
	}

	//@Given("^Click the Headset$")
	//public void click_the_Headset(int arg1) throws Throwable {
	    //click(A.getClickheadset());
	    //click(A.getClickheadsetproduct());
	    
	//}

	//@Given("^Click Add to Cart Button$")
	//public void click_Add_to_Cart_Button() throws Throwable {
	//    click(A.getClickAddtocart2());
	    
	//}

	/*@Given("^Click Cart Button$")
	public void click_Cart_Button() throws Throwable {
	    click(A.getClickcart());
	    
	}*/

	@Given("^mouseover TVandent$")
	public void mouseover_TVandent() throws Throwable {
	    Mouseover(A.getMouseoverTVandEnt());
	    
	}

	@Given("^Click Mi option$")
	public void click_Mi_option() throws Throwable {
	    click(A.getClickMI());
	    
	}

	@Given("^Scroll down upto Mi Band (\\d+)$")
	public void scroll_down_upto_Mi_Band(int arg1) throws Throwable {
	    ScrollDown(A.getScrollintomiband());
	    
	}

	@Given("^Click the Mi Band product$")
	public void click_the_Mi_Band_product() throws Throwable {
	    click(A.getClickMILED());
	    
	}

	@Given("^Click Add to Cart Button3$")
	public void click_Add_to_Cart_Button3() throws Throwable {
		click(A.getClickAddtocart3());
	    
	}
	@Given("^Click cart button$")
	public void click_cart_button1() throws Throwable {
	    click(A.getClickcart1());
	    
	}
	@Then("^Click the proceed to Checkout$")
	public void click_the_proceed_to_Checkout() throws Throwable {
	    click(A.getClickproceed());
	    
	}


	
	


				
	}

	
