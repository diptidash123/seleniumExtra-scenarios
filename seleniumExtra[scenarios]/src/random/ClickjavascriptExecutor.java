package random;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickjavascriptExecutor 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='persistent']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",checkbox);
		System.out.println("test done");

	}

}
