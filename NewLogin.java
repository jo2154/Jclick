package products;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		@Test
		public void regressionTesting();
	
		{		    
			       driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
                   Thread.sleep(1000);
                   WebElement Emailbox = driver.findElement(By.name("email"));
                   Emailbox.sendKeys("johnsinghraj001@gmail.com");
                   Thread.sleep(1000);
                   WebElement ContinueButton = driver.findElement(By.id("continue"));
                   ContinueButton.click();
                   Thread.sleep(1000);
                   WebElement Passwordbox = driver.findElement(By.name("password"));
                   Passwordbox.sendKeys("Johnsh1992#$");
                   Thread.sleep(1000);
                   WebElement Signinbutton1 = driver.findElement(By.id("signInSubmit"));
                   Signinbutton1.click();
                   Thread.sleep(1000);
                   driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).click();
                   Thread.sleep(1000);
                   driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[3]/a")).click();
                   Thread.sleep(1000);
                   driver.findElement(By.linkText("Electronics")).click();
                   Thread.sleep(1000);
                   driver.findElement(By.linkText("Headphones")).click();
                   Thread.sleep(1000);
                   driver.findElement(By.linkText("Open-Ear Headphones")).click();
                   Thread.sleep(1000);
                   driver.findElement(By.linkText("On-Ear" )).click();
                   Thread.sleep(1000);
                   System.out.println("firstTestCase");
        }
		
		@Test
		public void reTesting()
		{
		             WebElement image1 = driver.findElement(By.xpath("//*[@id=\"B0CY1PL36Q\"]/a/div/img"));
                     image1.click();
                     Thread.sleep(1000);
                     WebElement Dropdown = driver.findElement(By.id("quantity"));
                     Dropdown.click();
                     Select select = new Select(Dropdown);
                     select.selectByIndex(1);
                     WebElement BuyNowbutton1 = driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]"));
                     BuyNowbutton1.click();
                     driver.navigate().to("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
                    JavascriptExecutor jse = (JavascriptExecutor) driver;
                     jse.executeScript("window.scrollBy(0,1000)");
                     jse.executeScript("window.scrollBy(0,-500)");
                     WebElement ProceedtoBuybutton2 = driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input"));
                     ProceedtoBuybutton2.click();
                     WebElement Usethisaddressbutton = driver.findElement(By.xpath("//*[@id=\"orderSummaryPrimaryActionBtn\"]/span/input"));
                     Usethisaddressbutton.click();
                     Thread.sleep(5000);
                     System.out.println("secondTestCase");
		}
        
		@Test
		public void sanityTesting()
	    {
	             driver.navigate().to("https://www.amazon.in/");
                 driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[1]")).click();
                 driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
                 driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/div[2]/div[1]/a/div/div/div/div[2]/h2")).click();
                 driver.navigate().to("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
                 driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/div[2]/div[2]/a/div/div/div/div[2]/h2")).click();
                 driver.navigate().to("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
                 driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/div[2]/div[3]/a/div/div/div/div[2]/div/span")).click();
                 driver.navigate().to("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
                 driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/div[3]/div[1]/a/div/div/div/div[2]/h2")).click();
                 driver.navigate().to("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
                 driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/div[3]/div[2]/a/div/div/div/div[2]/h2")).click();
                 driver.navigate().to("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
                 driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/div[3]/div[3]/a/div/div/div/div[2]/h2")).click();
                 driver.navigate().to("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
                 driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/div[4]/div[1]/a/div/div/div/div[2]/h2")).click();
                 driver.navigate().to("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
                 driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/div[4]/div[2]/a/div/div/div/div[2]/h2")).click();
                 driver.navigate().to("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
                 driver.navigate().to("https://www.amazon.in/");
                 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Noise Smartwatches", Keys.ENTER);
                 JavascriptExecutor jse2 = (JavascriptExecutor) driver;
 		         jse2.executeScript("window.scrollBy(0,1000)");
 		         jse2.executeScript("window.scrollBy(0,-500)");
 		        WebElement AddtoCartbutton = driver.findElement(By.id("a-autoid-10-announce"));
 		        AddtoCartbutton.click();
 		        Thread.sleep(3000);
 		        driver.navigate().to("https://www.amazon.in/");
 		       System.out.println("thirdTestCase");
 	 	        driver.quit();
 		        
 	      }

	  }
		
}
		

		
   

		

	
