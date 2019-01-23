package com.cottonon.page_obj_lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class newaddress {

	@FindBy(xpath="//div[@id='addresses']/div/a")
	private WebElement nwddrss;
	public void newaddresss()
	{nwddrss.click();
	}
		
	@FindBy(xpath="//form[@id='edit-address-form']/div[2]/div/input")
	private WebElement addnem;
	public WebElement addressss()
	{return addnem;
	}
	
	@FindBy(xpath="//form[@id='edit-address-form']/div[3]/div/input")
	private WebElement fistnem;
	public WebElement firstnamee()
	{return fistnem;
	}
	
	@FindBy(xpath="//form[@id='edit-address-form']/div[4]/div/input")
	private WebElement lstnem;
	public WebElement lastnamee()
	{return lstnem;
	}
	
	@FindBy(xpath="//form[@id='edit-address-form']/div[5]/div/input")
	private WebElement add1;
	public WebElement address1()
	{return add1;
	}
	
	@FindBy(xpath="")
	private WebElement cntry;
	public WebElement country()
	{return cntry;
	}
	
	@FindBy(xpath=".//*[@id='s2id_dwfrm_profile_address_states_stateSelect']/a/span[2]/b")
	private WebElement sect;
	public void select()
	{sect.click();;
	}
	
	@FindBy(xpath="//div[@id='select2-result-label-72']/span")
	private WebElement stt;
	public void new_south()
	{stt.click();;
	}
	
	@FindBy(xpath="//form[@id='edit-address-form']/div[11]/div/input")
	private WebElement cit;
	public WebElement city()
	{return cit;
	}
	
	@FindBy(xpath="//form[@id='edit-address-form']/div[12]/div/input")
	private WebElement post;
	public WebElement postcode()
	{return post;
	}
	
	@FindBy(xpath="//form[@id='edit-address-form']/div[13]/div/input")
	private WebElement phn;
	public WebElement phone()
	{return phn;
	}
	
	@FindBy(xpath=".//*[@id='edit-address-form']/div[15]/button[1]")
	private WebElement apply;
	public void save()
	{apply.click();
	}
	
}
