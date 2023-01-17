package sunrise.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sunrise.qa.base.TestBase;

public class CompanyPage extends TestBase{
	
	@FindBy(xpath= "//span[normalize-space()='Master']")
	WebElement master; 
	@FindBy(xpath= "//div[@role='menuitem']//span[@class='ant-menu-title-content'][normalize-space()='Company']")
	WebElement company_1;
	@FindBy(xpath= "//li[@class='ant-menu-item ant-menu-item-active ant-menu-item-only-child']")
	WebElement company_2;

	public CompanyPage()
	{
		PageFactory.initElements(driver,this);
	}
	
public void navigate_to_companymodule()
{
	Actions action = new Actions(driver);
	action.moveToElement(master).pause(Duration.ofSeconds(1)).perform();
	action.moveToElement(company_1).pause(Duration.ofSeconds(1)).perform();
	action.moveToElement(company_2).click().perform();
}








}
