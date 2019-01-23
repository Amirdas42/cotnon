
package com.cottonon.page_obj_lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class navigatetopage {

	@FindBy(partialLinkText="Sign In")
	private WebElement signbtn;
	public void signinbtn()
	{ signbtn.click();
	}
	
	@FindBy(xpath="//ul[@class='menu-utility-user hidden-phone']/li[5]/a")
	private WebElement signoutbtn;
	public void signout()
	{signoutbtn.click();
	}
	
	@FindBy(xpath="//ul[@class='menu-utility-user hidden-phone']/li[6]")
	private WebElement myaccont;
	public void myaccount()
	{myaccont.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Personal Details')]")
	private WebElement personaldetel;
	public void personaldetails()
	{personaldetel.click();
	}
	
	@FindBy(xpath="//div[@class='content-asset']/div[1]/ul/li[2]/a")
	private WebElement addres;
	public void address()
	{addres.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'View My Wish')]")
	private WebElement wishlist;
	public void wishlistt()
	{wishlist.click();
	}
	
	@FindBy(xpath="//div[@id='site-wide-country-selector-ddl']/div/a")
	private WebElement australia;
	public void conselect()
	{australia.click();
	}
	
	@FindBy(xpath="//div[@id='site-wide-country-selector-ddl']/div[2]/ul[1]/li[2]/a/span[2]")
	private WebElement hongkong;
	public void country()
	{hongkong.click();
	}
	
	@FindBy(xpath="//div[@id='navigation']/nav/div[3]/ul/li[1]")
	private WebElement hompage;
	public void homepage()
	{hompage.click();	
	}
	
	@FindBy(xpath="//input[@id='q' and @placeholder='Search...']")
	private WebElement search;
	public void searchbox(String data)
	{search.sendKeys(data);
	}
	
	@FindBy(xpath="//button[@id='search-submit' and @value='go']")
	private WebElement enter;
	public void searchenter()
	{enter.click();
	}
	

}
