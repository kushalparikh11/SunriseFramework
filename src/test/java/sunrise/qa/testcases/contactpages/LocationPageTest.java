package sunrise.qa.testcases.contactpages;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sunrise.master.contactspages.LocationPage;
import sunrise.qa.base.TestBase;
import sunrise.qa.utils.TestUtil;

public class LocationPageTest extends TestBase {
	
	LocationPage locationpage;
	
	
	public LocationPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		locationpage = new LocationPage();
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
		locationpage.navigate_to_module();
		
		
	}
	
	

	@Test(priority=2)
	public void Verify_MaximumTab_Message() throws InterruptedException
	{
		locationpage.navigate_to_module();
		Thread.sleep(2000);
		Assert.assertTrue(locationpage.max_msg_present());
		
		
		
		
}
	
	@Test(priority=3)
	public void Verify_alltabclosed() throws InterruptedException
	{
		
		locationpage.tab_close();
		Thread.sleep(2000);
		Assert.assertTrue(locationpage.welcome_msg.isDisplayed());
	}

}