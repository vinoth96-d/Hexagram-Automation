package com.Hexagon.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Hexagon.base.BasePage;
import com.aventstack.extentreports.Status;

public class Portfolio_SubRed extends BasePage{


public static void Portfolio_subscription_T1(String excelName,String Scenario) throws Exception {
		

    	
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
    	Thread.sleep(1000);
 
    	if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
		{Thread.sleep(1000);
		BasePage.click1("pending");
		Thread.sleep(2000);
		}
    	test.log(Status.INFO, "Click on Capital");
        BasePage.click_hexgendash("capital");
       Thread.sleep(1000);
       
        test.log(Status.INFO, "Click on Portfolio Subred");
        BasePage.click_hexgendash("portfolio_subred");
        Thread.sleep(1000);
      
        test.log(Status.INFO, "Enter and Select Portfolio");
        BasePage.enterText("Portfolio","Portfolio",excelName,Scenario);
        BasePage.click_hexgendash("portfolio_AICF");
       Thread.sleep(1000);
       
  /*     test.log(Status.INFO, "Enter and Select Portfolio Class");
       BasePage.enterText("Portfolio_class","Portfolio Class",excelName,Scenario);
       BasePage.click_hexgendash("Portfolio_class_MYR");
      Thread.sleep(1000);*/
        
       test.log(Status.INFO, "Verifying the values After selected Portfolio");
   	BasePage.AssertExcel2("portfolioPlan","Portfolio Plan", excelName, Scenario,"Portfolio Plan");
   	BasePage.AssertExcel_ByreadingTextbox("Trade_date", "Reset", excelName, Scenario,"Trade Date");
	BasePage.AssertExcel_ByreadingTextbox("Transaction_date", "Reset", excelName, Scenario,"Transaction Date");
	BasePage.AssertExcel2("sourceCapital", "Source Capital", excelName, Scenario,"Source Capital");
	BasePage.AssertExcel2("Currency_subred", "Currency", excelName, Scenario,"Currency");
	//BasePage.AssertExcel_ByreadingTextbox("Price", "Base Price", excelName, Scenario,"Price");
//	BasePage.AssertExcel_ByreadingTextbox("Settlementdate", "Base Settlement Date", excelName, Scenario,"Settlement Date");
	BasePage.AssertExcel2("Bankcode", "Bank Code", excelName, Scenario,"Bank Code");
	BasePage.AssertExcel2("SettlementCcy", "Settlement Ccy", excelName, Scenario,"Settlement Ccy");
	BasePage.AssertExcel_ByreadingTextbox("settle_exchangerate", "Settle Exch Rate", excelName, Scenario,"Settle Exch Rate");
	BasePage.AssertExcel2("SettlementMode", "Settlement Mode", excelName, Scenario,"Settlement Mode");
//	BasePage.AssertExcel_ByreadingTextbox("BankTransDate", "Base Settlement Date", excelName, Scenario,"Bank Trans Date");
	BasePage.AssertExcel2("portfolioName", "Portfolio Name", excelName, Scenario,"Portfolio Name");		
	BasePage.AssertExcel2("portfolioCcy", "Portfolio Ccy", excelName, Scenario,"Portfolio Ccy");		
//	BasePage.AssertExcel2("UnitsOuts", "Units Outs", excelName, Scenario,"Units Outs");
//	BasePage.AssertExcel2("NAVPerUnit", "NAV Per Unit", excelName, Scenario,"NAV Per Unit");  	
     //  BasePage.clearWebField("Trade_date");
      Thread.sleep(1000); 
       test.log(Status.INFO, "Enter Trade Date");
   	BasePage.enterText("Trade_date", "Trade date", excelName, Scenario);
  
    
      //  BasePage.clearWebField("Transaction_date");
       Thread.sleep(1000); 
        test.log(Status.INFO, "Enter Transaction Date");
    	BasePage.enterText("Transaction_date", "Transaction_Date", excelName, Scenario);
   
     	
     
     	Thread.sleep(1000);
     	 test.log(Status.INFO, "Enter and Select Transaction Code");
         BasePage.enterText("Transaction_code","Transaction Code",excelName, Scenario);
         BasePage.click_hexgendash("UNSAL_transaction");
        Thread.sleep(1000);
             
        BasePage.clearWebField("units");
         test.log(Status.INFO, "Enter Units");
         BasePage.enterText("units", "Units",excelName, Scenario);
         Thread.sleep(1000);
         
      
         BasePage.clearWebField("Price");      
         test.log(Status.INFO, "Enter Price");
         BasePage.enterText("Price", "Price",excelName, Scenario);
         Thread.sleep(2000);
         BasePage.click1("BankAmountAcy");
         
         Thread.sleep(3000);
         test.log(Status.INFO, "Verifying the Values after entered Units and Price");
  
         
     	BasePage.AssertExcel_ByreadingTextbox("AmountTcy", "Amount Tcy", excelName, Scenario,"Amount Tcy");
    	BasePage.AssertExcel2("unitcapital", "Unit Capital", excelName, Scenario,"Unit Capital");		
    	BasePage.AssertExcel2("unitpremium", "Unit Premium", excelName, Scenario,"Unit Premium");		
    	BasePage.AssertExcel2("BankAmountAcy", "Bank Amount Acy", excelName, Scenario,"Bank Amount Acy");		
    	BasePage.AssertExcel2("SettleAmountPcy", "Settle Amount Pcy", excelName, Scenario,"Settle Amount Pcy");
    	

    	
   

       // test.log(Status.INFO, "Verifying Dividend Equalisation Reserve");
    	//BasePage.AssertText("divequ_reserve_title");
    	//BasePage.AssertExcel_ByreadingTextbox("divequ_reserve", "Div Equ Reserve", excelName, Scenario);
             
         BasePage.scrollintoview("Settlementdate");
           //  BasePage.clearWebField("settlement_date");
             Thread.sleep(1000);
             test.log(Status.INFO, "Enter Settlement Date");
             BasePage.enterText("Settlementdate", "Settlement Date",excelName, Scenario);
   //          Thread.sleep(2000);
             
             
             
            
	}
	


public static void Portfolio_subscription_T2(String excelName,String Scenario) throws Exception {
	
	if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
	{
	BasePage.click1("critical_alerts_close");
	
	}
	
	if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
	{Thread.sleep(1000);
	BasePage.click1("pending");
	Thread.sleep(2000);
	}
	//test.log(Status.INFO, "Creating Manual Portfolio Subred for future date with Settlement Date(T+2)");
	test.log(Status.INFO, "Click on Transactions");
	
	BasePage.click_hexgendash("transactions");
	Thread.sleep(1000);

	if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
	{Thread.sleep(1000);
	BasePage.click1("pending");
	Thread.sleep(2000);
	}
	test.log(Status.INFO, "Click on Capital");
    BasePage.click_hexgendash("capital");
   Thread.sleep(1000);
   
    test.log(Status.INFO, "Click on Portfolio Subred");
    BasePage.click_hexgendash("portfolio_subred");
    Thread.sleep(1000);
  
    test.log(Status.INFO, "Enter and Select Portfolio");
    BasePage.enterText("Portfolio","Portfolio",excelName,Scenario);
    BasePage.click_hexgendash("portfolio_AICF");
   Thread.sleep(1000);
   
 /*  test.log(Status.INFO, "Enter and Select Portfolio Class");
   BasePage.enterText("Portfolio_class","Portfolio Class",excelName,Scenario);
   BasePage.click_hexgendash("Portfolio_class_MYR");
  Thread.sleep(1000);*/
    
   test.log(Status.INFO, "Verifying the values After selected Portfolio");
	BasePage.AssertExcel2("portfolioPlan","Portfolio Plan", excelName, Scenario,"Portfolio Plan");
	BasePage.AssertExcel_ByreadingTextbox("Trade_date", "Reset", excelName, Scenario,"Trade Date");
BasePage.AssertExcel_ByreadingTextbox("Transaction_date", "Reset", excelName, Scenario,"Transaction Date");
BasePage.AssertExcel2("sourceCapital", "Source Capital", excelName, Scenario,"Source Capital");
BasePage.AssertExcel2("Currency_subred", "Currency", excelName, Scenario,"Currency");
//BasePage.AssertExcel_ByreadingTextbox("Price", "Base Price", excelName, Scenario,"Price");
//BasePage.AssertExcel_ByreadingTextbox("Settlementdate", "Base Settlement Date", excelName, Scenario,"Settlement Date");
BasePage.AssertExcel2("Bankcode", "Bank Code", excelName, Scenario,"Bank Code");
BasePage.AssertExcel2("SettlementCcy", "Settlement Ccy", excelName, Scenario,"Settlement Ccy");
BasePage.AssertExcel_ByreadingTextbox("settle_exchangerate", "Settle Exch Rate", excelName, Scenario,"Settle Exch Rate");
BasePage.AssertExcel2("SettlementMode", "Settlement Mode", excelName, Scenario,"Settlement Mode");
//BasePage.AssertExcel_ByreadingTextbox("BankTransDate", "Base Settlement Date", excelName, Scenario,"Bank Trans Date");
BasePage.AssertExcel2("portfolioName", "Portfolio Name", excelName, Scenario,"Portfolio Name");		
BasePage.AssertExcel2("portfolioCcy", "Portfolio Ccy", excelName, Scenario,"Portfolio Ccy");		
//BasePage.AssertExcel2("UnitsOuts", "Units Outs", excelName, Scenario,"Units Outs");
//BasePage.AssertExcel2("NAVPerUnit", "NAV Per Unit", excelName, Scenario,"NAV Per Unit");  	
 //  BasePage.clearWebField("Trade_date");
  Thread.sleep(1000); 
   test.log(Status.INFO, "Enter Trade Date");
	BasePage.enterText("Trade_date", "Trade date", excelName, Scenario);


  //  BasePage.clearWebField("Transaction_date");
   Thread.sleep(1000); 
    test.log(Status.INFO, "Enter Transaction Date");
	BasePage.enterText("Transaction_date", "Transaction_Date", excelName, Scenario);

 	
 
 	Thread.sleep(1000);
 	 test.log(Status.INFO, "Enter and Select Transaction Code");
     BasePage.enterText("Transaction_code","Transaction Code",excelName, Scenario);
     BasePage.click_hexgendash("UNSAL_transaction");
    Thread.sleep(1000);
         
    BasePage.clearWebField("units");
     test.log(Status.INFO, "Enter Units");
     BasePage.enterText("units", "Units",excelName, Scenario);
     Thread.sleep(1000);
     
  
     BasePage.clearWebField("Price");      
     test.log(Status.INFO, "Enter Price");
     BasePage.enterText("Price", "Price",excelName, Scenario);
     Thread.sleep(2000);
     BasePage.click1("BankAmountAcy");
     
     Thread.sleep(3000);
     test.log(Status.INFO, "Verifying the Values after entered Units and Price");
   
     
 	BasePage.AssertExcel_ByreadingTextbox("AmountTcy", "Amount Tcy", excelName, Scenario,"Amount Tcy");
	BasePage.AssertExcel2("unitcapital", "Unit Capital", excelName, Scenario,"Unit Capital");		
	BasePage.AssertExcel2("unitpremium", "Unit Premium", excelName, Scenario,"Unit Premium");		
	BasePage.AssertExcel2("BankAmountAcy", "Bank Amount Acy", excelName, Scenario,"Bank Amount Acy");		
	BasePage.AssertExcel2("SettleAmountPcy", "Settle Amount Pcy", excelName, Scenario,"Settle Amount Pcy");
	

	


   // test.log(Status.INFO, "Verifying Dividend Equalisation Reserve");
	//BasePage.AssertText("divequ_reserve_title");
	//BasePage.AssertExcel_ByreadingTextbox("divequ_reserve", "Div Equ Reserve", excelName, Scenario);
         
     BasePage.scrollintoview("Settlementdate");
       //  BasePage.clearWebField("settlement_date");
         Thread.sleep(1000);
         test.log(Status.INFO, "Enter Settlement Date");
         BasePage.enterText("Settlementdate", "Settlement Date",excelName, Scenario);
//          Thread.sleep(2000);
         
         
         
        
        
}

public static void Portfolio_subscription_T0(String excelName,String Scenario) throws Exception {
	
	if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
	{
	BasePage.click1("critical_alerts_close");
	
	}
	//test.log(Status.INFO, "Creating Manual Portfolio Subred for future date with Settlement Date(T+0)");
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
	test.log(Status.INFO, "Click on Capital");
    BasePage.click_hexgendash("capital");
   Thread.sleep(1000);
   
    test.log(Status.INFO, "Click on Portfolio Subred");
    BasePage.click_hexgendash("portfolio_subred");
    Thread.sleep(1000);
  
    test.log(Status.INFO, "Enter and Select Portfolio");
    BasePage.enterText("Portfolio","Portfolio",excelName,Scenario);
    BasePage.click_hexgendash("portfolio_AICF");
   Thread.sleep(1000);
   
 /*  test.log(Status.INFO, "Enter and Select Portfolio Class");
   BasePage.enterText("Portfolio_class","Portfolio Class",excelName,Scenario);
   BasePage.click_hexgendash("Portfolio_class_MYR");
  Thread.sleep(1000);*/
    
   test.log(Status.INFO, "Verifying the values After selected Portfolio");
	BasePage.AssertExcel2("portfolioPlan","Portfolio Plan", excelName, Scenario,"Portfolio Plan");
	BasePage.AssertExcel_ByreadingTextbox("Trade_date", "Reset", excelName, Scenario,"Trade Date");
BasePage.AssertExcel_ByreadingTextbox("Transaction_date", "Reset", excelName, Scenario,"Transaction Date");
BasePage.AssertExcel2("sourceCapital", "Source Capital", excelName, Scenario,"Source Capital");
BasePage.AssertExcel2("Currency_subred", "Currency", excelName, Scenario,"Currency");
//BasePage.AssertExcel_ByreadingTextbox("Price", "Base Price", excelName, Scenario,"Price");
//BasePage.AssertExcel_ByreadingTextbox("Settlementdate", "Base Settlement Date", excelName, Scenario,"Settlement Date");
BasePage.AssertExcel2("Bankcode", "Bank Code", excelName, Scenario,"Bank Code");
BasePage.AssertExcel2("SettlementCcy", "Settlement Ccy", excelName, Scenario,"Settlement Ccy");
BasePage.AssertExcel_ByreadingTextbox("settle_exchangerate", "Settle Exch Rate", excelName, Scenario,"Settle Exch Rate");
BasePage.AssertExcel2("SettlementMode", "Settlement Mode", excelName, Scenario,"Settlement Mode");
//BasePage.AssertExcel_ByreadingTextbox("BankTransDate", "Base Settlement Date", excelName, Scenario,"Bank Trans Date");
BasePage.AssertExcel2("portfolioName", "Portfolio Name", excelName, Scenario,"Portfolio Name");		
BasePage.AssertExcel2("portfolioCcy", "Portfolio Ccy", excelName, Scenario,"Portfolio Ccy");		
//BasePage.AssertExcel2("UnitsOuts", "Units Outs", excelName, Scenario,"Units Outs");
//BasePage.AssertExcel2("NAVPerUnit", "NAV Per Unit", excelName, Scenario,"NAV Per Unit");  	
 //  BasePage.clearWebField("Trade_date");
  Thread.sleep(1000); 
   test.log(Status.INFO, "Enter Trade Date");
	BasePage.enterText("Trade_date", "Trade date", excelName, Scenario);


  //  BasePage.clearWebField("Transaction_date");
   Thread.sleep(1000); 
    test.log(Status.INFO, "Enter Transaction Date");
	BasePage.enterText("Transaction_date", "Transaction_Date", excelName, Scenario);

 	
 
 	Thread.sleep(1000);
 	 test.log(Status.INFO, "Enter and Select Transaction Code");
     BasePage.enterText("Transaction_code","Transaction Code",excelName, Scenario);
     BasePage.click_hexgendash("UNSAL_transaction");
    Thread.sleep(1000);
         
    BasePage.clearWebField("units");
     test.log(Status.INFO, "Enter Units");
     BasePage.enterText("units", "Units",excelName, Scenario);
     Thread.sleep(1000);
     
  
     BasePage.clearWebField("Price");      
     test.log(Status.INFO, "Enter Price");
     BasePage.enterText("Price", "Price",excelName, Scenario);
     Thread.sleep(2000);
     BasePage.click1("BankAmountAcy");
     
     Thread.sleep(3000);
     test.log(Status.INFO, "Verifying the Values after entered Units and Price");
   //  BasePage.horizontalRight();
   //  Thread.sleep(2000);
   //  BasePage.scrollintoview("unitcapital");
     
 	BasePage.AssertExcel_ByreadingTextbox("AmountTcy", "Amount Tcy", excelName, Scenario,"Amount Tcy");
	BasePage.AssertExcel2("unitcapital", "Unit Capital", excelName, Scenario,"Unit Capital");		
	BasePage.AssertExcel2("unitpremium", "Unit Premium", excelName, Scenario,"Unit Premium");		
	BasePage.AssertExcel2("BankAmountAcy", "Bank Amount Acy", excelName, Scenario,"Bank Amount Acy");		
	BasePage.AssertExcel2("SettleAmountPcy", "Settle Amount Pcy", excelName, Scenario,"Settle Amount Pcy");
	
     BasePage.scrollintoview("Settlementdate");
       //  BasePage.clearWebField("settlement_date");
         Thread.sleep(1000);
         test.log(Status.INFO, "Enter Settlement Date");
         BasePage.enterText("Settlementdate", "Settlement Date",excelName, Scenario);
//          Thread.sleep(2000);
         
         
         
        
}


public static void PortfolioSubscription_Submit(String excelName,String Scenario) throws Exception {
	 
	//BasePage.scrollintoview("submit");
	test.log(Status.INFO, "Click on Submit");
 BasePage.click_hexgendash("Submit");
 
 if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
	{
	 BasePage.AssertExcel2("sub_assert", "submit", excelName, Scenario,"Validation");
}
 
 

 else 
	
	 if(BasePage.checkelementpresent1(readobjectRepo("Tick"))==true)
		{
		 
		 test.log(Status.INFO, "Click on Tick icon");
		 BasePage.scrollintoview("Tick");
		 BasePage.click_hexgendash("Tick");
		 
		 test.log(Status.INFO, "Enter Remarks");
		 BasePage.enterText("sub_remarks", "Remarks",excelName, Scenario);
		 Thread.sleep(1000);
		 
		 test.log(Status.INFO, "Click on Remarks Tick icon");
		 BasePage.click_hexgendash("remarks_tick");
		 
		// test.log(Status.INFO, "Verifying Portfolio Subscription Form Submission Validation");
		// BasePage.AssertExcel2("sub_assert", "Submit", excelName, Scenario,"Validation");
		//	Thread.sleep(1000);
		 if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
			{
			 BasePage.AssertExcel2("sub_assert", "Override Validation", excelName, Scenario,"Validation");
		}
		}
 
 
 
}


public static void PortfolioSubred_Confirmation(String excelName,String Scenario,String ID) throws Exception {
	
	BasePage.horizontalRight();
	
	
	 
	 test.log(Status.INFO, "Click on Hexgen User");
	 BasePage.click_hexgendash("hexgen_user");
	 Thread.sleep(2000);
	 
	 
	 test.log(Status.INFO, "Click on Logout");
	 BasePage.click_hexgendash("hexgen_logout");
	 Thread.sleep(2000);
	 
	// BasePage.click1("Login_click");
	 
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
    
    Thread.sleep(10000);
    
    if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
	{
	
	}
    
    test.log(Status.INFO, "Click on More Info Icon");
	BasePage.click_hexgendash("sub_moreinfo");
	Thread.sleep(1000);
	
	
	 test.log(Status.INFO, "Reading Transaction ID");
   //  BasePage.AssertText("TransId_title");
     BasePage.Reading_id("Transid",ID);
     System.out.println(BasePage.Transid);
	
	 test.log(Status.INFO, "Click on Approve");
 	BasePage.click_hexgendash("subred_approve");
 	Thread.sleep(1000);
 	
 //	 test.log(Status.INFO, "Enter Remarks");
 //	BasePage.enterText("approve_remarks", "remarks",excelName, Scenario);
 // 	Thread.sleep(1000);
  	        	
  	
  	 test.log(Status.INFO, "Click on Remarks Tick icon");
  	// text="Checkbox";
   	BasePage.click_hexgendash("approve_tick");
   	Thread.sleep(1000);
   	
    if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
	{
    	BasePage.AssertExcel2("sub_assert", "Confirm", excelName, Scenario,"Validation");
}

    test.log(Status.INFO, "Click on Hexgen User");
    //text="Hexgen User";
    BasePage.click_hexgendash("hexgen_user");
    Thread.sleep(2000);
    
    
    test.log(Status.INFO, "Click on Logout");
    BasePage.click_hexgendash("hexgen_logout");
    Thread.sleep(2000);
 	
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
   
   
   test.log(Status.INFO, "Click on Upload");
   BasePage.click_hexgendash("upload");
   
   Thread.sleep(1000);
   
  // BasePage.saveExcel(data);

  // Thread.sleep(3000);
   
   test.log(Status.INFO, "Uploading Subred Excel File");
   
  
  BasePage.upload_file(data);
  
  Thread.sleep(10000);
  
  test.log(Status.INFO, "Click on Upload Dashboard");
  BasePage.click_hexgendash("upload_dashboard");
  
  Thread.sleep(10000);
  BasePage.checkelementpresent(readobjectRepo("upload_status"));
  BasePage.AssertText("upload_status");
  
  
if(checkelementpresent(readobjectRepo("upload_status1"))==true) {
	  
	  test.log(Status.INFO, "Verifying Upload Status");
	 	BasePage.AssertExcel2("upload_status1","Upload Status 1", excelName, Scenario,"Status");
  }
  
  else {
	  test.log(Status.INFO, "Verifying Upload Status");
	BasePage.AssertExcel2("upload_status","Upload Status 1", excelName, Scenario,"Status");}
	
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
   
   
   if(checkelementpresent(readobjectRepo("upload_status2"))==true) {
		  
		  test.log(Status.INFO, "Verifying Upload Status");
		 	BasePage.AssertExcel2("upload_status2","Upload Status 2", excelName, Scenario,"Status");
	  }
	  
	  else {
		  test.log(Status.INFO, "Verifying Upload Status");
		BasePage.AssertExcel2("upload_status","Upload Status 2", excelName, Scenario,"Status");}
   BasePage.AssertText("upload_status");
   
   
	
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

//test.log(Status.INFO, "Click on More Info Close");
BasePage.click1("close_moreInfo");

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
	   BasePage.AssertExcel2("sub_assert", "Confirm", excelName, Scenario,"Validation");
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

public static void Verifying_SubscriptionRedemption_Report(String excelName,String Scenario) throws Exception {

	if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
	{
	
	 BasePage.click1("critical_alerts_close");
	}
    test.log(Status.INFO, "Click on Reports");
    BasePage.click_hexgendash("Reports");
    
    Thread.sleep(1000);
    
    test.log(Status.INFO, "Click on Operations");
    BasePage.click_hexgendash("operations");
    
    Thread.sleep(1000);
    
    test.log(Status.INFO, "Click on NAV");
    BasePage.click_hexgendash("report_NAV");
    
    test.log(Status.INFO, "Click on Subscription/Redemption Report");
    BasePage.click_hexgendash("subred_report");
    
 //   test.log(Status.INFO, "Enter and Select Portfolio");
 //	BasePage.enterText("subred_report_portfolio", "Portfolio",excelName, Scenario);
 	Thread.sleep(1000);
 //	BasePage.click_hexgendash("subred_report_AICF");
 	
 	//test.log(Status.INFO, "Click on Subscription/Redemption");
    BasePage.click1("subred_report_global");
    
 	test.log(Status.INFO, "Enter Begin Date");
 	BasePage.enterText("subred_report_begin", "Subred Begin Date",excelName, Scenario);
 	
  	Thread.sleep(2000);
  	
  	test.log(Status.INFO, "Enter End Date");
 	BasePage.enterText("subred_report_end", "Subred End Date",excelName, Scenario);
 	
 	
  	BasePage.AssertText("subred_output");
	  	if(BasePage.Asserttext.equals("EXCEL")) {
	  		 test.log(Status.INFO, "Enter and Select Output");
	  		  	Thread.sleep(1000);
  	BasePage.click1("subred_output");
  	BasePage.click1("subred_output_excel");
  	BasePage.enterText("subred_output_type", "Subred Output",excelName, Scenario);
  	BasePage.click_hexgendash("subred_output_html");}
  	
 	
 	Thread.sleep(5000);
  		
 	test.log(Status.INFO, "Click on View Report");
    BasePage.click_hexgendash("subred_report_view");
    
   // test.log(Status.INFO, "Verifying Create Cancel Register Report Request Validation");
  //	BasePage.AssertExcel2("sub_assert","Bank Transactions Report Message", excelName, Scenario,"Validation");
    if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
	{
      BasePage.AssertText("sub_assert");
      test.log(Status.INFO,"Validation :"+ BasePage.Asserttext);
}

    
Thread.sleep(20000);
    
    BasePage.switchTab();
    
 	
    test.log(Status.INFO, "Verifying Subscription/Redemption Report");
  	BasePage.verifying_Subred_report();
  	
  	Thread.sleep(5000);
  	BasePage.CloseTab();
  	
  	
}

public static void UploadedSub_cancellation_T2(String excelName,String Scenario,String data) throws Exception {
	
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
	test.log(Status.INFO, "Click on Capital");
    BasePage.click_hexgendash("capital");
   Thread.sleep(1000);
   
    test.log(Status.INFO, "Click on Portfolio Subred Cancellation");
    BasePage.click_hexgendash("Subred_cancellation");
    Thread.sleep(1000);
    
    Thread.sleep(1000); 
    test.log(Status.INFO, "Enter Transaction Date");
	BasePage.enterText("Subred_cancellation_TransDate", "Trade date", excelName, Scenario);
	
	/*Thread.sleep(1000); 
    test.log(Status.INFO, "Enter and Select File Name");
    BasePage.enterText("Subred_cancellation_Filename", "File Name", excelName, Scenario);
	Thread.sleep(1000);
	BasePage.click_hexgendash("Subred_cancellation_Filename_subred");*/
	
	Thread.sleep(1000); 
    test.log(Status.INFO, "Enter and Select Transaction ID");
	BasePage.enterText_TransId("Subred_cancellation_TransId", data);
	
	BasePage.click_hexgendash("Subred_cancellation_TransID");
	
	test.log(Status.INFO, "Click on Load Data");
    BasePage.click_hexgendash("Subred_cancellation_LoadData");
   Thread.sleep(1000);
   
   test.log(Status.INFO, "Click on Check Box");
   BasePage.click_hexgendash("Subred_cancellation_checkbox");
  Thread.sleep(3000);
  
 // BasePage.AssertExcel2("Subred_cancel_portfolio", "Portfolio", excelName, Scenario,"Portfolio");		
//	BasePage.AssertExcel2("Subred_cancel_transcode", "Transaction Code", excelName, Scenario,"Trans Code");		
//	BasePage.AssertExcel2("Subred_cancel_Amounttcy", "Amount Tcy 1 Cancel", excelName, Scenario,"Amount Tcy");		
//	BasePage.AssertExcel2("Subred_cancel_Units", "Units 1 Cancel", excelName, Scenario,"Quantity");

  
  test.log(Status.INFO, "Click on Submit");
  BasePage.click_hexgendash("Subred_cancellation_submit");

 
 if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
	{
   BasePage.AssertText("sub_assert");
   BasePage.AssertExcel2("sub_assert", "Submit", excelName, Scenario,"Validation");
}

	
 // test.log(Status.INFO, "Verifying Portfolio Subscription Cancellation Form Submission Validation");
 // BasePage.AssertExcel2("sub_assert", "Submit", excelName, Scenario,"Validation");
 	Thread.sleep(1000);
	
 	BasePage.horizontalRight();
 	 
 	 test.log(Status.INFO, "Click on Hexgen User");
 	 BasePage.click_hexgendash("hexgen_user");
 	 Thread.sleep(2000);
 	 
 	 
 	 test.log(Status.INFO, "Click on Logout");
 	 BasePage.click_hexgendash("hexgen_logout");
 	 Thread.sleep(2000);
  
 	// BasePage.click1("Login_click");
		
		
 	
         
         
         
        
}
public static void Subred_cancellation_T1(String excelName,String Scenario) throws Exception {
	
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
	test.log(Status.INFO, "Click on Capital");
   BasePage.click_hexgendash("capital");
  Thread.sleep(1000);
  
   test.log(Status.INFO, "Click on Portfolio Subred Cancellation");
   BasePage.click_hexgendash("Subred_cancellation");
   Thread.sleep(1000);
   
   Thread.sleep(1000); 
   test.log(Status.INFO, "Enter Transaction Date");
	BasePage.enterText("Subred_cancellation_TransDate", "Trade date", excelName, Scenario);
	
	/*Thread.sleep(1000); 
   test.log(Status.INFO, "Enter and Select File Name");
   BasePage.enterText("Subred_cancellation_Filename", "File Name", excelName, Scenario);
	Thread.sleep(1000);
	BasePage.click_hexgendash("Subred_cancellation_Filename_subred");*/
	
	Thread.sleep(1000); 
   test.log(Status.INFO, "Enter and Select Transaction ID");
	BasePage.enterText_TransId("Subred_cancellation_TransId", "TransactionID1");
	BasePage.click_hexgendash("Subred_cancellation_TransID");
	
	test.log(Status.INFO, "Click on Load Data");
   BasePage.click_hexgendash("Subred_cancellation_LoadData");
  Thread.sleep(1000);
  
  test.log(Status.INFO, "Click on Check Box");
  BasePage.click_hexgendash("Subred_cancellation_checkbox");
 Thread.sleep(1000);
 
// BasePage.AssertExcel2("Subred_cancel_portfolio", "Portfolio", excelName, Scenario,"Portfolio");		
//	BasePage.AssertExcel2("Subred_cancel_transcode", "Transaction Code", excelName, Scenario,"Trans Code");		
//	BasePage.AssertExcel2("Subred_cancel_Amounttcy", "Amount Tcy 1 Cancel", excelName, Scenario,"Amount Tcy");		
//	BasePage.AssertExcel2("Subred_cancel_Units", "Units 1 Cancel", excelName, Scenario,"Quantity");

 
 test.log(Status.INFO, "Click on Submit");
 BasePage.click_hexgendash("Subred_cancellation_submit");
Thread.sleep(1000);
	
 //test.log(Status.INFO, "Verifying Portfolio Subred Cancellation Form Submission Validation");
 if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
	{
   BasePage.AssertText("sub_assert");
   test.log(Status.INFO,"Validation :"+ BasePage.Asserttext);
}

	      
       
}

public static void ApproveUploadedSub_cancellation_T2(String excelName,String Scenario) throws Exception {
	
	
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
    
	//BasePage.checkelementpresent("close_moreInfo");
    
	 test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(2000);
		
		 test.log(Status.INFO, "Click on Approve");
		 	BasePage.click_hexgendash("Subred_cancellation_Approve");
		 	Thread.sleep(1000);
		  	
		  	 test.log(Status.INFO, "Click on Remarks Tick icon");
		  	// text="Checkbox";
		   	BasePage.click_hexgendash("Subred_cancellation_Remarks_tick");
		   	Thread.sleep(3000);
		   	
		    if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
			{
		      BasePage.AssertText("sub_assert");
		      BasePage.AssertExcel2("sub_assert", "Confirm", excelName, Scenario,"Validation");
		}
		
   	
   //	test.log(Status.INFO, "Verifying Portfolio Subscription Form Approval Validation");
   //	BasePage.AssertExcel2("sub_assert", "Confirm", excelName, Scenario,"Validation");
   	
  	
   	BasePage.horizontalRight();
    
    test.log(Status.INFO, "Click on Hexgen User");
    //text="Hexgen User";
    BasePage.click_hexgendash("hexgen_user");
    Thread.sleep(2000);
    
    
    test.log(Status.INFO, "Click on Logout");
    BasePage.click_hexgendash("hexgen_logout");
    Thread.sleep(2000);
 	
   // BasePage.click1("Login_click");
         
        
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
    
    Thread.sleep(1000);
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
    
    test.log(Status.INFO, "Click on Submit");
	BasePage.click_hexgendash("manual_submit");
	Thread.sleep(1000);
	
	
	 test.log(Status.INFO, "Click on Tick icon");
 	BasePage.click_hexgendash("popup_tick");
 	Thread.sleep(1000);
 	
 	if(BasePage.checkelementpresent1(readobjectRepo("DuplicateJob"))==true)
	{
 		Portfolio_SubRed BD=new Portfolio_SubRed();
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
  			BasePage.AssertExcel2("OverrideApprove", "Override Validation", excelName, Scenario,"Validation");
  			
  		
  	
  		         BasePage.loadTime("intraday_Complete");
  					
  		         Thread.sleep(1000);
		}
   	
   	
  	
  
 	

 	
  	else {
  		//test.log(Status.INFO, "Verifying Manual NAV Closing Validation");
  	   	//BasePage.AssertExcel2("sub_assert", "remarks", excelName, Scenario,"Validation");
  		 if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
			{
  			BasePage.AssertExcel2("sub_assert", "Override Validation", excelName, Scenario,"Validation");
		}
		
  		
  	}}
 	
}



public static void Verifying_AccountingEnquiry_Report(String excelName,String Scenario) throws Exception {
	 Thread.sleep(15000);
    
    test.log(Status.INFO, "Click on Reports");
    BasePage.click_hexgendash("Reports");
    
    Thread.sleep(1000);
    
    test.log(Status.INFO, "Click on Enquiries");
    BasePage.click_hexgendash("Enquiries");
    
    test.log(Status.INFO, "Click on Accounting");
    BasePage.click_hexgendash("Accounting");
    
    test.log(Status.INFO, "Click on Accounting Enquiry");
    BasePage.click_hexgendash("AccountingEnquiry");
    
    test.log(Status.INFO, "Enter Begin Date");
 	BasePage.enterText("Begin_Date", "Subred Begin Date",excelName, Scenario);
 	
  	Thread.sleep(2000);
  	
  	test.log(Status.INFO, "Enter End Date");
 	BasePage.enterText("End_Date", "Subred End Date",excelName, Scenario);
 	
 	Thread.sleep(5000);
  	
 	BasePage.enterText1("Report_portfolio", "Portfolio",excelName, Scenario);
	Thread.sleep(4000);
	BasePage.clearWebField("Report_portfolio");
	Thread.sleep(1000);
	
 	test.log(Status.INFO, "Enter and Select Portfolio");
 	BasePage.enterText("Report_portfolio", "Portfolio",excelName, Scenario);
 	Thread.sleep(3000);
 	BasePage.click_hexgendash("report_AICF");
 	
 	test.log(Status.INFO, "Click on View Report");
    BasePage.click_hexgendash("view_report");
    
    test.log(Status.INFO, "Enter Transaction ID in Search box");
    BasePage.enterText_TransId("report_search", "TransactionID5");
 	
 	test.log(Status.INFO, "Verifying Accounting Enquiry Report Details");
 	
 	if(BasePage.checkelementpresent1(readobjectRepo("ae_isreversed"))==true)
	{
 	BasePage.AssertText("ae_isreversed");
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
 	}}
 	else {
 		test.log(Status.INFO, "Portfolio Subred Cancellation - "+readtransIDs("TransactionID5")+" is not reflected in Accounting Enquiry Report");
 		
 	}

}


