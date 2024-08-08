package com.Hexagon.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Hexagon.base.BasePage;
import com.aventstack.extentreports.Status;

public class BulkDepositMaturityPage extends BasePage{

	public static String ExcelFileName = BasePage.readURLTestDataProp("MoneyMarket_TestData");

public static void BulkDepositMaturity(String excelName,String Scenario,String data,String Currency) throws Exception {
		
	if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
	{
	
	BasePage.click1("critical_alerts_close");
	}
    	
    	//test.log(Status.INFO, "Creating Manual Portfolio Subred for future date with Settlement Date(T+1)");
    	
	if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
	{
		 WebElement ele = driver.findElement(By.xpath(readobjectRepo("sub_assert")));
          ele.click();
          System.out.println("Noty text clicked");
	}
    	test.log(Status.INFO, "Click on Transactions");
    	BasePage.click_hexgendash("transactions");
    	Thread.sleep(1000);
    	
    	if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
		{
    		 WebElement ele = driver.findElement(By.xpath(readobjectRepo("sub_assert")));
	            ele.click();
	            System.out.println("Noty text clicked");
		}
    	test.log(Status.INFO, "Click on Investment");
    	BasePage.click_hexgendash("investment");
    	Thread.sleep(1000);
 
    	test.log(Status.INFO, "Click on Bulk Deposit Maturity");
        BasePage.click_hexgendash("BulkDepositMaturity");
       Thread.sleep(1000);
       
       test.log(Status.INFO, "Enter and Select Asset Class");
        BasePage.enterText("Bulk_assetclass","Asset Class",excelName,Scenario);
        if(BasePage.checkelementpresent1(readobjectRepo("Bulk_Assetclass"))==false) {
        	BasePage.click1("Bulk_clear");
        	Thread.sleep(1000);
        	 BasePage.enterText1("Bulk_assetclass","Asset Class",excelName,Scenario);
        	 if(BasePage.checkelementpresent1(readobjectRepo("Bulk_Assetclass"))==false) {
             	BasePage.click1("Bulk_clear");
             	Thread.sleep(1000);
             	 BasePage.enterText1("Bulk_assetclass","Asset Class",excelName,Scenario);}
        }
        BasePage.click_hexgendash("Bulk_Assetclass");
       Thread.sleep(1000);
       
       if(Currency.equals("MultiCurrency")) {
           test.log(Status.INFO, "Enter Currency");
           BasePage.click1("Bulk_currency");
           BasePage.click_hexgendash("Bulk_Currency");
          Thread.sleep(1000);}
       
       test.log(Status.INFO, "Enter and Select Portfolio");
   	BasePage.enterText("Bulk_portfolio", "Portfolio",excelName, Scenario);
   	BasePage.click_hexgendash("Bulk_Portfolio");
       
       test.log(Status.INFO, "Enter Transaction Date");
   	BasePage.enterText("Bulk_Transdate", "Maturity Date", excelName, Scenario);
   	
   	test.log(Status.INFO, "Click on Retrieve");
	BasePage.click_hexgendash("Bulk_retrieve");
	Thread.sleep(1000);
	
	test.log(Status.INFO, "Click on Checkbox");
	BasePage.scrollintoview("Bulk_ckeckbox");
	BasePage.click_hexgendash("Bulk_ckeckbox");
	
	test.log(Status.INFO, "Click on Interest Received Tcy");
	BasePage.click_hexgendash("Bulk_interestReceivedTCY");
	
	if(data.equals("INT")) {
		
		test.log(Status.INFO, "Enter Interest Received Tcy");
		BasePage.clearWebField("Bulk_interestreceived");
		BasePage.enterText("Bulk_interestreceived", "Interest Received Tcy", excelName, Scenario);
		Thread.sleep(2000);
	}
	
	test.log(Status.INFO, "Enter and Select Rollover Type");
	
	BasePage.click1("Bulk_rolloverNA");
	BasePage.scrollintoview("Bulk_rollover_NA");
	BasePage.click1("Bulk_rollover_NA");
	BasePage.scrollintoview("Bulk_interestReceivedTCY");
	BasePage.enterText("Bulk_rollovertype", "PRLESS", excelName, Scenario);
	BasePage.click_hexgendash("Bulk_RolloverType");
	
	test.log(Status.INFO, "Enter Amount Adjust Tcy");
	BasePage.clearWebField("Bulk_adjustamount");
	BasePage.enterText("Bulk_adjustamount", "Amount Adjust Tcy", excelName, Scenario);
	
	BasePage.click1("Bulk_rolloveramount");
	
	 BasePage.AssertExcel_ByreadingTextbox("Bulk_rolloveramount", "Rollover Amount", excelName, Scenario,"Rollover Amount"); 
	
	 test.log(Status.INFO, "Enter New Coupon Rate");
		BasePage.clearWebField("Bulk_newcouponrate");
		Thread.sleep(2000);
		BasePage.enterText("Bulk_newcouponrate", "New Coupon Rate", excelName, Scenario);
		
		 test.log(Status.INFO, "Enter Maturity Date");
		 BasePage.enterText("Bulk_maturitydate", "Maturity Date 1", excelName, Scenario);
		 Thread.sleep(2000);
	
   
	}

public static void BulkDeposit_EarlyMaturity(String excelName,String Scenario,String data,String Currency) throws Exception {
	
	Thread.sleep(15000);
    	
    	//test.log(Status.INFO, "Creating Manual Portfolio Subred for future date with Settlement Date(T+1)");
    	
	if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
	{
		 WebElement ele = driver.findElement(By.xpath(readobjectRepo("sub_assert")));
          ele.click();
          System.out.println("Noty text clicked");
	}
    	test.log(Status.INFO, "Click on Transactions");
    	BasePage.click_hexgendash("transactions");
    	Thread.sleep(1000);
    	
    	if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
		{
    		 WebElement ele = driver.findElement(By.xpath(readobjectRepo("sub_assert")));
	            ele.click();
	            System.out.println("Noty text clicked");
		}
    	test.log(Status.INFO, "Click on Investment");
    	BasePage.click_hexgendash("investment");
    	Thread.sleep(1000);
 
    	test.log(Status.INFO, "Click on Bulk Deposit Maturity");
        BasePage.click_hexgendash("BulkDepositMaturity");
       Thread.sleep(1000);
       
       test.log(Status.INFO, "Enter and Select Asset Class");
        BasePage.enterText("Bulk_assetclass","Asset Class",excelName,Scenario);
        if(BasePage.checkelementpresent1(readobjectRepo("Bulk_Assetclass"))==false) {
        	BasePage.click1("Bulk_clear");
        	Thread.sleep(1000);
        	 BasePage.enterText1("Bulk_assetclass","Asset Class",excelName,Scenario);
        	 if(BasePage.checkelementpresent1(readobjectRepo("Bulk_Assetclass"))==false) {
             	BasePage.click1("Bulk_clear");
             	Thread.sleep(1000);
             	 BasePage.enterText1("Bulk_assetclass","Asset Class",excelName,Scenario);}
        }
        BasePage.click_hexgendash("Bulk_Assetclass");
       Thread.sleep(1000);
       
       if(Currency.equals("MultiCurrency")) {
           test.log(Status.INFO, "Enter Currency");
           BasePage.click1("Bulk_currency");
           BasePage.click_hexgendash("Bulk_Currency");
          Thread.sleep(1000);}
       
       test.log(Status.INFO, "Enter and Select Portfolio");
   	BasePage.enterText("Bulk_portfolio", "Portfolio",excelName, Scenario);
   	BasePage.click_hexgendash("Bulk_Portfolio");
       
       test.log(Status.INFO, "Enter Transaction Date");
   	BasePage.enterText("Bulk_Transdate", "On Maturity/Early Maturity", excelName, Scenario);
   	
   	test.log(Status.INFO, "Click on Retrieve");
	BasePage.click_hexgendash("Bulk_retrieve");
	Thread.sleep(1000);
	
	test.log(Status.INFO, "Click on Checkbox");
	BasePage.scrollintoview("Bulk_ckeckbox");
	BasePage.click_hexgendash("Bulk_ckeckbox");
	
	test.log(Status.INFO, "Click on Interest Received Tcy");
	BasePage.click_hexgendash("Bulk_interestReceivedTCY");
	
	if(data.equals("INT")) {
		
		test.log(Status.INFO, "Enter Interest Received Tcy");
		BasePage.clearWebField("Bulk_interestreceived");
		BasePage.enterText("Bulk_interestreceived", "Interest Received Tcy", excelName, Scenario);
		Thread.sleep(2000);
	}
	
	test.log(Status.INFO, "Enter and Select Rollover Type");
	
	BasePage.click1("Bulk_rolloverNA");
	BasePage.scrollintoview("Bulk_rollover_NA");
	BasePage.click1("Bulk_rollover_NA");
	BasePage.scrollintoview("Bulk_interestReceivedTCY");
	BasePage.enterText("Bulk_rollovertype", "PRLESS", excelName, Scenario);
	BasePage.click_hexgendash("Bulk_RolloverType");
	
	test.log(Status.INFO, "Enter Amount Adjust Tcy");
	BasePage.clearWebField("Bulk_adjustamount");
	BasePage.enterText("Bulk_adjustamount", "Amount Adjust Tcy", excelName, Scenario);
	
	BasePage.click1("Bulk_rolloveramount");
	
	 BasePage.AssertExcel_ByreadingTextbox("Bulk_rolloveramount", "Rollover Amount", excelName, Scenario,"Rollover Amount"); 
	
	 test.log(Status.INFO, "Enter New Coupon Rate");
		BasePage.clearWebField("Bulk_newcouponrate");
		Thread.sleep(2000);
		BasePage.enterText("Bulk_newcouponrate", "New Coupon Rate", excelName, Scenario);
		
		 test.log(Status.INFO, "Enter Maturity Date");
		 BasePage.enterText("Bulk_maturitydate", "Maturity Date 1", excelName, Scenario);
		 Thread.sleep(2000);
	
   
	}
public static void BulkDepositMaturity_Fullwithdrawal(String excelName,String Scenario,String data,String Currency) throws Exception {
	
	if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
	{
	
	BasePage.click1("critical_alerts_close");
	}
    	
    	//test.log(Status.INFO, "Creating Manual Portfolio Subred for future date with Settlement Date(T+1)");
    	
	if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
	{
		 WebElement ele = driver.findElement(By.xpath(readobjectRepo("sub_assert")));
          ele.click();
          System.out.println("Noty text clicked");
          
	}
    	test.log(Status.INFO, "Click on Transactions");
    	BasePage.click_hexgendash("transactions");
    	Thread.sleep(1000);
    	
    	if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
		{
    		 WebElement ele = driver.findElement(By.xpath(readobjectRepo("sub_assert")));
	            ele.click();
	            System.out.println("Noty text clicked");
		}
    	test.log(Status.INFO, "Click on Investment");
    	BasePage.click_hexgendash("investment");
    	Thread.sleep(1000);
 
    	test.log(Status.INFO, "Click on Bulk Deposit Maturity");
        BasePage.click_hexgendash("BulkDepositMaturity");
       Thread.sleep(1000);
       
       test.log(Status.INFO, "Enter and Select Asset Class");
        BasePage.enterText("Bulk_assetclass","Asset Class",excelName,Scenario);
        if(BasePage.checkelementpresent1(readobjectRepo("Bulk_Assetclass"))==false) {
        	BasePage.click1("Bulk_clear");
        	Thread.sleep(1000);
        	 BasePage.enterText1("Bulk_assetclass","Asset Class",excelName,Scenario);
        	 if(BasePage.checkelementpresent1(readobjectRepo("Bulk_Assetclass"))==false) {
             	BasePage.click1("Bulk_clear");
             	Thread.sleep(1000);
             	 BasePage.enterText1("Bulk_assetclass","Asset Class",excelName,Scenario);}
        }
        BasePage.click_hexgendash("Bulk_Assetclass");
       Thread.sleep(1000);
       
       if(Currency.equals("MultiCurrency")) {
       test.log(Status.INFO, "Enter Currency");
       BasePage.click1("Bulk_currency");
       BasePage.click_hexgendash("Bulk_Currency");
      Thread.sleep(1000);}
       
       test.log(Status.INFO, "Enter and Select Portfolio");
   	BasePage.enterText("Bulk_portfolio", "Portfolio",excelName, Scenario);
   	BasePage.click_hexgendash("Bulk_Portfolio");
       
       test.log(Status.INFO, "Enter Transaction Date");
   	BasePage.enterText("Bulk_Transdate", "Maturity Date", excelName, Scenario);
   	
   	test.log(Status.INFO, "Click on Retrieve");
	BasePage.click_hexgendash("Bulk_retrieve");
	Thread.sleep(1000);
	
	test.log(Status.INFO, "Click on Checkbox");
	BasePage.scrollintoview("Bulk_ckeckbox");
	BasePage.click_hexgendash("Bulk_ckeckbox");
	
	test.log(Status.INFO, "Click on Interest Received Tcy");
	BasePage.click_hexgendash("Bulk_interestReceivedTCY");
	
	if(data.equals("INT")) {
		
		test.log(Status.INFO, "Enter Interest Received Tcy");
		BasePage.clearWebField("Bulk_interestreceived");
		BasePage.enterText("Bulk_interestreceived", "Interest Received Tcy", excelName, Scenario);
		Thread.sleep(2000);
	}
	
   
	}

public static void BulkDeposit_EarlyMaturity_Fullwithdrawal(String excelName,String Scenario,String data,String Currency) throws Exception {
	
	Thread.sleep(15000);
    	
    	//test.log(Status.INFO, "Creating Manual Portfolio Subred for future date with Settlement Date(T+1)");
    	
	if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
	{Thread.sleep(1000);
	BasePage.click1("pending");
	Thread.sleep(2000);
	}
    	test.log(Status.INFO, "Click on Transactions");
    	BasePage.click_hexgendash("transactions");
    	Thread.sleep(1000);
    	
    	if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
		{Thread.sleep(1000);
		BasePage.click1("pending");
		Thread.sleep(2000);
		}
    	test.log(Status.INFO, "Click on Investment");
    	BasePage.click_hexgendash("investment");
    	Thread.sleep(1000);
 
    	test.log(Status.INFO, "Click on Bulk Deposit Maturity");
        BasePage.click_hexgendash("BulkDepositMaturity");
       Thread.sleep(1000);
       
       test.log(Status.INFO, "Enter and Select Asset Class");
        BasePage.enterText("Bulk_assetclass","Asset Class",excelName,Scenario);
        if(BasePage.checkelementpresent1(readobjectRepo("Bulk_Assetclass"))==false) {
        	BasePage.click1("Bulk_clear");
        	Thread.sleep(1000);
        	 BasePage.enterText1("Bulk_assetclass","Asset Class",excelName,Scenario);
        	 if(BasePage.checkelementpresent1(readobjectRepo("Bulk_Assetclass"))==false) {
             	BasePage.click1("Bulk_clear");
             	Thread.sleep(1000);
             	 BasePage.enterText1("Bulk_assetclass","Asset Class",excelName,Scenario);}
        }
        BasePage.click_hexgendash("Bulk_Assetclass");
       Thread.sleep(1000);
       
       if(Currency.equals("MultiCurrency")) {
       test.log(Status.INFO, "Enter Currency");
       BasePage.click1("Bulk_currency");
       BasePage.click_hexgendash("Bulk_Currency");
      Thread.sleep(1000);}
       
       test.log(Status.INFO, "Enter and Select Portfolio");
   	BasePage.enterText("Bulk_portfolio", "Portfolio",excelName, Scenario);
   	BasePage.click_hexgendash("Bulk_Portfolio");
       
       test.log(Status.INFO, "Enter Transaction Date");
   	BasePage.enterText("Bulk_Transdate", "On Maturity/Early Maturity", excelName, Scenario);
   	
   	test.log(Status.INFO, "Click on Retrieve");
	BasePage.click_hexgendash("Bulk_retrieve");
	Thread.sleep(1000);
	
	test.log(Status.INFO, "Click on Checkbox");
	BasePage.scrollintoview("Bulk_ckeckbox");
	BasePage.click_hexgendash("Bulk_ckeckbox");
	
	test.log(Status.INFO, "Click on Interest Received Tcy");
	BasePage.click_hexgendash("Bulk_interestReceivedTCY");
	
	if(data.equals("INT")) {
		
		test.log(Status.INFO, "Enter Interest Received Tcy");
		BasePage.clearWebField("Bulk_interestreceived");
		BasePage.enterText("Bulk_interestreceived", "Interest Received Tcy", excelName, Scenario);
		Thread.sleep(2000);
	}
	
   
	}

public static void bulkmaturity_submit(String excelName,String Scenario) throws Exception {
	 
	Thread.sleep(5000);
	//BasePage.scrollintoview("submit");
	test.log(Status.INFO, "Click on Submit");
 BasePage.click_hexgendash("Bulk_submit");
 
 /*if(BasePage.checkelementpresent1(readobjectRepo("Depo_assert"))==true)
	{
	 BasePage.AssertExcel2("Depo_assert", "Depo Validation", excelName, Scenario,"Validation");     
}*/
 
 
	 if(BasePage.checkelementpresent1(readobjectRepo("Depo_Override"))==true)
		{
		 
		 test.log(Status.INFO, "Click on Override Approve icon");
		 BasePage.scrollintoview("Depo_Override");
		 BasePage.click_hexgendash("Depo_Override");
		 
		 test.log(Status.INFO, "Click on Remarks Approve icon");
		 BasePage.click_hexgendash("Depo_remarkstick");}
		 
		// test.log(Status.INFO, "Verifying Portfolio Subscription Form Submission Validation");
		// BasePage.AssertExcel2("sub_assert", "Submit", excelName, Scenario,"Validation");
		//	Thread.sleep(1000);
		 if(BasePage.checkelementpresent1(readobjectRepo("Depo_assert"))==true)
			{
			 BasePage.AssertExcel2("Depo_assert", "Depo Validation", excelName, Scenario,"Validation");         
	         
		}
		
	 
	 
 
 BasePage.horizontalRight();
	
	
 
 test.log(Status.INFO, "Click on Hexgen User");
 BasePage.click_hexgendash("hexgen_user");
 Thread.sleep(2000);
 
 
 test.log(Status.INFO, "Click on Logout");
 BasePage.click_hexgendash("hexgen_logout");
 Thread.sleep(2000);
 
 
}
	
public static void verifying_InterestReceived(String excelName,String Scenario) throws Exception {
	int loop=0;
	int entry=0;
	try {

    for(int i=1;i<10;i++)
    {
    	 loop=i;
    	String xpath="//*[@id=\"bulkdepomaturity\"]/div/div[2]/div/div[2]/div/div/div[2]/div/div/table/tbody["+i+"]/tr[1]/td[7]/span";
    	if(entry==0) {
    	if(checkelementpresent1(xpath)==true) 
    	{
    	WebElement ele0 = driver.findElement(By.xpath(xpath));
		 String t1 = ele0.getText();
		 System.out.println(t1);
		 String T1= readTestData("Interest Received Tcy", excelName,Scenario);
		if(t1.equals(T1))
    	{
			 try {
				 System.out.println("Entered Loop");
				 entry=1;
		        	//waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
				 Thread.sleep(5000);
		            WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[6]/div/div[40]/div/div[2]/div/div[2]/div/div/div[2]/div/div/table/tbody["+i+"]/tr[1]/td[1]/input"));
		        	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		        	Thread.sleep(3000); 
		        } catch (Exception e) {
		            e.printStackTrace();
		            reportFailure("Error to Scroll the Page");
		        }
			 try {
				 
				 
				 WebElement ele4 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[6]/div/div[40]/div/div[2]/div/div[2]/div/div/div[2]/div/div/table/tbody["+i+"]/tr[1]/td[1]/input"));
				 ele4.click();
				 Thread.sleep(3000);
				  } catch (AssertionError e) {
						
					  e.printStackTrace();
			            reportFailure("Click on element is unsuccessful");
				
			    	}	
			
		
			
					 }
		 
		    
		}
    	
   
    }}
    }catch (Exception e) {
			
			test.log(Status.FAIL,"Error in identifying Deposit Placement");
			e.printStackTrace();
			//reportFailure("Assertion Failed");
			takeScreenShot();
		} catch (AssertionError e) {
			
			//test.log(Status.FAIL,"Expected: " + expected + " <-----> Actual: " + actual);
			test.log(Status.FAIL,"Error in identifying Deposit Placement");
			e.printStackTrace();
			//reportFailure("Assertion Failed");
			takeScreenShot();
	
    	}
		
		
    }



public static void Bulkmaturity_Confirmation(String excelName,String Scenario,String ID) throws Exception {
	
	
	
    Thread.sleep(10000);
    
    if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
	{
    	BasePage.click_hexgendash("critical_alerts_close");
	}
    
    if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
	{Thread.sleep(1000);
	BasePage.click1("pending");
	Thread.sleep(2000);
	}
    test.log(Status.INFO, "Click on Transactions");
	BasePage.click_hexgendash("transactions");
	Thread.sleep(1000);
	
	if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
	{Thread.sleep(1000);
	BasePage.click1("pending");
	Thread.sleep(2000);
	}
    test.log(Status.INFO, "Click on Confirmation");
	BasePage.click_hexgendash("Depo_confirmation");
	Thread.sleep(1000);
	
	test.log(Status.INFO, "Click on Transaction Confirmation");
	BasePage.click_hexgendash("Depo_transConfirmaton");
	Thread.sleep(1000);
	
	 test.log(Status.INFO, "Reading Transaction ID");
   //  BasePage.AssertText("TransId_title");
     BasePage.Reading_id("Depo_Transid",ID);
     System.out.println(BasePage.Transid);
	
     if(BasePage.checkelementpresent1(readobjectRepo("Depo_confirmbox1"))==true)
		{
		 test.log(Status.INFO, "Click on Checkbox");
		 BasePage.click_hexgendash("Depo_confirmbox1");
		 	Thread.sleep(1000);
		 	
		 	if(BasePage.checkelementpresent1(readobjectRepo("Depo_confirmbox2"))==true)
			{
		
			 BasePage.click_hexgendash("Depo_confirmbox2");
			 	Thread.sleep(1000);
			 	
			 	if(BasePage.checkelementpresent1(readobjectRepo("Depo_confirmbox3"))==true)
				{
				
				 BasePage.click_hexgendash("Depo_confirmbox3");
				 	Thread.sleep(1000);
		 	
		}}}
 	
 //	 test.log(Status.INFO, "Enter Remarks");
 //	BasePage.enterText("approve_remarks", "remarks",excelName, Scenario);
 // 	Thread.sleep(1000);
  	        	
  	
  	 test.log(Status.INFO, "Click on Submit");
  	// text="Checkbox";
   	BasePage.click_hexgendash("Depo_confirmsubmit");
   	Thread.sleep(1000);
   	
    if(BasePage.checkelementpresent1(readobjectRepo("Depo_assert"))==true)
	{
    	 BasePage.AssertExcel2("Depo_assert", "Depo Validation 1", excelName, Scenario,"Validation"); 
}

    test.log(Status.INFO, "Click on Hexgen User");
    //text="Hexgen User";
    BasePage.click_hexgendash("hexgen_user");
    Thread.sleep(2000);
    
    
    test.log(Status.INFO, "Click on Logout");
    BasePage.click_hexgendash("hexgen_logout");
    Thread.sleep(2000);
 	
}

public static void depoPlacement_submit(String excelName,String Scenario) throws Exception {
	 
	//BasePage.scrollintoview("submit");
	test.log(Status.INFO, "Click on Submit");
 BasePage.click_hexgendash("Depo_submit");
 
 if(BasePage.checkelementpresent1(readobjectRepo("Depo_assert"))==true)
	{
   BasePage.AssertText("Depo_assert");
   test.log(Status.INFO,"Validation :"+ BasePage.Asserttext);
}
 
 

 else 
	
	 if(BasePage.checkelementpresent1(readobjectRepo("Depo_Override"))==true)
		{
		 
		 test.log(Status.INFO, "Click on Override Approve icon");
		 BasePage.scrollintoview("Depo_Override");
		 BasePage.click_hexgendash("Depo_Override");
		 
		 test.log(Status.INFO, "Click on Remarks Approve icon");
		 BasePage.click_hexgendash("Depo_remarkstick");
		 
		// test.log(Status.INFO, "Verifying Portfolio Subscription Form Submission Validation");
		// BasePage.AssertExcel2("sub_assert", "Submit", excelName, Scenario,"Validation");
		//	Thread.sleep(1000);
		 if(BasePage.checkelementpresent1(readobjectRepo("Depo_assert"))==true)
			{
			 BasePage.AssertExcel2("Depo_assert", "Depo Validation", excelName, Scenario,"Validation");         
	         
		}
		}
 
 BasePage.horizontalRight();
	
	
 
 test.log(Status.INFO, "Click on Hexgen User");
 BasePage.click_hexgendash("hexgen_user");
 Thread.sleep(2000);
 
 
 test.log(Status.INFO, "Click on Logout");
 BasePage.click_hexgendash("hexgen_logout");
 Thread.sleep(2000);
 
 
}


public static void depositPlacement_Confirmation(String excelName,String Scenario,String ID) throws Exception {
	
	
	
    Thread.sleep(10000);
    
    if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
	{
    	BasePage.click_hexgendash("critical_alerts_close");
	}
    
    if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
	{Thread.sleep(1000);
	BasePage.click1("pending");
	Thread.sleep(2000);
	}
    test.log(Status.INFO, "Click on Transactions");
	BasePage.click_hexgendash("transactions");
	Thread.sleep(1000);
	
	if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
	{Thread.sleep(1000);
	BasePage.click1("pending");
	Thread.sleep(2000);
	}
    test.log(Status.INFO, "Click on Confirmation");
	BasePage.click_hexgendash("Depo_confirmation");
	Thread.sleep(1000);
	
	test.log(Status.INFO, "Click on Transaction Confirmation");
	BasePage.click_hexgendash("Depo_transConfirmaton");
	Thread.sleep(1000);
	
	 test.log(Status.INFO, "Reading Transaction ID");
   //  BasePage.AssertText("TransId_title");
     BasePage.Reading_id("Depo_Transid",ID);
     System.out.println(BasePage.Transid);
	
	 test.log(Status.INFO, "Click on Checkbox");
 	BasePage.click_hexgendash("Depo_confirmbox");
 	Thread.sleep(1000);
 	
 //	 test.log(Status.INFO, "Enter Remarks");
 //	BasePage.enterText("approve_remarks", "remarks",excelName, Scenario);
 // 	Thread.sleep(1000);
  	        	
  	
  	 test.log(Status.INFO, "Click on Submit");
  	// text="Checkbox";
   	BasePage.click_hexgendash("Depo_confirmsubmit");
   	Thread.sleep(1000);
   	
    if(BasePage.checkelementpresent1(readobjectRepo("Depo_assert"))==true)
	{
    	 BasePage.AssertExcel2("Depo_assert", "Depo Validation 1", excelName, Scenario,"Validation"); 
}

    test.log(Status.INFO, "Click on Hexgen User");
    //text="Hexgen User";
    BasePage.click_hexgendash("hexgen_user");
    Thread.sleep(2000);
    
    
    test.log(Status.INFO, "Click on Logout");
    BasePage.click_hexgendash("hexgen_logout");
    Thread.sleep(2000);
 	
}

public static void RebuildNAV(String excelName,String Scenario) throws Exception {

	 if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
		{
		
		BasePage.click1("critical_alerts_close");
		}
	
	 if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
		{Thread.sleep(1000);
		BasePage.click1("pending");
		Thread.sleep(2000);
		}
  test.log(Status.INFO, "Click on Process");
  BasePage.click_hexgendash("Process");
  
  if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
	{Thread.sleep(1000);
	BasePage.click1("pending");
	Thread.sleep(2000);
	}
  
  test.log(Status.INFO, "Click on Rebuild");
   BasePage.click_hexgendash("Rebuild");
   
   test.log(Status.INFO, "Click on Rebuild NAV");
   BasePage.click_hexgendash("Rebuild_NAV");
  
  test.log(Status.INFO, "Enter and Select Portfolio");
	BasePage.enterText("Rebuild_portfolio", "Portfolio",excelName, Scenario);
	BasePage.click_hexgendash("Rebuild_portaicf");
	
	Thread.sleep(1000);
	BasePage.click_hexgendash("NAV_enddate");
	
	test.log(Status.INFO, "Enter NAV Start Date");
	BasePage.enterText("NAV_startdate", "Maturity Date",excelName, Scenario);
	
	
	test.log(Status.INFO, "Enter NAV End Date");
	BasePage.enterText("NAV_enddate", "Maturity Date",excelName, Scenario);
	
	
	
	
	/*test.log(Status.INFO, "Verifying Manual NAV Current Date");
	BasePage.AssertText("ManualNAV_currentdate_title");
 	BasePage.AssertExcel("ManualNAV_currentdate", "Manual NAV Current Date", excelName, Scenario);
 	Thread.sleep(1000);
	
 	test.log(Status.INFO, "Verifying Date Upto");
	BasePage.AssertText("Date_uptotitle");
	BasePage.AssertExcel_ByreadingTextbox("Date_upto", "Date Upto", excelName, Scenario,"Date Upto");
	
	test.log(Status.INFO, "Verifying Process");
	BasePage.AssertText("process_title");
 	BasePage.AssertExcel("manual_process", "Process", excelName, Scenario);
 	Thread.sleep(1000);*/
  
  test.log(Status.INFO, "Click on Rebuild");
	BasePage.click_hexgendash("RebuilGear");
	Thread.sleep(1000);
	
	
	 test.log(Status.INFO, "Click on Tick icon");
	BasePage.click_hexgendash("Rebuildtick");
	Thread.sleep(1000);

 	
 // test.log(Status.INFO, "Enter Remarks");
	//BasePage.enterText("manual_remarks", "Manual Remarks",excelName, Scenario);
//	Thread.sleep(1000);
	

 //	test.log(Status.INFO, "Verifying Rebuld NAV Validation");
 	//BasePage.AssertExcel2("sub_assert", "Rebuild", excelName, Scenario,"Validation");
 	
	 if(BasePage.checkelementpresent1(readobjectRepo("Depo_assert"))==true)
		{
		 BasePage.AssertExcel2("Depo_assert", "Rebuild Validation", excelName, Scenario,"Validation");
	}
	
	
 	
 	
	
	WebElement ele = driver.findElement(By.xpath("//*[@id=\"alerts-tab\"]/ul/li[2]/span"));
	 String actual = ele.getText();
	 Thread.sleep(10000);
	 BasePage.AssertText("criticalalert_number");
	if(BasePage.Asserttext.equals(actual))
	{
		Thread.sleep(10000); 
		 
		
	}
	if(BasePage.Asserttext.equals(actual))
	{
		Thread.sleep(10000); 
		 
		
	}
	if(BasePage.Asserttext.equals(actual))
	{
		Thread.sleep(10000); 
		 
		
	}
   if(!BasePage.Asserttext.equals(actual))
	{
		
		BasePage.AssertText("progress_status");
		test.log(Status.INFO,"Validation :"+ BasePage.Asserttext);		 
		 
		
	}
		

}


public static void Verifying_AccountingEnquiry_Report(String excelName,String Scenario) throws Exception {
	
   
	
   test.log(Status.INFO, "Click on Reports");
   BasePage.click_hexgendash("Reports");
   
   if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
	{Thread.sleep(1000);
	BasePage.click1("pending");
	Thread.sleep(2000);
	}
   
   test.log(Status.INFO, "Click on Enquiries");
   BasePage.click_hexgendash("Enquiries");
   
   test.log(Status.INFO, "Click on Accounting");
   BasePage.click_hexgendash("Accounting");
   
   test.log(Status.INFO, "Click on Accounting Enquiry");
   BasePage.click_hexgendash("AccountingEnquiry");
   
   test.log(Status.INFO, "Enter Begin Date");
	BasePage.enterText("Begin_Date", "On Maturity/Early Maturity",excelName, Scenario);
	
 	Thread.sleep(2000);
 	
 	test.log(Status.INFO, "Enter End Date");
	BasePage.enterText("End_Date", "On Maturity/Early Maturity",excelName, Scenario);
	
	Thread.sleep(3000);
 	
	BasePage.enterText1("Report_portfolio", "Portfolio",excelName, Scenario);
	Thread.sleep(4000);
	BasePage.clearWebField("Report_portfolio");
	Thread.sleep(1000);
	//BasePage.click_hexgendash("report_AICF");
	
	test.log(Status.INFO, "Enter and Select Portfolio");
	BasePage.enterText("Report_portfolio", "Portfolio",excelName, Scenario);
	Thread.sleep(3000);
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(readobjectRepo("report_AICF"))));
	BasePage.click_hexgendash("report_AICF");
	
	test.log(Status.INFO, "Click on View Report");
   BasePage.click_hexgendash("view_report");
   
   test.log(Status.INFO, "Enter Module Ref in Search box");
   BasePage.enterText("report_search", "Module Ref 1",excelName, Scenario);
	
	test.log(Status.INFO, "Verifying Accounting Enquiry Report Details");
	
	 if(BasePage.checkelementpresent1(readobjectRepo("ae_transdate"))==true) {
		 
		 
		BasePage.AssertExcel2("accountingreport_portfolio","Portfolio", excelName, Scenario,"Portfolio");
	   	BasePage.AssertExcel2("ae_transdate","Trans Date", excelName, Scenario,"Transaction Date");
	  //	BasePage.AssertTransID("accountingreport_transID");
	   	BasePage.AssertExcel2("ae_moduleref","Module Ref 1", excelName, Scenario,"Module Reference");  
	   	BasePage.AssertExcel2("ae_currency","Currency", excelName, Scenario,"Currency");
	   	BasePage.AssertExcel2("ae_Bulk_amounttcy","AE Amount Tcy 1", excelName, Scenario,"Amount Tcy");
		BasePage.AssertExcel2("ae_Bulk_amountpcy","AE Amount Pcy 1", excelName, Scenario,"Amount Pcy");
		BasePage.AssertExcel2("ae_transcode","Trans Code 1", excelName, Scenario,"Transaction Code");
		BasePage.AssertExcel2("ae_assetclass","AE Asset Class", excelName, Scenario,"Asset Class");
		BasePage.AssertExcel2("ae_counterparty","AE Counterparty", excelName, Scenario,"Counterparty");
		BasePage.AssertExcel2("ae_isreversed","Is Reversed", excelName, Scenario,"Is Reversed");
	 }
	 
	 else {
		 test.log(Status.FAIL, "Bulk Deposit Maturity is not refelcted in Accounting Enquiry Report");
		 BasePage.takeScreenShot();
			
	 }
	 
	 BasePage.enterText1("report_search", "Module Ref",excelName, Scenario);
	 if(BasePage.checkelementpresent1(readobjectRepo("ae_Bulk_Rolloveramt"))==true) {
	BasePage.AssertExcel2("ae_Bulk_Rolloveramt", "Rollover Amount", excelName, Scenario, "Rollover Deposit Placement Amount");
 }
	 BasePage.enterText1("report_search", "Module Ref 2",excelName, Scenario);
	 if(BasePage.checkelementpresent1(readobjectRepo("ae_Bulk_accural"))==true) {
	BasePage.AssertExcel2("ae_Bulk_accural", "Accural Interest", excelName, Scenario, "Accural Interest");
 }
	
	

}

