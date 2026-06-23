package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldText {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("shankar@yahoo.com");
		String emailId = email.getDomProperty("value");
		System.out.println("emailId ::" + emailId);
		
		//DOM
		//getDomProperty()
		//getDomAttribute()
		
	}

}
