package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicitly waits
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://testautomationpractice.blogspot.com/");
			
			driver.findElement(By.linkText("Apple")).click();
			
			//refresh
			driver.navigate().refresh();
			
			//back
			driver.navigate().back();
			
			//forward
			driver.navigate().forward();
		}

	}




		
		
		

	