package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
//		String placeHolderValue = firstName.getAttribute("placeholder");
//		System.out.println(placeHolderValue);
		
		String palceHolderValue = firstName.getDomAttribute("placeholder");
		System.out.println(palceHolderValue);
		
		//Webelement
		//attribute
		//Property
		String tagName = firstName.getDomProperty("tagName");
		System.out.println(tagName);
		
		String isDisabled = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).getDomProperty("disabled");
		System.out.println(isDisabled);
		
		String defaultValue = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).getDomProperty("defaultValue");
		System.out.println(defaultValue);
		
	}

	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
}
