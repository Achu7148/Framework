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

			Select element1 = new Select(driver.findElement(By.xpath("//select[@id='new_country_i']")));
			element1.selectByVisibleText("Albania");
			Thread.sleep(2000);
		} else 
		{
			System.out.println("object is not present");
		}
		return element;
	}
	
		
	//State text box hover
 public static WebElement txbx_State(WebDriver driver) throws InterruptedException{
	 boolean statehover = driver.findElement(By.xpath("//*[@id='new_state']/div[1]")).isEnabled();
		if (statehover == true) {
			WebElement element = driver.findElement(By.xpath("//*[@id='new_state']/div[1]"));

			Actions action = new Actions(driver);

			action.moveToElement(element).build().perform();
			action.click();

			driver.findElement(By.xpath("//*[@id='new_state']/div[1]")).click();
			Thread.sleep(1000);
			System.out.println("Step-2");			
			Thread.sleep(2000);
		} else 
		{
			System.out.println("object is not present");
		}
		return element;
        
      
 }
 
 //State text box
 public static WebElement hiddentxbx_State(WebDriver driver) throws InterruptedException{
	 
		element = driver.findElement(By.xpath("//*[@id='new_state_i']"));;
			Thread.sleep(2000);
			return element;
}
 
 
 // Zip code hover                                            
 public static WebElement txbx_Zipcode(WebDriver driver) throws InterruptedException{
	 boolean zipcodehover = driver.findElement(By.xpath("//*[@id='new_zipcode']/div")).isEnabled();
		if (zipcodehover == true) {
			WebElement element = driver.findElement(By.xpath("//*[@id='new_zipcode']/div"));

			Actions action = new Actions(driver);

			action.moveToElement(element).build().perform();
			action.click();
            driver.findElement(By.xpath("//*[@id='new_zipcode']/div")).click();
			Thread.sleep(1000);
			System.out.println("Step-2");			
			Thread.sleep(2000);
		} else 
		{
			System.out.println("object is not present");
		}
		return element;
        
      
 }
 
 //Zip code text box
 public static WebElement hiddentxbx_Zipcode(WebDriver driver) throws InterruptedException{
	 
		element = driver.findElement(By.id("new_zipcode_i"));;
		
			return element;
}
 
 

//Address text box hover                                            
public static WebElement txbx_Address(WebDriver driver) throws InterruptedException{
	 boolean addresshover = driver.findElement(By.xpath("//*[@id='new_address']/div[1]")).isEnabled();
		if (addresshover == true) {
			WebElement element = driver.findElement(By.xpath("//*[@id='new_address']/div[1]"));

			Actions action = new Actions(driver);

			action.moveToElement(element).build().perform();
			action.click();

			driver.findElement(By.xpath("//*[@id='new_address']/div[1]")).click();
			Thread.sleep(1000);
			System.out.println("Step-2");			
			Thread.sleep(2000);
		} else 
		{
			System.out.println("object is not present");
		}
		return element;
      
    
}

//Address text box
public static WebElement hiddentxbx_Address(WebDriver driver) throws InterruptedException{
	 
		element = driver.findElement(By.id("new_address_i"));;
			Thread.sleep(2000);
			return element;
}

