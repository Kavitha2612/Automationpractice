package com.selenium.org;

import org.openqa.selenium.WebDriver;

public class BrowserLaunchChild extends BaseClass{

	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
	
	
		driver = BaseClass.browserLaunch("Chrome");
		Thread.sleep(3000);

		getUrl("https://www.facebook.com/");
	
	}
}