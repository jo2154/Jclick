package firstaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class accountlogin 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Create an gmail Account", Keys.ENTER);
		WebElement SignupAccount = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/span/a/h3"));
		SignupAccount.click();
		WebElement Createaccountbutton = driver.findElement(By.xpath("//*[@id=\"page-width-container\"]/div[1]/article/section/div/div[1]/div/p[1]/a"));
		Createaccountbutton.click();
		WebElement Emailbox = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		Emailbox.sendKeys("johnsinghraj001@gmail.com");
		

	}

}
