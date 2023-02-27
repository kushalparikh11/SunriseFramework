package sunrise.qa.testcases.companypages;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sunrise.master.companypages.OwnershipStatusPage;
import sunrise.qa.base.TestBase;
import sunrise.qa.utils.TestUtil;

public class OwnershipStatusPageTest extends TestBase {
	
	OwnershipStatusPage ownership_statuspage;
	
	
	public OwnershipStatusPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		ownership_statuspage = new OwnershipStatusPage();
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
		ownership_statuspage.navigate_to_module();
		
		
	}
	
	

	@Test(priority=2)
	public void Verify_MaximumTab_Message() throws InterruptedException
	{
		ownership_statuspage.navigate_to_module();
		Thread.sleep(1000);
		Assert.assertTrue(ownership_statuspage.max_msg_present());
		
		
		
		
}
	
	@Test(priority=3)
	public void Verify_alltabclosed() throws InterruptedException
	{
		
		ownership_statuspage.tab_close();
		Thread.sleep(2000);
		Assert.assertTrue(ownership_statuspage.welcome_msg.isDisplayed());
	}

}

