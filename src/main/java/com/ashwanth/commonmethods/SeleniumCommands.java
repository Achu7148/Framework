package com.ashwanth.commonmethods;

import org.openqa.selenium.WebDriver;

public static WebDriver OpenApp(String BrowserName, String url){
fn_LaunchBrowser(BrowserName);
fn_OpenURL(url);
return driver;
}
public static void fn_OpenURL(String url){
driver.get(url);
driver.manage().window().maximize();
}
 
public static WebDriver fn_LaunchBrowser(String browsername){
if(browsername=="CH"){
System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
driver= new ChromeDriver();
}else if(browsername=="FF"){
driver= new FirefoxDriver();
}else if(browsername=="IE"){
System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
driver= new InternetExplorerDriver();
}
driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
return driver;
}