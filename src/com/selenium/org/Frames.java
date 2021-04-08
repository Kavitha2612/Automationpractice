package com.selenium.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames{
	
	
	
	private static CharSequence kavijaga;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
			
		driver.manage().window().maximize();
		
			
		
		driver.switchTo().frame("SingleFrame");
		WebElement id1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		id1.sendKeys("Kavi");
		
		Thread.sleep(4000);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		element.sendKeys(kavijaga);
		
		
		Thread.sleep(4000);
		driver.switchTo().frame(2);
		Thread.sleep(4000);
		driver.switchTo().frame(1);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("KaviR");
	
		}



}
