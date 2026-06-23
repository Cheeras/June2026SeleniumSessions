package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementUtility {

	private WebDriver driver;

	public WebElementUtility(WebDriver driver) {
		this.driver = driver;
	}

	private void nullCheck(CharSequence... value) {
		if(value == null) {
			throw new RuntimeException("===Value can not be null=====");
		}
	}
	public void doSendKeys(By locator, String value) {
		nullCheck(value);
		this.getElement(locator).sendKeys(value);
	}
	
	public void doSendKeys(By locator, CharSequence... value) {
		nullCheck(value);
		this.getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String getElementDomPropertyValue(By locator,String propName) {
		nullCheck(propName);
		return getElement(locator).getDomProperty(propName);
	}
	public String getElementDomAttributeValue(By locator,String attrName) {
		nullCheck(attrName);
		return getElement(locator).getDomAttribute(attrName);
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println("element text ==>"+eleText);
		return eleText;
	}
	
	public boolean doElementDisplayed(By locator) {
		boolean isDisplayed = getElement(locator).isDisplayed();
		return isDisplayed;
	}

}
