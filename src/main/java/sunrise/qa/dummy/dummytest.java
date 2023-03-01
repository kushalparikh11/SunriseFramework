package sunrise.qa.dummy;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class dummytest  {
	
	public static WebDriver driver;
	
	/*@Test
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
		
		
		   
        
        
    }*/
	
	@Test
	public static String test()
	{		
		Faker faker = new Faker();
		String random_email =  faker.internet().emailAddress(); 
		return random_email;
		    
	}
}
