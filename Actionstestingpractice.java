package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Actionstestingpractice {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions ();
		
		//headless testing
	//	option.addArguments("--Headless= new");
		
		//incognito mode
		option.addArguments("Incognito= new");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.pothysmart.com");
		System.out.println("Headless testing is completed");
		
		
		
		
		
		
		
		
		
		
	

	}

}
