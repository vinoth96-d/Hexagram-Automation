package com.Hexagon.pom.pages;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
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
		ChromeOptions options=new ChromeOptions();
  		
  		options.addArguments("--disable-extensions");
        options.addArguments("--start-maximized");
       
        options.addArguments("force-device-scale-factor=1.4");  
  		 
  		driver = new ChromeDriver(options);
          driver.manage().window().maximize();
          
 // 	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  	    wait = new WebDriverWait(driver,30);
  	    driver.get(url);
	}
	
	private static void zoomOut(WebDriver driver) {
        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).sendKeys(Keys.SUBTRACT).keyUp(Keys.CONTROL).perform();
    }

	public static void do_login(String excelName,String Scenario) throws Exception {
		
		test.log(Status.INFO, "Enter Valid Maker Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName", excelName,Scenario);
		
		 test.log(Status.INFO, "Enter Valid Maker Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword", excelName,Scenario);
        Thread.sleep(2000);
		
   		test.log(Status.INFO, "Select Company");
   	     BasePage.click1("company");
		//BasePage.enterText("company", "Company", excelName,Scenario);

   		Thread.sleep(2000);
          BasePage.click_hexgendash("comapny_dropdown");
           Thread.sleep(4000);
        test.log(Status.INFO, "Click on Login button");

        BasePage.click_login("loginButton");
        
        Thread.sleep(10000);
        
        BasePage.click1("Info_Alert");
        Thread.sleep(1000);
        BasePage.click1("Panel_Arrow");
        Thread.sleep(2000);
	}

	
}
