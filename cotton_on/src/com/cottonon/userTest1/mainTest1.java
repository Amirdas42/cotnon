package com.cottonon.userTest1;

import org.testng.annotations.Test;

import com.cottonon.generic_lib.Browsers;
import com.cottonon.generic_lib.common_lib;
import com.cottonon.generic_lib.excel_lib;
import com.cottonon.generic_lib.wait_stmt;
import com.cottonon.page_obj_lib.login;
import com.cottonon.page_obj_lib.navigatetopage;
import com.cottonon.page_obj_lib.newaddress;
import com.cottonon.page_obj_lib.personaldetel;
import com.cottonon.page_obj_lib.wishlistt;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class mainTest1 {
	WebDriver driver;
	excel_lib elib;
	wait_stmt waitstmt;
	common_lib library;
	login loginpage;
	navigatetopage navigatetopage;
	personaldetel personaldeteel;
	newaddress address;
	wishlistt wislist;
	
	 @BeforeClass
	  public void beforeClass() {
		 driver=Browsers.getbrowser();
		 elib=new excel_lib();
		 waitstmt=new wait_stmt();
		 library= new common_lib();
		 loginpage=PageFactory.initElements(driver, login.class);
		 navigatetopage=PageFactory.initElements(driver, navigatetopage.class);
		 personaldeteel=PageFactory.initElements(driver, personaldetel.class);
		 address=PageFactory.initElements(driver, newaddress.class);
		 wislist=PageFactory.initElements(driver, wishlistt.class);
		 
		 loginpage.logincotton();
		 
		 
	  }
  @Test
  public void personaldeteltest() throws Exception, InvalidFormatException, IOException {
	  String firstname=elib.getexceldata("Sheet1", 4, 1);
	  String lastname=elib.getexceldata("Sheet1", 4, 1);
	  String mailid=elib.getexceldata("Sheet1", 4, 1);
	 
	  navigatetopage.personaldetails();
	   
	  String actfirsttname=personaldeteel.firstname().getAttribute("value");
	  String actlastname=personaldeteel.lastname().getAttribute("value");
	  String actmailid=personaldeteel.mailid().getAttribute("value");
	  Assert.assertEquals(firstname, actfirsttname);
	  Assert.assertEquals(lastname, actlastname);
	  Assert.assertEquals(mailid, actmailid);
      }
	  @Test
	  public void addres() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		  navigatetopage.address();
		  address.newaddresss();
		  Thread.sleep(2000);
		  String add=elib.getexceldata("Sheet1", 2, 2);
		  address.addressss().sendKeys(add);
		  address.firstnamee().sendKeys("Amir");
		  address.lastnamee().sendKeys("kumar");
		  String add1=elib.getexceldata("Sheet1", 3, 2);
		  address.address1().sendKeys(add1);
		  address.select();
		  library.doubleclick(".//*[@id='select2-result-label-11']");
		  address.city().sendKeys("Bengaluru");
		  address.postcode().sendKeys("2000");
		  address.phone().sendKeys("9040428236");
		  address.save();
		  Thread.sleep(3000);
	  }	
	  @Test
	  public void wishlist()
	  {
		  navigatetopage.wishlistt();
		  
		  List<WebElement> pro=wislist.productname();
		  List<WebElement> item=wislist.item_no();
		  List<WebElement>pric=wislist.price();
		  System.out.println("There are "+pro.size()+" no of product present in wishlist.");

		  for(int i =0;i<pro.size();i++){
			  System.out.println(pro.get(i).getText());

			  System.out.println(item.get(i).getText());

			  System.out.println(pric.get(i).getText());
		  }
		 	 
	  }
	 
  @BeforeMethod
  public void beforeMethod() {
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