public static void Full_settlement(String excelName,String Scenario,String data,String data1) throws Exception {

	Thread.sleep(15000);
    
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
    test.log(Status.INFO, "Click on Settlement");
    BasePage.click_hexgendash("Settlement");
    
    test.log(Status.INFO, "Click on Trade/Benefit Settlement");
    BasePage.click_hexgendash("Trade/Benefit_Settlement");
    
    
    test.log(Status.INFO, "Enter and Select Portfolio");
 	BasePage.enterText("Settlement_portfolio", "Portfolio",excelName, Scenario);	
 	BasePage.click_hexgendash("settlement_portAICF");
 	
 	test.log(Status.INFO, "Enter Transaction Date");
 	BasePage.enterText("settle_transDate", "Settlement Date",excelName, Scenario);
 	
 	
 	 BasePage.scrollintoview("Settle_Details");
  	
 	
 	test.log(Status.INFO, "Click on Retrieve Settlement Details");
    BasePage.click_hexgendash("Settle_Details");
    
    BasePage.scrollintoview("Settle_Details");
    
    test.log(Status.INFO, "Click on Check box");
  	BasePage.verifying_SettlementID(data);
  	
  	if(data1.equals("TransactionID4")) {
  	BasePage.verifying_SettlementID(data1);}
 	
  	test.log(Status.INFO, "Click on Submit");
    BasePage.click_hexgendash("settle_Submit");
    
    if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true) {
    	
    	
    	BasePage.AssertExcel2("sub_assert", "Trade/Benefit Settlement", excelName, Scenario,"Validation");
		
		}
    
    
    else if(BasePage.checkelementpresent1(readobjectRepo("settle_override"))==true) {
    
    BasePage.scrollintoview("settle_override");
    
    test.log(Status.INFO, "Click on Override Tick Icon");
    BasePage.click_hexgendash("settle_override");
    
    test.log(Status.INFO, "Click on Remarks Tick Icon");
    BasePage.click_hexgendash("Settle_override_approve");
    
    if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
	{
      BasePage.AssertText("sub_assert");
      BasePage.AssertExcel2("sub_assert", "Override Validation", excelName, Scenario,"Validation");
}

    
    }
    
   
    
    
    //BasePage.horizontalRight();
	 
	 test.log(Status.INFO, "Click on Hexgen User");
	 BasePage.click_hexgendash("hexgen_user");
	 Thread.sleep(2000);
	 
	 
	 test.log(Status.INFO, "Click on Logout");
	 BasePage.click_hexgendash("hexgen_logout");
	 Thread.sleep(2000);
 
	// BasePage.click1("Login_click");

}
public static void Full_settlement_Reversal(String excelName,String Scenario,String data) throws Exception {

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
    test.log(Status.INFO, "Click on Settlement");
    BasePage.click_hexgendash("Settlement");
    
    test.log(Status.INFO, "Click on Trade/Benefit Settlement");
    BasePage.click_hexgendash("Trade/Benefit_Settlement");
    
 	test.log(Status.INFO, "Enter and Select Transaction ID in Search Box");
 	BasePage.enterText_TransId("Settle_reversal_search", data);
 	BasePage.click_hexgendash("Settle_select_rev");
 	
 	 BasePage.scrollintoview("Settle_Details");
 	
  	test.log(Status.INFO, "Click on Reverse");
    BasePage.click_hexgendash("Settle_reverse");
    
    if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
	{
      BasePage.AssertText("sub_assert");
      test.log(Status.INFO,"Validation :"+ BasePage.Asserttext);
}

    
 //   test.log(Status.INFO, "Verifying Trade/Benefit Settlement Reversal Validation");
 //   BasePage.AssertExcel2("sub_assert", "Remarks", excelName, Scenario,"Validation");
 //  	Thread.sleep(1000);
    
    
    BasePage.horizontalRight();
	 
	 test.log(Status.INFO, "Click on Hexgen User");
	 BasePage.click_hexgendash("hexgen_user");
	 Thread.sleep(2000);
	 
	 
	 test.log(Status.INFO, "Click on Logout");
	 BasePage.click_hexgendash("hexgen_logout");
	 Thread.sleep(2000);
 
	// BasePage.click1("Login_click");

}
public static void Partial_settlement_Reversal(String excelName,String Scenario) throws Exception {

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
    test.log(Status.INFO, "Click on Settlement");
    BasePage.click_hexgendash("Settlement");
    
    test.log(Status.INFO, "Click on Trade/Benefit Settlement");
    BasePage.click_hexgendash("Trade/Benefit_Settlement");
    
 	test.log(Status.INFO, "Enter and Select Transaction ID in Search Box");
 	BasePage.enterText_TransId("Settle_reversal_search", "TransactionID4");
 	BasePage.click_hexgendash("Settle_select_rev");
 	
 	 BasePage.scrollintoview("Settle_Details");
 	
  	test.log(Status.INFO, "Click on Reverse");
    BasePage.click_hexgendash("Settle_reverse");
    
    
  //  test.log(Status.INFO, "Verifying Trade/Benefit Settlement Reversal Validation");
  //  BasePage.AssertExcel2("sub_assert", "Remarks", excelName, Scenario,"Validation");
  // 	Thread.sleep(1000);
    if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
	{
      BasePage.AssertText("sub_assert");
      test.log(Status.INFO,"Validation :"+ BasePage.Asserttext);
}

    
    
    BasePage.horizontalRight();
	 
	 test.log(Status.INFO, "Click on Hexgen User");
	 BasePage.click_hexgendash("hexgen_user");
	 Thread.sleep(2000);
	 
	 
	 test.log(Status.INFO, "Click on Logout");
	 BasePage.click_hexgendash("hexgen_logout");
	 Thread.sleep(2000);
 
	// BasePage.click1("Login_click");

}

