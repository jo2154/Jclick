package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Basepage;

public class loginPage extends Basepage
{

	public loginPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	//locators
	@FindBy (xpath ="//input[@data-qa='login-email']")
	WebElement login_email;
	
	@FindBy (xpath="//button[@data-qa='login-button']")
     WebElement login;
	
	@FindBy (xpath="//input[@data-qa='login-password']")
	WebElement login_password;
	
	//Actions
	public void set_email_log(String email_Id)
	{
		login_email.sendKeys(email_Id);
	}
	
	public void set_pass_log(String pass)
	{
		login_password.sendKeys(pass); 
	}
	
	public void Enter_login ()
	{
		login.click();
	}
	
	
	
    
}
