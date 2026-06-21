
package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * Please refer the QuitvsCloseCaseStudy notes
 * 
 * ***/
public class QuitVsClose {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
	
		driver.close();//after execution of this statement driver will become null
		
		/*
		 * i want to fix this issue again launch the driver again
		 * driver = new ChromeDriver();
		 * */
		//driver = new ChromeDriver();
		System.out.println(driver.getTitle());
		//org.openqa.selenium.NoSuchSessionException
		//Session ID is null. Using WebDriver after calling quit()?
		
	}

}
