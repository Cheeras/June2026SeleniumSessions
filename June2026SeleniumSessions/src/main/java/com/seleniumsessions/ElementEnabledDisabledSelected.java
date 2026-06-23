package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementEnabledDisabledSelected {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		WebElement password = driver.findElement(By.id("pass"));
		boolean isDisp = password.isDisplayed();
		System.out.println(isDisp);
		boolean isEnab = password.isEnabled();
		System.out.println(isEnab);
		
		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement privacyCheckbox = driver.findElement(By.name("agree"));
		System.out.println(privacyCheckbox.isSelected());
		privacyCheckbox.click();
		System.out.println(privacyCheckbox.isSelected());
	}

	
}
