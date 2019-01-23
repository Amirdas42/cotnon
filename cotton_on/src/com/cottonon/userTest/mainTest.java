package com.cottonon.userTest;

import org.testng.annotations.Test;

import com.cottonon.generic_lib.Browsers;
import com.cottonon.generic_lib.common_lib;
import com.cottonon.generic_lib.excel_lib;
import com.cottonon.page_obj_lib.login;
import com.cottonon.page_obj_lib.my_bag;
import com.cottonon.page_obj_lib.navigatetopage;
import com.thoughtworks.selenium.webdriven.commands.CaptureScreenshotToString;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.record.CountryRecord;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

@Listeners(com.cottonon.generic_lib.failtestcapture.class)
public class mainTest {
	WebDriver driver;
	login loginpage;
	navigatetopage navigatetopage;
	my_bag bag;
	common_lib library;
	excel_lib elib;
	
	 @BeforeClass
	  public void beforeClass() {
		 elib=new excel_lib();
		 library=new common_lib();
		 driver=Browsers.getbrowser();
		 loginpage=PageFactory.initElements(driver, login.class);
		 navigatetopage=PageFactory.initElements(driver, navigatetopage.class);
		 bag=PageFactory.initElements(driver, my_bag.class);
		 loginpage.logincotton();
	  }
	 
	 @BeforeMethod
	  public void beforeMethod() {
		 
	  }
	
  @Test
  public void a_homepagetest() throws IOException {
	  System.out.println(driver.getCurrentUrl());
	  navigatetopage.homepage();
	  library.capturescreenshot("homepage");
  }
  
  @Test(enabled=false)
  public void b_countrytest() throws Exception
  {
	  navigatetopage.conselect();
	  Thread.sleep(1000);
	  navigatetopage.country();
  }
  
  @Test
  public void c_searchtest() throws EncryptedDocumentException, InvalidFormatException, IOException
  {
	  String data=elib.getexceldata("Sheet1",1,3);
	  navigatetopage.searchbox(data);
	  navigatetopage.searchenter();
	  String nem=driver.findElement(By.xpath("//div[@id='4fe8cf0b07f884cb9bf3a0b21b' and @data-itemid='9350486068348']/div[3]/h2/a")).getText();
      System.out.println("Shoe name is "+nem );
      String rate=driver.findElement(By.xpath(".//*[@id='4fe8cf0b07f884cb9bf3a0b21b']/div[5]/span")).getText();
      System.out.println("Shoe rate is "+rate);
  }
  
  @Test
  public void d_mybagtest()
  {
	  String baggg=bag.bagg().getText();
	  System.out.println("In my bag "+baggg.substring(8, 9)+" products are there.");
	 
  }
 
  @AfterMethod
  public void afterMethod() {  
 }
  
  @AfterClass
  public void afterClass() {
	  navigatetopage.signout();
	  
	  driver.close();
  }
  
}
