package com.ashwanth.pages;

import org.openqa.selenium.*;

public class FormSelection {

	private static WebElement element = null;
	
	//Clicking Sales
	public static WebElement sales_selection(WebDriver driver){
		
		return element = driver.findElement(By.name("TabHome"));
		
        }
	
	//Selecting Account
    public static WebElement account_selection(WebDriver driver){
		
		return element = driver.findElement(By.id("nav_accts"));
		
        }

    //Click "+" icon
    public static WebElement click_new(WebDriver driver){
		
		return element = driver.findElement(By.id("account|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.account.NewRecord"));
		
        }

    
 public static WebElement click_SaveandClose(WebDriver driver){
		
		return element = driver.findElement(By.id("account|NoRelationship|Form|Mscrm.Form.account.SaveAndClose"));
		
        }
    
    
    
}
