package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day6_actions {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Invoke Action class
		Actions act = new Actions (driver);
		
		//hover
	   WebElement ele=driver.findElement(By.xpath("//button[text()='Point Me']"));
		//drag and drop
	WebElement drag=	driver.findElement(By.id("draggable"));
	WebElement drop=	driver.findElement(By.id("droppable"));
	act.dragAndDrop(drag, drop).build().perform();
	
	//right click
	act.contextClick(ele).perform();
		
	}

}
