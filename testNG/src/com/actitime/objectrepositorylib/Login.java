package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
@FindBy(name="username")
WebElement usernameEdt;

@FindBy(name="pwd")
WebElement passwordEdt;

@FindBy(id="loginButton")
WebElement loginBtn;
//overloading mtd
public void login(String username,String password)
{
	usernameEdt.sendKeys(username);
	passwordEdt.sendKeys(password);
	loginBtn.click();
}
public void loin()
{
	usernameEdt.sendKeys("admin");
	passwordEdt.sendKeys("manager");
	loginBtn.click();
}
public WebElement getUsernameEdt() {
	return usernameEdt;
}
/*public void setUsernameEdt(WebElement usernameEdt) {
	this.usernameEdt = usernameEdt;
}*/
public WebElement getPasswordEdt() {
	return passwordEdt;
}
/*public void setPasswordEdt(WebElement passwordEdt) {
	this.passwordEdt = passwordEdt;
}*/
public WebElement getLoginBtn() {
	return loginBtn;
}
/*public void setLoginBtn(WebElement loginBtn) {
	this.loginBtn = loginBtn;
}*/

}
