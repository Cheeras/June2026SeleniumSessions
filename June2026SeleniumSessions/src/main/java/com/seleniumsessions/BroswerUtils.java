package com.seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
