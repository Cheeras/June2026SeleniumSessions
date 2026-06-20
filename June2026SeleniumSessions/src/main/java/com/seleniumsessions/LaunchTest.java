package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTest {

	public static void main(String[] args) {
		
		//broswer version v149
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shankar\\Documents\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();//345
		driver = new ChromeDriver();//567
		driver.get("https://www.google.com/");//567
		driver.quit();//567 it will close only last driver session i.e 567
	}
}
