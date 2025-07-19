package registrationprocess;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Infosys registration", Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/span/a/h3")).click();
		driver.findElement(By.name("firstnameX")).sendKeys("Raj");
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/register/div/div/div[2]/form/div[1]/div[2]/div/input"))
				.sendKeys("D");
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/register/div/div/div[2]/form/div[2]/div[1]/div/input"))
				.sendKeys("Kumar");
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/register/div/div/div[2]/form/div[2]/div[2]/div/input"))
				.sendKeys("rajj42122@gmail.com");
		driver.findElement(By.name("passwordX")).sendKeys("Rajesh@214");
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/register/div/div/div[2]/form/div[3]/div[2]/div/input"))
				.sendKeys("Rajesh@214");
		WebElement Bycheckingthebox = driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/register/div/div/div[2]/form/div[3]/div[3]/div/input"));
		Bycheckingthebox.click();
		WebElement Submitbutton = driver.findElement(By.xpath(
				"/html/body/app-root/div[1]/div/register/div/div/div[2]/form/div[3]/div[4]/div[1]/div[1]/button"));
		Submitbutton.click();
		driver.navigate().to("https://www.google.co.in/");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Infosys signin", Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		WebElement Emailbox = driver.findElement(By.id("username"));
		Emailbox.sendKeys("rajj42122@gmail.com");
		WebElement Passwordbox = driver.findElement(By.name("password"));
		Passwordbox.sendKeys("Rajesh@214");
		WebElement loginbutton = driver.findElement(By.id("btnSubmit"));
		loginbutton.click();
		WebElement searchbutton = driver.findElement(By.xpath("//*[@id=\"exampleFormControlInput1\"]"));
		searchbutton.sendKeys("Backend developer");
		WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]"));
		Dropdown.click();
		Select select = new Select (Dropdown);
		select.selectByIndex(6);
		
	}

}






