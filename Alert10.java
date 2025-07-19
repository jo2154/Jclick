package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 public class Alert10 
{
 
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.com/");
		
		Thread.sleep(10000);
		 
		WebElement Alert1=driver.findElement(By.id("alertBtn"));
		 Alert1.click();
		 
		 String exp = "You clicked: OK";
		 String act=driver.findElement(By.id("result")).getText();
		 
		 driver.switchTo().alert().accept();
		 
		 
	WebElement Alert2=driver.findElement(By.id("confirmBtn"));
		 Alert2.click();
		 WebElement Alert3=driver.findElement(By.id("promptBtn"));
		 Alert3.click();
		 if(act.equals(exp))
			{
				System.out.println("Alert passed..");
			}
			else
			{
				System.out.println("Alert failed.....");
			}  
			
		
		
		 
	}
	
}
	
		
	
	
		
		 
      



 
		 
		
	
		
		                                                                                                                                                                                                                                                                                                                               
		
		
		
		

	
