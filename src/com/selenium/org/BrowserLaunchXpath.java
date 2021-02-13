package com.selenium.org;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		//Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@name='username']"));
		name.sendKeys("9933231622");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("Kamatchi@kitchen098");

		WebElement create_btn = driver.findElement(By.xpath("//type[contains(@type,'submit')]"));
		create_btn.click();

	}
}
