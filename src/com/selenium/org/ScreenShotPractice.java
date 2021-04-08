package com.selenium.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotPractice {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File desFile = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\demo.png");
		FileUtils.copyFile(sourceFile, desFile);
		
		
		WebElement simple_alert = driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
		simple_alert.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(3000);
		
		WebElement confirm_alert = driver.findElement(By.xpath("(//a[text()='Alert with OK & Cancel '])"));
		confirm_alert.click();
		WebElement confirm_alert1 = driver.findElement(By.xpath("(//button[text()='click the button to display a confirm box '])"));
		confirm_alert1.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		
		
		WebElement prompt_alert = driver.findElement(By.xpath("(//a[text()='Alert with Textbox '])"));
		prompt_alert.click();
		
		WebElement prompt_alert1 = driver.findElement(By.xpath("(//button[text()='click the button to demonstrate the prompt box '])"));
		prompt_alert1.click();
		
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("kavijaga");
		alert3.accept();
		Thread.sleep(3000);
		driver.get("https://www.amazon.in/");
		//driver.close();
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)");
		
	
	
	}

}
