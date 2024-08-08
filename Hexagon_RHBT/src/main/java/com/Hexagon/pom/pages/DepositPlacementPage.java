package com.Hexagon.pom.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Hexagon.base.BasePage;
import com.aventstack.extentreports.Status;

public class DepositPlacementPage extends BasePage{

	public static String ExcelFileName = BasePage.readURLTestDataProp("MoneyMarket_TestData");

public static void DepositPlacement(String excelName,String Scenario,String data) throws Exception {
		

    	
    	//test.log(Status.INFO, "Creating Manual Portfolio Subred for future date with Settlement Date(T+1)");
    	if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
    		{
    		BasePage.click1("critical_alerts_close");
    		}
    	
    	 if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
    		{Thread.sleep(1000);
    		BasePage.click1("pending");
    		Thread.sleep(2000);
    		}
    	test.log(Status.INFO, "Click on Transactions");
    	BasePage.click_hexgendash("transactions");
    	
    	 if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
    		{Thread.sleep(1000);
    		BasePage.click1("pending");
    		Thread.sleep(2000);
    		}
    	test.log(Status.INFO, "Click on Investment");
    	BasePage.click_hexgendash("investment");
    	Thread.sleep(1000);
 
    	test.log(Status.INFO, "Click on Deposit Placement");
        BasePage.click_hexgendash("DepositPlacement");
       Thread.sleep(1000);
       
        test.log(Status.INFO, "Enter and Select Asset Class");
        BasePage.enterText("Depo_assetClass","Asset Class",excelName,Scenario);
        BasePage.click_hexgendash("Depo_assetClass_REP");
       Thread.sleep(1000);
       
       test.log(Status.INFO, "Enter Transaction Date");
   	BasePage.enterText("Depo_TransDate", "Transaction Date", excelName, Scenario);
   	
   	Thread.sleep(7000);
   	test.log(Status.INFO, "Enter Term");
    BasePage.clearWebField("Depo_term");
   	BasePage.enterText("Depo_term", "Term", excelName, Scenario);
   	
   	BasePage.click_hexgendash("Depo_Assetclassname");
   	
   	Thread.sleep(3000);
   	test.log(Status.INFO, "Verifying Values");
	BasePage.AssertExcel_ByreadingTextbox("Depo_maturitydate", "Maturity Date", excelName, Scenario,"Maturity Date");
	BasePage.AssertExcel_ByreadingTextbox("Depo_startDate", "Transaction Date", excelName, Scenario,"Accr Start Date");
	BasePage.AssertExcel_ByreadingTextbox("Depo_dueDate", "Maturity Date", excelName, Scenario,"Next Due Date");
	
   	
   	test.log(Status.INFO, "Enter and Select Counterparty");
   	BasePage.enterText("Depo_counterparty", "Counterparty", excelName, Scenario);
    BasePage.click_hexgendash("Depo_CounterParty"); 
    /*   test.log(Status.INFO, "Enter and Select Portfolio Class");
       BasePage.enterText("Portfolio_class","Portfolio Class",excelName,Scenario);
       BasePage.click_hexgendash("Portfolio_class_MYR");
      Thread.sleep(1000);*/
        
   
       test.log(Status.INFO, "Enter Interest rate");
       BasePage.clearWebField("Depo_interestRate");
   	BasePage.enterText("Depo_interestRate", "Interest Rate", excelName, Scenario);
   	Thread.sleep(1000);
   	
    test.log(Status.INFO, "Enter Amount");
    BasePage.clearWebField("Depo_amount");
   	BasePage.enterText("Depo_amount", "Amount", excelName, Scenario);
      //  BasePage.clearWebField("Transaction_date");
       Thread.sleep(1000); 
       
       if(data.equals("MultiCurrency")) {
       test.log(Status.INFO, "Enter Currency");
       BasePage.click1("Depo_currency");
       BasePage.scrollintoview("Depo_Currency");
       BasePage.click_hexgendash("Depo_Currency");
     //  BasePage.click_hexgendash("Depo_enterCurrrency");
     //  BasePage.click_hexgendash("Depo_selectCurrency");
          Thread.sleep(1000); }
          
       test.log(Status.INFO, "Click on Deposit Transaction Add icon");
       BasePage.scrollintoview("Depo_add");
       BasePage.click_hexgendash("Depo_add");
      Thread.sleep(1000);
     	
     	
     	 test.log(Status.INFO, "Enter and Select Portfolio");
         BasePage.enterText("Depo_portfolio","Portfolio",excelName, Scenario);
         BasePage.click_hexgendash("Depo_portfoliohaxagon");
        Thread.sleep(1000);
             
       // BasePage.clearWebField("units");
         test.log(Status.INFO, "Enter Amount");
         BasePage.clearWebField("Depo_Amount");
         BasePage.enterText("Depo_Amount", "Amount",excelName, Scenario);
         Thread.sleep(1000);
         
         BasePage.click_hexgendash("Depo_shortName");
         
         test.log(Status.INFO, "Verifying Values");
         BasePage.AssertExcel_ByreadingTextbox("Depo_shortName", "Short Name", excelName, Scenario,"Short Name");
         BasePage.scrollintoview("Depo_exchrate");
     	BasePage.AssertExcel_ByreadingTextbox("Depo_exchrate", "Exchange Rate", excelName, Scenario,"Exchange Rate");     	
     	BasePage.AssertExcel2("Depo_bankcode", "Bank Code", excelName, Scenario,"Bank Code");
     	BasePage.AssertExcel_ByreadingTextbox("Depo_InterestAmtTcy", "Interest Amount Tcy", excelName, Scenario,"Interest Amount Tcy");
     	BasePage.AssertExcel_ByreadingTextbox("Depo_AmountPcy", "Amount Pcy", excelName, Scenario,"Amount Pcy");
     	BasePage.AssertExcel_ByreadingTextbox("Depo_InterestAmtPcy", "Interest Amount Pcy", excelName, Scenario,"Interest Amount Pcy");
     	BasePage.AssertExcel_ByreadingTextbox("Depo_portfolioCcy", "Portfolio Ccy", excelName, Scenario,"Portfolio Ccy");
     	BasePage.scrollintoview("Depo_BankAccountCcy");
     	BasePage.AssertExcel2("Depo_BankAccountCcy", "Bank Account Ccy", excelName, Scenario,"Bank Account Ccy");
     	BasePage.AssertExcel_ByreadingTextbox("Depo_BankSettleAmtAcy", "Bank Settle Amount Acy", excelName, Scenario,"Bank Settle Amount Acy");
     	BasePage.AssertExcel_ByreadingTextbox("Depo_BankSettleAmtPcy", "Bank Settle Amount Pcy", excelName, Scenario,"Bank Settle Amount Pcy");
     	BasePage.AssertExcel_ByreadingTextbox("Depo_SettleExchangeRate", "Settle Exchange Rate", excelName, Scenario,"Settlement Exchange Rate");
     	BasePage.scrollintoview("Depo_PortfolioCcy");
     	BasePage.AssertExcel2("Depo_PortfolioCcy", "Portfolio Ccy", excelName, Scenario,"Portfolio Ccy");		
    	BasePage.AssertExcel2("Depo_Assetclassname", "Asset Class Name", excelName, Scenario,"Asset Class Name");		    	
    	BasePage.AssertExcel2("Depo_counterpartyName", "Counterparty Name", excelName, Scenario,"Counterparty Name");		
    	BasePage.scrollintoview("Depo_TotalIntAmount");
    	BasePage.AssertExcel2("Depo_TotalIntAmount", "Total Int Amt", excelName, Scenario,"Total Interest Amount");
    	BasePage.AssertExcel2("Depo_TotalSettleValue", "Total Settle Value", excelName, Scenario,"Total Settlement Value");         
            
	}
	


public static void depoPlacement_submit(String excelName,String Scenario) throws Exception {
	 
	//BasePage.scrollintoview("submit");
	test.log(Status.INFO, "Click on Submit");
 BasePage.click_hexgendash("Depo_submit");
 
/* if(BasePage.checkelementpresent1(readobjectRepo("Depo_assert"))==true)
	{
   BasePage.AssertText("Depo_assert");
   test.log(Status.INFO,"Validation :"+ BasePage.Asserttext);
}*/
 
	
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
    	BasePage.click1("critical_alerts_close");
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
	BasePage.enterText("NAV_startdate", "Transaction Date",excelName, Scenario);
	
	
	test.log(Status.INFO, "Enter NAV End Date");
	BasePage.enterText("NAV_enddate", "Transaction Date",excelName, Scenario);
	
	
	
	
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

public static void RebuildNAV1(String excelName,String Scenario) throws Exception {

	 Thread.sleep(10000);
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
	BasePage.enterText("NAV_startdate", "Transaction Date",excelName, Scenario);
	
	
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
	BasePage.enterText("Begin_Date", "Transaction Date",excelName, Scenario);
	
 	Thread.sleep(2000);
 	
 	test.log(Status.INFO, "Enter End Date");
	BasePage.enterText("End_Date", "Transaction Date",excelName, Scenario);
	
	Thread.sleep(3000);
 	
	
	BasePage.enterText1("Report_portfolio", "Portfolio",excelName, Scenario);
	Thread.sleep(3000);
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
   
   test.log(Status.INFO, "Enter Counterparty in Search box");
   BasePage.enterText("report_search", "Module Ref",excelName, Scenario);
	
	test.log(Status.INFO, "Verifying Accounting Enquiry Report Details");
	
	if(BasePage.checkelementpresent1(readobjectRepo("ae_isreversed"))==true)
	{
		BasePage.AssertExcel2("accountingreport_portfolio","Portfolio", excelName, Scenario,"Portfolio");
	   	BasePage.AssertExcel2("ae_transdate","Transaction_Date", excelName, Scenario,"Transaction Date");
	  //	BasePage.AssertTransID("accountingreport_transID");
	   	BasePage.AssertExcel2("ae_moduleref","Module Ref", excelName, Scenario,"Module Reference");  
	   	BasePage.AssertExcel2("ae_currency","Currency", excelName, Scenario,"Currency");
	   	BasePage.AssertExcel2("ae_amounttcy","AE Amount Tcy", excelName, Scenario,"Amount Tcy");
		BasePage.AssertExcel2("ae_amountpcy","AE Amount Pcy", excelName, Scenario,"Amount Pcy");
		BasePage.AssertExcel2("ae_transcode","Trans Code", excelName, Scenario,"Transaction Code");
		BasePage.AssertExcel2("ae_assetclass","AE Asset Class", excelName, Scenario,"Asset Class");
		BasePage.AssertExcel2("ae_counterparty","AE Counterparty", excelName, Scenario,"Counterparty");
		BasePage.AssertExcel2("ae_isreversed","Is Reversed", excelName, Scenario,"Is Reversed");
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
	else {
		test.log(Status.FAIL, "Deposit Placement is not reflected in Accounting Enquiry Report");
		
	}

}

public static void Verifying_BankTransactions_Report(String excelName,String Scenario) throws Exception {

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
   
   BasePage.checkelementpresent(readobjectRepo("banktransactions_portfolio"));
   
  // test.log(Status.INFO, "Enter and Select Portfolio");
   //BasePage.clearWebField("banktransactions_portfolio");
  // BasePage.enterText("banktransactions_portfolio", "Portfolio",excelName, Scenario);
	//BasePage.click_hexgendash("banktransactions_aicf");
   
   test.log(Status.INFO, "Enter Begin Date");
	BasePage.enterText("banktrans_begindate", "Transaction Date",excelName, Scenario);
	
 	Thread.sleep(1000);
 	
 	test.log(Status.INFO, "Enter End Date");
	BasePage.enterText("banktrans_enddate", "Transaction Date",excelName, Scenario);
	
	
	  	
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
 
   
   test.log(Status.INFO, "Verifying Bank Transactions Report Details");
 	verifying_banktransactions_report1_RHBT(excelName, Scenario);
   
 	
 	Thread.sleep(5000);
 	BasePage.CloseTab();
   

}

public static void verifying_banktransactions_report_RHBT(String excelName,String Scenario) throws Exception {
	String actual="";
	String expected="";
	String actual1="";
	String expected1="";
	String actual2="";
	String expected2="";
	String actual3="";
	String expected3="";
	String actual4="";
	String expected4="";
	
	int loop=0;
	int entry=0;
	int entry1=0;
	try {
		
		WebElement el = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[3]"));
		 actual = el.getText();
		 System.out.println(actual);
		if(actual.equals("Portfolio : HAXAGONMYR - HAXAGON MYR Fund"))
    	{
			 expected ="Portfolio : HAXAGONMYR - HAXAGON MYR Fund";
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
    	WebElement ele = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[6]"));
		 actual = ele.getText();
		 System.out.println(actual);
		if(actual.equals("5,000.00"))
    	{
			 expected ="5,000.00";
			Assert.assertEquals(actual, expected);
			test.log(Status.PASS,"Debit = Expected: " + expected + " <-----> Actual: " + actual);
			entry=1;
			}
		
		
}}}
    for(int i=8;i<25;i++)
    {
    	 loop=i;
    	String xpath="/html/body/table/tbody/tr["+i+"]/td[6]";
    	if(entry1==0) {
    	if(checkelementpresent1(xpath)==true) 
    	{
    	WebElement ele = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[6]"));
		 actual = ele.getText();
		 System.out.println(actual);
		if(actual.equals("7,875.00"))
    	{
			 expected ="7,875.00";
			Assert.assertEquals(actual, expected);
			test.log(Status.PASS,"Debit = Expected: " + expected + " <-----> Actual: " + actual);
			entry1=1;
			}
		
}}}
    if(entry==0) {
		test.log(Status.FAIL,"Full Settlement Amount - 15,000.65 is not reflected in Bank Transactions Report");
		//reportFailure("Assertion Failed");
		takeScreenShot();
		}
    if(entry1==0) {
		test.log(Status.FAIL,"Partial Settlement Amount- 7,875.00 is not reflected in Bank Transactions Report");
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
public static void verifying_banktransactions_report1_RHBT(String excelName,String Scenario) throws Exception {
	String actual="";
	String expected="";
	String actual1="";
	String expected1="";
	String actual2="";
	String expected2="";
	String actual3="";
	String expected3="";
	String actual4="";
	String expected4="";
	
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
	//		 expected ="(5,000.00)";
	//		Assert.assertEquals(actual, expected);
	//		test.log(Status.PASS,"Credit = Expected: " + expected + " <-----> Actual: " + actual);
			entry=1;
			
			
			String xpath1="/html/body/table/tbody/tr["+i+"]/td[2]";
		WebElement ele1 = driver.findElement(By.xpath(xpath1));
		 actual = ele1.getText();
		 System.out.println(actual);
			BasePage.AssertExcel1(xpath1, "Trans Code", excelName, Scenario, "Trans Code");
	//		 expected ="(5,000.00)";
	//		Assert.assertEquals(actual, expected);
	//		test.log(Status.PASS,"Credit = Expected: " + expected + " <-----> Actual: " + actual);
			entry=1;
			
			String xpath2="/html/body/table/tbody/tr["+i+"]/td[3]";	
		WebElement ele2 = driver.findElement(By.xpath(xpath2));
		 actual = ele2.getText();
		 System.out.println(actual);
			BasePage.AssertExcel1(xpath2, "AE Counterparty", excelName, Scenario, "Counterparty");
	//		 expected ="(5,000.00)";
	//		Assert.assertEquals(actual, expected);
	//		test.log(Status.PASS,"Credit = Expected: " + expected + " <-----> Actual: " + actual);
			entry=1;
			
			}
		
		
		
		
}}}
    
