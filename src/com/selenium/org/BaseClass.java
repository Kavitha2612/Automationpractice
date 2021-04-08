package com.selenium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import okhttp3.internal.connection.RouteSelector.Selection;

public class BaseClass {

	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browsername) {

		try {
			if (browsername.equalsIgnoreCase("chrome")) {

		//		String current = System.getProperty("user.dir");
		//		System.out.println("Current working directory in Java : " + current);	    
			//	System.setProperty("webdriver.chrome.driver", current + "\\driver\\chromedriver.exe");

				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");				
				driver = new ChromeDriver();
			
			} else {
				System.out.println("Invalid Browsername");
			} 
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void emailID(String id)
	{
		WebElement name = driver.findElement(By.xpath("//input[@id='email']"));
		name.sendKeys(id);	
	}
	
	public static void getPSS(String id)
	{
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(id);	
	}
	
	public static void clickBtn()
	{

		WebElement create_btn = driver.findElement(By.xpath("//type[contains(@name,'login')]"));
		create_btn.click();
	}
	
	public static void Searcher(String s) throws AWTException
	{
	WebElement element = driver.findElement(By.name("q"));
	element.sendKeys(s);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_UP);
	r.keyRelease(KeyEvent.VK_UP);

	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void title() {
		//System.out.println(driver.getTitle());
		String tit = driver.getTitle();
		System.out.println(tit);
	}
	
	public static void refresh() 
	{
		driver.navigate().refresh();	
	}
	
	public static void closeBrowser(){
		driver.quit();
	}

	public static void action()
	{ 
		org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(driver);
		WebElement source_element = driver.findElement(By.xpath("//span[text()='Draggable 1']"));
		WebElement target_element = driver.findElement(By.id("mydropzone"));
		ac.dragAndDrop(source_element, target_element).build().perform();
		
	}
	
	public static void screenShot() throws IOException {
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File sourceFile1 = ts1.getScreenshotAs(OutputType.FILE);
		File destFile1 = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\face1.png");
		FileUtils.copyFile(sourceFile1, destFile1);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}
		
	public static void screenShot1(String name) throws IOException {
		TakesScreenshot ts2 = (TakesScreenshot)driver;
		File sourceFile2 = ts2.getScreenshotAs(OutputType.FILE);
		File destFile2 = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\" + name + ".png");
		FileUtils.copyFile(sourceFile2, destFile2);
		
	}

	
	public static void loginPage()
	{
		driver.findElement(By.id("username")).sendKeys("deepa1985");
		driver.findElement(By.id("password")).sendKeys("puppy1985");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("location")).click();
		
	}
	
	public static void searchHotel() throws InterruptedException {
		WebElement ele1 = driver.findElement(By.id("location"));
		Select s1 = new Select(ele1);
		s1.selectByValue("New York");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement ele2 = driver.findElement(By.id("hotels"));
		Select s2 = new Select(ele2);
		s2.selectByValue("Hotel Sunshine");
		
		WebElement ele3 = driver.findElement(By.id("room_type"));
		Select s3 = new Select(ele3);
		s3.selectByValue("Super Deluxe");
		
		WebElement ele4 = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(ele4);
		s4.selectByValue("2");
		
		driver.findElement(By.id("datepick_in")).sendKeys("20/03/2021");
		driver.findElement(By.id("datepick_out")).sendKeys("22/03/2021");
		
		WebElement ele5 = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(ele5);
		s5.selectByValue("2");

		
		WebElement ele6 = driver.findElement(By.id("child_room"));
		Select s6 = new Select(ele6);
		s6.selectByValue("2");
		
		driver.findElement(By.id("Submit")).click();
	}
	

	public static void selectHotel() {
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();		
	}
	
		
	public static void bookHotel() {
		driver.findElement(By.id("first_name")).sendKeys("Kavi");
		driver.findElement(By.id("last_name")).sendKeys("jaga");
		driver.findElement(By.id("address")).sendKeys("thiruvanmayur,ch-41");
		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
		//driver.findElement(By.id("cc_type")).sendKeys("1234567890123456");VISA
		
		WebElement ele7 = driver.findElement(By.id("cc_type"));
		Select s7 = new Select(ele7);
		s7.selectByValue("VISA");
		
		WebElement ele8 = driver.findElement(By.id("cc_exp_month"));
		Select s8 = new Select(ele8);
		s8.selectByValue("6");
		
		WebElement ele9 = driver.findElement(By.id("cc_exp_year"));
		Select s9 = new Select(ele9);
		s9.selectByValue("2022");
		
		
		driver.findElement(By.id("cc_cvv")).sendKeys("123");		
		driver.findElement(By.id("book_now")).click();		
		driver.findElement(By.id("my_itinerary")).click();		
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
	}
	
	
	
}