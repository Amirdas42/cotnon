package com.cottonon.generic_lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {
	
	public static WebDriver driver;
	
	public static WebDriver getbrowser()
	{
		if(Constants.browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		 else if(Constants.browser.equals("firefox"))
		{
			driver =new FirefoxDriver();
		}
		
		return driver;
	}
}
