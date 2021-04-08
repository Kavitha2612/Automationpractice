package com.selenium.org;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class AdactinHotel extends BaseClass {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver = BaseClass.browserLaunch("chrome");
		getUrl("https://adactinhotelapp.com/");
		
		loginPage();
		searchHotel();
		selectHotel();
		bookHotel();
		screenShot1("Itinerary");
		closeBrowser();
	}
}