public static void Approve_Settlement(String excelName,String Scenario) throws Exception {
	
	
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
    
	//BasePage.checkelementpresent("close_moreInfo");
    
	 test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(2000);
		
		 test.log(Status.INFO, "Click on Approve");
		 	BasePage.click_hexgendash("Settle_Approve");
		 	Thread.sleep(1000);
		  	
		  	 test.log(Status.INFO, "Click on Remarks Tick icon");
		  	// text="Checkbox";
		   	BasePage.click_hexgendash("Settle_Remarks_tick");
		    if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
			{
		    	BasePage.AssertExcel2("sub_assert", "Confirm", excelName, Scenario,"Validation");
		}
		
   	
  // 	test.log(Status.INFO, "Verifying Trade/Benefit Settlement Form Approval Validation");
  // 	BasePage.AssertExcel2("sub_assert", "Confirm", excelName, Scenario,"Validation");
   	
  	
   	BasePage.horizontalRight();
    
    test.log(Status.INFO, "Click on Hexgen User");
    //text="Hexgen User";
    BasePage.click_hexgendash("hexgen_user");
    Thread.sleep(2000);
    
    
    test.log(Status.INFO, "Click on Logout");
    BasePage.click_hexgendash("hexgen_logout");
    Thread.sleep(2000);
 	
    //BasePage.click1("Login_click");
         
        
}

