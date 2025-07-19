package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day5_daypicker1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//click the datepicker
		driver.findElement(By.id("datepicker")).click();
		
		//exp
		String expyr = "2023";
		String expmon = "April";
		String expdate= "14";
		
		//Selecting year and month
		while(true)
		{
			String actyr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String actmon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			if (actyr.equals(expyr) && actmon.equals(expmon))
			{
				driver.findElement(By.xpath("//a[@class='ui-state-default'] [@data-date="+expdate+"]")).click();
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
		}
		
		
		

	}

}