public static void Verifying_AE_Report_ChangeINT(String excelName,String Scenario) throws Exception {
	 Thread.sleep(15000);
	
  test.log(Status.INFO, "Click on Reports");
  BasePage.click_hexgendash("Reports");
  
  if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
	{Thread.sleep(1000);
	BasePage.click1("pending");
	Thread.sleep(2000);
	}
  
  test.log(Status.INFO, "Click on Enquiries");
  BasePage.click_hexgendash("Enquiries");
  
  test.log(Status.INFO, "Click on Accounting");
  BasePage.click_hexgendash("Accounting");
  
  test.log(Status.INFO, "Click on Accounting Enquiry");
  BasePage.click_hexgendash("AccountingEnquiry");
  
  test.log(Status.INFO, "Enter Begin Date");
	BasePage.enterText("Begin_Date", "On Maturity/Early Maturity",excelName, Scenario);
	
	Thread.sleep(2000);
	
	test.log(Status.INFO, "Enter End Date");
	BasePage.enterText("End_Date", "On Maturity/Early Maturity",excelName, Scenario);
	
	Thread.sleep(3000);
	
	BasePage.enterText1("Report_portfolio", "Portfolio",excelName, Scenario);
	Thread.sleep(3000);
	BasePage.clearWebField("Report_portfolio");
	Thread.sleep(1000);
	//BasePage.click_hexgendash("report_AICF");
	
	test.log(Status.INFO, "Enter and Select Portfolio");
	BasePage.enterText("Report_portfolio", "Portfolio",excelName, Scenario);
	Thread.sleep(3000);
	BasePage.click_hexgendash("report_AICF");
	
	test.log(Status.INFO, "Click on View Report");
  BasePage.click_hexgendash("view_report");
  
  test.log(Status.INFO, "Enter Module Ref in Search box");
  BasePage.enterText("report_search", "Module Ref 1",excelName, Scenario);
	
	test.log(Status.INFO, "Verifying Accounting Enquiry Report Details");
	
	 if(BasePage.checkelementpresent1(readobjectRepo("ae_transdate"))==true) {
		 
		BasePage.AssertExcel2("accountingreport_portfolio","Portfolio", excelName, Scenario,"Portfolio");
	   	BasePage.AssertExcel2("ae_transdate","Trans Date", excelName, Scenario,"Transaction Date");
	  //	BasePage.AssertTransID("accountingreport_transID");
	   	BasePage.AssertExcel2("ae_moduleref","Module Ref 1", excelName, Scenario,"Module Reference");  
	   	BasePage.AssertExcel2("ae_currency","Currency", excelName, Scenario,"Currency");
	   	BasePage.AssertExcel2("ae_Bulk_AmountTCY","AE Amount Tcy 1", excelName, Scenario,"Amount Tcy");
		BasePage.AssertExcel2("ae_Bulk_AmountPCY","AE Amount Pcy 1", excelName, Scenario,"Amount Pcy");
		BasePage.AssertExcel2("ae_transcode","Trans Code 1", excelName, Scenario,"Transaction Code");
		BasePage.AssertExcel2("ae_assetclass","AE Asset Class", excelName, Scenario,"Asset Class");
		BasePage.AssertExcel2("ae_counterparty","AE Counterparty", excelName, Scenario,"Counterparty");
		BasePage.AssertExcel2("ae_isreversed","Is Reversed", excelName, Scenario,"Is Reversed");
	 }
	 else {
		 test.log(Status.FAIL, "Bulk Deposit Maturity is not refelcted in Accounting Enquiry Report");
		 BasePage.takeScreenShot();
			
	 }
	 BasePage.enterText1("report_search", "Module Ref",excelName, Scenario);
	 if(BasePage.checkelementpresent1(readobjectRepo("ae_Bulk_Rolloveramt"))==true) {
	BasePage.AssertExcel2("ae_Bulk_Rolloveramt", "Rollover Amount", excelName, Scenario, "Rollover Deposit Placement Amount");
}
	 BasePage.enterText1("report_search", "Module Ref 2",excelName, Scenario);
	 if(BasePage.checkelementpresent1(readobjectRepo("ae_Bulk_accural"))==true) {
	BasePage.AssertExcel2("ae_Bulk_accural", "Accural Interest", excelName, Scenario, "Accural Interest");
}
	/*BasePage.AssertText("ae_isreversed");
	if("Y".equals(BasePage.Asserttext))
	{
 
	BasePage.AssertExcel2("accountingreport_portfolio","Portfolio", excelName, Scenario,"Portfolio");
 	BasePage.AssertExcel2("ae_transdate","Transaction_Date", excelName, Scenario,"Transaction Date");
	BasePage.AssertTransID("accountingreport_transID");
 	BasePage.AssertExcel2("ae_moduleref","Portfolio Class", excelName, Scenario,"Module Reference");  
 	BasePage.AssertExcel2("ae_unitpremium","(Units)", excelName, Scenario,"Unit Premium");
 	BasePage.AssertExcel2("ae_amounttcy","Amount Tcy", excelName, Scenario,"Amount Tcy");
	BasePage.AssertExcel2("ae_unitcapital","Units", excelName, Scenario,"Units Capital");
 	
 	
// 	BasePage.scrollintoview_right();
// 	BasePage.AssertText("AE_transcode");
 	BasePage.AssertExcel2("ae_transcode","Transaction Code", excelName, Scenario,"Transaction Code");
 	BasePage.AssertExcel2("ae_isreversed","remarks", excelName, Scenario,"Is Reversed");
	}
	else if("N".equals(BasePage.Asserttext)){
		 test.log(Status.FAIL, "Portfolio Subred Cancellation - "+readtransIDs("TransactionID5")+" is not reflected in Accounting Enquiry Report");
		BasePage.takeScreenShot();
	}}*/
	
}



