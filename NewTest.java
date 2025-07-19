package Testjohn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Basepage;

public class NewTest extends Basepage
{

	public NewTest(WebDriver driver) 
	{
		
		super(WebDriver driver);
	
	}
	

	@FindBy (xpath ="//input[@data-qa='signup-email']")
	WebElement signup_email1;
	
	@FindBy (name="email")
	WebElement email;
	
	@FindBy (xpath="//button [text()='Signup']")
     WebElement signup;
	
	@FindBy (xpath="//input[@data-qa='signup-email']")
	WebElement signup_email;

	
    public void set_name_log(String name)
	{
		signup.sendKeys(name);
	}
	
	public void set_Email_log(String email_id)
	{
		email.sendKeys(email_id);
	}
	
	public void Enter_signup ()
	{
		signup.click();
	}
	
}


