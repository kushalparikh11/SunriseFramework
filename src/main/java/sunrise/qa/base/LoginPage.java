package sunrise.qa.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase{
	
	@FindBy(xpath= "//input[@placeholder='Enter User Name']")
	WebElement username;
	
	@FindBy(xpath= "//input[@placeholder='Enter Password']")
	WebElement password;
	
	@FindBy(xpath= "//button[@type='submit']")
	WebElement login;
	
	@FindBy(xpath= "//center[normalize-space()='Welcome to Home Page']")
	WebElement welcome_msg;
	
	

	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ValidateLogin()
	{
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		login.click();
		
	}
	
	public boolean ValidateWelcome_Msg()
	{
		return welcome_msg.isDisplayed();
		
	}
}
