package random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisablingInfobars
{

	public static void main(String[] args)
	{
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver","E:/software/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-infobars");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");

	}

}
