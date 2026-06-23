package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithDisableElement {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("testing");
		//org.openqa.selenium.ElementNotInteractableException: element not interactable
		//this element is disabled
		password.click();//click on disabled element : no exception
		
		

		
	}

}
