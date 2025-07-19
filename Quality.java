package prodtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Quality 
{

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.amazon.in/");
		   driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		   Thread.sleep(1000);
		   
		   @Test(priority=1)
		   public void Firstbrand()
		   {
			   WebElement Emailbox = driver.findElement(By.name("email"));
			   Emailbox.sendKeys("johnsinghraj001@gmail.com");
			   Thread.sleep(1000);
			   WebElement ContinueButton = driver.findElement(By.id("continue"));
			   ContinueButton.click();
			   Thread.sleep(1000);
			   System.out.println("Shoe");
		   }
			   
		   @Test(priority=2)
		   public void Secondbrand()
		   {
				   WebElement Passwordbox = driver.findElement(By.name("password"));
				   Passwordbox.sendKeys("Johnsh1992#$");
				   Thread.sleep(1000);
				   WebElement Signinbutton = driver.findElement(By.id("signInSubmit"));
				   Signinbutton.click();
				   Thread.sleep(1000);
				   System.out.println("Laptop");
			}
			   
			@Test(priority=3)
			public void Thirdbrand()
			{
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
			   System.out.println("LED TV");
			}
			   
		    @Test(priority=4)
			public void Fourthbrand()
			{

				   WebElement image = driver.findElement(By.xpath("//*[@id=\"B0D1P3BFC8\"]/a/div/img"));
			       image.click();
				   Thread.sleep(1000);
				   System.out.println("Tablet");
			}
			   
			@Test(priority=5)
			public void Fifthbrand()
			{
				   WebElement Dropdown = driver.findElement(By.id("quantity"));
				   Dropdown.click();
				   Select select = new Select(Dropdown);
				   select.selectByIndex(1);
				   WebElement AddtoCartButton = driver.findElement(By.id("add-to-cart-button"));
				   AddtoCartButton.click();
				   Thread.sleep(2000);
				   WebElement ProceedtoBuyButton = driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input"));
				   ProceedtoBuyButton.click();
				   Thread.sleep(1000);
				   System.out.println("Hair dryer");
			}
			   
			@Test(priority=6)
			public void Sixthbrand()
			{
				   WebElement Fullname = driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressFullName\"]"));
				   Fullname.sendKeys("JohnSingh.S");
				   WebElement Mobilenumber = driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressPhoneNumber\"]"));
				   Mobilenumber.sendKeys("9498388739");
				   WebElement Pincode = driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressPostalCode\"]"));
				   Pincode.sendKeys("629002");
				   WebElement Address1 = driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressLine1\"]"));
				   Address1.sendKeys("64B2, Vaithianathapuram, Kottar");
				   WebElement Address2 = driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressLine2\"]"));
				   Address2.sendKeys("Perumal Koil Street");
				   WebElement Landmark = driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-landmark\"]"));
				   Landmark.sendKeys("Near Siva Hospitals");
				   WebElement City = driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressCity\"]"));
				   City.sendKeys("Nagercoil");
				   WebElement Makethismydefaultaddress = driver.findElement(By.id("address-ui-widgets-use-as-my-default"));
				   Makethismydefaultaddress.click();
				   WebElement UsethisaddressButton = driver.findElement(By.id("orderSummaryPrimaryActionBtn-announce"));
				   UsethisaddressButton.click();
				   System.out.println("Trimmer");
			}
			   
	   }

}