public static void Verifying_BankTransactions_Report(String excelName,String Scenario,String data) throws Exception {

	 Thread.sleep(10000);
	 
	test.log(Status.INFO, "Click on Reports");
   BasePage.click_hexgendash("Reports");
   
   
   test.log(Status.INFO, "Click on Operations");
   BasePage.click_hexgendash("operations");
   
   Thread.sleep(1000);
   
   test.log(Status.INFO, "Click on Financials");
   BasePage.click_hexgendash("financials");
   
   test.log(Status.INFO, "Click on Bank Transactions");
   BasePage.click_hexgendash("Bank_transactions");
   
  
   
  // test.log(Status.INFO, "Enter and Select Portfolio");
   //BasePage.clearWebField("banktransactions_portfolio");
  // BasePage.enterText("banktransactions_portfolio", "Portfolio",excelName, Scenario);
	//BasePage.click_hexgendash("banktransactions_aicf");
   
   test.log(Status.INFO, "Enter Begin Date");
	BasePage.enterText("banktrans_begindate", "On Maturity/Early Maturity",excelName, Scenario);
	
 	Thread.sleep(1000);
 	
 	test.log(Status.INFO, "Enter End Date");
	BasePage.enterText("banktrans_enddate", "On Maturity/Early Maturity",excelName, Scenario);
	
	
	  	
	  	BasePage.AssertText("banktrans_output");
	  	if(BasePage.Asserttext.equals("EXCEL")) {
	  		
	  	 test.log(Status.INFO, "Enter and Select Output");
	 	  	Thread.sleep(1000);
	  	BasePage.click1("banktrans_output");
	  	BasePage.click1("banktrans_output_excel");
	  	BasePage.enterText("banktrans_output_type", "Output",excelName, Scenario);
	  	BasePage.click_hexgendash("banktrans_output_html");}
	
	test.log(Status.INFO, "Click on View Report");
   BasePage.click_hexgendash("banktrans_viewreport");
   
  
//	test.log(Status.INFO, "Verifying Bank Transactions Report Request Validation");
 	//BasePage.AssertExcel1("sub_assert","Bank Transactions Report Message", excelName, Scenario);
   if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
	{
     BasePage.AssertText("sub_assert");
     test.log(Status.INFO,"Validation :"+ BasePage.Asserttext);
}

 	
   BasePage.loadTime1(); 
  
   
   BasePage.switchTab();
   
 //  BasePage.AssertText("demo");
 //  System.out.println(BasePage.Asserttext);
   if(data.equals("Debit"))
   {
   
   test.log(Status.INFO, "Verifying Bank Transactions Report Details");
 	verifying_banktransactionsReport_BulkMaturity(excelName, Scenario);}
   else if(data.equals("Credit"))
   {
   
   test.log(Status.INFO, "Verifying Bank Transactions Report Details");
 	verifying_banktransactionsReport_DepoPlacement(excelName, Scenario);}
   else if(data.equals("Reversal"))
   {
   
   test.log(Status.INFO, "Verifying Bank Transactions Report Details");
   verifying_banktransactionsReport_BulkMaturityReversal(excelName, Scenario);}
   
 	
 	Thread.sleep(5000);
 	BasePage.CloseTab();
   

}

