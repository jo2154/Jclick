package Website;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://www.leafground.com/input.xhtml");
        driver.manage().window().maximize();
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		Thread.sleep(200);
		
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		
		Thread.sleep(200);
		
		WebElement refId = driver.findElement(By.id("j_idt88:name"));
		refId.sendKeys("Johnsingh");
		Thread.sleep(300);
		refId.clear();
		
		Thread.sleep(2000);
		
		driver.close();
		
		Thread.sleep(200);
		
		driver.quit();
		
		WebElement  clickbtn =driver.findElement(By.id("j_idt88:j_idt90"));
		clickbtn.click();
		
		Thread.sleep(300);
		
		WebElement clickAlert=driver.findElement(By.id("j_idt88:j_idt91"));
        clickAlert.click();
        Thread.sleep(200);
        
        driver.switchTo().alert().accept();
        
        WebElement clickConfirmbtn=driver.findElement(By.name("j_idt88:j_idt93"));
        clickConfirmbtn.click();
        Thread.sleep(300);
        
        driver.switchTo().alert().dismiss();
        
        WebElement clickPromptbtn=driver.findElement(By.id("j_idt88:j_idt104"));
        clickPromptbtn.click();
        
        driver.switchTo().alert().sendKeys("Gokul");                                                                                                             
        driver.switchTo().alert().accept();
     }

}
