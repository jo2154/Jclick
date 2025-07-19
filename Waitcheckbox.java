package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitcheckbox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement ele=driver.findElement(By.xpath("//input[@id='male'] "));
		
		//Wait
		WebDriverWait mywait = new WebDriverWait (driver, Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.elementToBeClickable(ele));
		
		ele.click();
		
		List<WebElement> checks=driver.findElements(By.xpath("//input[@class='form-check-input'] [@type='checkbox']"));
		
		for(WebElement check:checks)
		{
			String name=check.getDomAttribute("value");
			System.out.println(name);
			
			check.click();
		} 
		
		for(int i =0; i <checks.size();i ++)
		{
			checks.get(i).click();
		}
		
		Thread.sleep(10000);
		
		
	}

}

		
