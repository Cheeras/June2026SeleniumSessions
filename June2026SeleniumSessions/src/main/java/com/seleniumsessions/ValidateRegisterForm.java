package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidateRegisterForm {

	public static void main(String[] args) throws InterruptedException {
		//Problem statement
		//We need to fill the Register form and click on Continue button 
		//and validation is success or not with header verification and title 
		//and logout should present on screen
		
		BroswerUtils2 bUtil = new BroswerUtils2();
		WebDriver driver = bUtil.initDriver("chrome");
		bUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//By locators
		By firstNameField = By.id("input-firstname");
		By lastNameField = By.name("lastname");
		By emailField = By.xpath("//*[@id=\"input-email\"]");
		By phoneField = By.xpath("//*[@id=\"input-telephone\"]");
		By pwdField = By.cssSelector("#input-password");
		By confirmPassField = By.cssSelector("#input-confirm");
		By privacyPolicyCheckBox = By.name("agree");
		By continueButton = By.xpath("//input[@type='submit' and @value='Continue']");
		By accountHeader = By.tagName("h1");
		By logoutlink = By.linkText("Logout");
		
		WebElementUtility eUtil = new WebElementUtility(driver);
		eUtil.doSendKeys(firstNameField, "shiv");
		eUtil.doSendKeys(lastNameField, "Nallam");
		eUtil.doSendKeys(emailField, "shiva90087@gmail.com");
		eUtil.doSendKeys(phoneField, "8998989889");
		eUtil.doSendKeys(pwdField, "shiva@989898");
		eUtil.doSendKeys(confirmPassField, "shiva@989898");
		eUtil.doClick(privacyPolicyCheckBox);
		eUtil.doClick(continueButton);
		
		String actHeader = eUtil.doElementGetText(accountHeader);
		if(actHeader.equals("Your Account Has Been Created!")) {
			System.out.println("Account created successfully - PASS");
		}else {
			System.out.println("Account is not created - FAIL");
		}
		
		String actualPageTitle = bUtil.getPageTitle();
		System.out.println("Page Title is ===>"+actualPageTitle);
		
		boolean isLogoutDisplayed = eUtil.doElementDisplayed(logoutlink);
		if(isLogoutDisplayed) {
			System.out.println("Logout link is displayed - PASS");
		}else {
			System.out.println("Logout link is not displayed - FAIL");
		}
		Thread.sleep(1000);
		bUtil.closeBroswer();
	}

}
