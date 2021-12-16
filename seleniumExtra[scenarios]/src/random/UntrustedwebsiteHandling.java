package random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UntrustedwebsiteHandling 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:/software/chromedriver.exe");  //works properly
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.americanairlines.com");
		
		/*System.setProperty("webdriver.chrome.driver","E:/software/chromedriver.exe");//does not works
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);
		ChromeOptions options=new ChromeOptions();
		options.merge(cap);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.americanairlines.com");*/

		
		/*System.setProperty("webdriver.chrome.driver","E:/software/chromedriver.exe");//does not works
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.americanairlines.com");*/
	}

}
