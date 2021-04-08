package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		
		
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		
		//WebElement right_click = driver.findElement(By.name("q"));
		org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(driver);
	//	ac.contextClick(right_click).build().perform();
		
	
		//WebElement movetoelement = driver.findElement(By.linkText("Gmail"));
		//ac.moveToElement(movetoelement).click().build().perform();
		
	WebElement source_element = driver.findElement(By.xpath("//span[text()='Draggable 1']"));
	WebElement target_element = driver.findElement(By.id("mydropzone"));
	ac.dragAndDrop(source_element, target_element).build().perform();
		
		
		
		
		

	}

}
