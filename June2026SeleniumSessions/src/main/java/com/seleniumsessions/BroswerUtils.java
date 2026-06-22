package com.seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*
 * What is the purpose the BroswerUtils Class we can write
 * 1.Reusable methods we don't need to write the
 * repeated code.
 * 
 * 2.Easy to debug any problem for the chrome we have fix at once place, 
 * lets suppose we have not create this util class we might have to initialise the broswer 50 places
 * if any issue occures we need update the code 50 place in order a void this we will prefer to write 
 * initDriver() method 
 * 
 * 
 * */
/**
 * @author Shankar Cheerala
 */
public class BroswerUtils {

	WebDriver driver;//default value is null because it is not premitive
	/**
	 * this is used to initilise the driver on the basis of given broswer name:
	 * chrome,firefox,edge and safari
	 * @param broswerName
	 * @return it returns the driver
	 */
	//The method creates a browser driver object and returns it to the caller
	//Without returning the driver, the caller cannot directly use the created browser instance.
	public WebDriver initDriver(String broswerName) {
		System.out.println("Broswer Name :: "+broswerName);
	switch (broswerName.trim().toLowerCase()) {
		
	case "chrome":
		driver = new ChromeDriver();
		break;
	case "fireFox":
		driver = new FirefoxDriver();
		break;
	case "edge":
		driver = new EdgeDriver();
		break;
	default:
		System.out.println("Please pass right broswer name..");
		throw new BroswerException("This is invalid broswer");
	}
	return driver;
	}

	public void launchUrl(String url) {
		if(url.length()==0) {
			System.out.println("please pass the right URL" + url);
			throw new BroswerException("==EMPTY URL===");
		}
		if(url.indexOf("http")!=0) {//check if the url is stating with http or not
			System.out.println("http is missing in the url"+ url);
			throw new BroswerException("====http is missing====");
		}
		driver.get(url);
	}
	
	public void launchUrl(URL url) {
		String appUrl = String.valueOf(url);
		if(appUrl.length()==0) {
			System.out.println("please pass the right URL" + url);
			throw new BroswerException("==EMPTY URL===");
		}
		if(appUrl.indexOf("http")!=0) {//check if the url is stating with http or not
			System.out.println("http is missing in the url"+ url);
			throw new BroswerException("====http is missing====");
		}
		driver.get(appUrl);
	}

}
