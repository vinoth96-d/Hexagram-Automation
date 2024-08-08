package com.Hexagon.pom.testcases;

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
import com.Hexagon.base.ZipResult;
import com.Hexagon.pom.pages.LoginPage;
import com.Hexagon.pom.pages.CorporateAction;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CorporateAction_Dividend extends BasePage {

	String ExcelFileName = BasePage.readURLTestDataProp("HexagonEquityData");

	@Test(priority = 1)

	public void Login() throws Exception {

		test = extent.createTest("Login");

		LoginPage.Launch_application("HexagonURL");
		LoginPage.do_login(ExcelFileName, "DIVIDEND");

	}

	@Test(priority = 2)

	public void CorporateActionSumbit() throws Exception {
		
		test = extent.createTest("Create Corporate Action - Dividend");

		CorporateAction.CorporateActionFormDIV(ExcelFileName, "DIVIDEND");
		CorporateAction.CorporateAction_DIV_Submit(ExcelFileName, "DIVIDEND");

	}

	@Test(priority = 3)

	public void CorporateActionApprove() throws Exception {
		test = extent.createTest("Approve Corporate Action - Dividend");

		CorporateAction.CorporateAction_DIV_Confirmation(ExcelFileName, "DIVIDEND");
	}
	
	/*@Test(priority = 4)

	public void ManualIntradayNAV() throws Exception {
		test = extent.createTest("Approve Corporate Action - Dividend");

		CorporateAction.ManualIntradayNAV(ExcelFileName, "DIVIDEND");
	}
	
	@Test(priority = 5)

	public void VerifyAccountingEnquiry() throws Exception {
		test = extent.createTest("Approve Corporate Action - Dividend");

		 CorporateAction.Verifying_AccountingEnquiry_Report(ExcelFileName,"DIVIDEND");
	}
	
	

	// *****************DIRECTPLACEMENT RHBT
	// VERIFIED*********************************
	// CorporateAction.Directplacement(ExcelFileName, "Direct placement");
	// CorporateAction.Directplacement(ExcelFileName, "DIVIDEND");
	// CorporateAction.DirectplacementConformation(ExcelFileName, "DIVIDEND");
	// CorporateAction.ManualIntradayNAV(ExcelFileName, "DIVIDEND");
	// CorporateAction.Reset(ExcelFileName, "Direct placement");

	// *****************DIVIDEND RHBT CUSTODY
	// VERIFIED*********************************
	/*
	 * CorporateAction.ManualIntradayNAV(ExcelFileName, "DIVIDEND");
	 * CorporateAction.CorporateActionFormDIV(ExcelFileName, "DIVIDEND");
	 * CorporateAction.CorporateAction_DIV_Submit(ExcelFileName, "DIVIDEND");
	 * CorporateAction.CorporateAction_DIV_Confirmation(ExcelFileName, "DIVIDEND");
	 * CorporateAction.DIV_Manual_NAVClosing_IF(ExcelFileName, "DIVIDEND");
	 * CorporateAction.DIV_Settlement_Transaction(ExcelFileName, "DIVIDEND");
	 * CorporateAction.DIV_Settlement_Conformation(ExcelFileName, "DIVIDEND");
	 * CorporateAction.ManualIntradayNAV(ExcelFileName, "DIVIDEND");
	 * CorporateAction.Verifying_AccountingEnquiry_Report(ExcelFileName,
	 * "DIVIDEND"); CorporateAction.Verifying_BankTransactions_Report(ExcelFileName,
	 * "DIVIDEND"); CorporateAction.Reset(ExcelFileName, "Direct placement");
	 */

	// *****************BONUS 1:2 RHBT CUSTODY
	// VERIFIED*********************************

	// CorporateAction.Directplacement(ExcelFileName, "BONUS 1:2");
	// CorporateAction.DirectplacementConformation(ExcelFileName, "BONUS 1:2");
	// CorporateAction.ManualIntradayNAV(ExcelFileName, "BONUS 1:2");
	// CorporateAction.CorporateActionForm_BONUS_1_2(ExcelFileName, "BONUS 1:2");
	// CorporateAction.CorporateAction_Bonus_1_2_Submit(ExcelFileName, "BONUS 1:2");
	// CorporateAction.CorporateAction_Bonus_1_2_Confirmation(ExcelFileName, "BONUS
	// 1:2");
	// CorporateAction.B1_2_Manual_NAVClosing_IF(ExcelFileName, "BONUS 1:2");
	// CorporateAction.Bonus_1_2_Settlement_Transaction(ExcelFileName, "BONUS 1:2");
	// CorporateAction.Bonus_1_2_Settlement_Conformation(ExcelFileName, "BONUS
	// 1:2");
	// CorporateAction.ManualIntradayNAV(ExcelFileName, "BONUS 1:2");
	// CorporateAction.Bonus_1_2_HoldingStatements(ExcelFileName, "BONUS 1:2");
	// CorporateAction.Reset(ExcelFileName, "Direct placement");

	// *****************BONUS 2:1 RHBT CUSTODY
	// VERIFIED*********************************
	// CorporateAction.Directplacement(ExcelFileName, "BONUS 2:1");
	// CorporateAction.DirectplacementConformation(ExcelFileName, "BONUS 2:1");
	// CorporateAction.ManualIntradayNAV(ExcelFileName, "BONUS 1:2");
	// CorporateAction.CorporateActionForm_BONUS_2_1(ExcelFileName, "BONUS 2:1");
	// CorporateAction.CorporateAction_Bonus_2_1_Submit(ExcelFileName, "BONUS 2:1");
	// CorporateAction.CorporateAction_Bonus_2_1_Confirmation(ExcelFileName, "BONUS
	// 2:1");
	// CorporateAction.B2_1_IntradayFreeze(ExcelFileName, "BONUS 2:1");
	// CorporateAction.Bonus_2_1_Settlement_Transaction(ExcelFileName, "BONUS 2:1");
	// CorporateAction.Bonus_2_1_Settlement_Conformation(ExcelFileName, "BONUS
	// 2:1");
	// CorporateAction.ManualIntradayNAV(ExcelFileName, "BONUS 1:2");
	// CorporateAction.Bonus_2_1_HoldingStatements(ExcelFileName, "BONUS 2:1");
	// CorporateAction.Reset(ExcelFileName, "Direct placement");

	// ****************SPLIT RHBT Custody VERIFIED*********************************
	// CorporateAction.Directplacement(ExcelFileName, "SPLIT");
	// CorporateAction.DirectplacementConformation(ExcelFileName, "SPLIT");
	// CorporateAction.ManualIntradayNAV(ExcelFileName, "SPLIT");
	// CorporateAction.CorporateActionForm_Split_1_2(ExcelFileName, "SPLIT");
	// CorporateAction.CorporateAction_Split_1_2_Submit(ExcelFileName, "SPLIT");
	// CorporateAction.CorporateAction_Split_1_2_Confirmation(ExcelFileName,
	// "SPLIT");
	// CorporateAction.S1_2_IntradayFreeze(ExcelFileName, "SPLIT");
	// CorporateAction.Split_1_2_Settlement_Transaction(ExcelFileName, "SPLIT");
	// CorporateAction.Split_1_2_Settlement_Conformation(ExcelFileName, "SPLIT");
	// CorporateAction.ManualIntradayNAV(ExcelFileName, "SPLIT");
	// CorporateAction.Split_1_2_HoldingStatements(ExcelFileName, "SPLIT");
	// CorporateAction.Reset(ExcelFileName, "Direct placement");

	// ****************RSPLIT RHBT VERIFIED*********************************
	/*
	 * CorporateAction.Directplacement(ExcelFileName, "RSPLIT");
	 * CorporateAction.DirectplacementConformation(ExcelFileName, "RSPLIT");
	 * CorporateAction.ManualIntradayNAV(ExcelFileName, "RSPLIT");
	 * CorporateAction.CorporateActionForm_Split_2_1(ExcelFileName, "RSPLIT");
	 * CorporateAction.CorporateAction_Split_2_1_Submit(ExcelFileName, "RSPLIT");
	 * CorporateAction.CorporateAction_Split_2_1_Confirmation(ExcelFileName,
	 * "RSPLIT"); CorporateAction.S_2_1_IntradayFreeze(ExcelFileName, "RSPLIT");
	 * CorporateAction.Split_2_1_Settlement_Transaction(ExcelFileName, "RSPLIT");
	 * CorporateAction.Split_2_1_Settlement_Conformation(ExcelFileName, "RSPLIT");
	 * CorporateAction.ManualIntradayNAV(ExcelFileName, "RSPLIT");
	 * CorporateAction.Split_2_1_HoldingStatements(ExcelFileName, "RSPLIT");
	 * CorporateAction.Reset(ExcelFileName, "Direct placement");
	 * 
	 * 
	 */

	// ****************RIGHTS RHBT VERIFIED*********************************
	// CorporateAction.Directplacement(ExcelFileName, "RIGHTS");
	// CorporateAction.Directplacement_RIGHTS_NEWSECUIRTY(ExcelFileName, "RIGHTS");
	// CorporateAction.DirectplacementConformation(ExcelFileName, "RIGHTS");
	// CorporateAction.ManualIntradayNAV(ExcelFileName, "RIGHTS");
	// CorporateAction.CorporateActionFormRIGHTS(ExcelFileName, "RIGHTS");
	// CorporateAction.CorporateAction_RIGHTS_Submit(ExcelFileName, "RIGHTS");
	// CorporateAction.CorporateAction_RIGHTS_Confirmation(ExcelFileName, "RIGHTS");
	// CorporateAction.RIGHTS_Manual_NAVExrecorddate(ExcelFileName,
	// "RIGHTS");//------------19 mints...
	// CorporateAction.RIGHTS_PrimaryMarket(ExcelFileName, "RIGHTS");
	// CorporateAction.CorporateAction_RIGHTS_PRIMARYMARKET_SUBMIT(ExcelFileName,
	// "RIGHTS");
	// CorporateAction.CorporateAction_RIGHT_PRIMARYMARKET_Confirmation(ExcelFileName,
	// "RIGHTS");
	// CorporateAction.RIGHTS_ManualNAVuptoSettlementdate(ExcelFileName,
	// "RIGHTS");//------------19 mints...
	// CorporateAction.Rights_Settlement_Transaction(ExcelFileName, "RIGHTS");
	// CorporateAction.RIGHTS_Settlement_Conformation(ExcelFileName, "RIGHTS");
	// CorporateAction.RIGHTS_Manual_NAV_Allotmentdate(ExcelFileName,
	// "RIGHTS");//------------19 mints...
	// CorporateAction.RIGHTS_PrimaryMarketAllotment(ExcelFileName, "RIGHTS");
	// CorporateAction.CorporateAction_RIGHTS_PRIMARYMARKETALLOTMENT_SUBMIT(ExcelFileName,
	// "RIGHTS");
	// CorporateAction.RIGHTS_PRIMARYMARKET_Allotment_Confirmation(ExcelFileName,
	// "RIGHTS");
	// CorporateAction.ManualIntradayNAV(ExcelFileName, "RIGHTS");
	// CorporateAction.RIGHTS_HoldingStatements(ExcelFileName, "RIGHTS");
	// CorporateAction.Reset(ExcelFileName, "Direct placement");//taking 4.30 mints
	// to reset...

	// ****************WARRANT RHBT VERIFIED*********************************
	// CorporateAction.Directplacement_WARRANT_NEWSECUIRTY(ExcelFileName,
	// "WARRANT");
	// CorporateAction.DirectplacementConformation(ExcelFileName, "WARRANT");
	// CorporateAction.ManualIntradayNAV(ExcelFileName, "WARRANT");
	// CorporateAction.WARRANT_PrimaryMarket(ExcelFileName, "WARRANT");
	// CorporateAction.CorporateAction_WARRANT_PRIMARYMARKET_SUBMIT(ExcelFileName,
	// "WARRANT");
	// CorporateAction.CorporateAction_WARRANT_PRIMARYMARKET_Confirmation(ExcelFileName,
	// "WARRANT");
	// CorporateAction.WARRANT_ManualNAVuptoSettlementdate(ExcelFileName,
	// "WARRANT");//------------19 mints...
	// CorporateAction.WARRANT_Settlement_Transaction(ExcelFileName, "WARRANT");
	// CorporateAction.WARRANT_Settlement_Conformation(ExcelFileName, "WARRANT");
	// CorporateAction.WARRANT_Manual_NAV_Allotmentdate(ExcelFileName,
	// "WARRANT");//------------19 mints...
	// CorporateAction.WARRANT_PrimaryMarketAllotment(ExcelFileName, "WARRANT");
	// CorporateAction.WARRANT_PRIMARYMARKETALLOTMENT_SUBMIT(ExcelFileName,
	// "WARRANT");
	// CorporateAction.WARRANT_PRIMARYMARKET_Allotment_Confirmation(ExcelFileName,
	// "WARRANT");
	// CorporateAction.ManualIntradayNAV(ExcelFileName, "WARRANT");
	// CorporateAction.WARRANT_HoldingStatements(ExcelFileName, "WARRANT");
	// CorporateAction.Reset(ExcelFileName, "Direct placement");//taking 4.30 mints
	// to reset...

	// ****************MERGER RHBT VERIFIED*********************************
	// CorporateAction.Directplacement(ExcelFileName, "MERGER");
	// CorporateAction.Directplacement_MERGER_NEWSECUIRTY(ExcelFileName, "MERGER");
	// CorporateAction.DirectplacementConformation(ExcelFileName, "MERGER");
	// CorporateAction.ManualIntradayNAV(ExcelFileName, "MERGER");
	// CorporateAction.CorporateActionForm_MERGER(ExcelFileName, "MERGER");
	// CorporateAction.CorporateAction_MERGER_Submit(ExcelFileName, "MERGER");
	// CorporateAction.CorporateAction_MERGER_Confirmation(ExcelFileName, "MERGER");
	// CorporateAction.MERGER_Manual_NAVClosing_IF(ExcelFileName,
	// "MERGER");//------------19 mints...
	// CorporateAction.MERGER_Settlement_Transaction(ExcelFileName, "MERGER");
	// CorporateAction.MERGER_Settlement_Conformation(ExcelFileName, "MERGER");
	// CorporateAction.MERGER_Manual_NAVClosing_IntraDay(ExcelFileName, "MERGER");
	// CorporateAction.MERGER_HoldingStatements(ExcelFileName, "MERGER");
	// CorporateAction.Reset(ExcelFileName, "Direct placement");//taking 4.30 mints
	// to reset...

	// ****************DEMERGER RHBT VERIFIED*********************************
	// CorporateAction.Directplacement(ExcelFileName, "DEMERGER");
	// CorporateAction.Directplacement_MERGER_NEWSECUIRTY(ExcelFileName,
	// "DEMERGER");
	// CorporateAction.DirectplacementConformation(ExcelFileName, "DEMERGER");
	// CorporateAction.ManualIntradayNAV(ExcelFileName, "DEMERGER");
	// CorporateAction.CorporateActionForm_DEMERGER(ExcelFileName, "DEMERGER");
	// CorporateAction.CorporateAction_DEMERGER_Submit(ExcelFileName, "DEMERGER");
	// CorporateAction.CorporateAction_DEMERGER_Confirmation(ExcelFileName,
	// "DEMERGER");
	// CorporateAction.DEMERGER_Manual_NAVClosing_IF(ExcelFileName,
	// "DEMERGER");//------------19 mints...
	// CorporateAction.DEMERGER_Settlement_Transaction(ExcelFileName, "DEMERGER");
	// CorporateAction.DEMERGER_Settlement_Conformation(ExcelFileName, "DEMERGER");
	// CorporateAction.DEMERGER_Manual_NAVClosing_IntraDay(ExcelFileName,
	// "DEMERGER");
	// CorporateAction.DEMERGER_HoldingStatements(ExcelFileName, "DEMERGER");
	// CorporateAction.Reset(ExcelFileName, "Direct placement");//taking 4.30 mints
	// to reset...

	// ****************CONVERSION issue with Settlement Data Not
	// Found********************************
	// CorporateAction.Directplacement(ExcelFileName, "CONVERSION");
	// CorporateAction.Directplacement_MERGER_NEWSECUIRTY(ExcelFileName,
	// "CONVERSION");
	// CorporateAction.DirectplacementConformation(ExcelFileName, "CONVERSION");
	// CorporateAction.ManualIntradayNAV(ExcelFileName, "CONVERSION");
	// CorporateAction.CorporateActionForm_COVERSION(ExcelFileName, "CONVERSION");
	// CorporateAction.CorporateAction_CONVERSION_Submit(ExcelFileName,
	// "CONVERSION");
	// CorporateAction.CorporateAction_CONVERSION_Confirmation(ExcelFileName,
	// "CONVERSION");
	// CorporateAction.CONVERSION_Manual_NAVClosing_IF(ExcelFileName,
	// "CONVERSION");//------------19 mints...
	// CorporateAction.CONVERSION_Settlement_Transaction(ExcelFileName,
	// "CONVERSION");
	// CorporateAction.CONVERSION_Settlement_Conformation(ExcelFileName,
	// "CONVERSION");
	// CorporateAction.CONVERSION_Manual_NAVClosing_IntraDay(ExcelFileName,
	// "CONVERSION");
	// CorporateAction.CONVERSION_HoldingStatements(ExcelFileName, "CONVERSION");
	// CorporateAction.Reset(ExcelFileName, "Direct placement");//taking 4.30 mints
	// to reset...

	// ****************CONVERSION issue with Settlement Data Not
	// Found********************************
	// CorporateAction.Directplacement(ExcelFileName, "SPINOF");
	// CorporateAction.Directplacement_MERGER_NEWSECUIRTY(ExcelFileName, "SPINOF");
	// CorporateAction.DirectplacementConformation(ExcelFileName, "SPINOF");
	// CorporateAction.ManualIntradayNAV(ExcelFileName, "SPINOF");
	// CorporateAction.CorporateActionForm_SPINOF(ExcelFileName, "SPINOF");
	// CorporateAction.CorporateAction_SPINOF_Submit(ExcelFileName, "SPINOF");
	// CorporateAction.CorporateAction_SPINOF_Confirmation(ExcelFileName, "SPINOF");
	// CorporateAction.SPINOF_Manual_NAVClosing_IF(ExcelFileName,
	// "SPINOF");//------------19 mints...
	// CorporateAction.SPINOF_Settlement_Transaction(ExcelFileName, "SPINOF");
	// CorporateAction.SPINOF_Settlement_Conformation(ExcelFileName, "SPINOF");
	// CorporateAction.SPINOF_Manual_NAVClosing_IntraDay(ExcelFileName, "SPINOF");
	// CorporateAction.SPINOF_HoldingStatements(ExcelFileName, "SPINOF");

	@BeforeSuite
	public void prepareReport() {
		ZipResult.clearScreenshots();
		String fileName = BasePage.readURLTestDataProp("ReportName");
		// String fileName = BasePage.readTestData1("ReportName", excelName)
		Date d = new Date();
		// String ExtentfileName = fileName +"_"+d.toString().replace(":",
		// "_").replace(" ", "_") + ".html";
		String ExtentfileName = fileName + ".html";
		// reporter=new ExtentHtmlReporter("./extentreports/results.html");
		reporter = new ExtentHtmlReporter("./extentreports/" + ExtentfileName);

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		reporter.config().setDocumentTitle("Hexagram Automation Report");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("HEXAGRAMmPower");

	}

	// Stop Reporting
	// @AfterSuite(alwaysRun = true)
	@AfterSuite
	public void stopReport() {
		extent.flush();
		ZipResult.zipFile();
	}

	@AfterClass
	public void quit() throws Exception {
		if (extent != null) {
			extent.flush();
		}
		if (driver != null) {
			try {
				driver.quit();

			} catch (Exception e) {

				driver.quit();

			}
		}
		System.out.println("DriverQuit");

	}

}
