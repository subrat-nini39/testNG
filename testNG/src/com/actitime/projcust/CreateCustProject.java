package com.actitime.projcust;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.objectrepositorylib.ActiveProjectAndCustomer;
import com.actitime.objectrepositorylib.CreateNewCustomer;
import com.actitime.objectrepositorylib.Home;
import com.actitime.objectrepositorylib.OpenTasks;
import com.selenium.testNG.BaseClassTest;
import com.selenium.testNG.FileDataLib;

public class CreateCustProject extends BaseClassTest{
FileDataLib flib=new FileDataLib();
@Test
public void CreateCustomer() throws Throwable
{
	String custName=flib.getExcelData("Sheet1",1,1);
	Home hPage=PageFactory.initElements(driver, Home.class);
	hPage.navigateToTask();
	OpenTasks taskPage=PageFactory.initElements(driver, OpenTasks.class);
	taskPage.navigateToProjNCust();
	ActiveProjectAndCustomer aProjCust=PageFactory.initElements(driver, ActiveProjectAndCustomer.class);
	aProjCust.navigateToCreateCustPage();
	CreateNewCustomer custPage=PageFactory.initElements(driver, CreateNewCustomer.class);
	custPage.createCust(custName);
}

}
