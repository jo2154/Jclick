package signinProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class inforeg 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Infosys registration", Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/span/a/h3")).click();
        driver.findElement(By.name("firstnameX")).sendKeys("Raj");
		driver.findElement(By.xpath("/html/body/app-root/div[1]/div/register/div/div/div[2]/form/div[1]/div[2]/div/input")).sendKeys("D");
		driver.findElement(By.xpath("/html/body/app-root/div[1]/div/register/div/div/div[2]/form/div[2]/div[1]/div/input")).sendKeys("Kumar");
		driver.findElement(By.xpath("/html/body/app-root/div[1]/div/register/div/div/div[2]/form/div[2]/div[2]/div/input")).sendKeys("rajj42122@gmail.com");
		driver.findElement(By.name("passwordX")).sendKeys("Rajesh@214");
		driver.findElement(By.xpath("/html/body/app-root/div[1]/div/register/div/div/div[2]/form/div[3]/div[2]/div/input")).sendKeys("Rajesh@214");
		WebElement Bycheckingthebox = driver.findElement(By.xpath("/html/body/app-root/div[1]/div/register/div/div/div[2]/form/div[3]/div[3]/div/input"));
		Bycheckingthebox.click();
        WebElement Submitbutton = driver.findElement(By.xpath("/html/body/app-root/div[1]/div/register/div/div/div[2]/form/div[3]/div[4]/div[1]/div[1]/button"));
		Submitbutton.click();
		driver.navigate().to("https://www.google.co.in/");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Infosys signin", Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		WebElement Emailbox = driver.findElement(By.id("username"));
		Emailbox.sendKeys("rajj42122@gmail.com");
		WebElement Passwordbox = driver.findElement(By.id("password"));
		Passwordbox.sendKeys("Rajesh@214");
		WebElement loginbutton = driver.findElement(By.id("btnSubmit"));
		loginbutton.click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
		jse.executeScript("window.scrollBy(0,-200)");
		driver.findElement(By.id("privacybuttonid")).click();
		WebElement CountryCode = driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-privacyconsent/div/div/div[2]/form/div[3]/div[2]/div/input"));
		CountryCode.sendKeys("+91");
		WebElement Mobilenumber = driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-privacyconsent/div/div/div[2]/form/div[3]/div[4]/div/input"));
		Mobilenumber.sendKeys("8248953069");
		WebElement SkillsTextBox = driver.findElement(By.className("field-bg marB40"));
		SkillsTextBox.click();
		WebElement Checkbox = driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-privacyconsent/div/div/div[2]/form/div[4]/div[1]/div/input"));
		Checkbox.click();
		WebElement Submitbutton1 = driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-privacyconsent/div/div/div[2]/form/div[5]/div/div/button"));
		Submitbutton1.click();
		
	}

}



		
		

