package Programatic;

import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Tutorials
{
	
	private static final String Assertions = null;
	private static ChromeDriver Webdriver = null;

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}

	    @BeforeClass
	    public void setUp() 
	    {
	       
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        Webdriver = new ChromeDriver();
	        Webdriver.manage().window().maximize();
	        Webdriver.get("https://www.amazon.com");
	    }

	    @SuppressWarnings("unchecked")
		@Test
	    @DisplayName("Assert Equal Test Case")
	    public void assertEqualTest () {
	    	//Assertions.assertEquals ( 3,  calc.add(2,2),  ()  ->  "Assert Equal Test Failed");
	    	
	    	int unexpected;
			Object calc;
			int a;
			int b;
			Assertions.assertNotEquals(unexpected:  5,  ((ArrayList<Integer>) calc).add( a:  2, b:  3));
	        WebElement searchBox = Webdriver.findElement(By.id("twotabsearchtextbox"));
	        searchBox.sendKeys("Echo Dot");
	        searchBox.sendKeys(Keys.RETURN);
	        WebDriver driver;
	        
			String title = driver.getTitle();
	 }

	    @Test
	    @DisplayName("Assert Array Equal Test Case")
	    public void assertArrayEqualTest() {
	    	Assertions.assertArrayEquals(new int[]  {1, 2, 3},  new int[] {1, 3, 2});
	        WebElement product = Webdriver.findElement(By.xpath("(//span[contains(text(), 'Echo Dot')])[1]"));
	        product.click();
	        WebElement cartCount = Webdriver.findElement(By.id("nav-cart-count")); 
	        WebElement addToCartButton = Webdriver.findElement(By.id("add-to-cart-button"));
	        addToCartButton.click();
	    }

	    @Test
	    @DisplayName("Assert Iterable Equal Test Case")
	    public void assertIterableEqual(){
	    	Object asList;
			Object asList1;
			Iterable<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2, 3));
	    	Iterable<Integer> listTwo = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	        Assertions.assertIterableEquals(listOne,  listTwo);	    
	   {
	        WebElement cartButton = Webdriver.findElement(By.id("nav-cart"));
	        cartButton.click();
	        WebElement proceedToCheckoutButton =Webdriver.findElement(By.name("proceedToRetailCheckout"));
	        proceedToCheckoutButton.click();
	   }
	    
	    @Test
	    @DisplayName ("Assert Not Null Test")
	    public void assertNotNullTest() {
	    	String notnullstring = null;
	    	String notNullString = "ABC";
	    	Assertions.assertNotNull(notNullString);
	    }
	    
	    @Test
	    @DisplayName("Assert True Test")
	    public void assertTrueTest() {
	    	boolean trueboolean = true;
	    	boolean falseBoolean = false;
	    	Object message;
			Assertions.assertTrue(trueboolean,  message"Assert True Test Failed");
	    }
	    
	    @AfterClass
	    public void tearDown()
	    {
	        // Close the WebDriver
	        if (Webdriver != null) 
	        {
	           Webdriver.quit();
	        }
	    
	    }
	
} 
		
		
		     
		
	