package Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signUp {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("spicejet signup" , Keys.ENTER);
	    driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/span/a/h3")).click();
	    WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div[2]"));
	    Select select = new Select(Dropdown);
	    select.selectByIndex(2);
	     driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("John");
	     
	     
	     
	 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
	
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
				
		
		
	

	}

}
