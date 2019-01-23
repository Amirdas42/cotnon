package com.cottonon.generic_lib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;


public class common_lib {
	 public void workingwithdropdown(String xpath, int index)
	 {
		 WebElement wb= Browsers.driver.findElement(By.xpath(xpath));
		 Select sel = new Select(wb);
		 sel.selectByIndex(index);
	 }
	  
	 public boolean mousehouver(String xpath)
	 {
		 WebElement wb=Browsers.driver.findElement(By.xpath(xpath));
		 Actions act=new Actions(Browsers.driver);
		 act.moveToElement(wb).perform();
		return false;
	 }
	 
	 /*
	  * 
	  * 
	  */
     
	 public void mousehouver2ele(WebElement element1,WebElement element2)
	 {
		 if(element1.isDisplayed() && element1.isEnabled())
		 {
			 Actions act=new Actions(Browsers.driver);
			 act.moveToElement(element1).moveToElement(element2).click().build().perform();
			 
		 }else throw new RuntimeException("Element is not Displayed");
	 }
	 
	 public boolean doubleclick(String xpath)
	 {
		 WebElement wb=Browsers.driver.findElement(By.xpath(xpath));
		 Actions act=new Actions(Browsers.driver);
		 act.doubleClick(wb).perform();
		return false;
	 }
	 
	 public void capturescreenshot(String filename) throws IOException
	 {
		 TakesScreenshot ts= (TakesScreenshot)Browsers.driver;
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 File dst=new File("./Screenshot\\"+filename+".jpeg");
		 FileUtils.copyFile(src, dst);
		 EventFiringWebDriver efw= new EventFiringWebDriver(Browsers.driver);
	 }
	 
	/* public static String capturefailtest(String filename) throws IOException
	 {
		 TakesScreenshot ts= (TakesScreenshot)Browsers.driver;
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 Stri dst=new File("./FailScreenshot\\"+filename+".jpeg");
		 FileUtils.copyFile(src, dst);
		 EventFiringWebDriver efw= new EventFiringWebDriver(Browsers.driver);
		 return dst;
	 }*/
}
