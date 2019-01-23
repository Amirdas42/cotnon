package com.cottonon.page_obj_lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class shopbycategory {
	   
    @FindBy(xpath="//div[@id='navigation']/nav/div[3]/ul/li[2]")
    private WebElement catgory;
    public WebElement category()
    {return catgory;}
   
    @FindBy(xpath="html/body/div[2]/div[1]/div/div[2]/nav/div[3]/ul/li[2]/div/div/ul/li[1]/div/div[2]/div[2]/ul/li[1]/a")
    private WebElement jen;
    public WebElement jean()
    {return jen;}
	
	

}
