package sunrise.qa.testcases.companypages;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sunrise.master.companypages.CabinsPage;
import sunrise.qa.base.TestBase;
import sunrise.qa.utils.TestUtil;

public class CabinsPageTest extends TestBase {
	
	CabinsPage cabinspage;
	
	
	public CabinsPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		cabinspage = new CabinsPage();
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
		cabinspage.navigate_to_module();
		
		
	}
	
	

	@Test(priority=2)
	public void Verify_MaximumTab_Message() throws InterruptedException
	{
		cabinspage.navigate_to_module();
		Thread.sleep(1000);
		Assert.assertTrue(cabinspage.max_msg_present());
		
		
		
		
}
	
	@Test(priority=3)
	public void Verify_alltabclosed() throws InterruptedException
	{
		
		cabinspage.tab_close();
		Thread.sleep(2000);
		Assert.assertTrue(cabinspage.welcome_msg.isDisplayed());
	}

}
