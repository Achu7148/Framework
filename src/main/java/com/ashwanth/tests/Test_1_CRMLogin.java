package com.ashwanth.tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ashwanth.pages.CRMLogin;
import com.ashwanth.pages.FormSelection;
import com.ashwanth.pages.ContactPage;
import com.ashwanth.commonmethods.*;

public class Test_1_CRMLogin {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void LaunchBrowser() {
	
		
	     SeleniumCommands.fn_LaunchBrowser("CH");
	
	     SeleniumCommands.fn_OpenURL("https://sensiple-dev.crm.dynamics.com/");
	     /*
		 System.setProperty("webdriver.chrome.driver", "C:\\workspace\\qvsbatch1\\SelDrivers\\chromedriver.exe"); //Setting up chrome driver
		 driver = new ChromeDriver();  
		 
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	     driver.get("https://sensiple-dev.crm.dynamics.com/");
	     
	     driver.manage().window().maximize(); 	 */
	}
	
	
    /*
	public void Login1() {
		   
	     CRMLogin.txtbx_UserName(driver).sendKeys("bde1@sensiple4.onmicrosoft.com");
	     
	     CRMLogin.btn_Next(driver).click();
	     
	     CRMLogin.Wait(driver);
	 
	     CRMLogin.txtbx_Password(driver).sendKeys("Sensiple@2017");
	     
	     CRMLogin.Wait(driver);
	     
	     CRMLogin.btn_LogIn(driver).click();
	     
	     CRMLogin.Wait(driver);
	 
	     CRMLogin.btn_No(driver).click();
	     
	     CRMLogin.WaitForElement(driver);

	     FormSelection.account_selection(driver).click();
	     
	     CRMLogin.Wait(driver);
	 
	     } */
    
   
   @Test
    public void Login()throws NullPointerException {
	   
	     
	   
	     
	     CRMLogin.txtbx_UserName(driver).sendKeys("bde1@sensiple4.onmicrosoft.com");
	     
	     CRMLogin.btn_Next(driver).click();
	     
	     CRMLogin.Wait(driver);
	 
	     CRMLogin.txtbx_Password(driver).sendKeys("Sensiple@2017");
	     
	     CRMLogin.Wait(driver);
	     
	     CRMLogin.btn_LogIn(driver).click();
	     
	     CRMLogin.Wait(driver);
	 
	     CRMLogin.btn_No(driver).click();
	     
	     CRMLogin.WaitForElement(driver);
	     
	     
	     } 
    
   /*
    public void Account_Page()
    {
    	 FormSelection.sales_selection(driver).click();
   	 
	     FormSelection.account_selection(driver).click();
	     
	     CRMLogin.WaitForElement1(driver);
	       
	     FormSelection.click_new(driver).click();
	     
	     CRMLogin.WaitForElement2(driver);
	     
	     ContactPage.select_AccName(driver).click();
	     
	     ContactPage.txbx_AccName(driver).sendKeys("Ashwanth");
	       
    }*/
}
