package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common {
@FindBy(linkText="Logout")
WebElement logout;
public void logout()
{
	logout.click();
}
}
