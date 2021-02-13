package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement simple_alert = driver.findElement(By.xpath("//button[contains(text(),'    click the button to ')]"));
		simple_alert.click();
		
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
		WebElement confirm_alert = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		confirm_alert.click();
		
		
		WebElement confirm_alert1 = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		confirm_alert1.click();
		
		org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.accept();
		Thread.sleep(2000);
		
		WebElement prompt_alert = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		prompt_alert.click();
		
		WebElement prompt_alert1 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		prompt_alert1.click();

		Thread.sleep(2000);

		org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
		Thread.sleep(1000);
		alert3.sendKeys("I am Kavi");
		Thread.sleep(1000);
		alert3.accept();
		
		
		
		
		//WebElement prompt_alert1 = driver.findElement(By.xpath(""));
		
		
	}

}
