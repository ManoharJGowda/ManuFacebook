package com.facebook.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FWUtils extends BaseTest
{
	@Test
	public static void verifyPage(WebDriver driver,String expectedTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver, ETO);
		String actualTitle;
		wait.until(ExpectedConditions.titleContains(expectedTitle));
		actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Expected title is :"+ expectedTitle);
		}
		else
		{
			System.out.println("Actual title is :" + actualTitle);
		}
	}
	public static void takeScreenShot(WebDriver driver, String path)
	{
		try
		{
			TakesScreenshot ts= (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(path);
			FileUtils.copyFile(src, des);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
