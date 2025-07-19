package product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Brand 
{

	       public static void main(String[] args) 
	       {
	    	   
	    	 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	   		WebDriver driver = new ChromeDriver();
	   		driver.manage().window().maximize();
	   		driver.get("https://www.amazon.in/");
	   		
	   		
	   		@Test (priority=1)
	   		public void Student()
	   		{
	   			WebElement Emailbox = driver.findElement(By.name("email"));	
		         Emailbox.sendKeys("johnsinghraj001@gmail.com");
		         Thread.sleep(1000);
		         WebElement ContinueButton =  driver.findElement(By.id("continue"));
		         ContinueButton.click();
	   			
	   		}
		
		

	}

}
