package com.cottonon.page_obj_lib;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class wishlistt {
	 @FindBy(xpath="//table[@class='item-list']/tbody/tr/td[@class='item-details span3']/div/div[1]")
	 private List<WebElement> pn;
	 public List<WebElement> productname()
	 {return pn;
	 }
	 @FindBy(xpath="//table[@class='item-list']/tbody/tr/td[@class='item-details span3']/div/div[2]")
	 private List<WebElement> item;
	 public List<WebElement> item_no()
	 {return item;
	 }
	 @FindBy(xpath="//table[@class='item-list']/tbody/tr/td[@class='item-details span3']/div/div[5]")
	 private List<WebElement> rate;
	 public List<WebElement> price()
	 {return rate;
	 }
	 

}
