package sunrise.qa.testcases.kycpages;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sunrise.qa.base.TestBase;

import sunrise.qa.kyc.DocumentsPage;
import sunrise.qa.utils.TestUtil;

public class DocumentsPageTest extends TestBase {
	
	DocumentsPage documentspage;
	
	
	public DocumentsPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		documentspage = new DocumentsPage();
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
		documentspage.navigate_to_module();
		
		
		
	}
	
	

	@Test(priority=2)
	public void Verify_MaximumTab_Message() throws InterruptedException
	{
		documentspage.navigate_to_module();
		Thread.sleep(2000);
		Assert.assertTrue(documentspage.max_msg_present());
		
	}
	
	@Test(priority=3)
	public void Verify_alltabclosed() throws InterruptedException
	{
		
		documentspage.tab_close();
		Thread.sleep(2000);
		Assert.assertTrue(documentspage.welcome_msg.isDisplayed());
	}

}

