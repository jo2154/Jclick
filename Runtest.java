package testtwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Runtest 
{

	        static void main(String[] args) 
	        {
		               @Test 
		               public void display()
		               {
			                       System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");    
			                       WebDriver driver = new ChromeDriver();
		                            driver.manage().window().maximize();
		                            driver.get("https://www.spicejet.com");
		                            driver.manage().window().maximize();
		                            driver.findElement(By.id("first_name")).sendKeys("John");
		                            driver.findElement(By.id("last_name")).sendKeys("Singh");
		                            driver.findElement(By.cssSelector("#submit")).click();
		                            String act_url = driver.getCurrentUrl();
		                            System.out.println(act_url);
		                            String desired_url = "https://www.spicejet.com";
		                            if(act_url.equals(desired_url));
		                            {
			                                     System.out.println(" pass ");
		                            }
		                            String act_title=driver.getTitle();
		                            System.out.println(act_title);
		                            String desired_title = "OrangeHRM";
		                            if(act_title.equals(desired_title));
		                            {
		        	                        System.out.println("pass");
		                            }
		                            System.out.println("FirstTestCase");
		                            driver.close();
		           }
	
          }
	
}
		
		
		
		
		
		
		
		
		

	
