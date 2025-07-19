package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newday 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click(); //clicking the element
		
		Set<String>wins=driver.getWindowHandles(); //Storing all the window ID
		
		for(String win:wins)
		{
			String actual =driver.switchTo().window(win).getTitle(); //get title using window ID
			String expect = "OrangeHRM"; // adding expected result
			
			if(expect.equals(actual)) //condition for expected and actual result
			{
				driver.switchTo().window(win);
				driver.close(); // if matches, close the window
			}
			
		}
		System.out.println("Comlpleted.....");

		
	}
	
}
		
