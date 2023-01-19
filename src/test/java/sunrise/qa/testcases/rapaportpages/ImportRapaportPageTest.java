package sunrise.qa.testcases.rapaportpages;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sunrise.qa.base.TestBase;
import sunrise.qa.rapaportpages.ImportRapaportPage;
import sunrise.qa.utils.TestUtil;

public class ImportRapaportPageTest extends TestBase {
	
	ImportRapaportPage importrapaportpage;
	
	
	public ImportRapaportPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		importrapaportpage = new ImportRapaportPage();
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
		importrapaportpage.navigate_to_module();
		
		
		
	}
	
	

	@Test(priority=2)
	public void Verify_MaximumTab_Message() throws InterruptedException
	{
		importrapaportpage.navigate_to_module();
		Thread.sleep(2000);
		Assert.assertTrue(importrapaportpage.max_msg_present());
		
	}
	
	@Test(priority=3)
	public void Verify_alltabclosed() throws InterruptedException
	{
		
		importrapaportpage.tab_close();
		Thread.sleep(2000);
		Assert.assertTrue(importrapaportpage.welcome_msg.isDisplayed());
	}

}


