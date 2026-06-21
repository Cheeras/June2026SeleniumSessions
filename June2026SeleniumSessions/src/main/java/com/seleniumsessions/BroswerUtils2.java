package com.seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Shankar Cheerala
 */
public class BroswerUtils2 {

	WebDriver driver;// default value is null because it is not premitive

	/**
	 * this is used to initilise the driver on the basis of given broswer name:
	 * chrome,firefox,edge and safari
	 * @param broswerName
	 * @return it returns the driver
	 */
	public WebDriver initDriver(String broswerName) {
		System.out.println("Broswer Name :: " + broswerName);
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
	/*
	 * There is duplicate code in below 2 methods create separate method for the
	 * same
	 */

	/**
	 * below 2 are overloaded methods you can give at time of the interview
	 */

	public void launchUrl(String url) {
		lengthCheck(url);
		httpCheck(url);
		driver.get(url);
	}

	public void launchUrl(URL url) {
		String appUrl = String.valueOf(url);
		lengthCheck(appUrl);
		httpCheck(appUrl);
		driver.get(appUrl);
	}

	public void lengthCheck(String value) {
		if (value.length() == 0) {
			System.out.println("please pass the right URL" + value);
			throw new BroswerException("==EMPTY value===");
		}
	}

	public void httpCheck(String urlValue) {
		if (urlValue.indexOf("http") != 0) {// check if the url is stating with http or not
			System.out.println("http is missing in the url" + urlValue);
			throw new BroswerException("====http is missing====");
		}
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("page title is: "+title);
		return title;
	}
	
	public String getPageUrl() {
		String pageUrl = driver.getCurrentUrl();
		System.out.println("page URL is: "+pageUrl);
		return pageUrl;
	}
	
	public void closeBroswer() {
		if(driver!= null) {
			driver.close();
			System.out.println("broswer is closed");
		}
	}
	public void quiteBroswer() {
		if(driver!=null) {
			driver.quit();
			System.out.println("broswer is closed");
		}
	}
	

}
