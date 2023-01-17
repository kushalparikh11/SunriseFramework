package sunrise.qa.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import sunrise.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static final long PAGE_LOAD_TIMEOUT = 30;
	public static final long IMPLICIT_WAIT = 30;
	
	public TestUtil()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void ValidateUserLogin() {
		driver.findElement(By.xpath("//input[@placeholder='Enter User Name']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
