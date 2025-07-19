package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumautomation
{

	 public static void main(String[] args) throws InterruptedException
	 {
		    WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.manage().deleteAllCookies();
		    driver.manage().window().maximize();
		    driver.get("https://www.automationexercise.com/login");
		    WebElement EmailAddress =driver.findElement(By.xpath("//input[@data-qa='login-email']"));
		    EmailAddress.sendKeys("johnsinghraj001@gmail.com"); 
		    WebElement Password=driver.findElement(By.xpath("//input[@data-qa='login-password']"));
		    Password.sendKeys("johnsh01");
		    WebElement Login=driver.findElement(By.xpath("//button[@data-qa='login-button']"));
		    Login.click();
		    WebElement Addtocart=driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']"));
		    Addtocart.click();
		    WebElement ContinueShopping=driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']"));
		    ContinueShopping.click();
		    WebElement Viewcart =driver.findElement(By.xpath("//u[@text='View Cart']"));
		    Thread.sleep(5000);
		    Viewcart.click();
		    Thread.sleep(2000);
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		     
		    
		    
		    
		    
		    
		    
		   

	}

}
