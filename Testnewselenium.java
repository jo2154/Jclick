package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testnewselenium {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		WebElement ele2=driver.findElement(By.xpath("//select[@id='country']"));
		
		//bootstrap
				driver.findElement(By.cssSelector("button.multiselect ")).click();
				
			List <WebElement> elements=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//input [@type='checkbox']"));
	  	     for(WebElement ele1:elements)
			{
				ele1.click();
				System.out.println(ele1.getText());
			
				
				for(WebElement ele3:elements)
				{
					if(ele2.isSelected())
					{
						continue;
					}
					else
					{
						ele2.click();

					}
					System.out.println(ele3.getText());
				}
				
				

			}

		}
	
}
