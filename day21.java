import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class day21 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	    String actualurl = driver.getTitle();
	    String expecturl = "automation testing";                                                                                                                                                                                                                           xpect = "Automation Testing ";
	
	//System.out.println("Title: "+actual);
	
	if(expecturl.equals(actualurl))
	{
		System.out.println("Testing passed");
	}
	else
	{
		System.err.println("Testing failed");
	}
	
    String actualurl1=driver.getCurrentUrl();
    String Expecturl1= "https://testautomationpractice.blogspot.com/";
	
	System.out.println("Tittle: "+actualurl);
	
	if(Expecturl1.equals(actualurl))
	{
		System.out.println("Testing passed");
	}
	else
	{
		System.err.println("Testing failed");
	}
	
	String win=driver.getWindowHandle();
	System.out.println(win); //3067161773EC648DBDC485BA964EF7A2 //4440F57E3CCB95F9613485279D8533FC
	
	driver.switchTo().newWindow(WindowType.WINDOW);  //Tab
	driver.get("https://www.facebook.com/");

Set <String> wins=driver.getWindowHandles();

for(String win1:wins)
{		
	System.out.println("mutiple window: "+win1);
}
	
//close automation  page
driver.getPageSource();  

boolean status=driver.findElement(By.id("email")).isEnabled(); // check whether field is enabled or not

System.out.println(status);
{
      (Status && false);
{
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
} 
driver.switchTo().window(null);
}

	}
	
	
}

}

