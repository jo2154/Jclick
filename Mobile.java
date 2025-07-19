package newproduct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobile {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/");
	    WebElement Joinnowbutton=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/a/img"));
	    Joinnowbutton.click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
	  
	   
	   
	   
	  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  
	   
	 
	    
	    
	   
	    
	    
	  
	    
	    
	    
		
		

	}

}
