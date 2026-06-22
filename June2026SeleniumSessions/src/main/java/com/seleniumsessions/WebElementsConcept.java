package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsConcept {
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();//session id 123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//Formula
		//Create a webelement(FE) + perform action(click(),sendKeys(),isDisplayed(),getText().....)
		
//		//1. Approach 
//		driver.findElement(By.id("input-email")).sendKeys("tom@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("tom@123");
//		
//		//2. Approach
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		email.sendKeys("tom@gmail.com");
//		password.sendKeys("tom@123");
//		
//		//3 By Locator: Object Repository 
//		
//		By emailField = By.id("input-email");
//		By pwdField = By.id("input-password");
//		
//		WebElement email1 = driver.findElement(emailField);
//		WebElement password1 = driver.findElement(pwdField);
//		
//		email1.sendKeys("tom@gmail.com");
//		password1.sendKeys("tom@123");
//		
//		//4 By locator + generic method/function to get the element
//		By emailField1 = By.id("input-email");
//		By pwdField1 = By.id("input-password");
//		
//		getElement(emailField1).sendKeys("tom@gmail.com");
//		getElement(pwdField1).sendKeys("tom@123");
		
		//5. By locator + generic method to get the webelement + and perform action
//		By emailField = By.id("input-email");
//		By pwdField = By.id("input-password");
//		
//		doSendKeys(emailField, "tom@gmail.com");
//		doSendKeys(pwdField, "tom@123");
		
		//6.  By locator + generic method to get the webelement + and perform action but we need 
		// to create separate utility class
		By emailField = By.id("input-email");
		By pwdField = By.id("input-password");
		WebElementUtility eutil = new WebElementUtility(driver);//session id 123
		eutil.doSendKeys(emailField, "shankar@gmail.com");
		eutil.doSendKeys(pwdField, "shankar@123");
		
		//7. BrosweUtils + WebElementUtils refer LoginPageTest.java for more information
		
	}
	
}
