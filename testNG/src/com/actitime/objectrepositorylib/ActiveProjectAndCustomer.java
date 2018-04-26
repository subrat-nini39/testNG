package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveProjectAndCustomer {
@FindBy(xpath="//input[@value='Create New Customer']")
WebElement createCustBtn;
@FindBy(xpath="//input[@value='Create New Project']")
WebElement createNewProjBtn;
public void navigateToCreateCustPage()
{
	createCustBtn.click();
}
public void navigateToCreateProjPage()
{
	createNewProjBtn.click();
}
}
