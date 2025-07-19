package products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration
{

	          public static void main(String[] args) throws InterruptedException 
	         {
		
		               System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		               WebDriver driver = new ChromeDriver();
		               driver.manage().window().maximize();
		               driver.get("https://www.flipkart.com/");
		               driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[1]/div/div/div/div/img")).click();
		               Thread.sleep(1000);
		               WebElement pincode = driver.findElement(By.name("pincode"));
		               pincode.sendKeys("629002");
		               Thread.sleep(1000);
		               driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div[2]/div/div[2]/div[2]/div/div/div[1]/form/div/button")).click();
		               Thread.sleep(1000);
		               driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div/div[2]/a/div[1]/div/img")).click();
		               Thread.sleep(1000);
		               WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[2]/div"));
		               Select select = new Select(dropdown1);
		               select.selectByIndex(0);
		               select.selectByValue("2");
		               select.selectByVisibleText("Selenium");
		               Thread.sleep(1000);
		               driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div/div[1]/a/div[1]/div/img")).click();
		               Thread.sleep(1000);
		               driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div/div[2]/a/div[1]/div/img")).click();
		               Thread.sleep(1000);
		               driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div/div[4]/a/div[1]/div/img")).click();
		               Thread.sleep(1000);
		               driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div/div[5]/a/div[1]/div/img")).click();
		               Thread.sleep(1000);
		               driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div/div[6]/a/div[1]/div/img")).click();
		               Thread.sleep(1000);
		               driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div/div[7]/a/div[1]/div/img")).click();
		               Thread.sleep(1000);
           }

   }
		
		
		     