public static void Partial_settlement_T1(String excelName,String Scenario) throws Exception {

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
    test.log(Status.INFO, "Click on Settlement");
    BasePage.click_hexgendash("Settlement");
    
    test.log(Status.INFO, "Click on Trade/Benefit Settlement");
    BasePage.click_hexgendash("Trade/Benefit_Settlement");
    
    
    test.log(Status.INFO, "Enter and Select Portfolio");
 	BasePage.enterText("Settlement_portfolio", "Portfolio",excelName, Scenario);	
 	BasePage.click_hexgendash("settlement_portAICF");
 	
 	test.log(Status.INFO, "Enter Transaction Date");
 	BasePage.enterText("settle_transDate", "Settlement Date",excelName, Scenario);
 	
 	 BasePage.scrollintoview("Settle_Details");
  	
 	
 	test.log(Status.INFO, "Click on Retrieve Settlement Details");
    BasePage.click_hexgendash("Settle_Details");
    
    BasePage.scrollintoview("Settle_Details");
    
    test.log(Status.INFO, "Enter Partial Units");
  	BasePage.verifying_PartialSettlementID();
 	
	test.log(Status.INFO, "Click on Submit");
    BasePage.click_hexgendash("settle_Submit");
    
    if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true) {
    	
    	
    	BasePage.AssertExcel2("sub_assert", "Trade/Benefit Settlement", excelName, Scenario,"Validation");
	
	}


