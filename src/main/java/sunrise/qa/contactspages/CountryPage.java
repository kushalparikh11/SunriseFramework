package sunrise.qa.contactspages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sunrise.qa.base.TestBase;

public class CountryPage extends TestBase{
	
	@FindBy(xpath= "//span[normalize-space()='Master']")
	WebElement master; 
	@FindBy(xpath= "(//span[@class='ant-menu-title-content'][normalize-space()='Contacts'])[1]")
	WebElement contacts;
	@FindBy(xpath= "(//span[normalize-space()='Country'])[1]")
	WebElement country;

	@FindBy(xpath= "(//span[normalize-space()='Maximum tabs reached.'])[1]")
	WebElement max_msg;
	
	@FindBy(xpath= "(//*[name()='svg'])[2]")
	WebElement tab_close1_btn;
	
	@FindBy(xpath= "(//*[name()='svg'])[3]")
	WebElement tab_close2_btn;
	
	@FindBy(xpath= "//center[normalize-space()='Welcome to Home Page']")
	public
	WebElement welcome_msg;
	
	public CountryPage()
	{
		PageFactory.initElements(driver,this);
	}
	
public void navigate_to_module() throws InterruptedException
{
	Actions action = new Actions(driver);
	action.moveToElement(master).perform();
	Thread.sleep(2000);
	action.moveToElement(contacts).perform();
	Thread.sleep(2000);
	action.moveToElement(country).click().perform();
}

public boolean max_msg_present()

{
	return max_msg.isDisplayed();
	
}

public void tab_close() throws InterruptedException

{
	tab_close2_btn.click();
	Thread.sleep(2000);
	tab_close1_btn.click();
	
	}


}
