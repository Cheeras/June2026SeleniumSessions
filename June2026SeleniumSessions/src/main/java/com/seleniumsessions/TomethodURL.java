package com.seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TomethodURL {

	public static void main(String[] args) throws MalformedURLException {

		/*
		 * Important interview Question 
		 * Q) What is difference bet get() method and to()
		 * 
		 * Ans:
		 * There is difference between these 2 methods both are synonyms
		 * expect to() method is overloaded method get() is not overloaded
		 * method
		 * 
		 * driver.navigate().to(<String>);
		 * driver.navigate().to(URL url);
		 * 
		 * One more thing is to() method is internally calling get method only but 
		 * get method is only accepting String as parameter type to url to string we
		 * will use String.valueOf(url) to covert the URL to String type
		 * 
		 * */
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		System.out.println(driver.getTitle());
		URL baseUrl = new URL("https://www.flipkart.com");
		driver.navigate().to(baseUrl);
		
		
		
		
	}

}
