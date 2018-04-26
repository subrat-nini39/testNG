package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTasks {
@FindBy(linkText="Completed Tasks")
WebElement compltdTaskLnk;

@FindBy(linkText="Projects & Customers")
WebElement projAndCustLnk;

public void navigateToProjNCust()
{
	projAndCustLnk.click();
}
}
