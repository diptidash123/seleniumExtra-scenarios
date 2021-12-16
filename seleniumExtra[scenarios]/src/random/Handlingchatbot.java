package random;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Handlingchatbot 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		System.setProperty("webdriver.chrome.driver","E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		driver.findElement(By.xpath("//b[.='ASK DISHA']")).click();
		//driver.findElement(By.xpath("//div[@id='corover-close-btn']")).click();
		driver.findElement(By.id("corover-disha-icon")).click();
		Thread.sleep(30000);
		driver.switchTo().frame("corover-chat-frame");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("trains to kolkata");

	}

}
