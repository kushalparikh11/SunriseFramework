package sunrise.qa.testcases.contactpages;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sunrise.qa.base.TestBase;
import sunrise.qa.contactspages.ReferenceMediaPage;
import sunrise.qa.utils.TestUtil;

public class ReferenceMediaPageTest extends TestBase {
	
	ReferenceMediaPage referencemediapage;
	
	
	public ReferenceMediaPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		referencemediapage = new ReferenceMediaPage();
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
		referencemediapage.navigate_to_module();
		
		
	}
	
	

	@Test(priority=2)
	public void Verify_MaximumTab_Message() throws InterruptedException
	{
		referencemediapage.navigate_to_module();
		Thread.sleep(2000);
		Assert.assertTrue(referencemediapage.max_msg_present());
		
	}
	
	@Test(priority=3)
	public void Verify_alltabclosed() throws InterruptedException
	{
		
		referencemediapage.tab_close();
		Thread.sleep(2000);
		Assert.assertTrue(referencemediapage.welcome_msg.isDisplayed());
	}

}

