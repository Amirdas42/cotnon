package com.cottonon.page_obj_lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cottonon.generic_lib.Browsers;
import com.cottonon.generic_lib.Constants;
import com.cottonon.generic_lib.wait_stmt;

public class login extends wait_stmt {
	@FindBy(xpath="//input[@type='email']") 
	private WebElement uname;
	
    @FindBy(xpath="//div[@data-required-text='Please enter a value for Password']/div[1]/input")
    private WebElement pwd;
     
    @FindBy(xpath="//button[@value='Sign In' and @type='submit']")
    private WebElement submit;
    
    
    public void logincotton()
    {
    	pagetoload();
    	Browsers.driver.get(Constants.url);
    	Browsers.driver.manage().window().maximize();
    	uname.sendKeys(Constants.username);
    	pwd.sendKeys(Constants.pswd);
    	submit.click();
    	
    }
}
