package com.selenium.org;

import java.io.File;
import java.io.IOException;

import javax.swing.JScrollBar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\facebook1.png");
		FileUtils.copyFile(sourceFile, destFile);
		
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2500)");
		
		
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File sourceFile1 = ts1.getScreenshotAs(OutputType.FILE);
		File destFile1 = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\amazon1.png");
		FileUtils.copyFile(sourceFile1, destFile1);
		driver.quit();
		
		
	}
}




