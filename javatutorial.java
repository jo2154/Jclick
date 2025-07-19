package TestSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javatutorial 
{
	public static void main(String args[])
{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.get("https://www.automationexercise.com/login");
		  
		
		

	}

}
