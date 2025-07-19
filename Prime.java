package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prime
{

	         public static void main(String[] args) throws InterruptedException 
	         {
                     System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
                     WebDriver driver = new ChromeDriver();
		             driver.manage().window().maximize();
		             driver.get("https://www.amazon.in/");
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
		             driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span"));
		             Thread.sleep(1000);
		             driver.findElement(By.xpath("//*[@id=\"hmenu-  content\"]/ul[1]/li[3]/a")).click();
		             Thread.sleep(1000);
		             driver.findElement(By.linkText("Electronics")).click();
		             Thread.sleep(1000);
		             driver.findElement(By.linkText("Headphones")).click();
		             Thread.sleep(1000);
		             driver.findElement(By.linkText("Open-Ear Headphones")).click();
		             Thread.sleep(1000);
		             WebElement image =  driver.findElement(By.xpath("//*[@id=\"B0CYLBDFZ5\"]/a/div/img"));
		             image.click();
		             Thread.sleep(2000);
		             WebElement Dropdown = driver.findElement(By.id("quantity"));
		             Dropdown.click();
		             Select select = new Select(Dropdown);
		             select.selectByIndex(0);
		             WebElement AddtoCartButton = driver.findElement(By.id("add-to-cart-  button"));
		             AddtoCartButton.click();
		             Thread.sleep(2000);
		             WebElement Cartbutton = driver.findElement(By.xpath("//*[@id=\"attach-  sidesheet-view-cart-button\"]/span/input"));
		             Cartbutton.click();
		             Thread.sleep(1000);
		             WebElement ProceedtoBuybutton1 = driver.findElement(By.className("a- button-input"));
		             ProceedtoBuybutton1.click();
		             driver.navigate().to("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_car t?");
		             JavascriptExecutor jse = (JavascriptExecutor) driver;
		             jse.executeScript("window.scrollBy(0,1000)");
		             jse.executeScript("window.scrollBy(0,-500)");
		             WebElement ProceedtoBuybutton2 =      driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input"));
		             ProceedtoBuybutton2.click();
		             WebElement Usethisaddressbutton =      driver.findElement(By.xpath("//*[@id=\"orderSummaryPrimaryActionBtn\"]/span/input"));
		             Usethisaddressbutton.click();
		             driver.navigate().to("https://www.amazon.in/");
		             driver.quit();
	          }
	
}


	