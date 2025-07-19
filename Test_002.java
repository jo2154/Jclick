package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_002 {

	public static void main (String[] args)
	   {
		    WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.manage().deleteAllCookies();
		    driver.manage().window().maximize();
		    driver.get("https://www.automationexercise.com/login");
		    WebElement EmailAddress=driver.findElement(By.xpath("//input[@data-qa='login-email']"));
		    EmailAddress.sendKeys("johnsinghraj001@gmail.com"); 
		    // EmailAddress.sendKeys("johnsinghraj001@gmail.com");                                                                                                                                                                                                                                              ");
		    WebElement Password=driver.findElement(By.xpath("//input[@data-qa='login-password']"));
		    Password.sendKeys("johnsh01");
		    WebElement Login=driver.findElement(By.xpath("//button[@data-qa='login-button']"));
		    Login.click();
		    
		    
		    
		    
            
	}

}
