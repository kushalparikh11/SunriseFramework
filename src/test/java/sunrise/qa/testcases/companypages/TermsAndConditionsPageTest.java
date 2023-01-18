package sunrise.qa.testcases.companypages;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sunrise.qa.base.TestBase;
import sunrise.qa.companypages.TermsAndConditionsPage;
import sunrise.qa.utils.TestUtil;

public class TermsAndConditionsPageTest extends TestBase {
	
	TermsAndConditionsPage termsandconditionspage;
	
	
	public TermsAndConditionsPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		termsandconditionspage = new TermsAndConditionsPage();
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
		termsandconditionspage.navigate_to_module();
		
		
	}
	
	

	@Test(priority=2)
	public void Verify_MaximumTab_Message() throws InterruptedException
	{
		termsandconditionspage.navigate_to_module();
		Thread.sleep(2000);
		Assert.assertTrue(termsandconditionspage.max_msg_present());
		
		
		
		
}
	
	@Test(priority=3)
	public void Verify_alltabclosed() throws InterruptedException
	{
		
		termsandconditionspage.tab_close();
		Thread.sleep(2000);
		Assert.assertTrue(termsandconditionspage.welcome_msg.isDisplayed());
	}

}

