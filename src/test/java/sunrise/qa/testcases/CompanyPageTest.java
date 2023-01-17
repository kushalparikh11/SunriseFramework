package sunrise.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sunrise.qa.base.TestBase;
import sunrise.qa.pages.CompanyPage;
import sunrise.qa.pages.LoginPage;
import sunrise.qa.utils.TestUtil;

public class CompanyPageTest extends TestBase {
	
	CompanyPage companypage;
	LoginPage loginpage;
	
	public CompanyPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		companypage = new CompanyPage();
		TestUtil testutil = new TestUtil();
		testutil.ValidateUserLogin();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

	@Test
	public void Verify_Navigation_CompanyPage() 
	{
		companypage.navigate_to_companymodule();;
		driver.navigate().refresh();
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
	}
}
