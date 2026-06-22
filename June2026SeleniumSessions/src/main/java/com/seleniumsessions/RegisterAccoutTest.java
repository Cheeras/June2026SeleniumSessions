package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAccoutTest {

	public static void main(String[] args) {

		//initiliase the driver
		
		BroswerUtils2 bUtil = new BroswerUtils2();
		//The method creates a browser driver object and returns it to the caller.
		//Without returning the driver, the caller cannot directly use the created browser instance.
		WebDriver driver = bUtil.initDriver("chrome");
		
		bUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(bUtil.getPageTitle());
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
		WebElementUtility wUtil = new WebElementUtility(driver);
		wUtil.doSendKeys(firstName, "shankar");
		wUtil.doSendKeys(lastName, "cheerala");
		wUtil.doSendKeys(email, "shankar@gmail.com");
		wUtil.doSendKeys(telephone, "787877878");
		wUtil.doSendKeys(password, "shankar@123");
		wUtil.doSendKeys(confirmPassword, "shankar@123");
		
		bUtil.closeBroswer();
	}

}
