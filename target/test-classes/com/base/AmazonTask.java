package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonTask {
	
	public static WebDriver driver;
	public AmazonTask(WebDriver IDdriver) {
		this.driver=IDdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"nav-link-yourAccount\"]/span[1]" )
	private WebElement yourorders;
	
	@FindBy(xpath="//*[@id=\"nav-flyout-ya-signin\"]/a/span")
	private WebElement Signin;
	
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	private WebElement EnterEmail;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	private WebElement Clickcontinue;
	
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	private WebElement Enterpassword;
	
	@FindBy(xpath="//*[@id=\"signInSubmit\"]")
	private WebElement Clicklogin;
	
	@FindBy(xpath="//*[@id=\"nav-link-shopall\"]/span[2]")
	private WebElement Mouseovercategory;
	
	@FindBy(xpath="//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[6]/span")
	private WebElement Mouseoversubcategory;
			
	@FindBy(xpath="//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[6]/div[1]/div/a[5]/span")
	private WebElement ClickPowerbank;
	
	@FindBy(xpath="//*[@id=\"anonCarousel2\"]/ol/li[3]")
	private WebElement Clickbank;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	private WebElement ClickAddtocart;

	@FindBy(xpath="//*[@id=\"nav-link-shopall\"]/span[2]")
	private WebElement Mouseovercategory1;
	
	@FindBy(xpath="//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[7]/span")
	private WebElement Mouseoversubcategory1;
	
	@FindBy(xpath="//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[7]/div[1]/div/a[4]/span")
	private WebElement ClickSpeaker;
	
	@FindBy(xpath="//*[@id=\"dealTitle\"]/span")
	private WebElement ClickJBLGoPortableSpeakers;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	private WebElement ClickAddtocart1;
	
	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[2]")
	private WebElement ClickTodaysdeal;
	
	@FindBy(xpath="(//*[@id=\"dealTitle\"]/span)[2]")
	private WebElement Clickheadset;
	
	

	@FindBy(xpath ="//*[@id=\"result_0\"]/div/div[3]/div[1]/a/h2")
	private WebElement clickheadsetproduct;
		
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	private WebElement ClickAddtocart2;
	
	@FindBy(xpath="//*[@id=\"hlb-view-cart-announce\"]")
	private WebElement Clickcart;
	
	@FindBy(xpath="//*[@id=\"nav-subnav\"]/a[4]")
	private WebElement MouseoverTVandEnt;
	
	@FindBy(xpath="//a[@href='/s/ref=mega_elec_s23_3_2_1_2?rh=i%3Aelectronics%2Cn%3A15664337031&ie=UTF8']")
	private WebElement ClickMI;
	
	@FindBy(xpath="//*[@id=\"result_0\"]/div/div[3]/div[1]/a/h2")
	private WebElement Scrollintomiband;
		
	@FindBy(xpath="//*[@id=\"result_1\"]/div/div[3]/div[1]/a/h2")
	private WebElement ClickMILED ;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	private WebElement ClickAddtocart3;
	
	@FindBy(xpath="//*[@id=\"hlb-view-cart-announce\"]")
	private WebElement Clickcart1;
			
	@FindBy(xpath="//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
	private WebElement Clickproceed;
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getYourorders() {
		return yourorders;
	}

	public WebElement getSignin() {
		return Signin;
	}

	public WebElement getEnterEmail() {
		return EnterEmail;
	}

	public WebElement getClickcontinue() {
		return Clickcontinue;
	}

	public WebElement getEnterpassword() {
		return Enterpassword;
	}
	
	public WebElement getClicklogin() {
		return Clicklogin;
	}

	public WebElement getMouseovercategory() {
		return Mouseovercategory;
	}

	public WebElement getMouseoversubcategory() {
		return Mouseoversubcategory;
	}

	public WebElement getClickPowerbank() {
		return ClickPowerbank;
	}

	public WebElement getClickbank() {
		return Clickbank;
	}

	public WebElement getClickAddtocart() {
		return ClickAddtocart;
	}

	public WebElement getMouseovercategory1() {
		return Mouseovercategory1;
	}

	public WebElement getMouseoversubcategory1() {
		return Mouseoversubcategory1;
	}

	public WebElement getClickSpeaker() {
		return ClickSpeaker;
	}

	public WebElement getClickJBLGoPortableSpeakers() {
		return ClickJBLGoPortableSpeakers;
	}

	public WebElement getClickAddtocart1() {
		return ClickAddtocart1;
	}

	public WebElement getClickTodaysdeal() {
		return ClickTodaysdeal;
	}

	public WebElement getClickheadset() {
		return Clickheadset;
	}

	public WebElement getClickAddtocart2() {
		return ClickAddtocart2;
	}

	public WebElement getClickcart() {
		return Clickcart;
	}

	public WebElement getMouseoverTVandEnt() {
		return MouseoverTVandEnt;
	}

	public WebElement getClickMI() {
		return ClickMI;
	}

	public WebElement getScrollintomiband() {
		return Scrollintomiband;
	}

	public WebElement getClickMILED() {
		return ClickMILED;
	}

	public WebElement getClickAddtocart3() {
		return ClickAddtocart3;
	}

	public WebElement getClickcart1() {
		return Clickcart1;
	}

	public WebElement getClickproceed() {
		return Clickproceed;
	}
	
	public WebElement getClickheadsetproduct() {
		return clickheadsetproduct;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