public static void verifying_banktransactionsReport_BulkMaturity(String excelName,String Scenario) throws Exception {
	String actual="";
	String expected="";
	
	int loop=0;
	int entry=0;
	int entry1=0;
	try {
		
		WebElement el = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[3]"));
		 actual = el.getText();
		 System.out.println(actual);
		if(actual.equals("Portfolio : HAXAGONMYR - HAXAGON MYR FUND"))
    	{
			 expected ="Portfolio : HAXAGONMYR - HAXAGON MYR FUND";
			Assert.assertEquals(actual, expected);
			test.log(Status.PASS,"Portfolio = Expected: " + expected + " <-----> Actual: " + actual);
			}
		

    for(int i=8;i<25;i++)
    {
    	
    	 loop=i;
    	String xpath="/html/body/table/tbody/tr["+i+"]/td[6]";
    	if(entry==0) {
    	if(checkelementpresent1(xpath)==true) 
    	{
    	WebElement ele = driver.findElement(By.xpath(xpath));
		 actual = ele.getText();
		 System.out.println(actual);
		 
		if(actual.equals(readTestData("Debit", excelName,Scenario)))
    	{
			BasePage.AssertExcel1(xpath, "Debit", excelName, Scenario, "Debit");	
			entry=1;
			
			
			String xpath1="/html/body/table/tbody/tr["+i+"]/td[2]";
		WebElement ele1 = driver.findElement(By.xpath(xpath1));
		 actual = ele1.getText();
		 System.out.println(actual);
			BasePage.AssertExcel1(xpath1, "Trans Code 1", excelName, Scenario, "Trans Code");	
			entry=1;
			
			String xpath2="/html/body/table/tbody/tr["+i+"]/td[3]";	
		WebElement ele2 = driver.findElement(By.xpath(xpath2));
		 actual = ele2.getText();
		 System.out.println(actual);
			BasePage.AssertExcel1(xpath2, "AE Counterparty", excelName, Scenario, "Counterparty");
	
			entry=1;
			
			String xpath3="/html/body/table/tbody/tr["+i+"]/td[1]";	
			WebElement ele3 = driver.findElement(By.xpath(xpath3));
			 actual = ele3.getText();
			 System.out.println(actual);
				BasePage.AssertExcel1(xpath3, "Trans Date", excelName, Scenario, "Transaction Date");
				
			
			}
		
		
		
		
}}}
    
    if(entry==0) {
		test.log(Status.FAIL,"Bulk Deposit Maturity Amount is not reflected in Bank Transactions Report");
		//reportFailure("Assertion Failed");
		takeScreenShot();
		}
   
    }catch (Exception e) {
			
			test.log(Status.FAIL,"Error in verifying Bank Transaction Report Details");
			e.printStackTrace();
			//reportFailure("Assertion Failed");
			takeScreenShot();
		} catch (AssertionError e) {
			
			//test.log(Status.FAIL,"Expected: " + expected + " <-----> Actual: " + actual);
			test.log(Status.FAIL,"Error in verifying Bank Transaction Report Details");
			e.printStackTrace();
			//reportFailure("Assertion Failed");
			takeScreenShot();
	
    	}
		
		
    	
    }
