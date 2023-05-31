package com.POM;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public static WebDriver driver;
	private login loginlimeroad;

	public PageObjectManager(WebDriver driver) {
	this.driver=driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public login getLoginlimeroad() {
		if (loginlimeroad == null) {
			loginlimeroad = new login(driver);
		}
		return loginlimeroad;

	}

}
