package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	public WebDriver driver;

	@FindBy(xpath = "(//span[text()='SHOP MEN'])")
	private WebElement selectShopMen;

	@FindBy(xpath = "(//div[text()=\"Home\"])[1]")
	private WebElement mouseOnHome;

	@FindBy(xpath = "//a[text()='bed covers'][1]")
	private WebElement selectBedCovers;

	@FindBy(xpath = "//div[text()=\"₹ 1049\"][1]")
	private WebElement selectByPrice;

	@FindBy(xpath = "//div[text()='ADD TO CART']")
	private WebElement ClickAddtoCart;

	public login(WebDriver dri) {
		this.driver = dri;
		PageFactory.initElements(driver, this);

	}

	public WebElement getselectShopMen() {
		return selectShopMen;

	}

	public boolean isDisplayed() {
		return false;
	}

	public WebElement getMouseOnHome() {
		return mouseOnHome;
	}

	public WebElement getSelectBedCovers() {
		return selectBedCovers;
	}

	public WebElement getClickAddtoCart() {
		return ClickAddtoCart;
	}

	public WebElement getSelectByPrice() {
		return selectByPrice;
	}

}
