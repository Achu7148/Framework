package com.ashwanth.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ashwanth.commonmethods.CommonMethods;
import com.ashwanth.pages.CRMLogin;
import com.ashwanth.pages.FormSelection;
import com.ashwanth.pages.ContactPage;

public class Test_2_CRMLogin {

	WebDriver driver;

	@BeforeMethod
	public void LaunchBrowser() {
		
// Setting up driver
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\qvsbatch1\\SelDrivers\\chromedriver.exe"); 																										// up chromedriver
		driver = new ChromeDriver();
	
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
		
		Thread.sleep(1000);
		
		ContactPage.txbx_AccName(driver).sendKeys("Ashwanthk");
		
		ContactPage.txtbx_CntryName(driver);
		
		Thread.sleep(2000);
		
		ContactPage.txbx_State(driver);
		
		ContactPage.hiddentxbx_State(driver).sendKeys("TamilNadu");

        ContactPage.txbx_Zipcode(driver);
		
		ContactPage.hiddentxbx_Zipcode(driver).sendKeys("123456");
	
        ContactPage.txbx_Address(driver);
		
		ContactPage.hiddentxbx_Address(driver).sendKeys("USA1234");
		
		ContactPage.txtbx_Territory(driver);
		
        ContactPage.txbx_Website(driver);
		
		ContactPage.hiddentxbx_Website(driver).sendKeys("www.usa.com");
		
        ContactPage.txbx_Phone(driver);
		
		ContactPage.hiddentxbx_Phone(driver).sendKeys("1234567890");
	
		ContactPage.txtbx_Industry(driver);
		
		ContactPage.txtbx_CompanySize(driver);
		
		ContactPage.txtbx_RevenueRange(driver);
		
        ContactPage.txbx_EstYr(driver);
		
		ContactPage.hiddentxbx_EstYr(driver).sendKeys("1980");
		
		ContactPage.txtbx_BusinessType(driver);
		
        ContactPage.txbx_PrimAcc(driver);
		
		ContactPage.hiddentxbx_PrimAcc(driver).sendKeys("gs1");
		
		ContactPage.txbx_LegalEnt(driver);
			
		ContactPage.hiddentxbx_LegalEnt(driver).sendKeys("15");
		
		driver.switchTo().defaultContent();
		
		FormSelection.click_SaveandClose(driver).click();
		
	}
}
