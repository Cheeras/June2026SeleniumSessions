package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		
		String firstNam = "Shankar";
		String lastName = "Cheerala";
		StringBuilder sb = new StringBuilder("Selenium");
		StringBuffer sbf = new StringBuffer("Automation");
		firstName.sendKeys(firstNam," ",lastName," ",sb," ",sbf);
		
		firstName.sendKeys(null);//IllegalArgumentException
		
	}

}
