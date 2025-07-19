package Sampleproject;

public class Seleniumticketproject {

	public static void main(String[] args)
	{
	System.setProperty("WebDriver.chrome.driver" , " D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe " );
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.co.in/");
    driver.findelement (By.id ("//*[@id=\"side-menu\"]/li[1]/a/span");
    driver.click();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
