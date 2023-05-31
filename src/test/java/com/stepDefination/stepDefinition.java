package com.stepDefination;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Baseclass.BassClass;
import com.POM.PageObjectManager;
import com.Runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class stepDefinition extends BassClass {
	public static WebDriver driver = TestRunner.driver;
	PageObjectManager act = new PageObjectManager(driver);
	
	
	@Given("Launch the browser {string}")
	public void launch_the_browser(String string) {
	   
	}
	@When("Launch the url {string}")
	public void launch_the_url(String string) {
		urlLaunch(string);
	}
	@When("Select Shop Men")
	public void Select_Shop_Men(BassClass element) {
		explicitiWaitVisibility(act.getLoginlimeroad().getselectShopMen(), 5);
		ScroolAndClick(act.getLoginlimeroad().getselectShopMen());
	}
	@When("Place mouse on Home icon")
	public void place_mouse_on_home_icon() {
mouseHover(act.getLoginlimeroad().getMouseOnHome());
	}
	private void mouseHover(WebElement webElement) {
		
	}
	@When("Click Bed Covers it navigates to Bed Covers page")
	public void click_bed_covers_it_navigates_to_bed_covers_page() {
		ScroolAndClick(act.getLoginlimeroad().getSelectBedCovers());

	}
	@When("Click By Saral Home with price")
	public void click_by_saral_home_with_price(BassClass element) {
		ScroolAndClick(act.getLoginlimeroad().getSelectByPrice());

	}
	@When("Click ADD TO CART to order the item")
	public void click_add_to_cart_to_order_the_item(BassClass element) {
		ScroolAndClick(act.getLoginlimeroad().getClickAddtoCart());
	}
	@When("Close browser")
	public void close_browser() {
	 
	}
	@When("click the element to select the T-Shirt")
	public void click_the_element_to_select_the_t_shirt() {
	 
	}

	@When("Click Step Out In Style to navigates to collection of T-shirt")
	public void click_step_out_in_style_to_navigates_to_collection_of_t_shirt() {

	}

	@When("Click on maroon solid t-shirt to select")
	public void click_on_maroon_solid_t_shirt_to_select() {
	    
	}
	@When("click the element to select the Jeans pant")
	public void click_the_element_to_select_the_jeans_pant() {
	    
	}

	@When("Click on Mid Rice Jeans it navigates to types of Jeans")
	public void click_on_mid_rice_jeans_it_navigates_to_types_of_jeans() {

	}

	@When("Click on mid rise washed denim jean to select")
	public void click_on_mid_rise_washed_denim_jean_to_select() {
	    
	}


}
