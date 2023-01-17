package sunrise.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import sunrise.qa.utils.TestUtil;


public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("D:\\SunriseAutomation\\src\\main\\java\\sunrise\\qa\\config\\config.properties");
		prop.load(ip);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome")){
			
			driver = new ChromeDriver(); 
		}
		else if(browserName.equalsIgnoreCase("Firefox")){
			
			driver = new FirefoxDriver(); 
		}
		else if(browserName.equalsIgnoreCase("Edge")){
			
			driver = new EdgeDriver(); 
		}
		
		else
		{
			System.out.println("Browser is not available");
		}
		
		
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		
		driver.get(prop.getProperty("url"));
		
	}
}
