package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Casenumber {
	public static void main(String[] args) 
      {
		  @Test
		   public Selenium()
		   {
			  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
               WebDriver driver = new ChromeDriver();
               driver.manage().window().maximize();
               driver.get("https://www.google.co.in/");
               driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Infosys registration", Keys.ENTER);
 		       driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/span/a/h3")).click();
 		       driver.findElement(By.name("firstnameX")).sendKeys("Raj");
 		       driver.findElement(
 				By.xpath("/html/body/app-root/div[1]/div/register/div/div/div[2]/form/div[1]/div[2]/div/input"))
 				.sendKeys("D");
 		       driver.findElement(
 				By.xpath("/html/body/app-root/div[1]/div/register/div/div/div[2]/form/div[2]/div[1]/div/input"))
 				.sendKeys("Kumar");
 		          driver.findElement(
 				By.xpath("/html/body/app-root/div[1]/div/register/div/div/div[2]/form/div[2]/div[2]/div/input"))
 				.sendKeys("rajj42122@gmail.com");
 		        driver.findElement(By.name("passwordX")).sendKeys("Rajesh@214");
 		        driver.findElement(
 				By.xpath("/html/body/app-root/div[1]/div/register/div/div/div[2]/form/div[3]/div[2]/div/input"))
 				.sendKeys("Rajesh@214");
 		        WebElement Bycheckingthebox = driver.findElement(
 				By.xpath("/html/body/app-root/div[1]/div/register/div/div/div[2]/form/div[3]/div[3]/div/input"));
 		        Bycheckingthebox.click();
 		        WebElement Submitbutton = driver.findElement(By.xpath(
 				"/html/body/app-root/div[1]/div/register/div/div/div[2]/form/div[3]/div[4]/div[1]/div[1]/button"));
 		        Submitbutton.click();
 		        System.out.println("FirstTestCase");
		   }
 		    
		  @Test
 		   public Test()
 		    {
 		    	         driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Infosys signin", Keys.ENTER);
 		                 driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
 		                 WebElement Emailbox = driver.findElement(By.id("username"));
 		                 Emailbox.sendKeys("rajj42122@gmail.com");
 		                 WebElement Passwordbox = driver.findElement(By.id("password"));
 		                 Passwordbox.sendKeys("Rajesh@214");
 		                 WebElement loginbutton = driver.findElement(By.id("btnSubmit"));
 		                 loginbutton.click();
 		                 JavascriptExecutor jse = (JavascriptExecutor) driver;
 		                 jse.executeScript("window.scrollBy(0,400)");
 		                 driver.findElement(By.id("privacybuttonid")).click();
 		                 jse.executeScript("window.scrollBy(0,-200)");
 		                 WebElement CountryCode = driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-privacyconsent/div/div/div[2]/form/div[3]/div[2]/div/input"));
 		                 CountryCode.sendKeys("+91");
 		                 WebElement Mobilenumber = driver.findElement(By.xpath(
 				         "/html/body/app-root/div[1]/div/app-privacyconsent/div/div/div[2]/form/div[3]/div[4]/div/input"));
 		                  Mobilenumber.sendKeys("8245983069");
 		                  WebElement Skills = driver.findElement(By.id("mat-chip-list-input-0"));
 		                  Skills.sendKeys("Technology|CCD Technology|CCD Technology Skills");
 		                  Skills.click();
 		                   WebElement Checkbox = driver.findElement(By.xpath(
 				           "/html/body/app-root/div[1]/div/app-privacyconsent/div/div/div[2]/form/div[4]/div[1]/div/input"));
 		                   Checkbox.click();
 		                   WebElement Submitbutton1 = driver.findElement(By
 				           .xpath("/html/body/app-root/div[1]/div/app-privacyconsent/div/div/div[2]/form/div[5]/div/div/button"));
 		                   Submitbutton1.click();
 		                   JavascriptExecutor jse1 = (JavascriptExecutor) driver;
 		                   jse1.executeScript("window.scrollBy(0,1000)");
 		                   jse1.executeScript("window.scrollBy(0,-500)");
 		                   WebElement textbox = driver.findElement(By.id("exampleFormControlInput1"));
 		                   textbox.sendKeys("Quality Assurance Engineer");
 		                   WebElement Dropdown = driver.findElement(By.id("dropdownMenuButton"));
 		                   Dropdown.click();
 		                   Select select = new Select(Dropdown);
 		                   select.selectByIndex(2);
 		                   JavascriptExecutor jse11 = (JavascriptExecutor) driver;
 		                   jse11.executeScript("window.scrollBy(0,1000)");
 		                   jse11.executeScript("window.scrollBy(0,-500)");
 		                   WebElement ViewAndAcceptbutton = driver.findElement(By.xpath("/html/body/app-root/div[2]/div/app-jobs/div/div[4]/app-hotjobs/div/div[2]/owl-carousel-o/div/div[1]/owl-stage/div/div/div[6]/div/div/div[4]/button/span"));
 		                   ViewAndAcceptbutton.click();
 	         }

      }

}
