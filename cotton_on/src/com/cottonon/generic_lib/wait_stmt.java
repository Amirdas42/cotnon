package com.cottonon.generic_lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_stmt {
	
	public void pagetoload()
	{
		Browsers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
    public void elementtoload(WebElement wb)
    {
    	WebDriverWait wait = new WebDriverWait(Browsers.driver, 20);
    	wait.until(ExpectedConditions.visibilityOf(wb));
    }
}
