package sunrise.master.contactspages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import sunrise.qa.base.TestBase;
import sunrise.qa.utils.TestUtil;

public class ContactsPage extends TestBase{
	
	//Random String generated for : Document Number & all 
	public static String   Common_No_random	= TestUtil.RandomStringGenerator();
	public static String   Common_No_email	= TestUtil.RandomEmailGenerator();
	public static String   Common_No_name	= TestUtil.RandomNameGenerator();
	public static String   Common_No_company	= TestUtil.RandomCompanyGenerator();
	
	
	@FindBy(xpath= "//span[normalize-space()='Master']")
	WebElement master; 
	
	@FindBy(xpath= "(//span[@class='ant-menu-title-content'][normalize-space()='Contacts'])[1]")
	WebElement contacts;
	
	@FindBy(xpath= "(//span[@class='ant-menu-title-content'][normalize-space()='Contacts'])[2]")
	WebElement contacts_2;

	@FindBy(xpath= "//div[@class='ant-message-custom-content ant-message-error']")
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
	
	//Data -Contact detail section tab -1
	
	@FindBy(xpath="//textarea[@name='address']")  
	WebElement address;
	
	@FindBy(xpath="(//div[@class=' css-1cjvpk1-Input'])[1]")  
	WebElement City_select1;
	@FindBy(xpath="//div[@class=' css-1r12vxi-option'][1]")  
	WebElement City_select2;
	
	@FindBy(xpath="//input[@name='tax_id']")  
	WebElement taxId;
	
	@FindBy(xpath="//input[@name='alias_name']")  
	WebElement aliasName;
	
	@FindBy(xpath="(//input[@placeholder='Select date'])[2]")  
	WebElement LeaveDate;
	
	@FindBy(xpath="//textarea[@name='leave_reason']")  
	WebElement leaveReason;
	
	@FindBy(xpath="//input[@name='source_party']")  
	WebElement sourceParty;
	
	@FindBy(xpath="//input[@name='phone_one']")  
	WebElement phoneOne;
	@FindBy(xpath="//input[@name='phone_two']")  
	WebElement phoneTwo;
	
	@FindBy(xpath="//input[@name='mobile_one']")  
	WebElement mobileOne;
	
	@FindBy(xpath="//input[@name='mobile_two']")  
	WebElement mobileTwo;
	
	@FindBy(xpath="//input[@name='email_one']")  
	WebElement emailOne;
	
	@FindBy(xpath="//input[@name='email_two']")  
	WebElement emailTwo;
	
	@FindBy(xpath="//input[@name='website']")  
	WebElement Website;
	
	@FindBy(xpath="//input[@name='fax_number']")  
	WebElement faxNumber;
	
	@FindBy(xpath="//div[@name='customer_type']//span[@class='ant-select-selection-search']")  
	WebElement type_select1;
	@FindBy(xpath="//div[@class='ant-select-item-option-content'][normalize-space()='Consumer']") //may change in future  
	WebElement type_select2;
	
	@FindBy(xpath="(//div[@class='ant-select-selector'])[2]")  
	WebElement InvoiceType_select1;
	@FindBy(xpath="//div[contains(text(),'Regular')]")  //may change in future
	WebElement InvoiceType_select2;
	
	@FindBy(xpath="//input[@name='short_name']")  
	WebElement shortName;
	
	
	//Data -sales & purchase detail section tab -2 
	

	@FindBy(xpath="(//input[@placeholder='Select year'])[1]") 
	WebElement Establishedyear;
	@FindBy(xpath="//input[@name='pick_up_name']") 
	WebElement pickUpName;
	@FindBy(xpath="//input[@name='party_code']") 
	WebElement PartyCode;
	
	
	
	@FindBy(xpath="(//div[@class=' css-1cjvpk1-Input'])[2]") 
	WebElement ReferenceMedia_select1;
	@FindBy(xpath="//div[@class=' css-1r12vxi-option'][1]") 
	WebElement ReferenceMedia_select2;
	
	@FindBy(xpath="(//div[@class=' css-1cjvpk1-Input'])[3]") 
	WebElement OwnershipStatus_select1;
	@FindBy(xpath="(//div[@class=' css-1r12vxi-option'])[1]") 
	WebElement OwnershipStatus_select2;
	
	@FindBy(xpath="(//div[@class=' css-1cjvpk1-Input'])[4]") 
	WebElement Bank_select1;
	@FindBy(xpath="(//div[@class=' css-1r12vxi-option'])[1]") 
	WebElement Bank_select2;
	
