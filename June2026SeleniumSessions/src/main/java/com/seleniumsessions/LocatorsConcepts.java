package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LocatorsConcepts {
	static WebDriver driver;
	public static void main(String[] args) {
		//we are seen following locator
		//id,linkText,name
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//first preference will be for id - I
		//1.id - it is attribute : it is unique always it should not be duplicate
		//according to W3C standards id should not be duplicate
		driver.findElement(By.id("input-firstname")).sendKeys("Java");
		
		//what if id is not available   - II(second preference)
		//2.name - it is attribute : could be duplicate
		driver.findElement(By.name("lastname")).sendKeys("Testing");
		
		//3.classname : attribute - can be duplicate most of the times -- III (should be unique)
		// classname is super risky 
		//driver.findElement(By.className("form-control")).sendKeys("java@gmail.com");
		//.img-responsive --> 1 of 1
		//.form-control--> 1 of 7
		// driver.findElement(By.className("img-responsive")).click();
		
		//4. xpath - it is not attribute,it is address of the element in the DOM
		//syntax //input[@id="value"]
		////input[@id="input-telephone"]
		// we can not compare id and xpath - because xpath is not coming from the same family
		driver.findElement(By.xpath("//input[@id=\"input-telephone\"]")).sendKeys("12121212");
		////*[@id="input-email"]
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("shankar@gmail.com");
		
		//5. cssselector: it is not attribute
		driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
		driver.findElement(By.cssSelector("#input-confirm")).sendKeys("test@123");
		
		//6. linkText : only for links
		//htmltag <a>
		driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.linkText("Forgotten Password")).click();
		
		//7. partiallinkText: only for links
		//htmltag <a>
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8. tagName : only for the tags
//		
//		String headerText = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(headerText);
		By header = By.tagName("h2");
		String actHeader = doElementGetText(header);
		if(actHeader.equals("New Customer")) {
			System.out.println("header is correct -- PASS");
		}
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println("element text ==>"+eleText);
		return eleText;
	}
}
