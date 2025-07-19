package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[text()='orangeHRM, Inc']")).click();
		
		Set <String> wins=driver.getWindowHandles();

		for(String win : wins)
		{
			System.out.println("mutiple window: "+win);
	    }
		//String win1=driver.getWindowHandle();
	//	System.out.println(win1);
		
		driver.switchTo().newWindow(WindowType.WINDOW);  //Tab
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		boolean status=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).isEnabled(); // check whether field is enabled or not


		System.out.println(status);

		if (status == false)
		{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a"));
		}

		driver.switchTo().window(null);
	}

}
