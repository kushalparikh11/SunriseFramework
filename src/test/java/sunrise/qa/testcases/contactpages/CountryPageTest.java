package sunrise.qa.testcases.contactpages;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sunrise.qa.base.TestBase;

import sunrise.qa.contactspages.CountryPage;
import sunrise.qa.utils.TestUtil;

public class CountryPageTest extends TestBase {
	
	CountryPage countrypage;
	
	
	public CountryPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		countrypage = new CountryPage();
		TestUtil testutil = new TestUtil();
		testutil.ValidateUserLogin();
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	

	@Test(priority=1,invocationCount=2)
	public void Verify_Navigation_Page() throws InterruptedException
	{
		countrypage.navigate_to_module();
		
		
		
	}
	
	

	@Test(priority=2)
	public void Verify_MaximumTab_Message() throws InterruptedException
	{
		countrypage.navigate_to_module();
		Thread.sleep(2000);
		Assert.assertTrue(countrypage.max_msg_present());
		
	}
	
	@Test(priority=3)
	public void Verify_alltabclosed() throws InterruptedException
	{
		
		countrypage.tab_close();
		Thread.sleep(2000);
		Assert.assertTrue(countrypage.welcome_msg.isDisplayed());
	}

}