public static void verifying_banktransactionsReport_BulkMaturityReversal(String excelName,String Scenario) throws Exception {
	String actual="";
	String expected="";
	
	int loop=0;
	int entry=0;
	int entry1=0;
	try {
		
		WebElement el = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[3]"));
		 actual = el.getText();
		 System.out.println(actual);
		if(actual.equals("Portfolio : HAXAGONMYR - HAXAGON MYR FUND"))
    	{
			 expected ="Portfolio : HAXAGONMYR - HAXAGON MYR FUND";
			Assert.assertEquals(actual, expected);
			test.log(Status.PASS,"Portfolio = Expected: " + expected + " <-----> Actual: " + actual);
			}
		

    for(int i=8;i<25;i++)
    {
    	
    	 loop=i;
    	String xpath="/html/body/table/tbody/tr["+i+"]/td[7]";
    	String data="/html/body/table/tbody/tr["+i+"]/td[2]";
    	if(entry==0) {
    	if(checkelementpresent1(xpath)==true) 
    	{
    	WebElement ele = driver.findElement(By.xpath(xpath));
		 actual = ele.getText();
		 System.out.println(actual);
		 WebElement data1 = driver.findElement(By.xpath(data));
		 String actual4 = data1.getText();
		 
		if(actual.equals(readTestData("Credit Reversal", excelName,Scenario))&&(actual4.equals(readTestData("Trans Code 1", excelName, Scenario))))
    	{
			BasePage.AssertExcel1(xpath, "Credit Reversal", excelName, Scenario, "Credit");	
			entry=1;
			
			
			String xpath1="/html/body/table/tbody/tr["+i+"]/td[2]";
		WebElement ele1 = driver.findElement(By.xpath(xpath1));
		 actual = ele1.getText();
		 System.out.println(actual);
			BasePage.AssertExcel1(xpath1, "Trans Code 1", excelName, Scenario, "Trans Code");	
			entry=1;
			
			String xpath2="/html/body/table/tbody/tr["+i+"]/td[3]";	
		WebElement ele2 = driver.findElement(By.xpath(xpath2));
		 actual = ele2.getText();
		 System.out.println(actual);
			BasePage.AssertExcel1(xpath2, "AE Counterparty", excelName, Scenario, "Counterparty");
	
			entry=1;
			
			String xpath3="/html/body/table/tbody/tr["+i+"]/td[1]";	
			WebElement ele3 = driver.findElement(By.xpath(xpath3));
			 actual = ele3.getText();
			 System.out.println(actual);
				BasePage.AssertExcel1(xpath3, "Trans Date", excelName, Scenario, "Transaction Date");
		
				entry=1;
			
			}
		
		
		
		
}}}
    
    if(entry==0) {
		test.log(Status.FAIL,"Bulk Deposit Maturity Reversal Amount is not reflected in Bank Transactions Report");
		//reportFailure("Assertion Failed");
		takeScreenShot();
		}
   
    }catch (Exception e) {
			
			test.log(Status.FAIL,"Error in verifying Bank Transaction Report Details");
			e.printStackTrace();
			//reportFailure("Assertion Failed");
			takeScreenShot();
		} catch (AssertionError e) {
			
			//test.log(Status.FAIL,"Expected: " + expected + " <-----> Actual: " + actual);
			test.log(Status.FAIL,"Error in verifying Bank Transaction Report Details");
			e.printStackTrace();
			//reportFailure("Assertion Failed");
			takeScreenShot();
	
    	}
		
		
    	
    }
