package com.ashwanth.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class ContactPage {

	private static WebElement element = null;
	
	public static WebElement txtbx_AccName(WebDriver driver){
		 
        element = driver.findElement(By.id("name"));

        return element;

        }
	
	public static WebElement txtbx_CntryName(WebDriver driver){
		 
        Select element = new Select(driver.findElement(By.className("ms-crm-Inline-Value ms-crm-Inline-HasError")));

        element.selectByVisibleText("Albania");
		
        return null;

        }
	
	
}
