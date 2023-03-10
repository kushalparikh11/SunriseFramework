package sunrise.qa.testcases.kycpages;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sunrise.master.kycpages.GradePage;
import sunrise.qa.base.TestBase;
import sunrise.qa.utils.TestUtil;

public class GradePageTest extends TestBase {
	
	GradePage gradepage;
	
	
	public GradePageTest()
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		gradepage = new GradePage();
		
		TestUtil.ValidateUserLogin();
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	

	@Test(priority=1,invocationCount=2)
	public void Verify_Navigation_Page() throws InterruptedException
	{
		TestUtil.navigate_to_option2(gradepage.master,gradepage.kyc,gradepage.grade);
		
		
		
	}
	
	

	@Test(priority=2)
	public void Verify_MaximumTab_Message() throws InterruptedException
	{
		gradepage.navigate_to_module();
		Thread.sleep(2000);
		Assert.assertTrue(gradepage.max_msg_present());
		
	}
	
	@Test(priority=3)
	public void Verify_alltabclosed() throws InterruptedException
	{
		
		gradepage.tab_close();
		Thread.sleep(2000);
		Assert.assertTrue(gradepage.welcome_msg.isDisplayed());
	}

}

