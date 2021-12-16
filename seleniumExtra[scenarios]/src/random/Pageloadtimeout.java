package random;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Pageloadtimeout 
{

	public static void main(String[] args) 
	{
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		System.setProperty("webdriver.chrome.driver","E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com");

	}

}
