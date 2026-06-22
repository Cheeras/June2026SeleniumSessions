package com.seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBroswer {

	public static void main(String[] args) {

		//Launch the chrome broswer
		ChromeDriver driver = new ChromeDriver();
		
		//enter the URL
		driver.get("google.com/");
		
		//get the title of the page
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		
		//checkpoint/validation point/assertion
		if(actTitle.equals("Google123")) {
			System.out.println("title is correct : Pass");
		}else {
			System.out.println("Title is incorrect : Fail");
		}
		
		//Close the chrome driver
		//driver.quit();
	}

}
