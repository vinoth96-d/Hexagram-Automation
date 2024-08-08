package com.Hexagon.pom.pages;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Hexagon.base.BasePage;
import com.Hexagon.base.BaseProjectMethods;
import com.aventstack.extentreports.Status;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPage extends BasePage {
	
	public static String text;

	
	public static void  launchBrowser(String url)
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		HashMap<String, Object> chromePref=new HashMap<String, Object>();
		chromePref.put("profile.default_content_settings.popups",0);
		chromePref.put("download.default_directory","./testdata");
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", chromePref);
		options.addArguments("--disable-notifications");  
		 DesiredCapabilities cap = DesiredCapabilities.chrome();  
		 cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);  
		 cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String zoomJS;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        zoomJS = "document.body.style.zoom='0.8'";  
        js.executeScript(zoomJS);
	   // options.addArguments("force-device-scale-factor=0.5");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    wait = new WebDriverWait(driver,30);
	    driver.get(url);
	}
	
	public static void  launchBrowser1(String url) throws Exception
	{
             
              
              
              System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      		
      		ChromeOptions options=new ChromeOptions();
      		
      		options.addArguments("--disable-extensions");
            options.addArguments("--start-maximized");
           
            options.addArguments("force-device-scale-factor=1");  
      		 
      		driver = new ChromeDriver(options);
              driver.manage().window().maximize();
              
      	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      	    wait = new WebDriverWait(driver,30);
      	    driver.get(url);
      	   
          
	}
	public static void  launchBrowser2(String url)
	{
             
              
              
              System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      		
      		ChromeOptions options=new ChromeOptions();
      		options.addArguments("incognito");
      		options.addArguments("--disable-extensions");
            options.addArguments("--start-maximized");
           
            options.addArguments("force-device-scale-factor=1.4");  
      		 
      		driver = new ChromeDriver(options);
              driver.manage().window().maximize();
              
      	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      	    wait = new WebDriverWait(driver,30);
      	    driver.get(url);
          
	}
	

	public static void do_login(String excelName,String Scenario) throws Exception {
		
		BasePage.passfailscreenshots();
		test.log(Status.INFO, "Enter Valid Maker Username");
		BasePage.enterText("LoginUserForm_user_name", "MakerUserName", excelName,Scenario);
		
		 test.log(Status.INFO, "Enter Valid Maker Password");
		BasePage.enterText("LoginUserForm_password", "MakerPassword", excelName,Scenario);
		
		Thread.sleep(1000);
		
	   		test.log(Status.INFO, "Select Company");
	   	 BasePage.click1("company");
	   	 Thread.sleep(3000);
	           BasePage.click_hexgendash("comapny_dropdown");
	           Thread.sleep(2000);
	           
	           test.log(Status.INFO, "Click on Login button");
	         //  text="Login";
	          BasePage.click_hexgendash("loginButton");
	          Thread.sleep(1000);
   /*    try {
    	   BasePage.click1("company");
   		test.log(Status.INFO, "Select Company");
           BasePage.select("comapny_dropdown");
           Thread.sleep(2000);
           
           test.log(Status.INFO, "Click on Login button");
         //  text="Login";
          BasePage.click_login("loginButton");
    	}
    	catch(org.openqa.selenium.StaleElementReferenceException ex)
    	{
    		 test.log(Status.INFO, "Click on Login button");
             //  text="Login";
              BasePage.click_login("loginButton");
    	}*/

	}
public static void dologin_confirmation(String excelName,String Scenario) throws Exception {
		
	test.log(Status.INFO, "Enter Valid Checker Username");
	BasePage.enterText("LoginUserForm_user_name", "CheckerUserName", excelName, Scenario);

 
    test.log(Status.INFO, "Enter Valid Checker Password");
    BasePage.enterText("LoginUserForm_password", "CheckerPassword", excelName, Scenario);
    
    test.log(Status.INFO, "Select Company");
  	 BasePage.click1("company");
  		Thread.sleep(3000);
          BasePage.click_hexgendash("comapny_dropdown");
          Thread.sleep(2000);
          
          test.log(Status.INFO, "Click on Login button");
        //  text="Login";
         BasePage.click_hexgendash("loginButton");
         Thread.sleep(1000);
    
   
    

	}

public static void Reset(String excelName,String Scenario) throws Exception {
	

	BasePage.enterText1("LoginUserForm_user_name", "MakerUserName", excelName,Scenario);
	

	BasePage.enterText1("LoginUserForm_password", "MakerPassword", excelName,Scenario);
	
	Thread.sleep(1000);
	
 
   	 BasePage.click1("company");
   		Thread.sleep(3000);
           BasePage.click1("comapny_dropdown");
           Thread.sleep(2000);
           
 
         //  text="Login";
          BasePage.click1("loginButton");
          Thread.sleep(1000);
	
          if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
  		{
  		BasePage.click1("critical_alerts_close");
  		}
          Thread.sleep(2000);
          BasePage.click1("admin"); 
          BasePage.click1("configurations"); 
          BasePage.click1("reset"); 
          BasePage.enterText1("resetPortfolio", "Portfolio", excelName,Scenario);
          
          BasePage.click1("resetportfolio");
          BasePage.enterText1("resetDate", "Reset", excelName,Scenario);
          BasePage.click1("resetSubmit"); 
          
          BasePage.scrollintoview("resetOK");
 		 BasePage.click1("resetOK");
 		 
 		 BasePage.click1("resetapprove");
 		 
 		 BasePage.AssertText("InfoAlert");
  		String s= BasePage.Asserttext;
  		int i = Integer.parseInt(s);
  		i=i+1;
  		int j=i+1;int k=j+1;
  		if(BasePage.checkelementpresent3("//*[text()='"+i+"']")||BasePage.checkelementpresent3("//*[text()='"+j+"']")||BasePage.checkelementpresent("//*[text()='"+k+"']")) {};
  	
 	
 		 BasePage.click1("hexgen_user");
 		 Thread.sleep(2000);
 		 
 
 		 BasePage.click1("hexgen_logout");
 		 Thread.sleep(2000);

	}
public static void Checker_Tab() throws Exception {
	
	String a = "window.open('https://52.172.235.137:6447/login.jsp','_blank');";
	((JavascriptExecutor)driver).executeScript(a);
	
	
	
	
	
}
    

	

	
}
