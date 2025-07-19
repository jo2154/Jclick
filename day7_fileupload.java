package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day7_fileupload {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//fileupload
		driver.findElement(By.id("singleFileInput")).sendKeys("D:\\jeni 3353\\New folder\\John Files\\Book1.xlsx");
		driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();
		
		String  file1="D:\\jeni 3353\\New folder\\John Files\\Book1.xlsx";
		String  file2="D:\\jeni 3353\\New folder\\John Files\\Advisor Test report.xlsx";
		
		driver.findElement(By.id("multipleFilesInput")).sendKeys(file1+"\n"+file2);
		driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
		}

}
