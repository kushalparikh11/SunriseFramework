package sunrise.qa.testcases.contactpages;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sunrise.qa.base.TestBase;

import sunrise.qa.contactspages.ContactsPage;
import sunrise.qa.utils.TestUtil;

public class ContactPageTest extends TestBase {
	
	ContactsPage contactpage;
	
	
	public ContactPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		contactpage = new ContactsPage();
		
		TestUtil.ValidateUserLogin();
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	

	@Test(priority=1)
	public void Verify_Navigation_Page() throws InterruptedException
	{
		contactpage.navigate_to_module();
		
		
	}
	
	@Test(priority=2)
	public void Verify_MaximumTab_Message() throws InterruptedException
	{
		Assert.assertEquals(contactpage.max_msg_present(),"Maximum tabs reached.");
	}
	
	@Test(priority=3)
	public void Verify_alltabclosed() throws InterruptedException
	{
		contactpage.tab_close();
		Thread.sleep(2000);
		Assert.assertTrue(contactpage.welcome_msg.isDisplayed());
	}

}
