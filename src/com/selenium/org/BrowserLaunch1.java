package com.selenium.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("kavitha8502@gmail.com");
		Thread.sleep(3000);
		
		email.clear();
		Thread.sleep(3000);
		email.sendKeys("abcdtechnology@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("kavi1985");
		
		Thread.sleep(2000);
		WebElement create_btn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
        create_btn.click();
        
        WebElement day = driver.findElement(By.id("day"));
        		
        Select s =new Select(day);
        s.selectByValue("8");
        List<WebElement> options = s.getOptions();	
	    for (WebElement X : options) {
	    	System.out.println(X.getText());
			
		}
	}
}
