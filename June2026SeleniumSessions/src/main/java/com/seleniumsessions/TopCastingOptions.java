package com.seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		// 1 CD = CD only chrome
		// ChromeDriver driver = new ChromeDriver();

		// 2 WD d = new CD
		// valid and recommeneded : Only for local execution
		// WebDriver driver1 = new ChromeDriver();

		// 3 SC d = new CD();
		// valid but not recommended because only findElement() and findElements()
		// method are availble to
		// use get(),getUrl(),getTitle() ...etc methods are not able to access
		// only for local and only 2 methods are able to access
		// SearchContext driver = new ChromeDriver();

		// 4 WD d = new RWD();
		// valid and recommeded: only for remote luaching of broswer(chrome,FF,edge)
		// used when we want to run the testcases in remote machine, Cloud, AWS,
		// selenium Grid
		// WebDriver driver = new RemoteWebDriver(remoteAddress,capabilites);//we need to supply 
		//Operating System and broswer name
		
		// 5 SC d = new RWD();
		//SearchContext driver = new RemoteWebDriver(remoteAddress,capabilites);
		
		//6 RWD d = new CD();
		//only for local execution
		//valid and recommeded
		//RemoteWebDriver driver = new ChromeDriver();
		
		//7 ChromiumDriver cd = new CD();
		//local
		//valid and not recommeded: works only for the chromium based broswers: chrome/edge
		//ChromiumDriver driver = new ChromeDriver();
		
		//8 RWD d = new RWD()
		//valid only for remote execution
		//RemoteWebDriver driver = new RemoteWebDriver(remoteaddress, capabilites);// we need to supply 
		//Operating system and broswer that we need the execute the scripts/testcases
		
		//Best Practice
		/*
		 * If want to execute local second option
		 * if you want to execute remote use 4 option
		 * */

	}

}
