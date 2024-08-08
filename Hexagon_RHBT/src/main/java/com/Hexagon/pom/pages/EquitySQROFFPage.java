package com.Hexagon.pom.pages;

import com.Hexagon.base.BasePage;
import com.aventstack.extentreports.Status;

public class EquitySQROFFPage extends BasePage{
	
	public static String text;
	
public static void Equity_SQROFF(String excelName,String Scenario) throws Exception {
		

    	Thread.sleep(4000);
    	test.log(Status.INFO, "Click on Transactions");
    	BasePage.click_hexgendash("transactions");
    	Thread.sleep(1000);
 
    	test.log(Status.INFO, "Click on Investment");
        BasePage.click_hexgendash("investment");
 //       Thread.sleep(1000);
       
        test.log(Status.INFO, "Click on Direct Placement");
        BasePage.click_hexgendash("direct_placement");
 //       Thread.sleep(1000);
      
        test.log(Status.INFO, "Enter Portfolio");
        BasePage.enterText("portfolio","Portfolio",excelName, Scenario);
        BasePage.click1("faport_dropdown");
        Thread.sleep(1000);
        
        test.log(Status.INFO, "Enter Asset Class");
        BasePage.enterText("asset_class","Asset Class",excelName, Scenario);
        BasePage.click1("asset_class_dropdown");
       Thread.sleep(2000);
       
        test.log(Status.INFO, "Enter Security");
        BasePage.enterText("security","Security",excelName, Scenario);
        BasePage.click1("ramco_systems_dropdown");
       Thread.sleep(2000);
        
        test.log(Status.INFO, "Select Price Inclusive Interest");
        BasePage.select("price_inclusive");
        Thread.sleep(2000);
      
        BasePage.click1("transaction_date");
        BasePage.clearWebField("transaction_date");
        Thread.sleep(2000); 
        test.log(Status.INFO, "Enter Transaction Date");
    	BasePage.enterText("transaction_date", "Transaction_Date", excelName, Scenario);
   
    	 BasePage.click1("settlement_date_stk");
         BasePage.clearWebField("settlement_date_stk");
         Thread.sleep(2000); 
         test.log(Status.INFO, "Enter Settlement Date Stk");
     	BasePage.enterText("settlement_date_stk", "Settlement_date_Stk", excelName, Scenario);
     	
     BasePage.click1("transaction_code_click");
     	//BasePage.clearWebField("transaction_code_click");
     	BasePage.click1("code_dropdown_buy");
     	
     	 test.log(Status.INFO, "Enter Transaction Code");
         BasePage.enterText("transaction_code","Transaction Code",excelName, Scenario);
         BasePage.click1("code_dropdown_sqroff");
         Thread.sleep(2000);
         
      
         BasePage.click1("custodian_click");
         BasePage.scroll_dropdown("custodian_icici");
         BasePage.click1("custodian_icici");
         test.log(Status.INFO, "Enter Custodian");
         BasePage.enterText("custodian","Custodian",excelName, Scenario);
         BasePage.click1("custodian_dropdown");
   //      Thread.sleep(2000);
         
         test.log(Status.INFO, "Enter Deal Slip No");
         BasePage.enterText("deal_slip_no", "DealSlipNo",excelName, Scenario);       
  //       Thread.sleep(2000);
       
                      
         BasePage.scrollintoview("quantity");
   //      Thread.sleep(2000); 
         BasePage.clearWebField("quantity");
         test.log(Status.INFO, "Enter Quantity");
         BasePage.enterText("quantity", "Quantity",excelName, Scenario);
   //      Thread.sleep(2000);
         
             
         test.log(Status.INFO, "Verifying Price");
      	BasePage.AssertText("price_topic");
      	BasePage.AssertExcel_ByreadingTextbox("price", "Price", excelName, Scenario, Scenario);
      	
         BasePage.click1("investment_reason_click");
         BasePage.click1("investment_018");
         test.log(Status.INFO, "Enter Investment Reason");
         BasePage.enterText("investment_reason","InvestmentReason",excelName, Scenario);
         BasePage.click1("investment_reason_drop_018");
   //      Thread.sleep(2000);
             
         test.log(Status.INFO, "Enter Counterparty");
         BasePage.enterText("counterparty","Counter Party",excelName, Scenario);
         BasePage.click1("counterparty_dropdown");
   //      Thread.sleep(2000);
         
         test.log(Status.INFO, "Enter Broker");
         BasePage.enterText("broker","Broker",excelName, Scenario);
         BasePage.click1("broker_dropdown");
  //       Thread.sleep(2000);
             
         test.log(Status.INFO, "Enter Exchange");
         BasePage.enterText("exchange","Exchange",excelName, Scenario);
         BasePage.click1("exchange_dropdown");
             
             BasePage.click1("settlement_date");
             BasePage.clearWebField("settlement_date");
   //          Thread.sleep(2000);
             test.log(Status.INFO, "Enter Settlement Date");
             BasePage.enterText("settlement_date", "Settlement Date",excelName, Scenario);
   //          Thread.sleep(2000);
         
             
             BasePage.scrollintoview("trade_note");
             BasePage.click1("trade_note");
             
             BasePage.click1("Bank_account_code_click");
             BasePage.click1("Bankaccount_faoper");
             test.log(Status.INFO, "Enter Bank Account Code");
             BasePage.enterText("bank_account_code","Bank Account Code",excelName, Scenario);
             BasePage.click1("bank_code_dropdown");
   //          Thread.sleep(2000);
            	
            	test.log(Status.INFO, "Enter Trade Note");
             BasePage.enterText("trade_note", "Trade note",excelName, Scenario);
   //          Thread.sleep(2000);
             
	}
	
	
	public static void EquitySQROFF_FeesBreakdown_verification(String excelName,String Scenario) throws Exception {
		

		BasePage.scrollintoview("feetype1");
		
		test.log(Status.INFO, "Verifying Fees Breakdown 1");
		BasePage.AssertText("feetype_topic");
		BasePage.AssertExcel("feetype1", "feeType1", excelName, Scenario);
		BasePage.AssertText("feeamount_topic");
		BasePage.AssertExcel_ByreadingTextbox("feeamount1", "Fee Amount1", excelName, Scenario, Scenario);
		BasePage.AssertText("feeamtpcy_topic");
		BasePage.AssertExcel_ByreadingTextbox("feeamount_pcy1", "Fee Amount Pcy1", excelName, Scenario, Scenario);
		BasePage.AssertText("taxamount_topic");
		BasePage.AssertExcel_ByreadingTextbox("taxamount1", "Tax Amount1", excelName, Scenario, Scenario);
		BasePage.AssertText("taxamtpcy_topic");
		BasePage.AssertExcel_ByreadingTextbox("taxamount_pcy1", "Tax Amount Pcy1", excelName, Scenario, Scenario);
		BasePage.AssertText("exrate_topic");
		BasePage.AssertExcel_ByreadingTextbox("exchange_rate1", "Exchange Rate1", excelName, Scenario, Scenario);
		BasePage.AssertText("curr_topic");
		BasePage.AssertExcel("currency1", "Currency1", excelName, Scenario);
		BasePage.AssertText("partcost_topic");
		BasePage.AssertExcel("partofcost1", "Part Of Cost1", excelName, Scenario);
		BasePage.AssertText("partsetl_topic");
		BasePage.AssertExcel("partofsetl1", "Part Of Setl1", excelName, Scenario);
		BasePage.AssertText("partsetltax_topic");
		BasePage.AssertExcel("partofsettltax1", "Part Of Setl Tax1", excelName, Scenario);
		test.log(Status.PASS, "Verification of Fees Breakdown 1 is successful");
		
		test.log(Status.INFO, "Verifying Fees Breakdown 2");
		BasePage.AssertText("feetype_topic");
		BasePage.AssertExcel("feetype2", "feeType2", excelName, Scenario);
		BasePage.AssertText("feeamount_topic");
		BasePage.AssertExcel_ByreadingTextbox("feeamount2", "Fee Amount2", excelName, Scenario, Scenario);
		BasePage.AssertText("feeamtpcy_topic");
		BasePage.AssertExcel_ByreadingTextbox("feeamount_pcy2", "Fee Amount Pcy2", excelName, Scenario, Scenario);
		BasePage.AssertText("taxamount_topic");
		BasePage.AssertExcel_ByreadingTextbox("taxamount2", "Tax Amount2", excelName, Scenario, Scenario);
		BasePage.AssertText("taxamtpcy_topic");
		BasePage.AssertExcel_ByreadingTextbox("taxamount_pcy2", "Tax Amount Pcy2", excelName, Scenario, Scenario);
		BasePage.AssertText("exrate_topic");
		BasePage.AssertExcel_ByreadingTextbox("exchange_rate2", "Exchange Rate2", excelName, Scenario, Scenario);
		BasePage.AssertText("curr_topic");
		BasePage.AssertExcel("currency2", "Currency2", excelName, Scenario);
		BasePage.AssertText("partcost_topic");
		BasePage.AssertExcel("partofcost2", "Part Of Cost2", excelName, Scenario);
		BasePage.AssertText("partsetl_topic");
		BasePage.AssertExcel("partofsetl2", "Part Of Setl2", excelName, Scenario);
		BasePage.AssertText("partsetltax_topic");
		BasePage.AssertExcel("partofsettltax2", "Part Of Setl Tax2", excelName, Scenario);
		test.log(Status.PASS, "Verification of Fees Breakdown 2 is successful");
		
	 BasePage.horizontalRight();
	     
	     test.log(Status.INFO, "Click on Hexgen User");
	     BasePage.click_hexgendash("hexgen_user");
	     Thread.sleep(2000);
	     
	     
	     test.log(Status.INFO, "Click on Logout");
	     BasePage.click_hexgendash("hexgen_logout");
	     Thread.sleep(2000);
		
	}

	
public static void EquitySQROFF_DirectPlacement_verification(String excelName,String Scenario) throws Exception {
		
	test.log(Status.INFO, "Verifying Direct Placement Values");
	
	
    
    
	
	BasePage.horizontalRight();
	Thread.sleep(2000);
	BasePage.scrollintoview("trade_gain_loss");
	Thread.sleep(2000);
	BasePage.AssertText("trade_gain/loss_topic");
	BasePage.AssertExcel("trade_gain_loss", "Trade Gain/Loss", excelName, Scenario);		
	BasePage.AssertText("settlement_value_topic");
	BasePage.AssertExcel("settlement_value", "Settlement Value", excelName, Scenario);		
	BasePage.AssertText("saleable_qty_topic");
	BasePage.AssertExcel("saleable_quantity", "Saleable Quantity", excelName, Scenario);		
	BasePage.AssertText("qty_topic");
	BasePage.AssertExcel("quantity_asrt", "Qty", excelName, Scenario);		
	BasePage.AssertText("port_name_topic");
	BasePage.AssertExcel("portfolio_name", "Portfolio Name", excelName, Scenario);		
	BasePage.AssertText("port_Ccy_topic");
	BasePage.AssertExcel("portfolio_Ccy", "Portfolio Ccy", excelName, Scenario);
	
	
	BasePage.AssertText("security_name_topic");
	BasePage.AssertExcel("security_name", "Security Name", excelName, Scenario);
	BasePage.AssertText("security_ccy_topic");
	BasePage.AssertExcel("security_Ccy", "Security Ccy", excelName, Scenario);
	BasePage.AssertText("issuer_topic");
	BasePage.AssertExcel("issuer", "Issuer", excelName, Scenario);
	BasePage.AssertText("assetclass_topic");
	BasePage.AssertExcel("asset_class_asrt", "AssetClass", excelName, Scenario);
	BasePage.AssertText("facevalue_topic");
	BasePage.AssertExcel("face_value", "Face Value", excelName, Scenario);
	BasePage.AssertText("cert_topic");
	BasePage.AssertExcel("cert_fv", "Cert FV", excelName, Scenario);
	
	
	BasePage.AssertText("grossvalue_topic");
	BasePage.AssertExcel("gross_value", "Gross Value", excelName, Scenario);
	BasePage.AssertText("grossinterest_topic");
	BasePage.AssertExcel("gross_interest", "Gross Interest", excelName, Scenario);
	BasePage.AssertText("exinterest_topic");
	BasePage.AssertExcel("ex_interest", "EX Interest", excelName, Scenario);
	BasePage.AssertText("acquisitioncost_topic");
	BasePage.AssertExcel("acquisition_cost", "Acquisition Cost", excelName, Scenario);
	BasePage.AssertText("amortamount_topic");
	BasePage.AssertExcel("amortisation_amount", "Amortisation Amount", excelName, Scenario);
	BasePage.AssertText("feecapital_topic");
	BasePage.AssertExcel("fee_capitalised", "Fee Capitalised", excelName, Scenario);
	BasePage.AssertText("feeexpensed_topic");
	BasePage.AssertExcel("fee_expensed", "Fee Expensed", excelName, Scenario);
	BasePage.AssertText("settfee_topic");
	BasePage.AssertExcel("settlement_fee", "Settlement Fee", excelName, Scenario);
	BasePage.AssertText("sale_qty_topic");
	BasePage.AssertExcel("saleable_qty", "Saleable Qty", excelName, Scenario);
	
	
	BasePage.AssertText("Acquisitionpcy_topic");
	BasePage.AssertExcel("acquisition_cost_pcy", "Acquisition Cost Pcy", excelName, Scenario);
	BasePage.AssertText("grosspcy_topic");
	BasePage.AssertExcel("gross_int_pcy", "Gross Int Pcy", excelName, Scenario);
	BasePage.AssertText("amortpcy_topic");
	BasePage.AssertExcel("amort_amount_pcy", "Amort Amount Pcy", excelName, Scenario);
	BasePage.AssertText("settlvalue_topic");
	BasePage.AssertExcel("settle_value_pcy", "Settle Value Pcy", excelName, Scenario);
	BasePage.AssertText("gain/loss_topic");
	BasePage.AssertExcel("gain_loss_pcy", "Gain/Loss Pcy", excelName, Scenario);
	BasePage.AssertText("counterparty_topic");
	BasePage.AssertExcel("counterparty_name", "Counterparty Name", excelName, Scenario);
	BasePage.AssertText("broker_topic");
	BasePage.AssertExcel("broker_name", "Broker Name", excelName, Scenario);
	BasePage.AssertText("bank_topic");
	BasePage.AssertExcel("bank_name", "Bank Name", excelName, Scenario);
	
	test.log(Status.PASS, "Verification of Direct Placement Values is successful");
		
		}

}
