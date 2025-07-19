package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Seleniumaction {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		Actions act = new Actions (driver);
	   WebElement ele=driver.findElement(By.xpath("//button[text()='Point Me']"));
	   WebElement ele2=driver.findElement(By.xpath("//a[text()='Laptops']"));
		
	   act.moveToElement(ele).moveToElement(ele2).click().perform();
	   act.moveToElement(ele).moveToElement(ele2).perform();
		
	   System.out.println("Completed"); 
		
		Action actt=act.moveToElement(ele).moveToElement(ele2).build();
		actt.perform(); 
		
        WebElement ele3=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		act.doubleClick(ele3).perform(); 
		

	  WebElement drag=   driver.findElement(By.id("draggable"));
	 WebElement drop=	driver.findElement(By.id("droppable"));
	act.dragAndDrop(drag, drop).build().perform();
	
	//right click
	act.contextClick(ele).perform();
		
	}

}
		

	
