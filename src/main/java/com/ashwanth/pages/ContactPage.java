package com.ashwanth.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

public class ContactPage {

	private static WebElement element = null;
	
	//Account Name Text Box
	public static WebElement txbx_AccName(WebDriver driver){
		 
        element = driver.findElement(By.id("name_i"));

        return element;

        }
	
	//Country Name Drop down
	public static WebElement txtbx_CntryName(WebDriver driver) throws InterruptedException{
		 
		boolean countryDropdown = driver.findElement(By.xpath("//*[@id='Country_label']")).isEnabled();
		if (countryDropdown == true) {
			WebElement element = driver.findElement(By.xpath("//*[@id='Country_label']"));

			Actions action = new Actions(driver);

			action.moveToElement(element).build().perform();
			action.click();

			driver.findElement(By.xpath("//*[@id='Country_label']")).click();
			Thread.sleep(1000);
			System.out.println("Step-1");

			// Actions action = new Actions(driver);
			// WebElement element =
			// driver.findElement(By.xpath("//select[@id='new_country_i']"));
			// action.doubleClick(element).perform();

			Select element1 = new Select(driver.findElement(By.xpath("//select[@id='new_country_i']")));
			element1.selectByVisibleText("Albania");
			Thread.sleep(2000);
		} else 
		{
			System.out.println("object is not present");
		}
		return element;
	}
	
 public static WebElement txbx_State(WebDriver driver){
		 
        element = driver.findElement(By.id("new_state_i"));

        return element;

        }
}
