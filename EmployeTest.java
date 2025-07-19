package com.test.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class EmployeTest {


	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//	 Thread.sleep(500);
		//	 WebElement clickBtn = driver.findElement(By.className("pi pi-server layout-menuitem-icon"));
		//	 clickBtn.click();

		//	 
		//	 driver.navigate().to("https://www.leafground.com/input.xhtml");
		//	 driver.navigate().forward();
		//	 driver.navigate().back();
		//	 driver.navigate().refresh();

		//	 TakesScreenshot screenshot = (TakesScreenshot)driver;
		//	 
		//	 File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		//	 File destination = new File("C:\\Users\\welcome\\Desktop\\New folder\\selenium.png");
		//	Files.copy(screenshotAs, destination);
		//
		//	
		//WebElement element = driver.findElement(By.linkText("show"));
		//driver.findElement(By.partialLinkText("card"));
		//	

		//	WebElement element2 = driver.findElement(By.cssSelector(""));
		//	 WebElement clickAlert = driver.findElement(By.xpath("//a[@href='/alert.xhtml']"));
		//	 clickAlert.click();
		//	 	
		//	 
		//	 WebElement clickShowBtn = driver.findElement(By.xpath("//label[text()='Safari']"));
		//	 clickShowBtn.click();


		//	 String text = clickShowBtn.getText();
		//	 System.out.println(text);
		//	 
		//	String attribute = clickShowBtn.getAttribute(text);
		//	System.out.println(attribute);
		//	
		//	boolean displayed = clickShowBtn.isDisplayed();
		//	System.out.println(displayed);


		//	WebElement submitBtn = driver.findElement(By.id("j_idt88:j_idt94"));
		//	submitBtn.submit();


		//	 
		//	 Thread.sleep(1000);
		//	 driver.switchTo().alert().accept();
		//	 
		//	 WebElement clickConfirmBtn = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']//following::span[2]"));
		//	 clickConfirmBtn.click();
		//	 Thread.sleep(1000);
		//	 
		//	 driver.switchTo().alert().dismiss();
		//	 
		//	 WebElement clickPromt = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']//following::span[16]"));
		//	 clickPromt.click();
		//	 
		//	 
		//	 	
		//	 driver.switchTo().alert().sendKeys("john");
		//	 driver.switchTo().alert().accept();
		//	 



		WebElement selectTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));

		Select s= new Select(selectTool);
		//	 s.selectByIndex(1);
		//	 s.selectByVisibleText("Selenium");
		//	 s.selectByValue("Playwright");  //  not execute 
		//	 	Thread.sleep(2000);

		//	 driver.close();

	}

}
