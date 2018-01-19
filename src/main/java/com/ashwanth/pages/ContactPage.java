package com.ashwanth.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class ContactPage {

	private static WebElement element = null;
	
	public static WebElement txtbx_AccName(WebDriver driver){
		 
        element = driver.findElement(By.id("name_i"));

        return element;

        }
	
	public static WebElement txtbx_CntryName(WebDriver driver){
		 
        Select element = new Select(driver.findElement(By.id("new_country_i")));

        element.selectByVisibleText("Albania");
		
        return null;

        }
	
	
}
