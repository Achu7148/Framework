package com.ashwanth.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRMLogin {
	
	private static WebElement element = null;
	
	//Username textbox
	public static WebElement txtbx_UserName(WebDriver driver){
		 
        element = driver.findElement(By.id("i0116"));

        return element;

        }
	
	//Next button After entering username
	 public static WebElement btn_Next(WebDriver driver){
		 
         element = driver.findElement(By.id("idSIButton9"));
 
         return element;
 
         }
	 
	 //password text box
	 public static WebElement txtbx_Password(WebDriver driver){
		 
         element = driver.findElement(By.id("i0118"));
 
         return element;
 
         }
	 
	 //Login button
	 public static WebElement btn_LogIn(WebDriver driver){
		 
         element = driver.findElement(By.xpath("//input[@value='Sign in']"));
 
         return element;
 
         }
	 
    //Stay signed in No button
     public static WebElement btn_No(WebDriver driver){
		 
         element = driver.findElement(By.id("idBtn_Back"));
 
         return element;
 
         }
     
     //wait for element present(... icon near user profile)
public static WebElement WaitForElement(WebDriver driver){
		 
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	 return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("navTabButtonHelpImageIdWeb")));
 
         }

//close the browser
public static void CloseDriver(WebDriver driver){
	 
    driver.quit();

    }

//Wait
public static void Wait(WebDriver driver){
	 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

//Wait for 50 seconds
public static void Wait1(WebDriver driver){
	 
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    }

//Wait for element(+New)
public static WebElement WaitForElement1(WebDriver driver){
	 
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	 return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ms-crm-Menu-Label")));
 
         }

//wait for elemnt(Save & Close Button)
public static WebElement WaitForElement2(WebDriver driver){
	 
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	 return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Parent Account_label")));
 
         }

}
