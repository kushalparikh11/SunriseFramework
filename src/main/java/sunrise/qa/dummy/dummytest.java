package sunrise.qa.dummy;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dummytest  {
	
	public static WebDriver driver;
	
	@Test
    public void eightComponents() throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://3.109.51.172");
        driver.findElement(By.xpath("//input[@placeholder='Enter User Name']")).sendKeys("KUSHALPARIKH");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Sunrise@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		   
        
        
    }

}
