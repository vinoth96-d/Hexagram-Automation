package com.Hexagon.base;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.Hexagon.pom.pages.LoginPage;
import com.Hexagon.pom.testcases.CorporateAction_Dividend;
import com.Hexagon.pom.util.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Test;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.relevantcodes.extentreports.DisplayOrder;

public class BaseProjectMethods {

	//DRIVER INIT	
	public static WebDriver driver;
	public String fileName;
	
	//FOR REPORTING
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testName,testDesc,testAuthor,testCat;
	public static WebDriverWait wait;
	
		
	
	    public static Test startExtent;
	//TO LAUNCH THE BROWSER FOR ANY COUNCIL URL
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
	    options.addArguments("force-device-scale-factor=0.75");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    wait = new WebDriverWait(driver,30);
	    driver.get(url);
	}
	
	public static void Launch_application(String url) throws Exception {
		
		 test.log(Status.INFO, "Enter URL");
		
		String portalUrl = BasePage.readURLTestDataProp(url);
		LoginPage.launchBrowser(portalUrl);
		
		
	      
	        Thread.sleep(1800);
	        String URL = driver.getCurrentUrl();
	        test.log(Status.PASS, "URL opened succesfully=" + URL);
	        driver.manage().deleteAllCookies();
		BasePage.click1("advanced");
		BasePage.click1("proceed");
		
		
	}
	
	
	public static void refreshPage()
	{
		driver.navigate().refresh();
	}
	
		
	//TO READ TEST DATA
	/*public static  String[][] readTestData(String fName) throws IOException
	{
		XSSFWorkbook xl=new XSSFWorkbook(fName);
		int k=xl.getSheet("Sheet1").getLastRowNum()+1;
		int l=xl.getSheet("Sheet1").getRow(0).getLastCellNum();
	    String[][] data=new String[k][l];
						
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<l;j++)
			{
				data[i][j]=xl.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
							
			}
		}
		
		xl.close();
		return data;
	}*/
	
	//EXTENT REPORT PURPOSE
	@BeforeSuite
	public void prepareReport()
	{	
		String fileName = BasePage.readURLTestDataProp("ReportName");
		//String fileName = BasePage.readTestData1("ReportName", excelName)
		Date d = new Date();
		String ExtentfileName = fileName +"_"+d.toString().replace(":", "_").replace(" ", "_") + ".html";
		//String ExtentfileName = fileName + ".html";
		//reporter=new ExtentHtmlReporter("./extentreports/results.html");
		reporter=new ExtentHtmlReporter("./extentreports/"+ExtentfileName);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		reporter.config().setDocumentTitle("Council QA Automation Report");
		reporter.config().setTheme(Theme.STANDARD);
	}
		
	//Stop Reporting
	//@AfterSuite(alwaysRun = true)
	@AfterSuite
	public void stopReport()
	{
		extent.flush();
		
	}
	
	@AfterClass
	public void closeBrowserWindows()
	{
		driver.quit();
	}
	
	//write report
	@AfterMethod
	public void tearDown(ITestResult res) 
	{
		
		if(res.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,"Test Case Failed : " + res.getName());
			//test.log(Status.FAIL, "Failure Reason:"+ res.getThrowable());
			
		}
		else if(res.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "Test Case Passed: " + res.getName());
		} 
		else if(res.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "Test Case Skipped: "+res.getName());
		}
				
	}
}

