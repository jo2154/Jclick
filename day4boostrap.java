package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4boostrap {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		//boostrp
		driver.findElement(By.cssSelector("button.multiselect ")).click();
		
		List <WebElement> elements=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//input [@type='checkbox']"));
/*	for(WebElement ele:elements)
	{
		ele.click();
		System.out.println(ele.getText());
	} */
		
		for(WebElement ele:elements)
		{
			if(ele.isSelected())
			{
				continue;
			}
			else
			{
				ele.click();

			}
			System.out.println(ele.getText());
		}
		
		

	}

}
