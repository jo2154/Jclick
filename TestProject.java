package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProject 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		WebElement Emailbox = driver.findElement(By.name("email"));
		Emailbox.sendKeys("johnsinghraj001@gmail.com");
		WebElement ContinueButton = driver.findElement(By.id("continue"));
		ContinueButton.click();                                                                                                           
		Thread.sleep(1000);
	     WebElement Passwordbox = driver.findElement(By.name("password"));
		Passwordbox.sendKeys("Johnsh1992#$");
		WebElement Signinbutton = driver.findElement(By.id("signInSubmit"));
		Signinbutton.click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Today's Deals")).click();	
		WebElement image1 = driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[3]/div/div/div[2]/div/div/div/div[1]/div/a/div[1]/div/div"));
		image1.click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		jse.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(1000);
	   WebElement BuyNowbutton = driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]"));
	   BuyNowbutton.click();
	   Thread.sleep(2000);
	   driver.navigate().to("https://www.amazon.in/?ref_=nav_ya_signin");
	   driver.findElement(By.id("glow-ingress-line1")).click();
	   Thread.sleep(2000);
	   driver.navigate().to("https://www.amazon.in/");
	   driver.quit();
	}
	
}


