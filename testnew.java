package firsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testnew 
{

	public static void main(String[] args) 
	{
		System.setProperty("webriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://laulamaschools.com/");
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("About Us")).click();
		driver.findElement(By.linkText("System")).click();
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.linkText("Subscription")).click();
		driver.findElement(By.linkText("Stories")).click();
		driver.findElement(By.linkText("Contact Us")).click();
		WebElement ScheduleanappointmentButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/div/div[3]/div[2]/div/div[1]/button"));
		ScheduleanappointmentButton.click();
		driver.findElement(By.xpath("//button[contains(text),'I Understand')]"));
		driver.findElement(By.className("hOG1yWAgjl_Zm5t_5cxZ j8_A_9gON5cRo4O8uVVy"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/div[2]/table/tbody/tr[4]/td[2]/button")).clear();
		WebElement TimezoneDropdown1= driver.findElement(By.xpath("//*[@id=\"timezone-menu\"]/div[3]/div[4]/button[27]/div"));
		TimezoneDropdown1.sendKeys("46");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/div[1]/div/div/div[2]/div[8]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/div[1]/div/div/div[2]/div[8]/button[2]")).click();
	    WebElement firstNameBox = driver.findElement(By.name("FirstName"));
		firstNameBox.sendKeys("Rithvik");
		WebElement lastNameBox = driver.findElement(By.name("LastName"));
		lastNameBox.sendKeys("Kumar");
		WebElement emailbox = driver.findElement(By.name("Email"));
		emailbox.sendKeys("rithvikkumar@gmail.com");
		WebElement Phonenumber = driver.findElement(By.name("Phonenumber"));
		Phonenumber.sendKeys("8717652065");
		WebElement Sendmemoreinformation = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/div[2]/button/span"));
		Sendmemoreinformation.click();
		
	}

}

