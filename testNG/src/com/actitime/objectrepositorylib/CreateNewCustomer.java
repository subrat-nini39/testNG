package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomer {
@FindBy(name="name")
WebElement custNameEdt;
@FindBy(name="description")
WebElement custDescrptn;
@FindBy(name="createCustomerSubmit")
WebElement createCustBtn;
public void createCust(String custName)
{
	custNameEdt.sendKeys(custName);
	createCustBtn.click();
}
public void createCust(String custName,String desctn)
{
	custNameEdt.sendKeys(custName);
	custDescrptn.sendKeys(desctn);
	createCustBtn.click();
}
}
