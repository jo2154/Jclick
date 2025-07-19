package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitywait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		WebElement text1=driver.findElement(By.id("male"));
		 WebDriverWait mywait = new WebDriverWait (driver, Duration.ofSeconds(10));
		 mywait.until(ExpectedConditions.elementToBeClickable(text1));
		 
		 text1.click();
		 
		 System.out.println("completed...............");
		

	}

}
