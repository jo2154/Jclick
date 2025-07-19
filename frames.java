package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args)
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//enter into the frame
		WebElement f1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(f1);
		driver.findElement(By.name("mytext1")).sendKeys("santhosh");
		driver.switchTo().defaultContent();
		
		//frame 2
		WebElement f2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(f2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("john");
		driver.switchTo().defaultContent();
		
		//iframe
		WebElement f3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(f3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Iframe");
		
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("input.Hvn9fb ")).sendKeys("I am in iframe");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys(" i am enter into the parent");
		driver.switchTo().defaultContent();
	}

}

		
