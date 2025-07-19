package amazontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

class Newtest 
{

	        public static void main(String[] args)
	        {
		            System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		            WebDriver driver = new ChromeDriver();
		            driver.manage().window().maximize();
		            driver.get("https://www.amazon.in/");
		
		             @Test(priority=1)
		               void FirstTest()
		             {
		    	                driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		   		                WebElement Emailbox = driver.findElement(By.name("email"));
		   		                Emailbox.sendKeys("johnsinghraj001@gmail.com");
		   		                WebElement ContinueButton = driver.findElement(By.id("continue"));
		   		                ContinueButton.click();
		   		                WebElement Passwordbox = driver.findElement(By.name("password"));
		   		                Passwordbox.sendKeys("Johnsh1992#$");
		   		                Thread.sleep(1000); 
		   		                WebElement Signinbutton = driver.findElement(By.id("signInSubmit"));
		   		                Signinbutton.click();
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
		   		                System.out.println("Firsttestcase");
		                  }
		             
		   		           @Test(priority=2)
		   		           public  void SecondTest()
		   		            {
		   		                       WebElement image = driver.findElement(By.xpath("//*[@id=\"B0D1P3BFC8\"]/a/div/img"));
		   		                       image.click();
		   		                       Thread.sleep(1000);
		   		                       WebElement Dropdown = driver.findElement(By.id("quantity"));
		   		                       Select select = new Select(Dropdown);
		   		                       select.selectByIndex(1);
		   		                       Thread.sleep(1000);
		   		                       WebElement AddtoCartButton = driver.findElement(By.id("add-to-cart-button"));
		   		                       AddtoCartButton.click();
		   		                       Thread.sleep(1000);
		   		                       WebElement ProceedtoBuyButton = driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input"));
		   		                       ProceedtoBuyButton.click();
		   		                       Thread.sleep(1000);
		   		                       System.out.println("Secondtestcase");
		   		                }
		   		                
		   		                @Test(priority=2)
		   		                 public  void ThirdTest()
		   		                 {
		   		                        WebElement checked = driver.findElement(By.xpath("//*[@id=\"address-list\"]/div/div[1]/div/fieldset/div/span/div/label/input"));
		   		                        boolean status1 = checked.isSelected();
		   		                        System.out.println(status1);
		   		                        Thread.sleep(1000);
		   		                        WebElement UsethisaddressButton = driver.findElement(By.xpath("//*[@id=\"orderSummaryPrimaryActionBtn\"]/span/input"));
		   		                        UsethisaddressButton.click();
		   		                        System.out.println("Thirdtestcase");
		   		                        
		   		                }
		   		                
	        }
	        
}


		   	
 
		      