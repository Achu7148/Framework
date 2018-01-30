package com.ashwanth.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ashwanth.pages.CRMLogin;
import com.ashwanth.pages.FormSelection;
import com.ashwanth.pages.ContactPage;

public class Test_2_CRMLogin {

	WebDriver driver;

	@BeforeMethod
	public void LaunchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\qvsbatch1\\SelDrivers\\chromedriver.exe"); // Setting
//																													// up
//																													// chrome
//																													// driver
		driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\workspace\\Framework\\SeleniumDrivers\\FirefoxDriver.exe");
		//WebDriver driver = new FirefoxDriver();
        //driver = new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://sensiple-dev.crm.dynamics.com/");

		driver.manage().window().maximize();
	}

	@Test
	public void Login() throws NullPointerException {

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

	@AfterTest
	public void Account_Page() throws InterruptedException {

		FormSelection.sales_selection(driver).click();

		FormSelection.account_selection(driver).click();

		CRMLogin.WaitForElement1(driver);

		FormSelection.click_new(driver).click();

		driver.switchTo().frame("contentIFrame1");

		CRMLogin.WaitForElement2(driver);
		
		ContactPage.txbx_AccName(driver).sendKeys("Ashwanth");
		
		ContactPage.txtbx_CntryName(driver);
		
		Thread.sleep(2000);
		
		ContactPage.txbx_State(driver);
		
		ContactPage.hiddentxbx_State(driver).sendKeys("TamilNadu");
		
		Thread.sleep(1000);
		
        ContactPage.txbx_Zipcode(driver);
		
		ContactPage.hiddentxbx_Zipcode(driver).sendKeys("123456");
		
		Thread.sleep(1000);
		
        ContactPage.txbx_Address(driver);
		
		ContactPage.hiddentxbx_Address(driver).sendKeys("USA1234");
		
	}
}
