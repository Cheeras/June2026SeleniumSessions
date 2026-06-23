package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		WebElement firstName = driver.findElement(By.id("input-firstname"));
//		boolean b1 = firstName.isDisplayed();
//		
//		System.out.println(b1);
		
//		boolean b11 = driver.findElement(By.id("input-firstname11")).isDisplayed();
//		System.out.println(b11);
		
		By fn = By.id("input-abc");
		if(isElementDisplayed(fn)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		By logo = By.className("img-responsive");
		System.out.println(isElementDisplayed(logo));

	}
	public static boolean isElementDisplayed(By locator) {
		try {
		return getElement(locator).isDisplayed();
		}catch(NoSuchElementException e) {
			System.out.println("element is not present of the page using : "+locator);
			return false; 
		}
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
}
