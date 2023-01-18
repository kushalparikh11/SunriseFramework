package sunrise.qa.testcases.companypages;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import sunrise.qa.base.TestBase;
import sunrise.qa.companypages.BanksPage;
import sunrise.qa.utils.TestUtil;

public class BankPageTest extends TestBase {
	
	BanksPage bankspage;
	
	
	public BankPageTest()
	{
		super();
	}
	
	@BeforeSuite
	public void setup()
	{
		initialization();
		bankspage = new BanksPage();
		TestUtil testutil = new TestUtil();
		testutil.ValidateUserLogin();
	}
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
	
	

	@Test(priority=1,invocationCount=2)
	public void Verify_Navigation_CompanyPage() throws InterruptedException
	{
		bankspage.navigate_to_companymodule();
		
		
	}
	
	

	@Test(priority=2)
	public void Verify_MaximumTab_Message() throws InterruptedException
	{
		bankspage.navigate_to_companymodule();
		Thread.sleep(1000);
		Assert.assertTrue(bankspage.max_msg_present());
		
		
		
		
}
	
	@Test(priority=3)
	public void Verify_alltabclosed() throws InterruptedException
	{
		
		bankspage.tab_close();
		Thread.sleep(2000);
		Assert.assertTrue(bankspage.welcome_msg.isDisplayed());
	}

}
