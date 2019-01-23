package com.cottonon.page_obj_lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class my_bag {

	@FindBy(xpath="//div[@id='mini-cart']/div/div/a/span[1]")
	private WebElement bg;
	public WebElement bagg()
	{return bg;}
}
