package sunrise.qa.testcases.loginpage;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sunrise.qa.base.LoginPage;
import sunrise.qa.base.TestBase;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	
	
	
	
	public LoginPageTest()	
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage = new LoginPage();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void Verify_UserLogin()
	{
		loginpage.ValidateLogin();
		Assert.assertTrue(loginpage.ValidateWelcome_Msg());
	}

}
