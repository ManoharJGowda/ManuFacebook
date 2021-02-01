package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath="//input[@name='email']")
	private WebElement unTB;
	
	@FindBy(xpath="//input[@name='pass']")
	private WebElement pwTB;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBTN;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickLoginBTN()
	{
		loginBTN.click();
	}
	
}
