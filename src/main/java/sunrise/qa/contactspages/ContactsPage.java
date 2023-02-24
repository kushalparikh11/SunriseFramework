package sunrise.qa.contactspages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sunrise.qa.base.TestBase;
import sunrise.qa.utils.TestUtil;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath= "//span[normalize-space()='Master']")
	WebElement master; 
	
	@FindBy(xpath= "(//span[@class='ant-menu-title-content'][normalize-space()='Contacts'])[1]")
	WebElement contacts;
	
	@FindBy(xpath= "(//span[@class='ant-menu-title-content'][normalize-space()='Contacts'])[2]")
	WebElement contacts_2;

	@FindBy(css= ".ant-message-custom-content > span:nth-child(2)")
	WebElement max_msg;
	
	@FindBy(xpath= "(//*[name()='svg'])[2]")
	WebElement tab_close1_btn;
	
	@FindBy(xpath= "(//*[name()='svg'])[3]")
	WebElement tab_close2_btn;
	
	@FindBy(xpath= "//center[normalize-space()='Welcome to Home Page']")
	public
	WebElement welcome_msg;
	
	public ContactsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
public void navigate_to_module() throws InterruptedException
{
	TestUtil.navigate_to_option2(master,contacts,contacts_2);
}

public String max_msg_present() throws InterruptedException

{
	TestUtil.navigate_to_option2(master,contacts,contacts_2);
	TestUtil.navigate_to_option2(master,contacts,contacts_2);
	Thread.sleep(200);
	String msg =  max_msg.getText();
	return msg;
	
}

public void tab_close() throws InterruptedException

{
	tab_close2_btn.click();
	Thread.sleep(2000);
	tab_close1_btn.click();
	
	}


}
