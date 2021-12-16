package random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Webpushnotifications 
{

	public static void main(String[] args) 
	{
		/*System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");    //addArgument method-chrome Browser
		System.setProperty("webdriver.chrome.driver","E:/software/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.redbus.in/");*/
		

		
		/*System.setProperty("webdriver.gecko.driver","C:/Users/Dipti Dash/Downloads/geckodriver.exe");  //addArgument method-firefox Browser
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--disable-notifictaions");
	    WebDriver driver=new FirefoxDriver(options);
        driver.get("https://www.redbus.in/");*/
	    
	    
	    System.setProperty("webdriver.gecko.driver","C:/Users/Dipti Dash/Downloads/geckodriver.exe"); //addPreference method-firefox Browser
		FirefoxOptions options=new FirefoxOptions();
		options.addPreference("dom.notifications.enabled",false);
	    WebDriver driver=new FirefoxDriver(options);
	    driver.get("https://www.redbus.in/");
	    
	    
	    
	    
	    
	    
	    
		
	}

}
