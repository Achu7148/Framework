package com.ashwanth.tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ashwanth.pages.CRMLogin;
import com.ashwanth.pages.FormSelection;


public class Test_1_CRMLogin {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void LaunchBrowser() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\workspace\\qvsbatch1\\SelDrivers\\chromedriver.exe"); //Setting up chrome driver
		 driver = new ChromeDriver();  
		 
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	     driver.get("https://sensiple-dev.crm.dynamics.com/");
	     
	     driver.manage().window().maximize();	 
	}
	
	/*
    @Test
	public void Login() {
		   
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

	     CRMLogin.CloseDriver(driver);
	 
	     } 
    
}
