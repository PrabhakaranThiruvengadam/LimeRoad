package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.BassClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\User\\eclipse-workspace\\LimeRoad\\src\\test\\java\\com\\featurefile\\lime.feature" ,
	glue ="com.stepDefination",
	plugin = {"pretty","html:Reports/limeroad.html","json:Reports/limeroad.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	
	)
public class TestRunner extends BassClass {


	public static WebDriver driver;
	@BeforeClass
	public static void basicSter() {
		driver = browserLaunch("chrome");
		implicitiWait(5);
	}
		@AfterClass
		public static void ending() {
close();
			
		}
	}




