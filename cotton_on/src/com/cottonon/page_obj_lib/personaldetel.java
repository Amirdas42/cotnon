package com.cottonon.page_obj_lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class personaldetel {
	
	@FindBy(xpath="//div[@class='controls-group']/div[2]/div/input[@id='dwfrm_changelogin_profile_firstname']")
	private WebElement fstnem;
	public WebElement firstname()
	{return fstnem;
	}
    
	@FindBy(xpath="//div[@class='controls-group']/div[3]/div/input[@id='dwfrm_changelogin_profile_lastname']")
	private WebElement lstnem;
	public WebElement lastname()
	{return fstnem;
	}
	
	@FindBy(xpath="//input[@id='dwfrm_changelogin_username' and @type='email']")
	private WebElement melid;
	public WebElement mailid()
	{return fstnem;
	}
	
}
