package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
@FindBy(xpath="//div[text()='Tasks']/..")
WebElement openTasks;

@FindBy(xpath="//div[text()='Reports']")
WebElement openReports;

@FindBy(xpath="//div[text()='Users']")
WebElement openUsers;

@FindBy(xpath="//div[text()='Work Schedule']")
WebElement openWorkScedule;
public void navigateToTask()
{
	openTasks.click();
}
public void navigateToUser()
{
	openUsers.click();
}
}
