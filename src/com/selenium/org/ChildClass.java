package com.selenium.org;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildClass extends BaseClass{

	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
	
	
		driver = BaseClass.browserLaunch("Chrome");
		
		Thread.sleep(3000);
		getUrl("https://www.facebook.com/");
		
		Thread.sleep(3000);
		emailID("Kavi");
		
		Thread.sleep(3000);
		getPSS("kavi85");
		
//		Thread.sleep(3000);
//		clickBtn();
		Thread.sleep(3000);
		
		getUrl("https://www.google.com/");
		Searcher("gmail");
		
		Thread.sleep(3000);
		screenShot();

		refresh();

		Thread.sleep(3000);
		getUrl("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		
		action();
		title();
		//dropdown(null, "7", "8");
		
		Thread.sleep(3000);
		closeBrowser();
	}


}
