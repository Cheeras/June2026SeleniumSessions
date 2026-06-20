package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBroswer {

	public static void main(String[] args) {
		String broswer = "chrome1212";
		WebDriver driver = null;
		//driver = new ChromeDriver();// top casting
		//driver = new FirefoxDriver();
		switch(broswer.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please pass right broswer name "+broswer);
			throw new RuntimeException("Invalid Broswer");
		}

		// driver is ref variable
		// what is object new ChromeDriver() refereed by driver
		driver.get("https://www.google.com/");

		String actTitle = driver.getTitle();

		// check point/validation point/assertion

		if (actTitle.equals("Google")) {
			System.out.println("title is correct: PASS ");
		} else {
			System.out.println("title is incorrect: FAIL ");
		}

	}

}
