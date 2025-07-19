package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Basetest {
	public WebDriver driver;
	
	@BeforeSuite
	@Parameters({"browser"})
	public void setup(@Optional ("edge") String br)
	
	
	{ 
		switch (br.toLowerCase())
		{
		case "chrome"  : driver= new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		default : System.out.println("No browser is found");
		}
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.automationexercise.com/login");
	}
	                                                                                                                        
	@AfterSuite
	public void teardown ()
	{
		driver.quit();
	}

}
