package com.selenium.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3_Task {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.get("http://www.greenstechnologys.com/");
	
	driver.get("https://www.facebook.com/");
	WebElement element = driver.findElement(By.id("email"));
	element.sendKeys("abcd@gmail.com");
	
	WebElement element2 = driver.findElement(By.id("pass"));
	element2.sendKeys("adsadsfdg");
	
	WebElement element3 = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	element3.click();
	Thread.sleep(3000);
	
	WebElement element4 = driver.findElement(By.id("day"));
	Select s = new Select(element4);
	s.selectByValue("10");
	Thread.sleep(3000);
	List<WebElement> options = s.getOptions();
	for (WebElement x : options) {
		System.out.println(x.getText());
		Thread.sleep(3000);
		
		WebElement element5 = driver.findElement(By.name("birthday_month"));
		Select s1 =new Select(element5);
		s1.selectByValue("8");
		
		Thread.sleep(3000);
		List<WebElement> options2 = s.getOptions();
		Thread.sleep(3000);
		
		for (WebElement x1 : options2) {
			System.out.println(x1.getText());
			
			Thread.sleep(3000);
			WebElement element6 = driver.findElement(By.id("year"));
			Select s2 = new Select(element6);
			s2.selectByValue("2019");
			
			List<WebElement> options3 = s.getOptions();
			for (WebElement x2 : options) {
				System.out.println(x2.getText());
				Thread.sleep(3000);
				
				WebElement radio_button = driver.findElement(By.xpath("//label[text()='Female']"));
				radio_button.click();
				System.out.println("radio_button selected or not = ");
				
				
			}
			
		}
		
		
	}
	
	
	
	//WebElement element = driver.findElement(By.linkText("CONTACT US"));
	//element.click();
		
		
		
	}
}