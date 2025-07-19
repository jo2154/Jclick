package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1
{
	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Alert1 myalert=(Alert1) driver.switchTo().alert();                                                                                                                                                                                                                                                                                    
		myalert.dismiss();	
		
		
		String exp= "You clicked: Cancel";
		String act=driver.findElement(By.id("result")).getText();
		
		if(act.equals(exp))
		{
			System.out.println("Alert passed..");
		}
		else
		{
			System.out.println("Alert failed.....");
		}
		
	}

	private void dismiss() {
		// TODO Auto-generated method stub
		
	}

}

	
	