public static void verifying_banktransactionsReport_DepoPlacement(String excelName,String Scenario) throws Exception {
	String actual="";
	String expected="";
	
	int loop=0;
	int entry=0;
	int entry1=0;
	try {
		
		WebElement el = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[3]"));
		 actual = el.getText();
		 System.out.println(actual);
		if(actual.equals("Portfolio : HAXAGONMYR - HAXAGON MYR FUND"))
    	{
			 expected ="Portfolio : HAXAGONMYR - HAXAGON MYR FUND";
			Assert.assertEquals(actual, expected);
			test.log(Status.PASS,"Portfolio = Expected: " + expected + " <-----> Actual: " + actual);
			}
		

    for(int i=8;i<25;i++)
    {
    	
    	 loop=i;
    	String xpath="/html/body/table/tbody/tr["+i+"]/td[7]";
    	if(entry==0) {
    	if(checkelementpresent1(xpath)==true) 
    	{
    	WebElement ele = driver.findElement(By.xpath(xpath));
		 actual = ele.getText();
		 System.out.println(actual);
		 
		if(actual.equals(readTestData("Credit", excelName,Scenario)))
    	{
			BasePage.AssertExcel1(xpath, "Credit", excelName, Scenario, "Credit");
	
			entry=1;
			
			
			String xpath1="/html/body/table/tbody/tr["+i+"]/td[2]";
		WebElement ele1 = driver.findElement(By.xpath(xpath1));
		 actual = ele1.getText();
		 System.out.println(actual);
			BasePage.AssertExcel1(xpath1, "Trans Code", excelName, Scenario, "Trans Code");
	
			entry=1;
			
			String xpath2="/html/body/table/tbody/tr["+i+"]/td[3]";	
		WebElement ele2 = driver.findElement(By.xpath(xpath2));
		 actual = ele2.getText();
		 System.out.println(actual);
			BasePage.AssertExcel1(xpath2, "AE Counterparty", excelName, Scenario, "Counterparty");
	
			entry=1;
			
			String xpath3="/html/body/table/tbody/tr["+i+"]/td[1]";	
			WebElement ele3 = driver.findElement(By.xpath(xpath3));
			 actual = ele3.getText();
			 System.out.println(actual);
				BasePage.AssertExcel1(xpath3, "Transaction_Date", excelName, Scenario, "Transaction Date");
		
				entry=1;
			
			}
		
		
		
		
}}}
    
    if(entry==0) {
		test.log(Status.FAIL,"Deposit Placement Amount is not reflected in Bank Transactions Report");
		//reportFailure("Assertion Failed");
		takeScreenShot();
		}
   
    }catch (Exception e) {
			
			test.log(Status.FAIL,"Error in verifying Bank Transaction Report Details");
			e.printStackTrace();
			//reportFailure("Assertion Failed");
			takeScreenShot();
		} catch (AssertionError e) {
			
			//test.log(Status.FAIL,"Expected: " + expected + " <-----> Actual: " + actual);
			test.log(Status.FAIL,"Error in verifying Bank Transaction Report Details");
			e.printStackTrace();
			//reportFailure("Assertion Failed");
			takeScreenShot();
	
    	}
		
		
    }

public static void BulkDeposit_Reversal(String excelName,String Scenario) throws Exception {
	
	Thread.sleep(10000);
	
	if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
	{Thread.sleep(1000);
	BasePage.click1("pending");
	Thread.sleep(2000);
	}
	test.log(Status.INFO, "Click on Transactions");
	BasePage.click_hexgendash("transactions");
	Thread.sleep(1000);

	if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
	{Thread.sleep(1000);
	BasePage.click1("pending");
	Thread.sleep(2000);
	}
	test.log(Status.INFO, "Click on Investment");
   BasePage.click_hexgendash("investment");
  Thread.sleep(1000);
  
   test.log(Status.INFO, "Click on Trade Cancellation");
   BasePage.click_hexgendash("tradeCancellation");
   Thread.sleep(1000);
   
   Thread.sleep(1000); 
   test.log(Status.INFO, "Enter Transaction Date");
	BasePage.enterText("TradeCancel_TransDate", "On Maturity/Early Maturity", excelName, Scenario);
	
	
	Thread.sleep(1000); 
   test.log(Status.INFO, "Enter and Select Module Reference");
   BasePage.enterText("TradeCancel_moduleref", "Module Ref 1", excelName, Scenario);	
	BasePage.click_hexgendash("TradeCancel_ModuleRef");
	
	Thread.sleep(1000); 
	   test.log(Status.INFO, "Enter and Select Asset Class");
	   BasePage.enterText("TradeCancel_assetclass", "AE Asset Class", excelName, Scenario);	
		BasePage.click_hexgendash("TradeCancel_AssetClass");
  
		Thread.sleep(1000); 
		   test.log(Status.INFO, "Enter and Select Trans Code");
		   BasePage.enterText("TradeCancel_transcode", "Trans Code 1", excelName, Scenario);	
			BasePage.click_hexgendash("TradeCancel_TransCode");
		
			Thread.sleep(1000); 
			   test.log(Status.INFO, "Enter and Select Portfolio");
			   BasePage.enterText("TradeCancel_portfolio", "Portfolio", excelName, Scenario);	
				BasePage.click_hexgendash("TradeCancel_Portfolio");
			

				test.log(Status.INFO, "Click on Refresh Icon");
				 BasePage.click_hexgendash("TradeCancel_refresh");
				 
				 test.log(Status.INFO, "Click on Select All");
				 BasePage.click_hexgendash("TradeCancel_selectAll");
 
 test.log(Status.INFO, "Click on Submit");
 BasePage.click_hexgendash("TradeCancel_submit");


if(BasePage.checkelementpresent1(readobjectRepo("Depo_assert"))==true)
	{
	 BasePage.AssertExcel2("Depo_assert", "Reversal_Validation", excelName, Scenario,"Validation");
}

	Thread.sleep(1000);
	
	BasePage.horizontalRight();
	 
	 test.log(Status.INFO, "Click on Hexgen User");
	 BasePage.click_hexgendash("hexgen_user");
	 Thread.sleep(2000);
	 
	 
	 test.log(Status.INFO, "Click on Logout");
	 BasePage.click_hexgendash("hexgen_logout");
	 Thread.sleep(2000);
      
       
}

public static void Approve_Reversal(String excelName,String Scenario) throws Exception {
		
    
    if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
	{
	
	
	}
    
    
	/* test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(2000);
		
		 test.log(Status.INFO, "Click on Approve");
		 	BasePage.click_hexgendash("TradeCancel_Approve");
		 	Thread.sleep(1000);
		  	
		  	 test.log(Status.INFO, "Click on Remarks Tick icon");
		  	// text="Checkbox";
		   	BasePage.click_hexgendash("TradeCancel_remarks");*/
    
    test.log(Status.INFO, "Click on Approve");
    BasePage.click_hexgendash("upload_BOE_approve");
    
    test.log(Status.INFO, "Click on Approve in Remarks");
    BasePage.click_hexgendash("upload_remarks_approve");
    
		    if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
			{
		    	BasePage.AssertExcel2("sub_assert", "ReversalApprove_Validation", excelName, Scenario,"Validation");
		}
		

   	BasePage.horizontalRight();
    
    test.log(Status.INFO, "Click on Hexgen User");
    //text="Hexgen User";
    BasePage.click_hexgendash("hexgen_user");
    Thread.sleep(2000);
    
    
    test.log(Status.INFO, "Click on Logout");
    BasePage.click_hexgendash("hexgen_logout");
    Thread.sleep(2000);
 	     
}

public static void Verifying_ReversalAccountingEnquiry_Report(String excelName,String Scenario) throws Exception {
	if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
	{
	
	BasePage.click1("critical_alerts_close");
	}
  
	
  test.log(Status.INFO, "Click on Reports");
  BasePage.click_hexgendash("Reports");
  
 
  
  test.log(Status.INFO, "Click on Enquiries");
  BasePage.click_hexgendash("Enquiries");
  
  test.log(Status.INFO, "Click on Accounting");
  BasePage.click_hexgendash("Accounting");
  
  test.log(Status.INFO, "Click on Accounting Enquiry");
  BasePage.click_hexgendash("AccountingEnquiry");
  
  test.log(Status.INFO, "Enter Begin Date");
	BasePage.enterText("Begin_Date", "On Maturity/Early Maturity",excelName, Scenario);
	
	Thread.sleep(2000);
	
	test.log(Status.INFO, "Enter End Date");
	BasePage.enterText("End_Date", "On Maturity/Early Maturity",excelName, Scenario);
	
	Thread.sleep(5000);
	
	
	test.log(Status.INFO, "Enter and Select Portfolio");
	BasePage.enterText("Report_portfolio", "Portfolio",excelName, Scenario);
	Thread.sleep(3000);
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(readobjectRepo("report_AICF"))));
	BasePage.click_hexgendash("report_AICF");
	
	test.log(Status.INFO, "Click on View Report");
  BasePage.click_hexgendash("view_report");
  
  test.log(Status.INFO, "Enter Counterparty in Search box");
  BasePage.enterText("report_search", "Module Ref 1",excelName, Scenario);
	
	test.log(Status.INFO, "Verifying Accounting Enquiry Report Details");
	
	 if(BasePage.checkelementpresent(readobjectRepo("accountingreport_portfolio"))==true) {
		BasePage.AssertExcel2("accountingreport_portfolio","Portfolio", excelName, Scenario,"Portfolio");
	   	BasePage.AssertExcel2("ae_transdate","Trans Date", excelName, Scenario,"Transaction Date");
	  //	BasePage.AssertTransID("accountingreport_transID");
	   	BasePage.AssertExcel2("ae_moduleref","Module Ref 1", excelName, Scenario,"Module Reference");  
	   	BasePage.AssertExcel2("ae_currency","Currency", excelName, Scenario,"Currency");
	   	BasePage.AssertExcel2("ae_Bulk_amounttcy","AE Amount Tcy 1", excelName, Scenario,"Amount Tcy");
		BasePage.AssertExcel2("ae_Bulk_amountpcy","AE Amount Pcy 1", excelName, Scenario,"Amount Pcy");
		BasePage.AssertExcel2("ae_transcode","Trans Code 1", excelName, Scenario,"Transaction Code");
		BasePage.AssertExcel2("ae_assetclass","AE Asset Class", excelName, Scenario,"Asset Class");
		BasePage.AssertExcel2("ae_counterparty","AE Counterparty", excelName, Scenario,"Counterparty");
		BasePage.AssertExcel2("ae_isreversed","Is Reversed 1", excelName, Scenario,"Is Reversed");
	 }
	 else {
		 test.log(Status.FAIL, "Bulk Deposit Maturity Reversal is not refelcted in Accounting Enquiry Report");
		 BasePage.takeScreenShot();
			
	 }

}

