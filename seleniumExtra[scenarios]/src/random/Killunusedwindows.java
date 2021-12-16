package random;

import org.openqa.selenium.os.WindowsUtils;

public class Killunusedwindows 
{

	public static void main(String[] args) 
	
	{
		WindowsUtils.killByName("chromedriver.exe");
		System.out.println(WindowsUtils.thisIsWindows());
		System.out.println(WindowsUtils.getProgramFiles86Path());
		System.out.println(WindowsUtils.getProgramFilesPath());
		System.out.println(WindowsUtils.findTaskKill());
		System.out.println(WindowsUtils.findSystemRoot());
		System.out.println(WindowsUtils.loadEnvironment());
		
      
	}

}
