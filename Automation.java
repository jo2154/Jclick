package talentshipProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation
{

	    public static void main(String[] args) throws InterruptedException 
        {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://talentship.io/en/");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/div/ul/li/a/span")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
 		jse.executeScript("window.scrollBy(0,5000)");
 		jse.executeScript("window.scrollBy(0,-2500)");
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div[2]/div/ul/li/a/span")).click();
        driver.navigate().to("https://talentship.io/en/");
       WebElement Bookanexpertcallbutton = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div[3]/a"));
	    Bookanexpertcallbutton.click();
	    driver.navigate().to("https://talentship.io/en/");
	    WebElement DE = driver.findElement(By.xpath("//	*[@id=\"header\"]/div/div[2]/div[4]/div/ul/li[1]/a/span"));
	   DE.click();
	   driver.navigate().to("https://talentship.io/en/");
	   JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,2800)");
		jse1.executeScript("window.scrollBy(0,-1400)");
	   driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-a50910ac48499b463\"]/div[2]/div/div/div[1]/div/picture/img")).click();
     }

}






	
	
	   
	


	   
	   
	   
	   
	 
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
        
        
        
        
        
        
        
        
        
        
       
        
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
    
        
        
        
        
       
      
       
       
       
      
       
       
       
       
       
       
        
       
     
	