	@FindBy(xpath="(//input[@type='checkbox'])[4]") 
	WebElement ShipTo_checkbox;
	
	@FindBy(xpath="//input[@name='whatsapp_number']") WebElement whatsappNumber;
	@FindBy(xpath="//input[@name='skype_id']") WebElement skypeId;
	@FindBy(xpath="//input[@name='qq_id']") WebElement qqId;
	@FindBy(xpath="//input[@name='rapnet_id']") WebElement rapnetId;
	@FindBy(xpath="//input[@name='wechat_id']") WebElement wechatId;
	@FindBy(xpath="//input[@name='twitter_id']") WebElement twitterId;
	@FindBy(xpath="//input[@name='facebook_id']") WebElement facebookId;
	
	
	
	
	
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
	
	String msg =  max_msg.getText();
	return msg;
	
}

public void tab_close() throws InterruptedException

{
	tab_close2_btn.click();
	Thread.sleep(3000);
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
		Thread.sleep(5000);
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
	Company_Name.sendKeys(Common_No_company);
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
		Thread.sleep(5000);
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
	
	Contact_Person_Name.sendKeys(Common_No_name);
	Company_Name.sendKeys(Common_No_company);
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
	 
	
	 System.out.println(Common_No_name);
	 System.out.println(Common_No_company);
	 Assert.assertTrue(Record_success_msg.isDisplayed());
	 try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

	public void DataEntry_AllData()
	{
		plus_contact_btn.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		Individual_radiobtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Contact_Person_Name.sendKeys(Common_No_name);
		Company_Name.sendKeys(Common_No_company);
		Lab_type.click();
		Vendor_type.click();
		
		address.sendKeys(TestUtil.RandomAddressGenerator());
		
		
		try {
			Thread.sleep(2000);
			TestUtil.navigate_to_option1(City_select1,City_select2);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		taxId.sendKeys(TestUtil.RandomStringGenerator());
		
		
		aliasName.sendKeys(TestUtil.RandomNameGenerator());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		LeaveDate.sendKeys(TestUtil.GetCurrentDate("dd/MM/yyyy"));
		LeaveDate.sendKeys(Keys.RETURN);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		leaveReason.sendKeys(TestUtil.RandomStringGenerator());
		
		sourceParty.sendKeys(TestUtil.RandomCompanyGenerator());
		
		phoneOne.sendKeys("8780921825");
		phoneTwo.sendKeys("8780921825");
		
		mobileOne.sendKeys("8780921825");
		
		mobileTwo.sendKeys("8780921825");
		
		emailOne.sendKeys(TestUtil.RandomEmailGenerator());
		
		emailTwo.sendKeys(TestUtil.RandomEmailGenerator());
		
		Website.sendKeys(TestUtil.RandomWebsiteGenerator());
		
		faxNumber.sendKeys("+44-208-1234567");
		
		try {
			Thread.sleep(2000);
			TestUtil.navigate_to_option1(type_select1,type_select2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(2000);
			TestUtil.navigate_to_option1(InvoiceType_select1,InvoiceType_select2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		shortName.sendKeys(TestUtil.RandomStringGenerator());
		
		Next_btn1.click();
		 
		
		//Entry for Sale & purchase 
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Establishedyear.sendKeys(prop.getProperty("EstablishedYear"));
		Establishedyear.sendKeys(Keys.RETURN);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		pickUpName.sendKeys(TestUtil.RandomNameGenerator());
		//PartyCode.sendKeys(TestUtil.RandomStringGenerator()); - Not Implemented yet
		
		try {
			Thread.sleep(2000);
			TestUtil.navigate_to_option1(ReferenceMedia_select1,ReferenceMedia_select2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(2000);
			TestUtil.navigate_to_option1(OwnershipStatus_select1,OwnershipStatus_select2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(2000);
			TestUtil.navigate_to_option1(Bank_select1,Bank_select2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		ShipTo_checkbox.click();
		
		whatsappNumber.sendKeys(prop.getProperty("WhatsappNumber"));
		skypeId.sendKeys(TestUtil.RandomUserIDGenerator());
		qqId.sendKeys(TestUtil.RandomUserIDGenerator());
		rapnetId.sendKeys(TestUtil.RandomUserIDGenerator());
		wechatId.sendKeys(TestUtil.RandomUserIDGenerator());
		twitterId.sendKeys(TestUtil.RandomUserIDGenerator());
		facebookId.sendKeys(TestUtil.RandomUserIDGenerator());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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
		 
		
		 Assert.assertTrue(Record_success_msg.isDisplayed());
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