public static void Verifying_ReversalAE_Report(String excelName,String Scenario) throws Exception {
	if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
	{
	
	BasePage.click1("critical_alerts_close");
	}
  
	 
  test.log(Status.INFO, "Click on Reports");
  BasePage.click_hexgendash("Reports");
  
  if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
	{Thread.sleep(1000);
	BasePage.click1("pending");
	Thread.sleep(2000);
	}
  
  test.log(Status.INFO, "Click on Enquiries");
  BasePage.click_hexgendash("Enquiries");
  
  test.log(Status.INFO, "Click on Accounting");
  BasePage.click_hexgendash("Accounting");
  
  test.log(Status.INFO, "Click on Accounting Enquiry");
  BasePage.click_hexgendash("AccountingEnquiry");
  
  test.log(Status.INFO, "Enter Begin Date");
	BasePage.enterText("Begin_Date", "On Maturity/Early Maturity",excelName, Scenario);
	
	Thread.sleep(2000);
	
	test.log(Status.INFO, "Enter End Date");
	BasePage.enterText("End_Date", "On Maturity/Early Maturity",excelName, Scenario);
	
	Thread.sleep(3000);
	
	BasePage.enterText1("Report_portfolio", "Portfolio",excelName, Scenario);
	Thread.sleep(3000);
	BasePage.clearWebField("Report_portfolio");
	Thread.sleep(1000);
	//BasePage.click_hexgendash("report_AICF");
	
	test.log(Status.INFO, "Enter and Select Portfolio");
	BasePage.enterText("Report_portfolio", "Portfolio",excelName, Scenario);
	Thread.sleep(3000);
	BasePage.click_hexgendash("report_AICF");
	
	test.log(Status.INFO, "Click on View Report");
  BasePage.click_hexgendash("view_report");
  
  test.log(Status.INFO, "Enter Counterparty in Search box");
  BasePage.enterText("report_search", "Module Ref 1",excelName, Scenario);
	
	test.log(Status.INFO, "Verifying Accounting Enquiry Report Details");
	
	 if(BasePage.checkelementpresent(readobjectRepo("accountingreport_portfolio"))==true) {
		BasePage.AssertExcel2("accountingreport_portfolio","Portfolio", excelName, Scenario,"Portfolio");
	   	BasePage.AssertExcel2("ae_transdate","Trans Date", excelName, Scenario,"Transaction Date");
	  //	BasePage.AssertTransID("accountingreport_transID");
	   	BasePage.AssertExcel2("ae_moduleref","Module Ref 1", excelName, Scenario,"Module Reference");  
	   	BasePage.AssertExcel2("ae_currency","Currency", excelName, Scenario,"Currency");
	   	BasePage.AssertExcel2("ae_Bulk_AmountTCY","AE Amount Tcy 1", excelName, Scenario,"Amount Tcy");
		BasePage.AssertExcel2("ae_Bulk_AmountPCY","AE Amount Pcy 1", excelName, Scenario,"Amount Pcy");
		BasePage.AssertExcel2("ae_transcode","Trans Code 1", excelName, Scenario,"Transaction Code");
		BasePage.AssertExcel2("ae_assetclass","AE Asset Class", excelName, Scenario,"Asset Class");
		BasePage.AssertExcel2("ae_counterparty","AE Counterparty", excelName, Scenario,"Counterparty");
		BasePage.AssertExcel2("ae_isreversed","Is Reversed 1", excelName, Scenario,"Is Reversed");
	 }
	 else {
		 test.log(Status.FAIL, "Bulk Deposit Maturity Reversal is not refelcted in Accounting Enquiry Report");
		 BasePage.takeScreenShot();
			
	 }

}

public static void Upload_Subred(String excelName,String Scenario,String data) throws Exception {

	 if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
		{
		
		 BasePage.click1("critical_alerts_close");
		}
	 
	 if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
		{Thread.sleep(1000);
		BasePage.click1("pending");
		Thread.sleep(2000);
		}
	test.log(Status.INFO, "Click on Uploads");
   BasePage.click_hexgendash("uploads");
   
   if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
	{Thread.sleep(1000);
	BasePage.click1("pending");
	Thread.sleep(2000);
	}
   test.log(Status.INFO, "Click on Upload");
   BasePage.click_hexgendash("upload");
   
   Thread.sleep(1000);
   
   test.log(Status.INFO, "Uploading Subred Excel File");
   
  
  BasePage.upload_file(data);
  
  Thread.sleep(10000);
  
  test.log(Status.INFO, "Click on Upload Dashboard");
  BasePage.click_hexgendash("upload_dashboard");
  
  BasePage.checkelementpresent(readobjectRepo("upload_status"));
  BasePage.AssertText("upload_status");
  
  Thread.sleep(20000);
  
  if(BasePage.Asserttext.equals("Pending with 301758"))
	{
	
	   test.log(Status.INFO, "Verifying Upload Status");
	 	BasePage.AssertExcel2("upload_status","Upload Status 1", excelName, Scenario,"Status");
	}
  else if(!BasePage.Asserttext.equals("Pending with 301758"))
	{
	   Thread.sleep(20000);
	   
	}
  else if(BasePage.Asserttext.equals("Pending with 301758"))
 	{
 	
 	   test.log(Status.INFO, "Verifying Upload Status");
 	 	BasePage.AssertExcel2("upload_status","Upload Status 1", excelName, Scenario,"Status");
 	}
  
	
	BasePage.horizontalRight();
	
	Thread.sleep(2000);
	
	test.log(Status.INFO, "Click on Critical Alerts");
   BasePage.click_hexgendash("critical_Alerts");
  
   test.log(Status.INFO, "Click on Approve");
   BasePage.click_hexgendash("upload_BOE_approve");
   
   test.log(Status.INFO, "Click on Approve in Remarks");
   BasePage.click_hexgendash("upload_remarks_approve");
   
   test.log(Status.INFO, "Click on Close Critical Alerts");
   BasePage.click_hexgendash("critical_alerts_close");
   
   Thread.sleep(10000);
   BasePage.AssertText("upload_status");
   
   if(BasePage.Asserttext.equals("Pending with CHKBOMBOAMBOMM"))
	{
	
	   test.log(Status.INFO, "Verifying Upload Status");
	 	BasePage.AssertExcel2("upload_status","Upload Status 2", excelName, Scenario,"Status");
	}
  else if(!BasePage.Asserttext.equals("Pending with CHKBOMBOAMBOMM"))
	{
	   Thread.sleep(20000);
	}
  else if(BasePage.Asserttext.equals("Pending with CHKBOMBOAMBOMM"))
 	{
 	   test.log(Status.INFO, "Verifying Upload Status");
 	 	BasePage.AssertExcel2("upload_status","Upload Status 2", excelName, Scenario,"Status");
 	}
   
	
	test.log(Status.INFO, "Click on Hexgen User");
   //text="Hexgen User";
   BasePage.click_hexgendash("hexgen_user");
   Thread.sleep(2000);
   
   
   test.log(Status.INFO, "Click on Logout");
   BasePage.click_hexgendash("hexgen_logout");
   Thread.sleep(2000);
   
	
   test.log(Status.INFO, "Enter Valid Checker Username");
	BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);


   test.log(Status.INFO, "Enter Valid Checker Password");
   BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);
   
   test.log(Status.INFO, "Select Company");
 	 BasePage.click1("company");
 		Thread.sleep(2000);
         BasePage.click_hexgendash("comapny_dropdown");
         Thread.sleep(2000);
         
         test.log(Status.INFO, "Click on Login button");
       //  text="Login";
        BasePage.click_hexgendash("loginButton");
        Thread.sleep(1000);
   
 
   
   if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
	{
	
	}
   
   test.log(Status.INFO, "Click on More Info Icon");
	BasePage.click_hexgendash("sub_moreinfo");
	Thread.sleep(1000);
     
	test.log(Status.INFO, "Verifying the Uploaded Portfolio Subred file with Settlement Date(T+1)");
	BasePage.AssertExcel2("upload_portfolio","Portfolio", excelName, Scenario,"Portfolio");
BasePage.AssertExcel2("upload_transdate", "Upload Trans Date", excelName, Scenario,"Trans Date");
BasePage.AssertExcel2("upload_NAVdate", "Upload Trans Date", excelName, Scenario,"NAV Date");
BasePage.AssertExcel2("upload_transcode", "Transaction Code", excelName, Scenario,"Trans Code");
BasePage.AssertExcel2("upload_quantity", "Units", excelName, Scenario,"Quantity");
BasePage.AssertExcel2("upload_price", "Price", excelName, Scenario,"Price");
BasePage.AssertExcel2("upload_AmountTcy", "Amount Tcy", excelName, Scenario,"Amount Tcy");		
BasePage.AssertExcel2("upload_Glaccount", "Bank Code", excelName, Scenario,"Gl Account Code");

