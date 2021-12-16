package random;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromefirefoxlogFiles 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:/software/chromedriver.exe");
		//System.setProperty("webdriver.chrome.logfile","./chromelog.txt");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"./firefoxlog.txt");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		System.out.println("execution completed");

	}

}
