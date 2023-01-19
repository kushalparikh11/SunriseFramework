package sunrise.qa.testcases.employeepages;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sunrise.qa.base.TestBase;
import sunrise.qa.employeepages.DesignationPage;
import sunrise.qa.utils.TestUtil;

public class DesignationPageTest extends TestBase {
	
	DesignationPage designationpage;
	
	
	public DesignationPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		designationpage = new DesignationPage();
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
		designationpage.navigate_to_module();
		
		
		
	}
	
	

	@Test(priority=2)
	public void Verify_MaximumTab_Message() throws InterruptedException
	{
		designationpage.navigate_to_module();
		Thread.sleep(2000);
		Assert.assertTrue(designationpage.max_msg_present());
		
	}
	
	@Test(priority=3)
	public void Verify_alltabclosed() throws InterruptedException
	{
		
		designationpage.tab_close();
		Thread.sleep(2000);
		Assert.assertTrue(designationpage.welcome_msg.isDisplayed());
	}

}