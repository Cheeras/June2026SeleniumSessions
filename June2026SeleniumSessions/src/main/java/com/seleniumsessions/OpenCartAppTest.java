package com.seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class OpenCartAppTest {

	public static void main(String[] args) {

		BroswerUtils2 bu = new BroswerUtils2();
		WebDriver driver = bu.initDriver("chrome");
		//bu.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		URL url;
		try {
			url = new URL("naveenautomationlabs.com/opencart/index.php?route=account/login");
			bu.launchUrl(url);
		} catch (MalformedURLException e) {
			System.out.println("https is missing");
			e.printStackTrace();
			throw new BroswerException("http is missing");
		}
		
		String actTitle = bu.getPageTitle();
		if(actTitle.equals("Account Login")) {
			System.out.println("title is correct -- PASS");
		}else {
			System.out.println("title is in correct -- FAIL");
		}
		String actPageUrl = bu.getPageUrl();
		if(actPageUrl.contains("account/login")) {
			System.out.println("login page url is correct");
		}else {
			System.out.println("login page url is not correct");
		}
		
		bu.quiteBroswer();
	}

}
