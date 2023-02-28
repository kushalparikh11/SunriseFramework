package sunrise.master.contactspages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import sunrise.qa.base.TestBase;
import sunrise.qa.utils.TestUtil;

public class ContactsPage extends TestBase{
	
	//Random String generated for : Document Number & all 
	public static String   Common_No_random	= TestUtil.RandomStringGenerator();
	
	
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
	
	
	//Data entry with all data 
	
	
	@FindBy(xpath= "//button[@class='ant-btn ant-btn-primary']")
	WebElement plus_contact_btn;
	
	//Type-Section
	@FindBy(xpath= "//input[@value='Company']")
	WebElement company_radiobtn;
	
	@FindBy(xpath= "//input[@name='company_name']")
	WebElement Company_Name;
	
	@FindBy(xpath= "//input[@value='Individual']")
	WebElement Individual_radiobtn;
	
	@FindBy(xpath= "//input[@name='contact_person_name']")
	WebElement Contact_Person_Name;
	
	
	//lab section
	@FindBy(xpath= "//input[@value='Lab']")
	WebElement Lab_type;
	@FindBy(xpath= "//input[@value='Vendor']")
	WebElement Vendor_type;
	
	//Next-Buttons
	@FindBy(xpath= "//button[@type='submit']")
	WebElement Next_btn1;
	
	//Next-Buttons - Sales & Purchase section
	@FindBy(xpath= "(//button[@type='submit'])[2]")
	WebElement Next_btn2;
	
	//InternalNote -Section
	@FindBy(xpath= "//textarea[@name='internal_notes']")
	WebElement Internal_Notes;
	
	@FindBy(xpath= "(//button[@type='button'])[9]")
	WebElement Save_btn;
	
	@FindBy(xpath= "//span[normalize-space()='Contact created successfully']")
	WebElement Record_success_msg;
	
	
	
	
	
	
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

public void DataEntry_CompanyName()
{
	try {
		TestUtil.navigate_to_option2(master,contacts,contacts_2);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	plus_contact_btn.click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	company_radiobtn.click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	Company_Name.sendKeys(Common_No_random);
	Lab_type.click();
	Vendor_type.click();
	 Next_btn1.click();
	 Next_btn2.click();
	 
	 try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	 
	 Internal_Notes.sendKeys("Test Completed!!");
	 
	 try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	 Save_btn.click();
	 
	 try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  ;
	 
	
	 System.out.println(Common_No_random);
	 Assert.assertTrue(Record_success_msg.isDisplayed());
	
	 
	 
	}


public void DataEntry_ContactPersonName()
{
	
	plus_contact_btn.click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Individual_radiobtn.click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	Contact_Person_Name.sendKeys(Common_No_random);
	Company_Name.sendKeys(Common_No_random);
	Lab_type.click();
	Vendor_type.click();
	 Next_btn1.click();
	 Next_btn2.click();
	 
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	 Internal_Notes.sendKeys("Test Completed!!");
	 
	 try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	 Save_btn.click();
	 
	 try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  ;
	 
	
	 System.out.println(Common_No_random);
	 Assert.assertTrue(Record_success_msg.isDisplayed());
	
	 
	 
	}


}
