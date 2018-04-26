package com.selenium.testNG;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.objectrepositorylib.Common;
import com.actitime.objectrepositorylib.Login;

public class BaseClassTest {
public WebDriver driver;
FileDataLib flib=new FileDataLib();
Properties pObj;
@BeforeClass
public void beforeClass() throws Throwable
{
	pObj=flib.getPropertiesObj();
	String bName=pObj.getProperty("browser");
	if(bName.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(bName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium RC\\Work\\testNG\\resource\\chromedriver.exe");
		driver=new ChromeDriver();
	}
}
@BeforeMethod
public void beforeMethod() throws InterruptedException, IOException
{
	String bUrl=pObj.getProperty("url");
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	driver.get(bUrl);
	Login lPage=PageFactory.initElements(driver, Login.class);
	lPage.login("admin","manager");
}
@AfterMethod
public void afterMethod()
{
	Common logOutPg=PageFactory.initElements(driver, Common.class);
	logOutPg.logout();
}
@AfterClass
public void afterClass()
{
	driver.close();
}
}