    if(entry==0) {
		test.log(Status.FAIL,"Deposit Placement Amount- 5,000.00 is not reflected in Bank Transactions Report");
		//reportFailure("Assertion Failed");
		takeScreenShot();
		}
    /*if(entry1==0) {
		test.log(Status.FAIL,"Reversed Partial Settlement Amount- 7,875.00 is not reflected in Bank Transactions Report");
		//reportFailure("Assertion Failed");
		takeScreenShot();
		}*/
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
 		DepositPlacementPage BD=new DepositPlacementPage();
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
	BasePage.enterText("Date_upto", "On Maturity/Early Maturity",excelName, Scenario);
  
  test.log(Status.INFO, "Click on Submit");
	BasePage.click_hexgendash("manual_submit");
	Thread.sleep(1000);
	
	
	 test.log(Status.INFO, "Click on Tick icon");
	BasePage.click_hexgendash("popup_tick");
	Thread.sleep(1000);

	if(BasePage.checkelementpresent1(readobjectRepo("DuplicateJob"))==true)
	{
 		DepositPlacementPage BD=new DepositPlacementPage();
			BasePage.click_hexgendash("Refresh");
			BD.ManualNAVClosing_IntradayFreeze(excelName, Scenario);
	}
 	
 	
  	if(BasePage.checkelementpresent1(readobjectRepo("NAVClosingStarted"))==true) {
  		
  		BasePage.AssertExcel2("NAVClosingStarted", "Manual Nav Closing", excelName, Scenario,"Validation");
  		
  		Thread.sleep(240000);
		 
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
  			
  		
  			Thread.sleep(240000);
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
