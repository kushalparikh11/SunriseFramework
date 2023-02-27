package sunrise.qa.testcases.employeepages;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sunrise.master.employeepages.QualificationPage;
import sunrise.qa.base.TestBase;
import sunrise.qa.utils.TestUtil;

public class QualificationPageTest  extends TestBase {
	
	QualificationPage qualificationpage;
	
	
	public QualificationPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		qualificationpage = new QualificationPage();
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
		qualificationpage.navigate_to_module();
		
		
		
	}
	
	

	@Test(priority=2)
	public void Verify_MaximumTab_Message() throws InterruptedException
	{
		qualificationpage.navigate_to_module();
		Thread.sleep(2000);
		Assert.assertTrue(qualificationpage.max_msg_present());
		
	}
	
	@Test(priority=3)
	public void Verify_alltabclosed() throws InterruptedException
	{
		
		qualificationpage.tab_close();
		Thread.sleep(2000);
		Assert.assertTrue(qualificationpage.welcome_msg.isDisplayed());
	}

}

