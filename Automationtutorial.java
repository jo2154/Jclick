package automationpractical;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationtutorial 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/login");
        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Sriram");
        driver .findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("Sriram_876@gmail.com");
        driver.findElement(By.xpath(" //button[text()='Signup']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Darwin@987");
        driver.findElement(By.xpath("//input[@name ='first_name']")).sendKeys("Riyaz");
        driver .findElement(By.xpath("//input[@name ='last_name']")).sendKeys("Mohammed");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Mohammed steels");
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("442,george street, Mohammed steels");
        driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("442,Raman  street, Fleix steels");
        driver.findElement (By.xpath("//input[@data-qa='state']")).sendKeys("TamilNadu");
        driver.findElement(By.xpath("//input[@data-qa='city']")).sendKeys("India");
        driver.findElement(By.xpath("//input[@data-qa='zipcode']")).sendKeys("629005");
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("9765230987");
        driver.findElement(By.xpath("//button[text()='Create Account']")).click();
        driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
        driver.findElement(By.xpath("//button[text()='Test Cases']")).click();
        driver.findElement(By.xpath("//u[text()='Test Case 1: Register User']")).click();
        driver.findElement(By.xpath("//u[text()='Test Case 2: Login User with correct email and password']")).click();
        driver.findElement(By.xpath("//u[text()='Test Case 3: Login User with incorrect email and password']")).click();
        driver.findElement(By.xpath("//u[text()='Test Case 4: Logout User']")).click();
        driver.findElement(By.xpath("//u[text()='Test Case 5: Register User with existing email']")).click();
        driver.navigate().back();
        
     } 
		
}
	