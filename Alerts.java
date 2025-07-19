package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts 
{
	    public static void main(String[] args) throws InterruptedException
	    {
	    	
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			WebDriver driver1 = new ChromeDriver();
			driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
			driver1.manage().deleteAllCookies();
			driver1.manage().window().maximize();
			driver1.get("https://the-internet.herokuapp.com/javascript_alerts");
			
			Thread.sleep(3000);
			//Alerts
			driver1.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
			
			Alert myalert=driver1.switchTo().alert();
			myalert.accept();
			
			String exp= "You successfully clicked an alert";
			String act=driver1.findElement(By.id("result")).getText();
			
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
			
		

