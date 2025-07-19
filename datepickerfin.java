package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datepickerfin {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.id("txtDate")).click();
		
		String expyear= "2015";
		String expmon = "Apr";
		String expdate= "14";
		
		
		
		//select class for month
		WebElement mon=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select select = new Select(mon);
		select.selectByVisibleText(expmon);
		
		//Year
		WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select select1 = new Select(year);
		select1.selectByVisibleText(expyear);
		
		//select date
		driver.findElement(By.xpath("//a[@data-date="+expdate+"]")).click();
		
		
		
		
		

	}

}
