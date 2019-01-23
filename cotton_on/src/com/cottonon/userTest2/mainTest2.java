package com.cottonon.userTest2;

import org.testng.annotations.Test;

import com.cottonon.generic_lib.Browsers;
import com.cottonon.generic_lib.common_lib;
import com.cottonon.generic_lib.wait_stmt;
import com.cottonon.page_obj_lib.login;
import com.cottonon.page_obj_lib.navigatetopage;
import com.cottonon.page_obj_lib.shopbycategory; 


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class mainTest2 {
	WebDriver driver;
	common_lib library;
	wait_stmt wait;
	login loginpage;
	navigatetopage navigate;
	shopbycategory shopcat;
	
	 @BeforeClass
	  public void beforeClass() {
		 driver=Browsers.getbrowser();
		 library=new common_lib();
		 wait=new wait_stmt();
		 loginpage=PageFactory.initElements(driver, login.class);
		 navigate=PageFactory.initElements(driver, navigatetopage.class);
		 shopcat=PageFactory.initElements(driver, shopbycategory.class);
		 
		 loginpage.logincotton();
		
	  }
	 
	 @BeforeMethod
	  public void beforeMethod() {
	  }
	
  @Test
  public void shopbycategory() throws IOException {
	  
library.mousehouver2ele(shopcat.category(), shopcat.jean());
	  
  }
  

  @AfterMethod
  public void afterMethod() {
  }

 

  @AfterClass
  public void afterClass() {
	  navigate.signout();
	  driver.close();
  }

}
