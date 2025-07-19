package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1{

public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//name
		WebElement text1=driver.findElement(By.id("name"));
		text1.sendKeys("John");
		text1.clear();
		Thread.sleep(2000);
		
		//Email
		WebElement text2=driver.findElement(By.id("email"));
		text2.sendKeys("johnsinghraj001@gmail.com");
		text2.clear();
		Thread.sleep(2000);
		
		//Phone
		WebElement text3=driver.findElement(By.id("phone"));
		text3.sendKeys("9498388739");
		text3.clear();
		Thread.sleep(2000);
		
		//Address
		WebElement text4=driver.findElement(By.id("textarea"));		
		text4.sendKeys("45/6A,Ranveer Street,vetturnimadam, Nagercoil");
		text4.clear();
		Thread.sleep(2000);
		
		//URL
		String CurrentUrl = driver.getCurrentUrl();
	    System.out.println(CurrentUrl);
	    Thread.sleep(2000);
	    
	    //Title
	    String title = driver.getTitle();
	    System.out.println(title);                                                                                                                                             
	    Thread.sleep(2000);
	    
	    //X-path
	    WebElement text5=driver.findElement(By.xpath("//*[@id='name']"));
	    text5.sendKeys("John");
	    
	    WebElement text6=driver.findElement(By.xpath("//*[@id=\"email\"]"));
	    text6.sendKeys("johnsinghraj001@gmail.com");
	    
	    WebElement text7=driver.findElement(By.xpath("//*[@id=\"phone\"]"));
	    text7.sendKeys("9498388739");
	    
	    WebElement text8=driver.findElement(By.xpath("//*[@id=\"textarea\"]"));
	    text8.sendKeys("54/87A,Rishwan street,Nagercoil");
	    
	    //LinkText
	    driver.findElement(By.linkText("Home"));
	    driver.findElement(By.linkText("Hidden Elements & AJAX"));
	    driver.findElement(By.linkText("Download Files"));
	    driver.findElement(By.partialLinkText("Hidden Elements"));
	    
	   //CSS Selector
	    driver.findElement(By.cssSelector("input#name")).sendKeys("san");
	    driver.findElement(By.cssSelector("input.form-control"));// class name
	    driver.findElement(By.cssSelector("input[id='name']")); //attribute
	    
	  //ClassName/
	    List<WebElement> header1=driver.findElements(By.className("//*[@id=\"name\"]"));
	    List<WebElement> header2=driver.findElements(By.className("//*[@id=\"email\"]"));
	    List<WebElement> header3=driver.findElements(By.className("//*[@id=\"phone\"]"));
	    List<WebElement> header4=driver.findElements(By.className("//*[@id=\"textarea\"]"));
	    
	   driver.close();
	}

   }




	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		

