package com.Baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BassClass {
protected static WebDriver driver;
	

	public static WebDriver browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions a1 = new ChromeOptions();
		a1.addArguments("Incognito");
		driver = new ChromeDriver(a1);
	}else if (browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}else if (browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
		return driver;
	}
	public static void urlLaunch(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static void click(WebElement element) {
		if (element.isDisplayed()) {
			element.click();
		}
	}
	public static void inputValue(WebElement element, String value) {
		if (element.isDisplayed()) {
			element.sendKeys(value);
		}

	}
	public static void implicitiWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
public static void explicitiWaitVisibility(WebElement element, int time) {
	WebDriverWait wait = new WebDriverWait(driver, time);
	wait.until(ExpectedConditions.visibilityOf(element));
}
public static void explicitiWaitClickable(WebElement element, int time) {
	WebDriverWait wait = new WebDriverWait(driver, time);
	wait.until(ExpectedConditions.elementToBeClickable(element));
	
}
	public static void Screenshot(String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\User\\eclipse-workspace\\maven_NykaProject\\screenShot\\" + fileName + ".png");
		FileHandler.copy(src, dest);

	}

	public static void selectByIndex(WebElement element, String option, String value) {
		Select a = new Select(element);
		if (option.equals("index")) {
			int index = Integer.parseInt(value);
			a.selectByIndex(index);
		} else if (option.equals("value")) {
			a.selectByValue(value);

		} else if (option.equals("text")) {
			a.selectByVisibleText(value);
		}
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();

	}
public static void navigateForward() {
	driver.navigate().forward();
}
public static void navigateRefresh() {
	driver.navigate().refresh();
}
public static void clearfiled(WebElement element) {
	element.clear();
}
public static boolean isMultiple(WebElement element) {
	Select a = new Select(element);
	boolean multiple = a.isMultiple();
	return multiple;
	
}
public static void actionclass(WebElement element,String options) {
	Actions a = new Actions(driver);
	if(options.equalsIgnoreCase("moveToElement")) {
	a.moveToElement(element).build().perform();
	}else if(options.equalsIgnoreCase("click")) {
		a.click(element).build().perform();
}else if (options.equalsIgnoreCase("doubleClick")) {
		a.doubleClick(element).build().perform();
}else if (options.equalsIgnoreCase("contextClick")) {
	a.contextClick(element).build().perform();
}else if (options.equalsIgnoreCase("clickAndHold")) {
	a.clickAndHold(element).build().perform();
}else if(options.equalsIgnoreCase("relese")) {
	a.release(element).build().perform();
}
}
	public static void switchToFrame(String id) {
		driver.switchTo().frame(id);
	}
	public static void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	public static void switchToFrame(int index) {
		driver.switchTo().frame(index);//index starts from 0, first iframe is selected
	}
	public static void switchToParentFrame() {
		driver.switchTo().parentFrame();//return to previous frame
	}
	public static void switchToDefaultContent() {
		driver.switchTo().defaultContent();//return to main page
	}
	//java Script Method
	public static void ScroolByAxis(int x,int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(x,x);");
	}
	public static void ScrollByElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView();",element);
	}
	public static void ScroolAndClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].click();",element);
	}
	public static void scroolToEnd() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight);","");
	}
	public static void quit() {
		driver.quit();
	}
	public static void close() {
		driver.close();
	}
	public static void webdriverwait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	public static String getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	public static String getCurrenturl() {
		String currenturl = driver.getCurrentUrl();
		System.out.println("current page url address is :"+currenturl);
		return currenturl;
		
		
	}
}


