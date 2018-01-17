package Ashwanth.Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class chromebrowserlaunch {
	 public static void main(String[] args) throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe"); //Setting up chrome driver
		 
	      WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://sensiple-dev.crm.dynamics.com/");//Launch Chrome Browser
		 
		 driver.manage().window().maximize();//Maximize the window
		 
		 //Enter Username, Password and login
		 driver.findElement(By.id("i0116")).sendKeys("bde1@sensiple4.onmicrosoft.com");
		 
		 driver.findElement(By.id("idSIButton9")).click();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	     driver.findElement(By.id("i0118")).sendKeys("Sensiple@2017");
	     
	     driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	     
		 driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		 
	     driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
 
		 driver.findElement(By.id("idBtn_Back")).click();
		  
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		 driver.quit();
		 
	 }
}