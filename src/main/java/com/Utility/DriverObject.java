package com.Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverObject {

	public static WebDriver driver;
	
	
	public void GetChromeDriver() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\Chrome\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		
	}
	 public void enterUrl(String url) throws IOException
	 {
		 ConfigFileCaller cg = new ConfigFileCaller();
		 String sitename=cg.fetchdata(url);
		 driver.get(sitename);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	 }
	
	

	public void refreshPage()
	{
		driver.navigate().refresh();
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
}
