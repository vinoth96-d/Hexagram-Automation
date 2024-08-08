package com.Hexagon.pom.testcases.MoneyMarket_EarlyMaturity_MultiCurrency;

import java.util.Date;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Hexagon.base.BasePage;
import com.Hexagon.base.BaseProjectMethods;
import com.Hexagon.pom.pages.LoginPage;
import com.Hexagon.pom.pages.BulkDepositMaturityPage;
import com.Hexagon.pom.pages.DepositPlacementPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MM_Partial_BackDate_ZEROINT extends BasePage{

    
	String ExcelFileName = BasePage.readURLTestDataProp("MoneyMarket_TestData");
	
	String Scenario = "MC BackDate(T+2) Zero INT";
	
	@Test(priority = 1)
	public void Create_DepositPlacement() throws Exception
	{
		test=extent.createTest("Create Deposit Placement on BackDate");
		test.log(Status.INFO, "MultiCurrency - Early Maturity(2 days) PartialWithdrawal(Back Date,Zero Interest)");
		 
		
		LoginPage.Launch_application("HexagonURL");
		LoginPage.Reset(ExcelFileName, Scenario);
		
		LoginPage.do_login(ExcelFileName,Scenario);
		DepositPlacementPage.DepositPlacement(ExcelFileName, Scenario,"MultiCurrency");
		DepositPlacementPage.depoPlacement_submit(ExcelFileName, Scenario);

		
	}
	
	
	@Test(priority = 2)
	public void Approve_DepositPlacement() throws Exception
	{
		test=extent.createTest("Approve Deposit Placement");
		
		LoginPage.dologin_confirmation(ExcelFileName,Scenario);
		DepositPlacementPage.depositPlacement_Confirmation(ExcelFileName, Scenario,"DepositTransactionID");
		
	}
	
	@Test(priority = 3)
	public void Rebuild_NAV() throws Exception
	{
		test=extent.createTest("Rebuild NAV");
		 
		LoginPage.do_login(ExcelFileName,Scenario);
		DepositPlacementPage.RebuildNAV(ExcelFileName, Scenario);
		
	}
	
	@Test(priority = 4)
	public void View_AccountingEnquiry_Report() throws Exception
	{
		test=extent.createTest("Verify Accounting Enquiry Report");
		 
		DepositPlacementPage.Verifying_AccountingEnquiry_Report(ExcelFileName, Scenario);
		
	}
	
	@Test(priority = 5)
	public void Verify_BankTransactions_Report() throws Exception
	{
		test=extent.createTest("Verify Bank Transactions Report");
	
		DepositPlacementPage.Verifying_BankTransactions_Report(ExcelFileName, Scenario);
		
	}
	
    @Test(priority = 6)
	public void RebuildNAV() throws Exception
	{
		test=extent.createTest("Rebuild NAV");
		 
		DepositPlacementPage.RebuildNAV1(ExcelFileName, Scenario);
		
	}
	
	@Test(priority = 7)
	public void Create_BulkDepositMaturity() throws Exception
	{
		test=extent.createTest("Create Bulk Deposit Maturity(PartialWithdrawal,No Change in INT)");
		
		BulkDepositMaturityPage.BulkDeposit_EarlyMaturity(ExcelFileName, Scenario,"INT","MultiCurrency");
		BulkDepositMaturityPage.bulkmaturity_submit(ExcelFileName, Scenario);
		
	}
	
	@Test(priority = 8)
	public void Approve_BulkDepositMaturity() throws Exception
	{
		test=extent.createTest("Approve Bulk Deposit Maturity");
		
		LoginPage.dologin_confirmation(ExcelFileName,Scenario);
		BulkDepositMaturityPage.Bulkmaturity_Confirmation(ExcelFileName, Scenario,"BulkDepositMaturityID");
		
	}
	@Test(priority = 9)
	public void Rebuildnav() throws Exception
	{
		test=extent.createTest("Rebuild NAV");
		 
		LoginPage.do_login(ExcelFileName,Scenario);
		BulkDepositMaturityPage.RebuildNAV(ExcelFileName, Scenario);
		
	}
	
	@Test(priority = 10)
	public void Verify_AccountingEnquiry_Report() throws Exception
	{
		test=extent.createTest("Verify Accounting Enquiry Report");
		 
		BulkDepositMaturityPage.Verifying_AE_Report_ChangeINT(ExcelFileName, Scenario);
		
	}
	
	@Test(priority = 11)
	public void Verify_BankTransactionsReport() throws Exception
	{
		test=extent.createTest("Verify Bank Transactions Report");
		
		BulkDepositMaturityPage.Verifying_BankTransactions_Report(ExcelFileName, Scenario,"Debit");
		
	}
	
	@Test(priority = 12)
	public void BulkMaturity_Reversal() throws Exception
	{
		test=extent.createTest("Reverse Bulk Deposit Maturity");
		
		BulkDepositMaturityPage.BulkDeposit_Reversal(ExcelFileName, Scenario);
		
	}
	
	@Test(priority = 13)
		public void Reversal_Approval() throws Exception
		{
			test=extent.createTest("Approve Bulk Deposit Maturity Reversal");
			
			LoginPage.dologin_confirmation(ExcelFileName,Scenario);
			BulkDepositMaturityPage.Approve_Reversal(ExcelFileName, Scenario);
			
		}
	
	@Test(priority = 14)
	public void Verify_ReversalAccountingEnquiry_Report() throws Exception
	{
		test=extent.createTest("Verify Reversed Accounting Enquiry Report");
		 
		LoginPage.do_login(ExcelFileName,Scenario);
		BulkDepositMaturityPage.Verifying_ReversalAE_Report(ExcelFileName, Scenario);
		
	}
	
	@Test(priority = 15)
	public void Verify_ReversalBankTransactionsReport() throws Exception
	{
		test=extent.createTest("Verify Reversed Bank Transactions Report");
		
		BulkDepositMaturityPage.Verifying_BankTransactions_Report(ExcelFileName, Scenario,"Reversal");
		
	}
	
	/*@Test(priority = 3)
	public void Create_PortfolioSubredT2() throws Exception
	{
		test=extent.createTest("Create Manual Portfolio Subscription on BackDate with settlement date(T+2)");
		
		
		LoginPage.do_login(ExcelFileName,"BackDate(T+2) UNSAL");
		
		Portfolio_SubRed.Portfolio_subscription_T2(ExcelFileName, "BackDate(T+2) UNSAL");
		Portfolio_SubRed.PortfolioSubscription_Submit(ExcelFileName, "BackDate(T+2) UNSAL");

		
	}
	
	
	@Test(priority = 4)
	public void Approve_PortfolioSubscriptionT2() throws Exception
	{
		test=extent.createTest("Approve Portfolio Subscription");
	
		
		Portfolio_SubRed.PortfolioSubred_Confirmation(ExcelFileName, "BackDate(T+2) UNSAL","TransactionID2");
		
	}
	
	@Test(priority = 5)
	public void Create_PortfolioSubredT0() throws Exception
	{
		test=extent.createTest("Create Manual Portfolio Redemption on BackDate with settlement date(T+0)");
		
		LoginPage.do_login(ExcelFileName,"BackDate(T+0) UNPUR");
		
		Portfolio_SubRed.Portfolio_subscription_T0(ExcelFileName, "BackDate(T+0) UNPUR");
		Portfolio_SubRed.PortfolioSubscription_Submit(ExcelFileName, "BackDate(T+0) UNPUR");

		
	}
	
	
	@Test(priority = 6)
	public void Approve_PortfolioSubscriptionT0() throws Exception
	{
		test=extent.createTest("Approve Portfolio Redemption");
		
		Portfolio_SubRed.PortfolioSubred_Confirmation(ExcelFileName, "BackDate(T+0) UNPUR","TransactionID3");
		
	
		
	}

	@Test(priority = 7)
	public void Upload_Subred() throws Exception
	{
		test=extent.createTest("Upload Subred Excel File on BackDate with Settlement Date(T+1,T+2,T+0)");

		
		LoginPage.do_login(ExcelFileName,"BackDate Upload Subred");
		
		Portfolio_SubRed.Upload_Subred(ExcelFileName, "BackDate Upload Subred","BackDate");
		
		
	}
	
	@Test(priority = 8)
		public void Approve_Uploaded_PortfolioSubred() throws Exception
		{
			test=extent.createTest("Approve Uploaded Subred Excel File");
		
			
			Portfolio_SubRed.UploadPortfolioSubred_Confirmation(ExcelFileName, "BackDate Upload Subred");
			
		}
	
	@Test(priority = 9)
		public void Verify_SubscriptionRedemption_Report() throws Exception
		{
			test=extent.createTest("Verify Subscription/Redemption Report");
			 
			
			LoginPage.do_login(ExcelFileName,"BackDate SubRed Report");
			Portfolio_SubRed.Verifying_SubscriptionRedemption_Report(ExcelFileName, "BackDate SubRed Report");
			
			
		}
		
		
	
	@Test(priority = 10)
	public void PortfolioSubred_Cancellation() throws Exception
	{
		test=extent.createTest("Portfolio Subred Cancellation of Uploaded transaction");
		 
		
			Portfolio_SubRed.UploadedSub_cancellation_T2(ExcelFileName, "BackDate Upload Subred","TransactionID5");
		
		
	}
	
	
	@Test(priority = 11)
	public void Approve_Subred_Cancellation() throws Exception
	{
		test=extent.createTest("Approve Portfolio Subred Cancellation");
		 

		Portfolio_SubRed.ApproveUploadedSub_cancellation_T2(ExcelFileName, "BackDate Upload Subred");
		
	}
	
	
	
	@Test(priority = 12)
	public void ManualNAVClosing_Intraday() throws Exception
	{
		test=extent.createTest("ManualNAVClosing_Intraday");
		 
        LoginPage.do_login(ExcelFileName,"BackDate Upload Subred");
		Portfolio_SubRed.Manual_NAVClosing(ExcelFileName, "BackDate Upload Subred");
		
	}
	
	@Test(priority = 13)
	public void View_AccountingEnquiry_Report() throws Exception
	{
		test=extent.createTest("Verify Accounting Enquiry Report");
		 
		Portfolio_SubRed.Verifying_AccountingEnquiry_Report(ExcelFileName, "BackDate SubRed Report");
		
	}
	
	@Test(priority = 14)
	public void Create_FullSettlement() throws Exception
	{
		test=extent.createTest("Full Settlement of Portfolio Subred with settlement date(T+1)");
		 
		
		Portfolio_SubRed.Full_settlement(ExcelFileName, "BackDate(T+1) UNSAL","TransactionID1");
		
	}
	
	@Test(priority = 15)
	public void Approve_FullSettlement() throws Exception
	{
		test=extent.createTest("Approve Full Settlement");
		 
		
		Portfolio_SubRed.Approve_Settlement(ExcelFileName, "BackDate SubRed Report");
		
	}
	
	@Test(priority = 16)
		public void Create_PartialSettlement() throws Exception
		{
			test=extent.createTest("Partial Settlement of Uploaded Portfolio Subred with settlement date(T+1)");
			 
			
			LoginPage.do_login(ExcelFileName,"BackDate SubRed Report");
			Portfolio_SubRed.Partial_settlement_T1(ExcelFileName, "BackDate(T+1) UNSAL");
			
		}
		
		@Test(priority = 17)
		public void Approve_PartialSettlement() throws Exception
		{
			test=extent.createTest("Approve Partial Settlement");
			 
			Portfolio_SubRed.Approve_Settlement(ExcelFileName, "BackDate SubRed Report");
			
		}
	
	
	
	
	
	@Test(priority = 18)
	public void Verify_BankTransactions_Report() throws Exception
	{
		test=extent.createTest("Verify Bank Transactions Report");

		LoginPage.do_login(ExcelFileName,"BackDate SubRed Report");
		Portfolio_SubRed.Verifying_BankTransactions_Report(ExcelFileName, "BackDate(T+1) UNSAL","Debit");
		
	}
	
	   @Test(priority = 19)
		public void FullSettlement_Reversal() throws Exception
		{
			test=extent.createTest("Full Settlement Reversal of Portfolio Subred with settlement date(T+1)");
			 
			
			Portfolio_SubRed.Full_settlement_Reversal(ExcelFileName, "BackDate SubRed Report","TransactionID1");
			
		}
		
		@Test(priority = 20)
		public void Approve_FullSettlement_Reversal() throws Exception
		{
			test=extent.createTest("Approve Full Settlement Reversal");
			 
			
			Portfolio_SubRed.Approve_Settlement(ExcelFileName, "BackDate SubRed Report");
			
		}
		
		 @Test(priority = 21)
			public void PartialSettlement_Reversal() throws Exception
			{
				test=extent.createTest("Partial Settlement Reversal of Portfolio Subred with settlement date(T+1)");
				 
				LoginPage.do_login(ExcelFileName,"BackDate SubRed Report");
				Portfolio_SubRed.Partial_settlement_Reversal(ExcelFileName, "BackDate SubRed Report");
				
			}
			
			@Test(priority = 22)
			public void Approve_PartialSettlement_Reversal() throws Exception
			{
				test=extent.createTest("Approve Partial Settlement Reversal");
				 
				
				Portfolio_SubRed.Approve_Settlement(ExcelFileName, "BackDate SubRed Report");
				
			}
			
			@Test(priority = 23)
			public void Verify_BankTransactions_report() throws Exception
			{
				test=extent.createTest("Verify Bank Transactions Report");

				LoginPage.do_login(ExcelFileName,"BackDate SubRed Report");
				Portfolio_SubRed.Verifying_BankTransactions_Report(ExcelFileName, "BackDate(T+1) UNSAL","Credit");
				
			}
			
			@Test(priority = 24)
			public void Create_Full_Settlement() throws Exception
			{
				test=extent.createTest("Full Settlement of Portfolio Subred with settlement date(T+1)");
				 
				
				Portfolio_SubRed.Full_settlement(ExcelFileName, "BackDate(T+1) UNSAL","TransactionID1");
				
			}
			
		@Test(priority = 25)
			public void Approve_Full_Settlement() throws Exception
			{
				test=extent.createTest("Approve Full Settlement");
				 
				
				Portfolio_SubRed.Approve_Settlement(ExcelFileName, "BackDate SubRed Report");
				
			}
			
			@Test(priority = 26)
			public void PortfolioSubred_cancellation() throws Exception
			{
				test=extent.createTest("Portfolio Subred Cancellation without Reversing the Settlement");
				 
				
				LoginPage.do_login(ExcelFileName,"BackDate Upload Subred");
					Portfolio_SubRed.Subred_cancellation_T1(ExcelFileName, "BackDate Upload Subred");
				
				
			}
			
			@Test(priority = 27)
					public void Create_FullSettlementT2() throws Exception
					{
						test=extent.createTest("Full Settlement of Portfolio Subred with settlement date(T+2)");
						 
						
						Portfolio_SubRed.Full_settlement(ExcelFileName, "BackDate(T+2) UNSAL","TransactionID2");
						
					}
					
			@Test(priority = 28)
					public void Approve_FullSettlementT2() throws Exception
					{
						test=extent.createTest("Approve Full Settlement");
						 
						
						Portfolio_SubRed.Approve_Settlement(ExcelFileName, "BackDate SubRed Report");
						
					}
			
		   @Test(priority = 29)
			public void FullSettlement_ReversalT2() throws Exception
			{
				test=extent.createTest("Full Settlement Reversal of Portfolio Subred with settlement date(T+2)");
				 
				
				LoginPage.do_login(ExcelFileName,"BackDate SubRed Report");
				Portfolio_SubRed.Full_settlement_Reversal(ExcelFileName, "BackDate SubRed Report","TransactionID2");
				
			}
			
			@Test(priority = 30)
			public void Approve_FullSettlement_ReversalT2() throws Exception
			{
				test=extent.createTest("Approve Full Settlement Reversal");
				 
				
				Portfolio_SubRed.Approve_Settlement(ExcelFileName, "BackDate SubRed Report");
				
			}
			
			@Test(priority = 31)
			public void PortfolioSubred_CancellationT2() throws Exception
			{
				test=extent.createTest("Portfolio Subred Cancellation");
				 
				
				LoginPage.do_login(ExcelFileName,"BackDate Upload Subred");
					Portfolio_SubRed.UploadedSub_cancellation_T2(ExcelFileName, "BackDate Upload Subred","TransactionID2");
				
				
			}
			
			
			@Test(priority = 32)
			public void Approve_Subred_CancellationT2() throws Exception
			{
				test=extent.createTest("Approve Portfolio Subred Cancellation");
				 

				Portfolio_SubRed.ApproveUploadedSub_cancellation_T2(ExcelFileName, "BackDate Upload Subred");
				
			}
			@Test(priority = 33)
			public void Rebuild_NAV() throws Exception
			{
				test=extent.createTest("Rebuild NAV");
				 
				
				LoginPage.do_login(ExcelFileName,"BackDate Upload Subred");
				Portfolio_SubRed.RebuildNAV(ExcelFileName, "BackDate(T+1) UNSAL");
				
			}
			@Test(priority = 34)
			public void ManualNAVclosing_Intraday() throws Exception
			{
				test=extent.createTest("Manual NAV Closing_Intraday");
				 
				
				Portfolio_SubRed.Manual_NAVClosing(ExcelFileName, "BackDate Upload Subred");
				
			}
			
			@Test(priority = 35)
			public void Verify_NAVSummary_Report() throws Exception
			{
				test=extent.createTest("Verify NAV Summary Report");
				 
	
				Portfolio_SubRed.Verifying_NAVSummary_Report(ExcelFileName, "BackDate SubRed Report");
				
				
			}
			
	
	/*@Test(priority = 5)
		public void Upload_Subred() throws Exception
		{
			test=extent.createTest("Uploading Subred Excel File with Settlement Date(T+1,T+2,T+0)");

			LoginPage.Launch_application("HexagonURL");
			LoginPage.do_login(ExcelFileName,"Current(T+0) UNSAL");
			
			PortfolioSubscription.Upload_Subred(ExcelFileName, "Current(T+0) UNSAL");
			
		}

	/*@Test(priority = 2)
	public void Equity_SELL() throws Exception
	{
		test=extent.createTest("Creating Direct Placement and Verification of Equity Shares SELL");
		 
		//LoginPage.Launch_application("HexagonURL");
		//LoginPage.do_login(ExcelFileName,"SELL");
		EquitySELLPage.Equity_sell(ExcelFileName,"SELL");
		EquitySELLPage.EquitySELL_DirectPlacement_verification(ExcelFileName,"SELL");
		EquitySELLPage.EquitySELL_FeesBreakdown_verification(ExcelFileName,"SELL");
		
	}
	
	@Test(priority = 3)
	public void Equity_ETFBUY() throws Exception
	{
		test=extent.createTest("Creating Direct Placement and Verification of Equity Shares ETFBUY");
    
		//LoginPage.Launch_application("HexagonURL");
		LoginPage.do_login(ExcelFileName,"ETFBUY");
		EquityETFBUYPage.Equity_ETFBUY(ExcelFileName,"ETFBUY");
		EquityETFBUYPage.EquityETF_DirectPlacement_verification(ExcelFileName,"ETFBUY");
		EquityETFBUYPage.EquityETF_FeesBreakdown_verification(ExcelFileName,"ETFBUY");
		
		
	}
	
	@Test(priority = 4)
	public void Equity_ETFSELL() throws Exception
	{
		test=extent.createTest("Creating Direct Placement and Verification of Equity Shares ETFSELL");
		 

		//LoginPage.Launch_application("HexagonURL");
		LoginPage.do_login(ExcelFileName,"ETFSELL");
		EquityETFSELLPage.Equity_ETFSELL(ExcelFileName,"ETFSELL");
		EquityETFSELLPage.EquityETFSELL_DirectPlacement_verification(ExcelFileName,"ETFSELL");
		EquityETFSELLPage.EquityETFSELL_FeesBreakdown_verification(ExcelFileName,"ETFSELL");
	}
	
	@Test(priority = 5)
	public void Equity_SQROFF() throws Exception
	{
		test=extent.createTest("Creating Direct Placement and Verification of Equity Shares SQROFF");
		 

		//LoginPage.Launch_application("HexagonURL");
		LoginPage.do_login(ExcelFileName,"SQROFF");
		EquitySQROFFPage.Equity_SQROFF(ExcelFileName,"SQROFF");
		EquitySQROFFPage.EquitySQROFF_DirectPlacement_verification(ExcelFileName,"SQROFF");
		EquitySQROFFPage.EquitySQROFF_FeesBreakdown_verification(ExcelFileName,"SQROFF");
	}*/
	
	
	
	
	

	
	
	@BeforeSuite
	public void prepareReport()
	{	
		String fileName = BasePage.readURLTestDataProp("ReportName");
		//String fileName = BasePage.readTestData1("ReportName", excelName)
		Date d = new Date();
		//String ExtentfileName = fileName +"_"+d.toString().replace(":", "_").replace(" ", "_") + ".html";
		String ExtentfileName = fileName + ".html";
		//reporter=new ExtentHtmlReporter("./extentreports/results.html");
		reporter=new ExtentHtmlReporter("./extentreports/"+ExtentfileName);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		reporter.config().setDocumentTitle("Hexagon Automation Report");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("HexagonmPower");
		
		
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

}
