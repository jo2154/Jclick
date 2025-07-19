package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day5 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//enter input to the search field
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("selenium");
		
		//get all the suggest values
		List <WebElement> suggs=driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		
		boolean status = false;
		
		for(int i =0; i<suggs.size(); i++)
		{
			 String value=suggs.get(i).getText();
			 System.out.println(value);
		}
		
		//search one of the value
		
		for(WebElement dropvalue:suggs)
		{
			String actvalue=dropvalue.getText();
			String expvalue="Selenium Interview questions";
			
			if(actvalue.equalsIgnoreCase(expvalue)) 
			{
				status = true;
				dropvalue.click();
				System.out.println("testing passed");
				break;
			}			
		}	
		if(! status )
		{
			System.out.println("Values are not matched");
		}

	
	}

}
