package random;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Verifyerrormessages 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("(//span[.='Next'])[1]")).click();
		WebElement error=driver.findElement(By.xpath("//div[@class='o6cuMc']"));
		/*String actualerror=error.getText();
		String expectederror="Enter an email or phone number";
		Assert.assertEquals(actualerror, expectederror);
		System.out.println("execution completed");*/
		
		String actualerror=error.getAttribute("innerHTML");
		String expectederror="Enter an email or phone number";
		Assert.assertTrue(actualerror.contains("Enter"));
		System.out.println("test completed");

	}

}