test.log(Status.INFO, "Verifying the Uploaded Portfolio Subred file with Settlement Date(T+2)");
BasePage.AssertExcel2("upload_Portfolio1","Portfolio", excelName, Scenario,"Portfolio");
BasePage.AssertExcel2("upload_transdate1", "Upload Trans Date", excelName, Scenario,"Trans Date");
BasePage.AssertExcel2("upload_NAVdate1", "Upload Trans Date", excelName, Scenario,"NAV Date");
BasePage.AssertExcel2("upload_transcode1", "Transaction Code", excelName, Scenario,"Trans Code");
BasePage.AssertExcel2("upload_quantity1", "Units 1", excelName, Scenario,"Quantity");
BasePage.AssertExcel2("upload_price1", "Price", excelName, Scenario,"Price");
BasePage.AssertExcel2("upload_AmountTcy1", "Amount Tcy 1", excelName, Scenario,"Amount Tcy");		
BasePage.AssertExcel2("upload_Glaccount1", "Bank Code", excelName, Scenario,"Gl Account Code");


test.log(Status.INFO, "Verifying the Uploaded Portfolio Subred file with Settlement Date(T+0)");
BasePage.AssertExcel2("upload_Portfolio2","Portfolio", excelName, Scenario,"Portfolio");
BasePage.AssertExcel2("upload_transdate2", "Upload Trans Date", excelName, Scenario,"Trans Date");
BasePage.AssertExcel2("upload_NAVdate2", "Upload Trans Date", excelName, Scenario,"NAV Date");
BasePage.AssertExcel2("upload_transcode2", "Transaction Code 2", excelName, Scenario,"Trans Code");
BasePage.AssertExcel2("upload_quantity2", "Units 2", excelName, Scenario,"Quantity");
BasePage.AssertExcel2("upload_price2", "Price", excelName, Scenario,"Price");
BasePage.AssertExcel2("upload_AmountTcy2", "Amount Tcy 2", excelName, Scenario,"Amount Tcy");		
BasePage.AssertExcel2("upload_Glaccount2", "Bank Code", excelName, Scenario,"Gl Account Code");

test.log(Status.INFO, "Click on More Info Close");
BasePage.click_hexgendash("close_moreInfo");

Thread.sleep(5000);

   
}

public static void UploadPortfolioSubred_Confirmation(String excelName,String Scenario) throws Exception {
	
	
	test.log(Status.INFO, "Click on Approve");
   BasePage.click_hexgendash("upload_BOE_approve");
   
   test.log(Status.INFO, "Click on Approve in Remarks");
   BasePage.click_hexgendash("upload_remarks_approve");
  	
  //	test.log(Status.INFO, "Verifying Portfolio Subscription Form Approval Validation");
  //	BasePage.AssertExcel2("sub_assert", "Confirm", excelName, Scenario,"Validation");
   if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
	{
     BasePage.AssertText("sub_assert");
     test.log(Status.INFO,"Validation :"+ BasePage.Asserttext);
}

  	
  	BasePage.horizontalRight();
   
   test.log(Status.INFO, "Click on Hexgen User");
   //text="Hexgen User";
   BasePage.click_hexgendash("hexgen_user");
   Thread.sleep(2000);
   
   
   test.log(Status.INFO, "Click on Logout");
   BasePage.click_hexgendash("hexgen_logout");
   Thread.sleep(2000);
}


public static void Manual_NAVClosing(String excelName,String Scenario) throws Exception {

	 if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
		{
		
		BasePage.click1("critical_alerts_close");
		}
	 
	 if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
		{Thread.sleep(1000);
		BasePage.click1("pending");
		Thread.sleep(2000);
		}
   test.log(Status.INFO, "Click on Process");
   BasePage.click_hexgendash("Process");
   
   if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
	{Thread.sleep(1000);
	BasePage.click1("pending");
	Thread.sleep(2000);
	}
   
   test.log(Status.INFO, "Click on Manual NAV Closing");
    BasePage.click_hexgendash("Manual_NAV_Closing");
   
   test.log(Status.INFO, "Enter and Select Portfolio");
	BasePage.enterText("Manual_portfolio", "Portfolio",excelName, Scenario);
	BasePage.click_hexgendash("Manualport_aicf");
	
 	Thread.sleep(1000);
 	
   test.log(Status.INFO, "Click on Submit");
	BasePage.click_hexgendash("manual_submit");
	Thread.sleep(1000);
	
	
	 test.log(Status.INFO, "Click on Tick icon");
	BasePage.click_hexgendash("popup_tick");
	Thread.sleep(1000);
	
	if(BasePage.checkelementpresent1(readobjectRepo("DuplicateJob"))==true)
	{
		BulkDepositMaturityPage BD=new BulkDepositMaturityPage();
			BasePage.click_hexgendash("Refresh");
			BD.Manual_NAVClosing(excelName, Scenario);
	}
 	
 	
  	if(BasePage.checkelementpresent1(readobjectRepo("NAVClosingStarted"))==true) {
  		
  		BasePage.AssertExcel2("NAVClosingStarted", "Manual Nav Closing", excelName, Scenario,"Validation");
  		
		  
		 
		         BasePage.loadTime("intraday_Complete");
				
		         Thread.sleep(1000);}
 	

 	
  	else {
  		 if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
			{
  			BasePage.AssertExcel2("sub_assert", "Manual Nav Closing", excelName, Scenario,"Validation");
		}
  	}

	
 if(BasePage.checkelementpresent1(readobjectRepo("manual_override"))==true)
	{
   	test.log(Status.INFO, "Click on Override Tick icon");
  	// text="Checkbox";
   	BasePage.scrollintoview("manual_override");
   	BasePage.click_hexgendash("manual_override");
   	Thread.sleep(1000);
   	
   // test.log(Status.INFO, "Enter Remarks");
 	//BasePage.enterText("manual_remarks", "Manual Remarks",excelName, Scenario);
  //	Thread.sleep(1000);
  	

 	 test.log(Status.INFO, "Click on Remarks Tick icon");
 	// text="Checkbox";
  	BasePage.click_hexgendash("manualremarks_tick");
  	Thread.sleep(1000);
   	
  	BasePage.AssertText("sub_assert");
  
  		 if(BasePage.checkelementpresent1(readobjectRepo("OverrideApprove"))==true)
			{
  			BasePage.AssertExcel2("OverrideApprove", "Depo Validation", excelName, Scenario,"Validation");
  			
  		
  	
  		         BasePage.loadTime("intraday_Complete");
  					
  		         Thread.sleep(1000);
		}
   	
   	
  	
  
 	

 	
  	else {
  		//test.log(Status.INFO, "Verifying Manual NAV Closing Validation");
  	   	//BasePage.AssertExcel2("sub_assert", "remarks", excelName, Scenario,"Validation");
  		 if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
			{
  			BasePage.AssertExcel2("sub_assert", "Depo Validation", excelName, Scenario,"Validation");
		}
		
  		
  	}}
	
}






public static void ManualNAVClosing_IntradayFreeze(String excelName,String Scenario) throws Exception {

	 if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
		{
		
		BasePage.click1("critical_alerts_close");
		}
	 
	 if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
		{Thread.sleep(1000);
		BasePage.click1("pending");
		Thread.sleep(2000);
		}
  test.log(Status.INFO, "Click on Process");
  BasePage.click_hexgendash("Process");
  
  if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
	{Thread.sleep(1000);
	BasePage.click1("pending");
	Thread.sleep(2000);
	}
  
  test.log(Status.INFO, "Click on Manual NAV Closing");
   BasePage.click_hexgendash("Manual_NAV_Closing");
  
  test.log(Status.INFO, "Enter and Select Portfolio");
	BasePage.enterText("Manual_portfolio", "Portfolio",excelName, Scenario);
	BasePage.click_hexgendash("Manualport_aicf");
	
	Thread.sleep(1000);
	
	test.log(Status.INFO, "Enter Date Upto");
	BasePage.enterText("Date_upto", "Settlement Date",excelName, Scenario);
  
  test.log(Status.INFO, "Click on Submit");
	BasePage.click_hexgendash("manual_submit");
	Thread.sleep(1000);
	
	
	 test.log(Status.INFO, "Click on Tick icon");
	BasePage.click_hexgendash("popup_tick");
	Thread.sleep(1000);

	if(BasePage.checkelementpresent1(readobjectRepo("DuplicateJob"))==true)
	{
		BulkDepositMaturityPage BD=new BulkDepositMaturityPage();
			BasePage.click_hexgendash("Refresh");
			BD.ManualNAVClosing_IntradayFreeze(excelName, Scenario);
	}
 	
 	
  	if(BasePage.checkelementpresent1(readobjectRepo("NAVClosingStarted"))==true) {
  		
  		BasePage.AssertExcel2("NAVClosingStarted", "Manual Nav Closing", excelName, Scenario,"Validation");
  		
		  
		 
		         BasePage.loadTime("intraday_Complete");
				
		         Thread.sleep(1000);}
 	

 	
  	else {
  		 if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
			{
  			BasePage.AssertExcel2("sub_assert", "Manual Nav Closing", excelName, Scenario,"Validation");
		}
  	}

	
 if(BasePage.checkelementpresent1(readobjectRepo("manual_override"))==true)
	{
   	test.log(Status.INFO, "Click on Override Tick icon");
  	// text="Checkbox";
   	BasePage.scrollintoview("manual_override");
   	BasePage.click_hexgendash("manual_override");
   	Thread.sleep(1000);
   	
   // test.log(Status.INFO, "Enter Remarks");
 	//BasePage.enterText("manual_remarks", "Manual Remarks",excelName, Scenario);
  //	Thread.sleep(1000);
  	

 	 test.log(Status.INFO, "Click on Remarks Tick icon");
 	// text="Checkbox";
  	BasePage.click_hexgendash("manualremarks_tick");
  	Thread.sleep(1000);
   	
  	BasePage.AssertText("sub_assert");
  
  		 if(BasePage.checkelementpresent1(readobjectRepo("OverrideApprove"))==true)
			{
  			BasePage.AssertExcel2("OverrideApprove", "Depo Validation", excelName, Scenario,"Validation");
  			
  		
  	
  		         BasePage.loadTime("intraday_Complete");
  					
  		         Thread.sleep(1000);
		}
   	
   	
  	
  
 	

 	
  	else {
  		//test.log(Status.INFO, "Verifying Manual NAV Closing Validation");
  	   	//BasePage.AssertExcel2("sub_assert", "remarks", excelName, Scenario,"Validation");
  		 if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
			{
  			BasePage.AssertExcel2("sub_assert", "Depo Validation", excelName, Scenario,"Validation");
		}
		
  		
  	}}
 	
}	

}
