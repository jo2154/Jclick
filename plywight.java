package testflow1.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class plywight {
	
	public static void main(String[] args) 
	{
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.testleaf.com");
        driver.findElement(By.xpath("//span[text() ='Start Course']")).click();
        driver.navigate().back();
        driver .findElement(By.xpath("//span[text()='Sign In']")).click();
        driver .findElement(By.linkText("Sign Up")).click();
        driver .navigate().forward();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   
        
        
        
        
        
        
        
        
        
        
        
        
    
        
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
		

	}

}
