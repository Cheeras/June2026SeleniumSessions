package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementUtility {

	private WebDriver driver;
	public WebElementUtility(WebDriver driver) {
		this.driver = driver;
	}
	public  void doSendKeys(By locator,String value) {
		this.getElement(locator).sendKeys(value);
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
