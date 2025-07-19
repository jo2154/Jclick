package Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
	   File source=ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File (System.getProperty("user.dir")+"\\screenshot\\page.png");
		
		source.renameTo(target); 
		
		
    	WebElement ele1=	driver.findElement(By.xpath("//div[@class='date-picker-box']"));
    	File source1=ele1.getScreenshotAs(OutputType.FILE);
    	File target1 = new File (System.getProperty("user.dir")+"\\screenshot\\div.png");
    	source1.renameTo(target1); 
		
	
		WebElement ele2=	driver.findElement(By.xpath("//button[text()='Upload Single File']"));
		File source11=ele2.getScreenshotAs(OutputType.FILE);
		
		File target11 = new File (System.getProperty("user.dir")+"\\screenshot\\element.png");
		source11.renameTo(target11); 
		System.out.println("completed");
		
		driver.close();
		
	}

}

		
	