//Territory Drop down
	public static WebElement txtbx_Territory(WebDriver driver) throws InterruptedException{
		 
		boolean TerritoryDropdown = driver.findElement(By.xpath("//*[@id='new_territory']/div[1]")).isEnabled();
		if (TerritoryDropdown == true) {
			WebElement element = driver.findElement(By.xpath("//*[@id='new_territory']/div[1]"));

			Actions action = new Actions(driver);

			action.moveToElement(element).build().perform();
			action.click();

			driver.findElement(By.xpath("//*[@id='new_territory']/div[1]")).click();
			Thread.sleep(1000);

			Select element1 = new Select(driver.findElement(By.id("new_territory_i")));
			element1.selectByVisibleText("South East");
			Thread.sleep(2000);
		} else 
		{
			System.out.println("object is not present");
		}
		return element;
	}

	
	
	//Website text box hover                                            
	public static WebElement txbx_Website(WebDriver driver) throws InterruptedException{
		 boolean websitehover = driver.findElement(By.xpath("//*[@id='websiteurl']/div[1]")).isEnabled();
			if (websitehover == true) {
				WebElement element = driver.findElement(By.xpath("//*[@id='websiteurl']/div[1]"));

				Actions action = new Actions(driver);

				action.moveToElement(element).build().perform();
				action.click();

				driver.findElement(By.xpath("//*[@id='websiteurl']/div[1]")).click();
				Thread.sleep(1000);
				System.out.println("Step-2");			
				Thread.sleep(2000);
			} else 
			{
				System.out.println("object is not present");
			}
			return element;
	      
	    
	}

	//Website text box
	public static WebElement hiddentxbx_Website(WebDriver driver) throws InterruptedException{
		 
			element = driver.findElement(By.id("websiteurl_i"));;
				Thread.sleep(2000);
				return element;
	}

	
	
	//Phone text box hover                                            
		public static WebElement txbx_Phone(WebDriver driver) throws InterruptedException{
			 boolean phonehover = driver.findElement(By.xpath("//*[@id='telephone1']/div[1]")).isEnabled();
				if (phonehover == true) {
					WebElement element = driver.findElement(By.xpath("//*[@id='telephone1']/div[1]"));

					Actions action = new Actions(driver);

					action.moveToElement(element).build().perform();
					action.click();

					driver.findElement(By.xpath("//*[@id='telephone1']/div[1]")).click();
					Thread.sleep(1000);
					System.out.println("Step-2");			
					Thread.sleep(2000);
				} else 
				{
					System.out.println("object is not present");
				}
				return element;
		      
		    
		}

		//Phone text box
		public static WebElement hiddentxbx_Phone(WebDriver driver) throws InterruptedException{
			 
				element = driver.findElement(By.id("telephone1_i"));;
					Thread.sleep(2000);
					return element;
		}
	
	
		//Account Type Drop down
				public static WebElement txtbx_acctype(WebDriver driver) throws InterruptedException{
					 
					boolean AcctypeDropdown = driver.findElement(By.xpath("//*[@id='new_accounttype']/div[1]")).isEnabled();
					if (AcctypeDropdown == true) {
						WebElement element = driver.findElement(By.xpath("//*[@id='new_accounttype']/div[1]"));

						Actions action = new Actions(driver);

						action.moveToElement(element).build().perform();
						action.click();

						driver.findElement(By.xpath("//*[@id='new_accounttype']/div[1]")).click();
						Thread.sleep(1000);

						Select element1 = new Select(driver.findElement(By.id("new_accounttype_i")));
						element1.selectByVisibleText("New");
						Thread.sleep(2000);
					} else 
					{
						System.out.println("object is not present");
					}
					return element;
				}

	
	

	//Industry Drop down
		public static WebElement txtbx_Industry(WebDriver driver) throws InterruptedException{
			 
			boolean IndustryDropdown = driver.findElement(By.xpath("//*[@id='new_industry']/div[1]")).isEnabled();
			if (IndustryDropdown == true) {
				WebElement element = driver.findElement(By.xpath("//*[@id='new_industry']/div[1]"));

				Actions action = new Actions(driver);

				action.moveToElement(element).build().perform();
				action.click();

				driver.findElement(By.xpath("//*[@id='new_industry']/div[1]")).click();
				Thread.sleep(1000);

				Select element1 = new Select(driver.findElement(By.id("new_industry_i")));
				element1.selectByVisibleText("Banking");
				Thread.sleep(2000);
			} else 
			{
				System.out.println("object is not present");
			}
			return element;
		}

		
		//Company Size Drop down
				public static WebElement txtbx_CompanySize(WebDriver driver) throws InterruptedException{
					 
					boolean CompanysizeDropdown = driver.findElement(By.xpath("//*[@id='new_companysize']/div[1]")).isEnabled();
					if (CompanysizeDropdown == true) {
						WebElement element = driver.findElement(By.xpath("//*[@id='new_companysize']/div[1]"));

						Actions action = new Actions(driver);

						action.moveToElement(element).build().perform();
						action.click();

						driver.findElement(By.xpath("//*[@id='new_companysize']/div[1]")).click();
						Thread.sleep(1000);

						Select element1 = new Select(driver.findElement(By.id("new_companysize_i")));
						element1.selectByVisibleText("500-1000");
						Thread.sleep(2000);
					} else 
					{
						System.out.println("object is not present");
					}
					return element;
				}

 
				//Revenue Range Drop down
				public static WebElement txtbx_RevenueRange(WebDriver driver) throws InterruptedException{
					 
					boolean RevenuerangeDropdown = driver.findElement(By.xpath("//*[@id='new_revenuerange']/div[1]")).isEnabled();
					if (RevenuerangeDropdown == true) {
						WebElement element = driver.findElement(By.xpath("//*[@id='new_revenuerange']/div[1]"));

						Actions action = new Actions(driver);

						action.moveToElement(element).build().perform();
						action.click();

						driver.findElement(By.xpath("//*[@id='new_revenuerange']/div[1]")).click();
						Thread.sleep(1000);

						Select element1 = new Select(driver.findElement(By.id("new_revenuerange_i")));
						element1.selectByVisibleText("50 -100 Million");
						Thread.sleep(2000);
					} else 
					{
						System.out.println("object is not present");
					}
					return element;
				}
 
				
				//Establishment year text box hover                                            
				public static WebElement txbx_EstYr(WebDriver driver) throws InterruptedException{
					 boolean estyr = driver.findElement(By.xpath("//*[@id='new_establishmentyear']/div[1]")).isEnabled();
						if (estyr == true) {
							WebElement element = driver.findElement(By.xpath("//*[@id='new_establishmentyear']/div[1]"));

							Actions action = new Actions(driver);

							action.moveToElement(element).build().perform();
							action.click();

							driver.findElement(By.xpath("//*[@id='new_establishmentyear']/div[1]")).click();
							Thread.sleep(1000);
							System.out.println("Step-2");			
							Thread.sleep(2000);
						} else 
						{
							System.out.println("object is not present");
						}
						return element;
				      
				    
				}

				//Establishment Year text box
				public static WebElement hiddentxbx_EstYr(WebDriver driver) throws InterruptedException{
					 
						element = driver.findElement(By.id("new_establishmentyear_i"));;
							Thread.sleep(2000);
							return element;
				}
				
				//Business Type Drop down
				public static WebElement txtbx_BusinessType(WebDriver driver) throws InterruptedException{
					 
					boolean BusinesstypeDropdown = driver.findElement(By.xpath("//*[@id='new_businesstype']/div[1]")).isEnabled();
					if (BusinesstypeDropdown == true) {
						WebElement element = driver.findElement(By.xpath("//*[@id='new_businesstype']/div[1]"));

						Actions action = new Actions(driver);

						action.moveToElement(element).build().perform();
						action.click();

						driver.findElement(By.xpath("//*[@id='new_businesstype']/div[1]")).click();
						Thread.sleep(1000);

						Select element1 = new Select(driver.findElement(By.id("new_businesstype_i")));
						element1.selectByVisibleText("Company");
						Thread.sleep(2000);
					} else 
					{
						System.out.println("object is not present");
					}
					return element;
				}
			
				////Number of Legal Entities Text Box hover                                           
				public static WebElement txbx_LegalEnt(WebDriver driver) throws InterruptedException{
					 boolean legent = driver.findElement(By.xpath("//*[@id='new_legalentities']/div[1]")).isEnabled();
						if (legent == true) {
							WebElement element = driver.findElement(By.xpath("//*[@id='new_legalentities']/div[1]"));

							Actions action = new Actions(driver);

							action.moveToElement(element).build().perform();
							action.click();

							driver.findElement(By.xpath("//*[@id='new_legalentities']/div[1]")).click();
							Thread.sleep(1000);
							System.out.println("Step-2");			
							Thread.sleep(2000);
						} else 
						{
							System.out.println("object is not present");
						}
						return element;
				      
				    
				}

				//Number of Legal Entities Text Box 
				public static WebElement hiddentxbx_LegalEnt(WebDriver driver) throws InterruptedException{
					 
						element = driver.findElement(By.id("new_legalentities_i"));;
							Thread.sleep(2000);
							return element;
				}
			
				//Primary account Owner
				public static WebElement txtbx_AccOwner(WebDriver driver) throws InterruptedException{
					 
					boolean Primaryaccountowner = driver.findElement(By.xpath("//*[@id='new_primaryaccountowner_i']")).isEnabled();
					if (Primaryaccountowner == true) {
						WebElement element = driver.findElement(By.xpath("//*[@id='new_primaryaccountowner_i']"));

						Actions action = new Actions(driver);

						action.moveToElement(element).build().perform();
						action.click();

						driver.findElement(By.xpath("//*[@id='new_primaryaccountowner_i']")).click();
						Thread.sleep(1000);

						Select element1 = new Select(driver.findElement(By.id("new_businesstype_i")));
						element1.selectByVisibleText("Company");
						Thread.sleep(2000);
					} else 
					{
						System.out.println("object is not present");
					}
					return element;
				}
					
					
					
				//Primary Account owner Text Box hover                                           
					public static WebElement txbx_PrimAcc(WebDriver driver) throws InterruptedException{
						 boolean PrimAcc = driver.findElement(By.xpath("//*[@id='new_primaryaccountowner']/div[1]")).isEnabled();
							if (PrimAcc == true) {
								WebElement element = driver.findElement(By.xpath("//*[@id='new_primaryaccountowner']/div[1]"));

								Actions action = new Actions(driver);

								action.moveToElement(element).build().perform();
								action.click();

								driver.findElement(By.xpath("//*[@id='new_primaryaccountowner']/div[1]")).click();
								Thread.sleep(1000);
								System.out.println("Step-2");			
								Thread.sleep(2000);
							} else 
							{
								System.out.println("object is not present");
							}
							return element;
					      
					    
					}

					//Primary Account owner Text Box 
					public static WebElement hiddentxbx_PrimAcc(WebDriver driver) throws InterruptedException{
						 
							element = driver.findElement(By.id("new_primaryaccountowner_ledit"));;
								Thread.sleep(2000);
								return element;
					
					
				
}
}


