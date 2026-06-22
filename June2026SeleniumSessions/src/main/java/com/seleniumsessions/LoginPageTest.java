package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		BroswerUtils2 bu = new BroswerUtils2();
		WebDriver driver = bu.initDriver("chrome");//session id 123
		bu.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(bu.getPageTitle());
		
		By emailField = By.id("input-email");
		By pwdField = By.id("input-password");
		
		WebElementUtility eUtil = new WebElementUtility(driver);
		eUtil.doSendKeys(emailField, "tom@gmail.com");
		eUtil.doSendKeys(pwdField, "tom@123");
		
		bu.closeBroswer();
		
	}

}
