package com.facebook.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.facebook.generics.BaseTest;
import com.facebook.generics.FWUtils;
import com.facebook.pages.LoginPage;

public class TestLoginPage extends BaseTest
{
	@Test
	public static void testValidLogin() throws InterruptedException
	{
		BaseTest.openApplication();
		Thread.sleep(1000);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName("8496963069");
		lp.setPassword("Saijayaram@74");
		lp.clickLoginBTN();
		String title = driver.getTitle();
		Reporter.log(title);
		Thread.sleep(1000);
		FWUtils.takeScreenShot(driver, PHOTO_PATH);
		Thread.sleep(1000);
		String cur_url = driver.getCurrentUrl();
		Reporter.log(cur_url);
		BaseTest.closeApplication();
	}
}