else if(BasePage.checkelementpresent1(readobjectRepo("settle_override"))==true) {

BasePage.scrollintoview("settle_override");

test.log(Status.INFO, "Click on Override Tick Icon");
BasePage.click_hexgendash("settle_override");

test.log(Status.INFO, "Click on Remarks Tick Icon");
BasePage.click_hexgendash("Settle_override_approve");

if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
{
	BasePage.AssertExcel2("sub_assert", "Override Validation", excelName, Scenario,"Validation");
}


}

    
  //  test.log(Status.INFO, "Verifying Trade/Benefit Settlement Validation");
  //  BasePage.AssertExcel2("sub_assert", "Submit", excelName, Scenario,"Validation");
   	Thread.sleep(1000);
    
    
    BasePage.horizontalRight();
	 
	 test.log(Status.INFO, "Click on Hexgen User");
	 BasePage.click_hexgendash("hexgen_user");
	 Thread.sleep(2000);
	 
	 
	 test.log(Status.INFO, "Click on Logout");
	 BasePage.click_hexgendash("hexgen_logout");
	 Thread.sleep(2000);
 
	// BasePage.click1("Login_click");

}



public static void Verifying_BankTransactions_Report(String excelName,String Scenario,String data) throws Exception {

	 if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
		{
		 BasePage.click_hexgendash("critical_alerts_close");
		
		}
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
   // BasePage.enterText("banktransactions_portfolio", "Portfolio",excelName, Scenario);
 	//BasePage.click_hexgendash("banktransactions_aicf");
    
    test.log(Status.INFO, "Enter Begin Date");
 	BasePage.enterText("banktrans_begindate", "Settlement Date",excelName, Scenario);
 	
  	Thread.sleep(1000);
  	
  	test.log(Status.INFO, "Enter End Date");
 	BasePage.enterText("banktrans_enddate", "Settlement Date",excelName, Scenario);
 	
 	
 	  	
 	  	BasePage.AssertText("banktrans_output");
 	  	if(BasePage.Asserttext.equals("EXCEL")) {
 	  		
 	  	 test.log(Status.INFO, "Enter and Select Output");
 	 	  	Thread.sleep(1000);
 	  	BasePage.click1("banktrans_output");
 	  	BasePage.click1("banktrans_output_excel");
 	  	BasePage.enterText("banktrans_output_type", "Subred Output",excelName, Scenario);
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

  	
  	Thread.sleep(25000);
    
    BasePage.switchTab();
    
  //  BasePage.AssertText("demo");
  //  System.out.println(BasePage.Asserttext);
    if(data.equals("Debit"))
    {
    
    test.log(Status.INFO, "Verifying Bank Transactions Report Details");
  	BasePage.verifying_banktransactions_report_RHBT();}
    if(data.equals("Credit"))
    {
    
    test.log(Status.INFO, "Verifying Bank Transactions Report Details");
  	BasePage.verifying_banktransactions_report1_RHBT();}
    
  	
  	Thread.sleep(5000);
  	BasePage.CloseTab();
    

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
   
   Thread.sleep(1000);
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
 	
 	test.log(Status.INFO, "Enter NAV End Date");
	BasePage.enterText("NAV_enddate", "Settlement Date",excelName, Scenario);
 	
 	test.log(Status.INFO, "Enter NAV Start Date");
	BasePage.enterText("NAV_startdate", "Trade date",excelName, Scenario);
 	
 	
 	
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
  	
	 if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
		{
		 BasePage.AssertExcel2("sub_assert", "Rebuild", excelName, Scenario,"Validation");
	}
	
 	
  	
  	
	
	WebElement ele = driver.findElement(By.xpath("//*[@id=\"alerts-tab\"]/ul/li[2]/span"));
	 String actual = ele.getText();
	 Thread.sleep(15000);
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

public static void Verifying_NAVSummary_Report(String excelName,String Scenario) throws Exception {

	Thread.sleep(15000);
    test.log(Status.INFO, "Click on Reports");
    BasePage.click_hexgendash("Reports");
    
    Thread.sleep(1000);
    
    test.log(Status.INFO, "Click on Operations");
    BasePage.click_hexgendash("operations");
    
    Thread.sleep(1000);
    
    test.log(Status.INFO, "Click on NAV");
    BasePage.click_hexgendash("report_NAV");
    
    test.log(Status.INFO, "Click on NAV Summary");
    BasePage.click_hexgendash("Nav_Summary");
    
  //  test.log(Status.INFO, "Enter and Select Portfolio");
 //	BasePage.enterText("Nav_report_portfolio", "Portfolio",excelName, Scenario);
 	Thread.sleep(1000);
 //	BasePage.click_hexgendash("Nav_report_AICF");
 	
 	//test.log(Status.INFO, "Click on Subscription/Redemption");
   // BasePage.click1("subred_report_global");
    
 	test.log(Status.INFO, "Enter Begin Date");
 	BasePage.enterText("Nav_report_begin", "Subred Begin Date",excelName, Scenario);
 	
  	Thread.sleep(2000);
  	
  	test.log(Status.INFO, "Enter End Date");
 	BasePage.enterText("Nav_report_end", "Subred End Date",excelName, Scenario);
 	
 	 
  	BasePage.AssertText("Nav_output");
  	if(BasePage.Asserttext.equals("EXCEL")) {
  		test.log(Status.INFO, "Enter and Select Output");
  	  	Thread.sleep(1000);
  	BasePage.click1("Nav_output");
  	BasePage.click1("Nav_output_excel");
  	BasePage.enterText("Nav_output_type", "Subred Output",excelName, Scenario);
  	BasePage.click_hexgendash("Nav_output_html");
  	}
 	
 	Thread.sleep(5000);
  		
 	test.log(Status.INFO, "Click on View Report");
    BasePage.click_hexgendash("Nav_report_view");
    
  //  test.log(Status.INFO, "Verifying NAV Summary Report Validation");
  //	BasePage.AssertExcel2("sub_assert","Bank Transactions Report Message", excelName, Scenario,"Validation");
    if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
	{
      BasePage.AssertText("sub_assert");
      test.log(Status.INFO,"Validation :"+ BasePage.Asserttext);
}

Thread.sleep(20000);
    
    BasePage.switchTab();
    
 	
    test.log(Status.INFO, "Verifying NAV Summary Report");
  	BasePage.verifying_NavSummary(excelName,Scenario);
  	
  	Thread.sleep(5000);
  	BasePage.CloseTab();
  	
  	
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
  
  Thread.sleep(1000);
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
 		Portfolio_SubRed BD=new Portfolio_SubRed();
			BasePage.click_hexgendash("Refresh");
			BD.ManualNAVClosing_IntradayFreeze(excelName, Scenario);
	}
 	
 	
  	if(BasePage.checkelementpresent1(readobjectRepo("NAVClosingStarted"))==true) {
  		
  		BasePage.AssertExcel2("NAVClosingStarted", "Manual Nav Closing", excelName, Scenario,"Validation");
  		
  		Thread.sleep(120000);
		 
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
  			BasePage.AssertExcel2("OverrideApprove", "Override Validation", excelName, Scenario,"Validation");
  			
  			Thread.sleep(120000);
  	
  		         BasePage.loadTime("intraday_Complete");
  					
  		         Thread.sleep(1000);
		}
   	
   	
  	
  
 	

 	
  	else {
  		//test.log(Status.INFO, "Verifying Manual NAV Closing Validation");
  	   	//BasePage.AssertExcel2("sub_assert", "remarks", excelName, Scenario,"Validation");
  		 if(BasePage.checkelementpresent1(readobjectRepo("sub_assert"))==true)
			{
  			BasePage.AssertExcel2("sub_assert", "Override Validation", excelName, Scenario,"Validation");
		}
		
  	}	
  	}}

