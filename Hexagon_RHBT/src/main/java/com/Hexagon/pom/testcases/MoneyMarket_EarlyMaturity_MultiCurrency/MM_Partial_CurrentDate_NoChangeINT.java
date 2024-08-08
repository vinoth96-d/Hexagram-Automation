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

public class MM_Partial_CurrentDate_NoChangeINT extends BasePage{

    
	String ExcelFileName = BasePage.readURLTestDataProp("MoneyMarket_TestData");
	
	String Scenario = "MC CurrentDate(T+2) No change INT";
	
	@Test(priority = 1)
	public void Create_DepositPlacement() throws Exception
	{
		test=extent.createTest("Create Deposit Placement on CurrentDate");
		test.log(Status.INFO, "MultiCurrency - Early Maturity(2 days) PartialWithdrawal(Current Date,No Change in Interest)");
		 
		
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
	public void ManualNAVclosing() throws Exception
	{
		test=extent.createTest("Manual NAV Closing");

		LoginPage.do_login(ExcelFileName,Scenario);
		DepositPlacementPage.Manual_NAVClosing(ExcelFileName, Scenario);
		
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
	public void Intraday_Freeze() throws Exception
	{
		test=extent.createTest("Manual NAV Intraday/Freeze");
		 
		DepositPlacementPage.ManualNAVClosing_IntradayFreeze(ExcelFileName, Scenario);
		
	}
	
	@Test(priority = 7)
	public void Create_BulkDepositMaturity() throws Exception
	{
		test=extent.createTest("Create Bulk Deposit Maturity(PartialWithdrawal,No Change in INT)");
		
		BulkDepositMaturityPage.BulkDeposit_EarlyMaturity(ExcelFileName, Scenario,"","MultiCurrency");
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
	public void ManualNAVClosing() throws Exception
	{
		test=extent.createTest("Manual NAV Closing");
		 
		LoginPage.do_login(ExcelFileName,Scenario);
		BulkDepositMaturityPage.Manual_NAVClosing(ExcelFileName, Scenario);
		
	}
	
	@Test(priority = 10)
	public void Verify_AccountingEnquiry_Report() throws Exception
	{
		test=extent.createTest("Verify Accounting Enquiry Report");
		 
		BulkDepositMaturityPage.Verifying_AccountingEnquiry_Report(ExcelFileName, Scenario);
		
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
		BulkDepositMaturityPage.Verifying_ReversalAccountingEnquiry_Report(ExcelFileName, Scenario);
		
	}
	
	@Test(priority = 15)
	public void Verify_ReversalBankTransactionsReport() throws Exception
	{
		test=extent.createTest("Verify Reversed Bank Transactions Report");
		
		BulkDepositMaturityPage.Verifying_BankTransactions_Report(ExcelFileName, Scenario,"Reversal");
		
	}
	
	
	

	
	
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
