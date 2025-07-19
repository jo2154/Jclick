package com.test.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//class name 
public class SeleniumTest {
	
	public static void main(String[] args) throws InterruptedException {   //main method
		
		//inter face reference   key   class
		WebDriver driver =      new  ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
//		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node01pfh6xar81l9enbcecpmcm6l88764031.node0");
		driver.manage().window().maximize();
		Thread.sleep(2000);
			
			
		 WebElement clickBtn = driver.findElement(By.id("j_idt88:j_idt90"));
		 clickBtn.click();
		
		 
//		WebElement refName = driver.findElement(By.id("j_idt88:name"));
//		refName.sendKeys("John");
//		Thread.sleep(2000);
//		refName.clear();

		
		
//		Thread.sleep(2000);
//		driver.close();
		 
		
		 
		
//		String title = driver.getTitle(); 
//		
//		System.out.println(title);
//		
		 
//		
//		String currentUrl = driver.getCurrentUrl();  // current url 
//		
//		System.out.println(currentUrl); 
		 
		
		
	
	}
	
}