public static void Adding_capital(String excelName,String Scenario) throws Exception {
	
	
	BasePage.enterText1("LoginUserForm_user_name", "MakerUserName", excelName,Scenario);
	
	
	BasePage.enterText1("LoginUserForm_password", "MakerPassword", excelName,Scenario);
	
	Thread.sleep(1000);
	
   	
   	 BasePage.click1("company");
           BasePage.click1("comapny_dropdown");
           Thread.sleep(2000);
           
          
          BasePage.click1("loginButton");
          Thread.sleep(1000);

	
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
	
	BasePage.click1("transactions");
	Thread.sleep(1000);

	if(BasePage.checkelementpresent1(readobjectRepo("pending"))==true)
	{Thread.sleep(1000);
	BasePage.click1("pending");
	Thread.sleep(2000);
	}
	
    BasePage.click1("capital");
   Thread.sleep(1000);
   
  
    BasePage.click1("portfolio_subred");
    Thread.sleep(1000);
  
 
    BasePage.enterText1("Portfolio","Portfolio",excelName,Scenario);
    BasePage.click1("portfolio_AICF");
   Thread.sleep(1000);
   
/*     test.log(Status.INFO, "Enter and Select Portfolio Class");
   BasePage.enterText("Portfolio_class","Portfolio Class",excelName,Scenario);
   BasePage.click_hexgendash("Portfolio_class_MYR");
  Thread.sleep(1000);*/
    
  
	BasePage.enterText1("Trade_date", "Trade date", excelName, Scenario);


  
	BasePage.enterText1("Transaction_date", "Transaction_Date", excelName, Scenario);

 	
 
 
     BasePage.enterText1("Transaction_code","Transaction Code",excelName, Scenario);
     BasePage.click1("UNSAL_transaction");
    Thread.sleep(1000);
         
    BasePage.clearWebField("units");
    
     BasePage.enterText1("units", "Units",excelName, Scenario);
     Thread.sleep(1000);
     
  
     BasePage.clearWebField("Price");      
   
     BasePage.enterText1("Price", "Price",excelName, Scenario);
     Thread.sleep(2000);
     BasePage.click1("BankAmountAcy");
     
    
	

	


   // test.log(Status.INFO, "Verifying Dividend Equalisation Reserve");
	//BasePage.AssertText("divequ_reserve_title");
	//BasePage.AssertExcel_ByreadingTextbox("divequ_reserve", "Div Equ Reserve", excelName, Scenario);
         
     BasePage.scrollintoview("Settlementdate");
       //  BasePage.clearWebField("settlement_date");
         Thread.sleep(1000);
      
         BasePage.enterText1("Settlementdate", "Settlement Date",excelName, Scenario);
//          Thread.sleep(2000);
         
       
         BasePage.click1("Submit");
         
       
        	
        	 if(BasePage.checkelementpresent1(readobjectRepo("Tick"))==true)
        		{
        		 
        		
        		 BasePage.scrollintoview("Tick");
        		 BasePage.click1("Tick");
        		 
        	
        		 BasePage.enterText1("sub_remarks", "Remarks",excelName, Scenario);
        		 Thread.sleep(1000);
        		 
        		
        		 BasePage.click1("remarks_tick");
        		 
        		
        		}
         
        	 BasePage.horizontalRight();
        		
        		
        	 
        	
        	 BasePage.click1("hexgen_user");
        	 Thread.sleep(2000);
        	 
        	 
        	
        	 BasePage.click1("hexgen_logout");
        	 Thread.sleep(2000);
        	 
        	// BasePage.click1("Login_click");
        	 
        	
        	BasePage.enterText1("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

             BasePage.enterText1("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);
            
          	 BasePage.click1("company");
          		Thread.sleep(2000);
                  BasePage.click1("comapny_dropdown");
                  Thread.sleep(2000);
                  BasePage.click1("loginButton");
                 Thread.sleep(1000);
            
         
            
            if(BasePage.checkelementpresent(readobjectRepo("critical_alerts_close"))==true)
        	{
        	
        	}
         	BasePage.click1("sub_moreinfo");
        	Thread.sleep(1000);
        	
        	
        
        		BasePage.click1("subred_approve");
         	Thread.sleep(1000);
          	BasePage.click1("approve_tick");
           	Thread.sleep(1000);
          
         
            BasePage.click1("hexgen_user");
            Thread.sleep(2000);
            
            
           
            BasePage.click1("hexgen_logout");
            Thread.sleep(2000);
         
         
        
}
}
