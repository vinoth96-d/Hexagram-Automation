package com.Hexagon.pom.pages;

import java.io.IOException;

import com.Hexagon.base.BasePage;
import com.aventstack.extentreports.Status;

public class CorporateAction extends BasePage {

	public static void CorporateActionFormDIV(String excelName, String Scenario) throws Exception {

		// Thread.sleep(9000);
		test.log(Status.INFO, "Creating Corporate Action For DIV");
		test.log(Status.INFO, "Click on Masters");
		BasePage.click_hexgendash("Masters");
		Thread.sleep(2000);

		test.log(Status.INFO, "Valuation");
		BasePage.click_hexgendash("Valuation");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Corporate Action");
		BasePage.click_hexgendash("CorporateAction");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.enterText("BenefitType", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("BenefitType_DIV");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter Ex Record_Date");
		BasePage.enterText("Exec_Record_Date", "Ex Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter AGM Date");
		BasePage.enterText("AGM_Date", "AGM_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Lodgement Date");
		BasePage.enterText("Lodgement_Date", "Lodgement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Record Date");
		BasePage.enterText("Record_Date", "Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Security");
		BasePage.click_hexgendash("Securitytextbox");
		BasePage.enterText("Security", "Security", excelName, Scenario);
		BasePage.click_hexgendash("Security_4405");
		Thread.sleep(1000);

		BasePage.scrollintoview("ExecPricetitle");
		test.log(Status.INFO, "Enter Exec Price");
		System.out.println("75");
		BasePage.enterText("exec_PriceBI", "Exec_Price", excelName, Scenario);
		System.out.println("79");
		Thread.sleep(1000);

		BasePage.scrollintoview("Exp_Setl_Datetitle");
		test.log(Status.INFO, "Enter Exp Setl Date");
		BasePage.enterText("Exp_Setl_Date", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Exec Price Tax");
		BasePage.enterText("TaxPriceEntry", "Exec_PriceTax", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Exec Price Basis");
		BasePage.click_hexgendash("Execpricebasics_textbox");
		BasePage.enterText("Exec_PriceBasics", "Exec_Price_Basis", excelName, Scenario);
		BasePage.click_hexgendash("Execpricebasics_PERSHR");
		Thread.sleep(1000);

		System.out.println("89");

		Thread.sleep(8000);
		System.out.println("88");
		System.out.println("Started Verfication for Corporate Action DIVIDEND");

		test.log(Status.INFO, "Verifying Ratio Org");
		BasePage.AssertExcel_ByreadingTextbox("Ratio_Org", "Ratio Org", excelName, Scenario, "Ratio Org");

		test.log(Status.INFO, "Verifying Ratio New");
		BasePage.AssertExcel_ByreadingTextbox("Ratio_New", "Ratio New", excelName, Scenario, "Ratio New");

		test.log(Status.INFO, "Verifying Round Method");
		BasePage.AssertExcel2("Round_Method", "Round Method", excelName, Scenario, "Round Method");

		test.log(Status.INFO, "Verifying Round Decimals");
		BasePage.AssertExcel_ByreadingTextbox("Round_Decimals", "Round Decimals", excelName, Scenario,
				"Round Decimals");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel_ByreadingTextbox("Basicinfo_Face_VAlue", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying Cost Transfer %");
		BasePage.AssertExcel_ByreadingTextbox("Cost_Transfer%", "Cost Transfer %", excelName, Scenario,
				"Cost Transfer %");

		test.log(Status.INFO, "Verifying Dividend Type");
		BasePage.AssertExcel2("Divended_Type", "Dividend Type", excelName, Scenario, "Dividend Type");

		test.log(Status.INFO, "Verifying Benefit Ccy");
		BasePage.AssertExcel2("Benefit_Ccy", "Benefit Ccy", excelName, Scenario, "Benefit Ccy");

		test.log(Status.INFO, "Verifying Exec Price Basics");
		BasePage.AssertExcel2("PERSHR_TEXT", "Exec_Price_Basis", excelName, Scenario, "Exec Price Basics");

		BasePage.scrollintoview("SecurityName");
		test.log(Status.INFO, "Verifying Security Name");
		BasePage.AssertExcel2("CAFORM_Security_Name", "Security Name", excelName, Scenario, "Security Name");

		test.log(Status.INFO, "Verifying Security Ccy");
		BasePage.AssertExcel2("CAFORM_Security_Ccy", "Security Ccy", excelName, Scenario, "Security Ccy");

		test.log(Status.INFO, "Verifying Issuer");
		BasePage.AssertExcel2("CAFORM_issuer", "Issuer", excelName, Scenario, "Issuer");

		test.log(Status.INFO, "Verifying Asset Class");
		BasePage.AssertExcel2("CAFORM_Asset_Class", "Asset Class", excelName, Scenario, "Asset Class");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel2("CAFORM_face_value", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying ISIN");
		BasePage.AssertExcel2("CAFORM_ISIN", "ISIN", excelName, Scenario, "ISIN");

	}

	public static void CorporateActionForm_MERGER(String excelName, String Scenario) throws Exception {

		// Thread.sleep(9000);
		test.log(Status.INFO, "Creating Corporate Action For MERGER");
		test.log(Status.INFO, "Click on Masters");
		BasePage.click_hexgendash("Masters");
		Thread.sleep(2000);

		test.log(Status.INFO, "Valuation");
		BasePage.click_hexgendash("Valuation");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Corporate Action");
		BasePage.click_hexgendash("CorporateAction");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.enterText("BenefitType", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("Benefit_MERGER");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter Ex Record_Date");
		BasePage.enterText("Exec_Record_Date", "Ex Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter AGM Date");
		BasePage.enterText("AGM_Date", "AGM_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Lodgement Date");
		BasePage.enterText("Lodgement_Date", "Lodgement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Record Date");
		BasePage.enterText("Record_Date", "Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Security");
		BasePage.click_hexgendash("Securitytextbox");
		BasePage.enterText("Security", "Security", excelName, Scenario);
		BasePage.click_hexgendash("Security_4405");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Ratio Org");
		BasePage.enterText("Ratio_Org", "Ratio Org", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Ratio New");
		BasePage.enterText("Ratio_New", "Ratio New", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Exp Setl Date");
		BasePage.enterText("Exp_Setl_Date", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);
		test.log(Status.INFO, "Enter and Select New Security");
		BasePage.enterText("NEW_SECUIRTY", "New Security", excelName, Scenario);
		BasePage.scrollintoview("Security_5035");
		BasePage.click_hexgendash("Security_5035");
		Thread.sleep(1000);

		System.out.println("89");

		Thread.sleep(8000);
		System.out.println("88");
		System.out.println("Started Verfication for Corporate Action MERGER");

		test.log(Status.INFO, "Verifying Ratio Org");
		BasePage.AssertExcel_ByreadingTextbox("Ratio_Org", "Ratio Org", excelName, Scenario, "Ratio Org");

		test.log(Status.INFO, "Verifying Ratio New");
		BasePage.AssertExcel_ByreadingTextbox("Ratio_New", "Ratio New", excelName, Scenario, "Ratio New");

		test.log(Status.INFO, "Verifying Round Method");
		BasePage.AssertExcel2("Round_Method", "Round Method", excelName, Scenario, "Round Method");

		test.log(Status.INFO, "Verifying Round Decimals");
		BasePage.AssertExcel_ByreadingTextbox("Round_Decimals", "Round Decimals", excelName, Scenario,
				"Round Decimals");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel_ByreadingTextbox("Basicinfo_Face_VAlue", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying Cost Transfer %");
		BasePage.AssertExcel_ByreadingTextbox("Cost_Transfer%", "Cost Transfer %", excelName, Scenario,
				"Cost Transfer %");

		test.log(Status.INFO, "Verifying Dividend Type");
		BasePage.AssertExcel2("Divended_Type", "Dividend Type", excelName, Scenario, "Dividend Type");

		test.log(Status.INFO, "Verifying Benefit Ccy");
		BasePage.AssertExcel2("Benefit_Ccy", "Benefit Ccy", excelName, Scenario, "Benefit Ccy");

		test.log(Status.INFO, "Verifying Exec Price Basics");
		BasePage.AssertExcel2("PERSHR_TEXT", "Exec_Price_Basis", excelName, Scenario, "Exec Price Basics");

		test.log(Status.INFO, "Verifying Security Name");
		BasePage.AssertExcel2("CAFORM_Security_Name", "Security Name", excelName, Scenario, "Security Name");

		test.log(Status.INFO, "Verifying Security Ccy");
		BasePage.AssertExcel2("CAFORM_Security_Ccy", "Security Ccy", excelName, Scenario, "Security Ccy");

		test.log(Status.INFO, "Verifying Issuer");
		BasePage.AssertExcel2("CAFORM_issuer", "Issuer", excelName, Scenario, "Issuer");

		test.log(Status.INFO, "Verifying Asset Class");
		BasePage.AssertExcel2("CAFORM_Asset_Class", "Asset Class", excelName, Scenario, "Asset Class");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel2("CAFORM_face_value", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying ISIN");
		BasePage.AssertExcel2("CAFORM_ISIN", "ISIN", excelName, Scenario, "ISIN");

	}

	public static void CorporateActionForm_DEMERGER(String excelName, String Scenario) throws Exception {

		// Thread.sleep(9000);
		test.log(Status.INFO, "Creating Corporate Action For DEMERGER");
		test.log(Status.INFO, "Click on Masters");
		BasePage.click_hexgendash("Masters");
		Thread.sleep(2000);

		test.log(Status.INFO, "Valuation");
		BasePage.click_hexgendash("Valuation");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Corporate Action");
		BasePage.click_hexgendash("CorporateAction");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.enterText("BenefitType", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("Benefit_Demerger");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter Ex Record_Date");
		BasePage.enterText("Exec_Record_Date", "Ex Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter AGM Date");
		BasePage.enterText("AGM_Date", "AGM_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Lodgement Date");
		BasePage.enterText("Lodgement_Date", "Lodgement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Record Date");
		BasePage.enterText("Record_Date", "Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Security");
		BasePage.click_hexgendash("Securitytextbox");
		BasePage.enterText("Security", "Security", excelName, Scenario);
		BasePage.click_hexgendash("Security_4405");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Exec Price Basis");
		BasePage.click_hexgendash("Execpricebasics_textbox");
		BasePage.enterText("Exec_PriceBasics", "Exec_Price_Basis", excelName, Scenario);
		BasePage.click_hexgendash("FVALUE");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Ratio Org");
		BasePage.enterText("Ratio_Org", "Ratio Org", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Ratio New");
		BasePage.enterText("Ratio_New", "Ratio New", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Cost Transfer %");
		BasePage.scrollintoview("COSTTRANSFER");
		BasePage.enterText("COSTTRANSFER", "Cost Transfer %", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Exp Setl Date");
		BasePage.enterText("Exp_Setl_Date", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);
		test.log(Status.INFO, "Enter and Select New Security");
		BasePage.enterText("NEW_SECUIRTY", "New Security", excelName, Scenario);
		BasePage.scrollintoview("Security_5035");
		BasePage.click_hexgendash("Security_5035");
		Thread.sleep(1000);

		System.out.println("89");

		Thread.sleep(8000);
		System.out.println("88");
		System.out.println("Started Verfication for Corporate Action MERGER");

		test.log(Status.INFO, "Verifying Ratio Org");
		BasePage.AssertExcel_ByreadingTextbox("Ratio_Org", "Ratio Org", excelName, Scenario, "Ratio Org");

		test.log(Status.INFO, "Verifying Ratio New");
		BasePage.AssertExcel_ByreadingTextbox("Ratio_New", "Ratio New", excelName, Scenario, "Ratio New");

		test.log(Status.INFO, "Verifying Round Method");
		BasePage.AssertExcel2("Round_Method", "Round Method", excelName, Scenario, "Round Method");

		test.log(Status.INFO, "Verifying Round Decimals");
		BasePage.AssertExcel_ByreadingTextbox("Round_Decimals", "Round Decimals", excelName, Scenario,
				"Round Decimals");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel_ByreadingTextbox("Basicinfo_Face_VAlue", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying Cost Transfer %");
		BasePage.AssertExcel_ByreadingTextbox("Cost_Transfer%", "Cost Transfer %", excelName, Scenario,
				"Cost Transfer %");

		test.log(Status.INFO, "Verifying Dividend Type");
		BasePage.AssertExcel2("Divended_Type", "Dividend Type", excelName, Scenario, "Dividend Type");

		test.log(Status.INFO, "Verifying Benefit Ccy");
		BasePage.AssertExcel2("Benefit_Ccy", "Benefit Ccy", excelName, Scenario, "Benefit Ccy");

		test.log(Status.INFO, "Verifying Exec Price Basics");
		BasePage.AssertExcel2("PERSHR_TEXT", "Exec_Price_Basis", excelName, Scenario, "Exec Price Basics");

		test.log(Status.INFO, "Verifying Security Name");
		BasePage.AssertExcel2("CAFORM_Security_Name", "Security Name", excelName, Scenario, "Security Name");

		test.log(Status.INFO, "Verifying Security Ccy");
		BasePage.AssertExcel2("CAFORM_Security_Ccy", "Security Ccy", excelName, Scenario, "Security Ccy");

		test.log(Status.INFO, "Verifying Issuer");
		BasePage.AssertExcel2("CAFORM_issuer", "Issuer", excelName, Scenario, "Issuer");

		test.log(Status.INFO, "Verifying Asset Class");
		BasePage.AssertExcel2("CAFORM_Asset_Class", "Asset Class", excelName, Scenario, "Asset Class");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel2("CAFORM_face_value", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying ISIN");
		BasePage.AssertExcel2("CAFORM_ISIN", "ISIN", excelName, Scenario, "ISIN");

	}

	public static void CorporateActionForm_COVERSION(String excelName, String Scenario) throws Exception {

		// Thread.sleep(9000);
		test.log(Status.INFO, "Creating Corporate Action For MERGER");
		test.log(Status.INFO, "Click on Masters");
		BasePage.click_hexgendash("Masters");
		Thread.sleep(2000);

		test.log(Status.INFO, "Valuation");
		BasePage.click_hexgendash("Valuation");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Corporate Action");
		BasePage.click_hexgendash("CorporateAction");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.enterText("BenefitType", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("BenefitType_CONV");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter Ex Record_Date");
		BasePage.enterText("Exec_Record_Date", "Ex Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter AGM Date");
		BasePage.enterText("AGM_Date", "AGM_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Lodgement Date");
		BasePage.enterText("Lodgement_Date", "Lodgement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Record Date");
		BasePage.enterText("Record_Date", "Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Security");
		BasePage.click_hexgendash("Securitytextbox");
		BasePage.enterText("Security", "Security", excelName, Scenario);
		BasePage.click_hexgendash("Security_4405");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Ratio Org");
		BasePage.enterText("Ratio_Org", "Ratio Org", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Ratio New");
		BasePage.enterText("Ratio_New", "Ratio New", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Exp Setl Date");
		BasePage.enterText("Exp_Setl_Date", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);
		test.log(Status.INFO, "Enter and Select New Security");
		BasePage.enterText("NEW_SECUIRTY", "New Security", excelName, Scenario);
		BasePage.scrollintoview("Security_5035");
		BasePage.click_hexgendash("Security_5035");
		Thread.sleep(1000);

		System.out.println("89");

		Thread.sleep(8000);
		System.out.println("88");
		System.out.println("Started Verfication for Corporate Action MERGER");

		test.log(Status.INFO, "Verifying Ratio Org");
		BasePage.AssertExcel_ByreadingTextbox("Ratio_Org", "Ratio Org", excelName, Scenario, "Ratio Org");

		test.log(Status.INFO, "Verifying Ratio New");
		BasePage.AssertExcel_ByreadingTextbox("Ratio_New", "Ratio New", excelName, Scenario, "Ratio New");

		test.log(Status.INFO, "Verifying Round Method");
		BasePage.AssertExcel2("Round_Method", "Round Method", excelName, Scenario, "Round Method");

		test.log(Status.INFO, "Verifying Round Decimals");
		BasePage.AssertExcel_ByreadingTextbox("Round_Decimals", "Round Decimals", excelName, Scenario,
				"Round Decimals");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel_ByreadingTextbox("Basicinfo_Face_VAlue", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying Cost Transfer %");
		BasePage.AssertExcel_ByreadingTextbox("Cost_Transfer%", "Cost Transfer %", excelName, Scenario,
				"Cost Transfer %");

		test.log(Status.INFO, "Verifying Dividend Type");
		BasePage.AssertExcel2("Divended_Type", "Dividend Type", excelName, Scenario, "Dividend Type");

		test.log(Status.INFO, "Verifying Benefit Ccy");
		BasePage.AssertExcel2("Benefit_Ccy", "Benefit Ccy", excelName, Scenario, "Benefit Ccy");

		test.log(Status.INFO, "Verifying Exec Price Basics");
		BasePage.AssertExcel2("PERSHR_TEXT", "Exec_Price_Basis", excelName, Scenario, "Exec Price Basics");

		test.log(Status.INFO, "Verifying Security Name");
		BasePage.AssertExcel2("CAFORM_Security_Name", "Security Name", excelName, Scenario, "Security Name");

		test.log(Status.INFO, "Verifying Security Ccy");
		BasePage.AssertExcel2("CAFORM_Security_Ccy", "Security Ccy", excelName, Scenario, "Security Ccy");

		test.log(Status.INFO, "Verifying Issuer");
		BasePage.AssertExcel2("CAFORM_issuer", "Issuer", excelName, Scenario, "Issuer");

		test.log(Status.INFO, "Verifying Asset Class");
		BasePage.AssertExcel2("CAFORM_Asset_Class", "Asset Class", excelName, Scenario, "Asset Class");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel2("CAFORM_face_value", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying ISIN");
		BasePage.AssertExcel2("CAFORM_ISIN", "ISIN", excelName, Scenario, "ISIN");

	}

	public static void CorporateActionForm_SPINOF(String excelName, String Scenario) throws Exception {

		// Thread.sleep(9000);
		test.log(Status.INFO, "Creating Corporate Action For MERGER");
		test.log(Status.INFO, "Click on Masters");
		BasePage.click_hexgendash("Masters");
		Thread.sleep(2000);

		test.log(Status.INFO, "Valuation");
		BasePage.click_hexgendash("Valuation");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Corporate Action");
		BasePage.click_hexgendash("CorporateAction");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.enterText("BenefitType", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("Benefittype_SPINOF");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter Ex Record_Date");
		BasePage.enterText("Exec_Record_Date", "Ex Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter AGM Date");
		BasePage.enterText("AGM_Date", "AGM_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Lodgement Date");
		BasePage.enterText("Lodgement_Date", "Lodgement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Record Date");
		BasePage.enterText("Record_Date", "Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Security");
		BasePage.click_hexgendash("Securitytextbox");
		BasePage.enterText("Security", "Security", excelName, Scenario);
		BasePage.click_hexgendash("Security_4405");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Ratio Org");
		BasePage.enterText("Ratio_Org", "Ratio Org", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Ratio New");
		BasePage.enterText("Ratio_New", "Ratio New", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select TAXCODE");
		BasePage.enterText("CA_TAXCODE", "Taxcode", excelName, Scenario);
		BasePage.click_hexgendash("CA_TAXCODE_NA");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter Exp Setl Date");
		BasePage.enterText("Exp_Setl_Date", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);
		test.log(Status.INFO, "Enter and Select New Security");
		BasePage.enterText("NEW_SECUIRTY", "New Security", excelName, Scenario);
		BasePage.scrollintoview("Security_5035");
		BasePage.click_hexgendash("Security_5035");
		Thread.sleep(1000);

		System.out.println("89");

		Thread.sleep(8000);
		System.out.println("88");
		System.out.println("Started Verfication for Corporate Action MERGER");

		test.log(Status.INFO, "Verifying Ratio Org");
		BasePage.AssertExcel_ByreadingTextbox("Ratio_Org", "Ratio Org", excelName, Scenario, "Ratio Org");

		test.log(Status.INFO, "Verifying Ratio New");
		BasePage.AssertExcel_ByreadingTextbox("Ratio_New", "Ratio New", excelName, Scenario, "Ratio New");

		test.log(Status.INFO, "Verifying Round Method");
		BasePage.AssertExcel2("Round_Method", "Round Method", excelName, Scenario, "Round Method");

		test.log(Status.INFO, "Verifying Round Decimals");
		BasePage.AssertExcel_ByreadingTextbox("Round_Decimals", "Round Decimals", excelName, Scenario,
				"Round Decimals");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel_ByreadingTextbox("Basicinfo_Face_VAlue", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying Cost Transfer %");
		BasePage.AssertExcel_ByreadingTextbox("Cost_Transfer%", "Cost Transfer %", excelName, Scenario,
				"Cost Transfer %");

		test.log(Status.INFO, "Verifying Dividend Type");
		BasePage.AssertExcel2("Divended_Type", "Dividend Type", excelName, Scenario, "Dividend Type");

		test.log(Status.INFO, "Verifying Benefit Ccy");
		BasePage.AssertExcel2("Benefit_Ccy", "Benefit Ccy", excelName, Scenario, "Benefit Ccy");

		test.log(Status.INFO, "Verifying Exec Price Basics");
		BasePage.AssertExcel2("PERSHR_TEXT", "Exec_Price_Basis", excelName, Scenario, "Exec Price Basics");

		test.log(Status.INFO, "Verifying Security Name");
		BasePage.AssertExcel2("CAFORM_Security_Name", "Security Name", excelName, Scenario, "Security Name");

		test.log(Status.INFO, "Verifying Security Ccy");
		BasePage.AssertExcel2("CAFORM_Security_Ccy", "Security Ccy", excelName, Scenario, "Security Ccy");

		test.log(Status.INFO, "Verifying Issuer");
		BasePage.AssertExcel2("CAFORM_issuer", "Issuer", excelName, Scenario, "Issuer");

		test.log(Status.INFO, "Verifying Asset Class");
		BasePage.AssertExcel2("CAFORM_Asset_Class", "Asset Class", excelName, Scenario, "Asset Class");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel2("CAFORM_face_value", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying ISIN");
		BasePage.AssertExcel2("CAFORM_ISIN", "ISIN", excelName, Scenario, "ISIN");

	}

	public static void CorporateAction_DIV_Submit(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Click on Submit");
		BasePage.click_hexgendash("SubmitButton");
		
		if(BasePage.checkelementpresent1(("Depo_Override"))==true)
		{
		 
		 test.log(Status.INFO, "Click on Override Approve icon");
		 BasePage.scrollintoview("Depo_Override");
		 BasePage.click_hexgendash("Depo_Override");
		 
		 test.log(Status.INFO, "Click on Remarks Approve icon");
		 BasePage.click_hexgendash("Depo_remarkstick");
		 
		 test.log(Status.INFO, "Verifying Corporate Action Form Submission message");
		 BasePage.AssertExcel2("DIV_MSG", "CAForm_Override", excelName, Scenario, "Successful Message");
		 
		}

		else {
		test.log(Status.INFO, "Verifying Corporate Action Form Submission message");
		BasePage.AssertExcel2("DIV_MSG", "CAForm_Submit", excelName, Scenario, "Successful Message");}

		Thread.sleep(4000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(6000);

	}

	public static void CorporateAction_MERGER_Submit(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Click on Submit");
		BasePage.click_hexgendash("SubmitButton");

		test.log(Status.INFO, "Verifying Corporate Action Form Submission message");
		BasePage.AssertExcel2("DIV_MSG", "CAForm_Submit", excelName, Scenario, "Successful Message");

		Thread.sleep(4000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(6000);

	}

	public static void CorporateAction_DEMERGER_Submit(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Click on Submit");
		BasePage.click_hexgendash("SubmitButton");

		test.log(Status.INFO, "Verifying Corporate Action Form Submission message");
		BasePage.AssertExcel2("DIV_MSG", "CAForm_Submit", excelName, Scenario, "Successful Message");

		Thread.sleep(4000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(6000);

	}

	public static void CorporateAction_CONVERSION_Submit(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Click on Submit");
		BasePage.click_hexgendash("SubmitButton");

		test.log(Status.INFO, "Verifying Corporate Action Form Submission message");
		BasePage.AssertExcel2("DIV_MSG", "CAForm_Submit", excelName, Scenario, "Successful Message");

		Thread.sleep(4000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(6000);

	}

	public static void CorporateAction_SPINOF_Submit(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Click on Submit");
		BasePage.click_hexgendash("SubmitButton");

		test.log(Status.INFO, "Verifying Corporate Action Form Submission message");
		BasePage.AssertExcel2("DIV_MSG", "CAForm_Submit", excelName, Scenario, "Successful Message");

		Thread.sleep(4000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(6000);

	}

	public static void CorporateAction_DIV_Confirmation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid Checker Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid Checker Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Select Company");
		// BasePage.click1("company");
		BasePage.enterText("company", "Company", excelName, Scenario);

		Thread.sleep(2000);
		BasePage.click_hexgendash("comapny_dropdown");
		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(10000);

		test.log(Status.INFO, "Approving DIV Corporate Action Form");

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("CA_approve");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Remarks");
		BasePage.enterText("approve_remarks", "CA_Approve_remarks", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("approve_tick");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(5000);
	}

	public static void CorporateAction_MERGER_Confirmation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(12000);

		test.log(Status.INFO, "Approving DIV Corporate Action Form");

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("CA_approve");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Remarks");
		BasePage.enterText("approve_remarks", "CA_Approve_remarks", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("approve_tick");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(5000);

	}

	public static void CorporateAction_CONVERSION_Confirmation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(12000);

		test.log(Status.INFO, "Approving DIV Corporate Action Form");

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("CA_approve");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Remarks");
		BasePage.enterText("approve_remarks", "CA_Approve_remarks", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("approve_tick");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(5000);

	}

	public static void CorporateAction_SPINOF_Confirmation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(12000);

		test.log(Status.INFO, "Approving DIV Corporate Action Form");

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("CA_approve");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Remarks");
		BasePage.enterText("approve_remarks", "CA_Approve_remarks", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("approve_tick");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(5000);
	}

	public static void CorporateAction_DEMERGER_Confirmation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(12000);

		test.log(Status.INFO, "Approving DIV Corporate Action Form");

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("CA_approve");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Remarks");
		BasePage.enterText("approve_remarks", "CA_Approve_remarks", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("approve_tick");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(5000);

	}

	public static void CorporateActionForm_BONUS_1_2(String excelName, String Scenario) throws Exception {

		// LoginPage.do_login(ExcelFileName,"DIVIDEND");

		// Thread.sleep(9000);
		test.log(Status.INFO, "Creating Corporate Action For BONUS 1:2");
		test.log(Status.INFO, "Click on Masters");
		BasePage.click_hexgendash("Masters");
		Thread.sleep(1000);

		test.log(Status.INFO, "Valuation");
		BasePage.click_hexgendash("Valuation");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Corporate Action");
		BasePage.click_hexgendash("CorporateAction");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.enterText("BenefitType", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("Benefittype_BONUS");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter Ex Record_Date");
		BasePage.enterText("Exec_Record_Date", "Ex Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter AGM Date");
		BasePage.enterText("AGM_Date", "AGM_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Lodgement Date");
		BasePage.enterText("Lodgement_Date", "Lodgement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Record Date");
		BasePage.enterText("Record_Date", "Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Security");
		BasePage.enterText("Security", "Security", excelName, Scenario);
		BasePage.click_hexgendash("Security_4405");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Ratio Org");
		BasePage.enterText("Ratio_Org", "Ratio Org", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Ratio New");
		BasePage.enterText("Ratio_New", "Ratio New", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Exp Setl Date");
		BasePage.enterText("Exp_Setl_Date", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		System.out.println("89");

		Thread.sleep(8000);
		System.out.println("88");
		System.out.println("Started Verfication for Corporate Action BONUS 1:2");

		test.log(Status.INFO, "Verifying Benefit Ccy");
		BasePage.AssertExcel2("Benefit_Ccy", "Benefit Ccy", excelName, Scenario, "Benefit Ccy");

		test.log(Status.INFO, "Verifying Exec Price Basis");
		BasePage.AssertExcel2("Exec_Price_Basis_BONUS", "Exec_Price_Basis", excelName, Scenario, "Exec Price Basis");

		test.log(Status.INFO, "Verifying Exec Price");
		BasePage.AssertExcel_ByreadingTextbox("exec_PriceBI", "Exec_Price", excelName, Scenario, "Exec Price");

		test.log(Status.INFO, "Verifying Exec Price Tax");
		BasePage.AssertExcel_ByreadingTextbox("E_P_T", "Exec_PriceTax", excelName, Scenario, "Exec Price Tax");

		test.log(Status.INFO, "Verifying Round Method");
		BasePage.AssertExcel2("Round_Method", "Round Method", excelName, Scenario, "Round Method");

		test.log(Status.INFO, "Verifying Round Decimals");
		BasePage.AssertExcel_ByreadingTextbox("Round_Decimals", "Round Decimals", excelName, Scenario,
				"Round Decimals");
		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel_ByreadingTextbox("Basicinfo_Face_VAlue", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying Cost Transfer %");
		BasePage.AssertExcel_ByreadingTextbox("Cost_Transfer%", "Cost Transfer %", excelName, Scenario,
				"Cost Transfer %");

		test.log(Status.INFO, "Verifying Withhold Tax %");
		BasePage.AssertExcel_ByreadingTextbox("WithHold_Tax", "Withhold Tax %", excelName, Scenario, "Withhold Tax %");

		test.log(Status.INFO, "Verifying Dividend Type");
		BasePage.AssertExcel2("Divended_Type", "Dividend Type", excelName, Scenario, "Dividend Type");

		test.log(Status.INFO, "Verifying Security Name");
		BasePage.AssertExcel2("CAFORM_Security_Name", "Security Name", excelName, Scenario, "Security Name");

		test.log(Status.INFO, "Verifying Security Ccy");
		BasePage.AssertExcel2("CAFORM_Security_Ccy", "Security Ccy", excelName, Scenario, "Security Ccy");

		test.log(Status.INFO, "Verifying Issuer");
		BasePage.AssertExcel2("CAFORM_issuer", "Issuer", excelName, Scenario, "Issuer");

		test.log(Status.INFO, "Verifying Asset Class");
		BasePage.AssertExcel2("CAFORM_Asset_Class", "Asset Class", excelName, Scenario, "Asset Class");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel2("CAFORM_face_value", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying ISIN");
		BasePage.AssertExcel2("CAFORM_ISIN", "ISIN", excelName, Scenario, "ISIN");

	}

	public static void CorporateAction_Bonus_1_2_Submit(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Click on Submit");
		BasePage.click_hexgendash("SubmitButton");

		test.log(Status.INFO, "Verifying Corporate Action Form Submission message");
		BasePage.AssertExcel2("DIV_MSG", "CAForm_Submit", excelName, Scenario, "Successful Message");

		Thread.sleep(2000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);
	}

	public static void CorporateAction_Bonus_1_2_Confirmation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);
		test.log(Status.INFO, "Select Company");
		// BasePage.click1("company");
		BasePage.enterText("company", "Company", excelName, Scenario);

		Thread.sleep(2000);
		BasePage.click_hexgendash("comapny_dropdown");
		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(15000);

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("CA_approve");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Remarks");
		BasePage.enterText("approve_remarks", "CA_Approve_remarks", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("approve_tick");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void CorporateActionForm_BONUS_2_1(String excelName, String Scenario) throws Exception {

		// LoginPage.do_login(ExcelFileName,"DIVIDEND");

		Thread.sleep(9000);
		test.log(Status.INFO, "Creating Corporate Action For BONUS 2:1");
		test.log(Status.INFO, "Click on Masters");
		BasePage.click_hexgendash("Masters");
		Thread.sleep(1000);

		test.log(Status.INFO, "Valuation");
		BasePage.click_hexgendash("Valuation");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Corporate Action");
		BasePage.click_hexgendash("CorporateAction");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.enterText("BenefitType", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("Benefittype_BONUS");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter Ex Record_Date");
		BasePage.enterText("Exec_Record_Date", "Ex Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter AGM Date");
		BasePage.enterText("AGM_Date", "AGM_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Lodgement Date");
		BasePage.enterText("Lodgement_Date", "Lodgement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Record Date");
		BasePage.enterText("Record_Date", "Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Security");
		BasePage.enterText("Security", "Security", excelName, Scenario);
		BasePage.click_hexgendash("Security_4405");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Ratio Org");
		BasePage.enterText("Ratio_Org", "Ratio Org", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Ratio New");
		BasePage.enterText("Ratio_New", "Ratio New", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Exp Setl Date");
		BasePage.enterText("Exp_Setl_Date", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		System.out.println("89");

		Thread.sleep(8000);
		System.out.println("88");
		System.out.println("Started Verfication for Corporate Action BONUS 2:1");

		test.log(Status.INFO, "Verifying Benefit Ccy");
		BasePage.AssertExcel2("Benefit_Ccy", "Benefit Ccy", excelName, Scenario, "Benefit Ccy");

		test.log(Status.INFO, "Verifying Exec Price Basis");
		BasePage.AssertExcel2("Exec_Price_Basis_BONUS", "Exec_Price_Basis", excelName, Scenario, "Exec Price Basis");

		test.log(Status.INFO, "Verifying Exec Price");
		BasePage.AssertExcel_ByreadingTextbox("exec_PriceBI", "Exec_Price", excelName, Scenario, "Exec Price");

		test.log(Status.INFO, "Verifying Exec Price Tax");
		BasePage.AssertExcel_ByreadingTextbox("E_P_T", "Exec_PriceTax", excelName, Scenario, "Exec Price Tax");

		test.log(Status.INFO, "Verifying Round Method");
		BasePage.AssertExcel2("Round_Method", "Round Method", excelName, Scenario, "Round Method");

		test.log(Status.INFO, "Verifying Round Decimals");
		BasePage.AssertExcel_ByreadingTextbox("Round_Decimals", "Round Decimals", excelName, Scenario,
				"Round Decimals");
		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel_ByreadingTextbox("Basicinfo_Face_VAlue", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying Cost Transfer %");
		BasePage.AssertExcel_ByreadingTextbox("Cost_Transfer%", "Cost Transfer %", excelName, Scenario,
				"Cost Transfer %");

		test.log(Status.INFO, "Verifying Withhold Tax %");
		BasePage.AssertExcel_ByreadingTextbox("WithHold_Tax", "Withhold Tax %", excelName, Scenario, "Withhold Tax %");

		test.log(Status.INFO, "Verifying Dividend Type");
		BasePage.AssertExcel2("Divended_Type", "Dividend Type", excelName, Scenario, "Dividend Type");

		test.log(Status.INFO, "Verifying Security Name");
		BasePage.AssertExcel2("CAFORM_Security_Name", "Security Name", excelName, Scenario, "Security Name");

		test.log(Status.INFO, "Verifying Security Ccy");
		BasePage.AssertExcel2("CAFORM_Security_Ccy", "Security Ccy", excelName, Scenario, "Security Ccy");

		test.log(Status.INFO, "Verifying Issuer");
		BasePage.AssertExcel2("CAFORM_issuer", "Issuer", excelName, Scenario, "Issuer");

		test.log(Status.INFO, "Verifying Asset Class");
		BasePage.AssertExcel2("CAFORM_Asset_Class", "Asset Class", excelName, Scenario, "Asset Class");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel2("CAFORM_face_value", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying ISIN");
		BasePage.AssertExcel2("CAFORM_ISIN", "ISIN", excelName, Scenario, "ISIN");

	}

	public static void CorporateAction_Bonus_2_1_Submit(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Click on Submit");
		BasePage.click_hexgendash("SubmitButton");

		System.out.println("151");

		System.out.println("Verifying BONUS_Submit Validations");
		Thread.sleep(2000);

		test.log(Status.INFO, "Verifying Corporate Action Form Submission message");
		BasePage.AssertExcel2("DIV_MSG", "CAForm_Submit", excelName, Scenario, "Successful Message");

		Thread.sleep(2000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);
	}

	public static void CorporateAction_Bonus_2_1_Confirmation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Select Company");
		// BasePage.click1("company");
		BasePage.enterText("company", "Company", excelName, Scenario);

		Thread.sleep(2000);
		BasePage.click_hexgendash("comapny_dropdown");

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(15000);

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("CA_approve");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Remarks");
		BasePage.enterText("approve_remarks", "CA_Approve_remarks", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("approve_tick");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void CorporateActionForm_Split_1_2(String excelName, String Scenario) throws Exception {

		// LoginPage.do_login(ExcelFileName,"DIVIDEND");

		Thread.sleep(9000);
		test.log(Status.INFO, "Creating Corporate Action For SPLIT 1:2");
		test.log(Status.INFO, "Click on Masters");
		BasePage.click_hexgendash("Masters");
		Thread.sleep(1000);

		test.log(Status.INFO, "Valuation");
		BasePage.click_hexgendash("Valuation");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Corporate Action");
		BasePage.click_hexgendash("CorporateAction");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.enterText("BenefitType", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("Benefittype_SPLIT");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter Ex Record_Date");
		BasePage.enterText("Exec_Record_Date", "Ex Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter AGM Date");
		BasePage.enterText("AGM_Date", "AGM_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Lodgement Date");
		BasePage.enterText("Lodgement_Date", "Lodgement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Record Date");
		BasePage.enterText("Record_Date", "Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Security");
		BasePage.enterText("Security", "Security", excelName, Scenario);
		BasePage.click_hexgendash("Security_4405");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Ratio Org");
		BasePage.enterText("Ratio_Org", "Ratio Org", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Ratio New");
		BasePage.enterText("Ratio_New", "Ratio New", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Exp Setl Date");
		BasePage.enterText("Exp_Setl_Date", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		System.out.println("89");

		Thread.sleep(8000);
		System.out.println("88");
		System.out.println("Started Verfication for Corporate Action SPLIT 1:2");

		test.log(Status.INFO, "Verifying Benefit Ccy");
		BasePage.AssertExcel2("Benefit_Ccy", "Benefit Ccy", excelName, Scenario, "Benefit Ccy");

		test.log(Status.INFO, "Verifying Exec Price Basis");
		BasePage.AssertExcel2("Exec_Price_Basis_BONUS", "Exec_Price_Basis", excelName, Scenario, "Exec Price Basis");

		test.log(Status.INFO, "Verifying Exec Price");
		BasePage.AssertExcel_ByreadingTextbox("exec_PriceBI", "Exec_Price", excelName, Scenario, "Exec Price");

		test.log(Status.INFO, "Verifying Exec Price Tax");
		BasePage.AssertExcel_ByreadingTextbox("E_P_T", "Exec_PriceTax", excelName, Scenario, "Exec Price Tax");

		test.log(Status.INFO, "Verifying Round Method");
		BasePage.AssertExcel2("Round_Method", "Round Method", excelName, Scenario, "Round Method");

		test.log(Status.INFO, "Verifying Round Decimals");
		BasePage.AssertExcel_ByreadingTextbox("Round_Decimals", "Round Decimals", excelName, Scenario,
				"Round Decimals");
		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel_ByreadingTextbox("Basicinfo_Face_VAlue", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying Cost Transfer %");
		BasePage.AssertExcel_ByreadingTextbox("Cost_Transfer%", "Cost Transfer %", excelName, Scenario,
				"Cost Transfer %");

		test.log(Status.INFO, "Verifying Withhold Tax %");
		BasePage.AssertExcel_ByreadingTextbox("WithHold_Tax", "Withhold Tax %", excelName, Scenario, "Withhold Tax %");

		test.log(Status.INFO, "Verifying Dividend Type");
		BasePage.AssertExcel2("Divended_Type", "Dividend Type", excelName, Scenario, "Dividend Type");

		test.log(Status.INFO, "Verifying Security Name");
		BasePage.AssertExcel2("CAFORM_Security_Name", "Security Name", excelName, Scenario, "Security Name");

		test.log(Status.INFO, "Verifying Security Ccy");
		BasePage.AssertExcel2("CAFORM_Security_Ccy", "Security Ccy", excelName, Scenario, "Security Ccy");

		test.log(Status.INFO, "Verifying Issuer");
		BasePage.AssertExcel2("CAFORM_issuer", "Issuer", excelName, Scenario, "Issuer");

		test.log(Status.INFO, "Verifying Asset Class");
		BasePage.AssertExcel2("CAFORM_Asset_Class", "Asset Class", excelName, Scenario, "Asset Class");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel2("CAFORM_face_value", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying ISIN");
		BasePage.AssertExcel2("CAFORM_ISIN", "ISIN", excelName, Scenario, "ISIN");

	}

	public static void CorporateAction_Split_1_2_Submit(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Click on Submit");
		BasePage.click_hexgendash("SubmitButton");

		System.out.println("151");

		System.out.println("Verifying SPLIT_Submit Validations");
		Thread.sleep(2000);

		test.log(Status.INFO, "Verifying Corporate Action Form Submission message");
		BasePage.AssertExcel2("DIV_MSG", "CAForm_Submit", excelName, Scenario, "Successful Message");

		Thread.sleep(2000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);
	}

	public static void CorporateAction_Split_1_2_Confirmation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Select Company");
		// BasePage.click1("company");
		BasePage.enterText("company", "Company", excelName, Scenario);

		Thread.sleep(2000);
		BasePage.click_hexgendash("comapny_dropdown");

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(15000);

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("CA_approve");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Remarks");
		BasePage.enterText("approve_remarks", "CA_Approve_remarks", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("approve_tick");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void CorporateActionForm_Split_2_1(String excelName, String Scenario) throws Exception {

		// LoginPage.do_login(ExcelFileName,"DIVIDEND");

		Thread.sleep(9000);
		test.log(Status.INFO, "Creating Corporate Action For SPLIT 1:2");
		test.log(Status.INFO, "Click on Masters");
		BasePage.click_hexgendash("Masters");
		Thread.sleep(1000);

		test.log(Status.INFO, "Valuation");
		BasePage.click_hexgendash("Valuation");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Corporate Action");
		BasePage.click_hexgendash("CorporateAction");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.enterText("BenefitType", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("Benefittype_RSPLIT");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter Ex Record_Date");
		BasePage.enterText("Exec_Record_Date", "Ex Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter AGM Date");
		BasePage.enterText("AGM_Date", "AGM_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Lodgement Date");
		BasePage.enterText("Lodgement_Date", "Lodgement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Record Date");
		BasePage.enterText("Record_Date", "Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Security");
		BasePage.enterText("Security", "Security", excelName, Scenario);
		BasePage.click_hexgendash("Security_4405");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Ratio Org");
		BasePage.enterText("Ratio_Org", "Ratio Org", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Ratio New");
		BasePage.enterText("Ratio_New", "Ratio New", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Exp Setl Date");
		BasePage.enterText("Exp_Setl_Date", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		System.out.println("89");

		Thread.sleep(8000);
		System.out.println("88");
		System.out.println("Started Verfication for Corporate Action SPLIT 1:2");

		test.log(Status.INFO, "Verifying Benefit Ccy");
		BasePage.AssertExcel2("Benefit_Ccy", "Benefit Ccy", excelName, Scenario, "Benefit Ccy");

		test.log(Status.INFO, "Verifying Exec Price Basis");
		BasePage.AssertExcel2("Exec_Price_Basis_BONUS", "Exec_Price_Basis", excelName, Scenario, "Exec Price Basis");

		test.log(Status.INFO, "Verifying Exec Price");
		BasePage.AssertExcel_ByreadingTextbox("exec_PriceBI", "Exec_Price", excelName, Scenario, "Exec Price");

		test.log(Status.INFO, "Verifying Exec Price Tax");
		BasePage.AssertExcel_ByreadingTextbox("E_P_T", "Exec_PriceTax", excelName, Scenario, "Exec Price Tax");

		test.log(Status.INFO, "Verifying Round Method");
		BasePage.AssertExcel2("Round_Method", "Round Method", excelName, Scenario, "Round Method");

		test.log(Status.INFO, "Verifying Round Decimals");
		BasePage.AssertExcel_ByreadingTextbox("Round_Decimals", "Round Decimals", excelName, Scenario,
				"Round Decimals");
		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel_ByreadingTextbox("Basicinfo_Face_VAlue", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying Cost Transfer %");
		BasePage.AssertExcel_ByreadingTextbox("Cost_Transfer%", "Cost Transfer %", excelName, Scenario,
				"Cost Transfer %");

		test.log(Status.INFO, "Verifying Withhold Tax %");
		BasePage.AssertExcel_ByreadingTextbox("WithHold_Tax", "Withhold Tax %", excelName, Scenario, "Withhold Tax %");

		test.log(Status.INFO, "Verifying Dividend Type");
		BasePage.AssertExcel2("Divended_Type", "Dividend Type", excelName, Scenario, "Dividend Type");

		test.log(Status.INFO, "Verifying Security Name");
		BasePage.AssertExcel2("CAFORM_Security_Name", "Security Name", excelName, Scenario, "Security Name");

		test.log(Status.INFO, "Verifying Security Ccy");
		BasePage.AssertExcel2("CAFORM_Security_Ccy", "Security Ccy", excelName, Scenario, "Security Ccy");

		test.log(Status.INFO, "Verifying Issuer");
		BasePage.AssertExcel2("CAFORM_issuer", "Issuer", excelName, Scenario, "Issuer");

		test.log(Status.INFO, "Verifying Asset Class");
		BasePage.AssertExcel2("CAFORM_Asset_Class", "Asset Class", excelName, Scenario, "Asset Class");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel2("CAFORM_face_value", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying ISIN");
		BasePage.AssertExcel2("CAFORM_ISIN", "ISIN", excelName, Scenario, "ISIN");

	}

	public static void CorporateAction_Split_2_1_Submit(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Click on Submit");
		BasePage.click_hexgendash("SubmitButton");

		System.out.println("151");

		System.out.println("Verifying SPLIT_Submit Validations");
		Thread.sleep(2000);

		test.log(Status.INFO, "Verifying Corporate Action Form Submission message");
		BasePage.AssertExcel2("DIV_MSG", "CAForm_Submit", excelName, Scenario, "Successful Message");

		Thread.sleep(2000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);
	}

	public static void CorporateAction_Split_2_1_Confirmation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);
		test.log(Status.INFO, "Select Company");
		// BasePage.click1("company");
		BasePage.enterText("company", "Company", excelName, Scenario);

		Thread.sleep(2000);
		BasePage.click_hexgendash("comapny_dropdown");

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(15000);

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("CA_approve");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Remarks");
		BasePage.enterText("approve_remarks", "CA_Approve_remarks", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("approve_tick");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void MERGER_Manual_NAVClosing_IF(String excelName, String Scenario) throws Exception {

		System.out.println("Entered Successfully!");
		Thread.sleep(5000);
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Manualport_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Dateupto");
		BasePage.enterText("ManualNAV_DateUpto", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manual_override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manualremarks_tick");
		Thread.sleep(1260000);// 21 mints for 7 days...

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(10000);

		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");

		Thread.sleep(3000);

	}

	public static void DEMERGER_Manual_NAVClosing_IF(String excelName, String Scenario) throws Exception {

		System.out.println("Entered Successfully!");
		Thread.sleep(5000);
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Manualport_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Dateupto");
		BasePage.enterText("ManualNAV_DateUpto", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manual_override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manualremarks_tick");
		Thread.sleep(1260000);// 21 mints for 7 days...

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(10000);

		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");

		Thread.sleep(3000);

	}

	public static void CONVERSION_Manual_NAVClosing_IF(String excelName, String Scenario) throws Exception {

		System.out.println("Entered Successfully!");
		Thread.sleep(5000);
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Manualport_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Dateupto");
		BasePage.enterText("ManualNAV_DateUpto", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manual_override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manualremarks_tick");
		Thread.sleep(1260000);// 21 mints for 7 days...

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(10000);

		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");

		Thread.sleep(3000);

	}

	public static void SPINOF_Manual_NAVClosing_IF(String excelName, String Scenario) throws Exception {

		System.out.println("Entered Successfully!");
		Thread.sleep(5000);
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Manualport_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Dateupto");
		BasePage.enterText("ManualNAV_DateUpto", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manual_override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manualremarks_tick");
		Thread.sleep(1260000);// 21 mints for 7 days...

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(10000);

		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");

		Thread.sleep(3000);

	}

	public static void DIV_Manual_NAVClosing_IF(String excelName, String Scenario) throws Exception {

		LoginPage.do_login(ExcelFileName, "DIVIDEND");
		Thread.sleep(11000);
		System.out.println("Entered Successfully!");
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "PortfolioName", excelName, Scenario);
		BasePage.click_hexgendash("Manualport_C16");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Dateupto");
		BasePage.enterText("ManualNAV_DateUpto", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manual_override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manualremarks_tick");
		BasePage.click1("Panel_Arrow");
		Thread.sleep(32000);// 19 mints for 6 days...

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(2000);

		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");
		Thread.sleep(3000);
	}

	public static void DIV_Settlement_Transaction(String excelName, String Scenario) throws Exception {

		Thread.sleep(3000);
		test.log(Status.INFO, "Creating Settlement Transacation For DIV");
		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Settlement");
		BasePage.click_hexgendash("Settlement_module");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Trade/benefitSettlement");
		BasePage.click_hexgendash("Trade_benefitSettlement");
		Thread.sleep(1000);
		// test.log(Status.INFO, "Enter Due Date");
		// BasePage.enterText("Settlement_DueDate", "Exp_Settlement_Date", excelName,
		// Scenario);
		// Thread.sleep(1000);
		test.log(Status.INFO, "Enter and Select Portfolio");
		BasePage.click_hexgendash("Settlementportfolio");
		BasePage.enterText("settlementportinput", "PortfolioName", excelName, Scenario);
		BasePage.click_hexgendash("Settlement_C16");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.click_hexgendash("SettlementBenefitType");
		BasePage.enterText("SettlementBTInput", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("SettlementBTDIV");
		Thread.sleep(2000);

		BasePage.scrollintoview("SettlementRetriveicon");
		System.out.println("1120");
		BasePage.click_hexgendash("SettlementRetriveicon");
		System.out.println("1122");
		BasePage.click_hexgendash("Settlement_checkbox");
		// BasePage.click_hexgendash("Settlement_PortfolioText");

		// test.log(Status.INFO, "Enter and Select Bank Account Ccy");
		// BasePage.enterText("Settlement_Bank_ccy","BankAccount_Ccy",excelName,Scenario);
		// BasePage.scrollintoview("settlement_MYR");
		// BasePage.click_hexgendash("settlement_MYR");
		// Thread.sleep(2000);

		BasePage.click_hexgendash("SettlementSubmit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Settlement Transaction Message");
		BasePage.AssertExcel1("trans_message", "SettleTrans_SubmitText", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void MERGER_Settlement_Transaction(String excelName, String Scenario) throws Exception {

		Thread.sleep(8000);
		test.log(Status.INFO, "Creating Settlement Transacation For MERGER");
		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Settlement");
		BasePage.click_hexgendash("Settlement_module");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Trade/benefitSettlement");
		BasePage.click_hexgendash("Trade_benefitSettlement");
		Thread.sleep(1000);
		test.log(Status.INFO, "Enter Due Date");
		BasePage.enterText("Settlement_DueDate", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);
		test.log(Status.INFO, "Enter and Select Portfolio");
		BasePage.click_hexgendash("Settlementportfolio");
		BasePage.enterText("settlementportinput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Settlement_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.click_hexgendash("SettlementBenefitType");
		BasePage.enterText("SettlementBTInput", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("SettlementBT_MERGER");
		Thread.sleep(2000);

		BasePage.scrollintoview("SettlementRetriveicon");
		System.out.println("1120");
		BasePage.click_hexgendash("SettlementRetriveicon");
		System.out.println("1122");

		BasePage.click_hexgendash("Settlement_checkbox");
		BasePage.click_hexgendash("Settlement_PortfolioText");
		test.log(Status.INFO, "Enter and Select Bank Account Ccy");
		BasePage.enterText("Settlement_Bank_ccy", "BankAccount_Ccy", excelName, Scenario);
		BasePage.scrollintoview("settlement_MYR");
		BasePage.click_hexgendash("settlement_MYR");
		Thread.sleep(2000);

		BasePage.click_hexgendash("Settlementcheckbox2");
		BasePage.click_hexgendash("Settle_portfoliotext2");
		test.log(Status.INFO, "Enter and Select Bank Account Ccy");
		BasePage.enterText("SettleBankccy2", "BankAccount_Ccy", excelName, Scenario);
		BasePage.scrollintoview("Settle_MYR2");
		BasePage.click_hexgendash("Settle_MYR2");
		Thread.sleep(2000);

		BasePage.click_hexgendash("SettlementSubmit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Settlement Transaction Message");
		BasePage.AssertExcel1("trans_message", "SettleTrans_SubmitText", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void DEMERGER_Settlement_Transaction(String excelName, String Scenario) throws Exception {

		Thread.sleep(8000);
		test.log(Status.INFO, "Creating Settlement Transacation For MERGER");
		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Settlement");
		BasePage.click_hexgendash("Settlement_module");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Trade/benefitSettlement");
		BasePage.click_hexgendash("Trade_benefitSettlement");
		Thread.sleep(1000);
		test.log(Status.INFO, "Enter Due Date");
		BasePage.enterText("Settlement_DueDate", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);
		test.log(Status.INFO, "Enter and Select Portfolio");
		BasePage.click_hexgendash("Settlementportfolio");
		BasePage.enterText("settlementportinput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Settlement_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.click_hexgendash("SettlementBenefitType");
		BasePage.enterText("SettlementBTInput", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("Settle_Demerger");
		Thread.sleep(2000);

		BasePage.scrollintoview("SettlementRetriveicon");
		System.out.println("1120");
		BasePage.click_hexgendash("SettlementRetriveicon");
		System.out.println("1122");

		BasePage.click_hexgendash("Settlement_checkbox");
		BasePage.click_hexgendash("Settlement_PortfolioText");
		BasePage.scrollintoview("Settlement_Bank_ccy");
		test.log(Status.INFO, "Enter and Select Bank Account Ccy");
		BasePage.enterText("Settlement_Bank_ccy", "BankAccount_Ccy", excelName, Scenario);
		BasePage.scrollintoview("settlement_MYR");
		BasePage.click_hexgendash("settlement_MYR");
		Thread.sleep(2000);

		BasePage.click_hexgendash("SettlementSubmit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Settlement Transaction Message");
		BasePage.AssertExcel1("trans_message", "SettleTrans_SubmitText", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void CONVERSION_Settlement_Transaction(String excelName, String Scenario) throws Exception {

		Thread.sleep(8000);
		test.log(Status.INFO, "Creating Settlement Transacation For MERGER");
		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Settlement");
		BasePage.click_hexgendash("Settlement_module");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Trade/benefitSettlement");
		BasePage.click_hexgendash("Trade_benefitSettlement");
		Thread.sleep(1000);
		test.log(Status.INFO, "Enter Due Date");
		BasePage.enterText("Settlement_DueDate", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);
		test.log(Status.INFO, "Enter and Select Portfolio");
		BasePage.click_hexgendash("Settlementportfolio");
		BasePage.enterText("settlementportinput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Settlement_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.click_hexgendash("SettlementBenefitType");
		BasePage.enterText("SettlementBTInput", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("Settlement_CONV");
		Thread.sleep(2000);

		BasePage.scrollintoview("SettlementRetriveicon");
		System.out.println("1120");
		BasePage.click_hexgendash("SettlementRetriveicon");
		System.out.println("1122");
		BasePage.click_hexgendash("Settlement_checkbox");
		BasePage.click_hexgendash("Settlement_PortfolioText");

		test.log(Status.INFO, "Enter and Select Bank Account Ccy");
		BasePage.enterText("Settlement_Bank_ccy", "BankAccount_Ccy", excelName, Scenario);
		BasePage.scrollintoview("settlement_MYR");
		BasePage.click_hexgendash("settlement_MYR");
		Thread.sleep(2000);

		// BasePage.click_hexgendash("SettlementSubmit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Settlement Transaction Message");
		// BasePage.AssertExcel1("trans_message", "SettleTrans_SubmitText", excelName,
		// Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void SPINOF_Settlement_Transaction(String excelName, String Scenario) throws Exception {

		Thread.sleep(8000);
		test.log(Status.INFO, "Creating Settlement Transacation For MERGER");
		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Settlement");
		BasePage.click_hexgendash("Settlement_module");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Trade/benefitSettlement");
		BasePage.click_hexgendash("Trade_benefitSettlement");
		Thread.sleep(1000);
		test.log(Status.INFO, "Enter Due Date");
		BasePage.enterText("Settlement_DueDate", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);
		test.log(Status.INFO, "Enter and Select Portfolio");
		BasePage.click_hexgendash("Settlementportfolio");
		BasePage.enterText("settlementportinput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Settlement_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.click_hexgendash("SettlementBenefitType");
		BasePage.enterText("SettlementBTInput", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("SettlementBT_MERGER");
		Thread.sleep(2000);

		BasePage.scrollintoview("SettlementRetriveicon");
		System.out.println("1120");
		BasePage.click_hexgendash("SettlementRetriveicon");
		System.out.println("1122");
		BasePage.click_hexgendash("Settlement_checkbox");
		BasePage.click_hexgendash("Settlement_PortfolioText");

		test.log(Status.INFO, "Enter and Select Bank Account Ccy");
		BasePage.enterText("Settlement_Bank_ccy", "BankAccount_Ccy", excelName, Scenario);
		BasePage.scrollintoview("settlement_MYR");
		BasePage.click_hexgendash("settlement_MYR");
		Thread.sleep(2000);

		BasePage.click_hexgendash("SettlementSubmit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Settlement Transaction Message");
		BasePage.AssertExcel1("trans_message", "SettleTrans_SubmitText", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void B1_2_Manual_NAVClosing_IF(String excelName, String Scenario) throws Exception {
		LoginPage.do_login(ExcelFileName, "DIVIDEND");
		Thread.sleep(11000);
		System.out.println("Entered Successfully!");
		Thread.sleep(5000);
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("manualnavclosing_M15");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Dateupto");
		BasePage.enterText("ManualNAV_DateUpto", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manual_override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manualremarks_tick");
		Thread.sleep(32000);

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(10000);
		BasePage.click1("Panel_Arrow");
		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");

		Thread.sleep(3000);

	}

	public static void DIV_Settlement_Conformation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid Checker Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid Checker Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Select Company");
		// BasePage.click1("company");
		BasePage.enterText("company", "Company", excelName, Scenario);

		Thread.sleep(2000);
		BasePage.click_hexgendash("comapny_dropdown");
		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(15000);
		BasePage.click_hexgendash("Alert_Refresh");

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("Settlementconfapprove");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("Settleconfappremarkstickbutton");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void MERGER_Settlement_Conformation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(10000);

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("Settlementconfapprove");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("Settleconfappremarkstickbutton");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void DEMERGER_Settlement_Conformation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(10000);

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("Settlementconfapprove");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("Settleconfappremarkstickbutton");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void SPINOF_Settlement_Conformation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(10000);

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("Settlementconfapprove");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("Settleconfappremarkstickbutton");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void CONVERSION_Settlement_Conformation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(10000);

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("Settlementconfapprove");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("Settleconfappremarkstickbutton");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void DIV_Manual_NAVClosing_IntraDay(String excelName, String Scenario) throws Exception {

		// LoginPage.do_login(ExcelFileName,"DIVIDEND");
		// Thread.sleep(11000);

		System.out.println("Entered Successfully!");
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Manualport_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manual_override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manualremarks_tick");
		Thread.sleep(40000);

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(8000);
		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");

		Thread.sleep(3000);

	}

	public static void MERGER_Manual_NAVClosing_IntraDay(String excelName, String Scenario) throws Exception {

		// LoginPage.do_login(ExcelFileName,"DIVIDEND");
		// Thread.sleep(11000);

		System.out.println("Entered Successfully!");
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Manualport_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manual_override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manualremarks_tick");
		Thread.sleep(40000);

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(8000);
		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");

		Thread.sleep(3000);

	}

	public static void DEMERGER_Manual_NAVClosing_IntraDay(String excelName, String Scenario) throws Exception {
		// LoginPage.do_login(ExcelFileName,"DIVIDEND");
		// Thread.sleep(11000);

		System.out.println("Entered Successfully!");
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Manualport_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manual_override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manualremarks_tick");
		Thread.sleep(40000);

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(8000);
		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");

		Thread.sleep(3000);

	}

	public static void CONVERSION_Manual_NAVClosing_IntraDay(String excelName, String Scenario) throws Exception {

		// LoginPage.do_login(ExcelFileName,"DIVIDEND");
		// Thread.sleep(11000);

		System.out.println("Entered Successfully!");
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Manualport_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manual_override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manualremarks_tick");
		Thread.sleep(40000);

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(8000);
		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");

		Thread.sleep(3000);

	}

	public static void SPINOF_Manual_NAVClosing_IntraDay(String excelName, String Scenario) throws Exception {

		// LoginPage.do_login(ExcelFileName,"DIVIDEND");
		// Thread.sleep(11000);

		System.out.println("Entered Successfully!");
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Manualport_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manual_override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manualremarks_tick");
		Thread.sleep(40000);

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(8000);
		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");

		Thread.sleep(3000);

	}

	public static void Verifying_AccountingEnquiry_Report(String excelName, String Scenario) throws Exception {

		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Reports");
		BasePage.click_hexgendash("Reportmenu");

		test.log(Status.INFO, "Click on Enquiries");
		BasePage.click_hexgendash("Enquiries");

		test.log(Status.INFO, "Click on Accounting");
		BasePage.click_hexgendash("reportAccounting");

		test.log(Status.INFO, "Click on Accounting Enquiry");
		BasePage.click_hexgendash3("reporAE");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter Begin Date");
		BasePage.enterText("reportBegindate", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter End Date");
		BasePage.enterText("reportenddate", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Portfolio");
		BasePage.enterText("ReportPortInput", "PortfolioName", excelName, Scenario);
		Thread.sleep(3000);
		BasePage.click_hexgendash("Report_C16");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on View Report");
		BasePage.click_hexgendash("ViewReports");

		Thread.sleep(2000);
		System.out.println("Started Verfication for DIV Account Enquiry");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Portfolio");
		BasePage.AssertExcel2("Reportsverfport", "Portfolio", excelName, Scenario, "PortfolioName");

		test.log(Status.INFO, "Verifying Trans Date");
		BasePage.AssertExcel2("Report_TransDate", "Trans Date", excelName, Scenario, "Trans Date");

		test.log(Status.INFO, "Verifying Amount Tcy");
		BasePage.AssertExcel2("Report_AmountTcy", "Amount Tcy", excelName, Scenario, "Amount Tcy");

		test.log(Status.INFO, "Verifying Credit/Debit");
		BasePage.AssertExcel2("Report_Credit", "Credit", excelName, Scenario, "Credit");

		test.log(Status.INFO, "Verifying Security");
		BasePage.AssertExcel2("ReportVerfSecur", "Security", excelName, Scenario, "Security");

		test.log(Status.INFO, "Verifying Trans Code");
		BasePage.AssertExcel2("Report_TransCode", "Trans Code", excelName, Scenario, "Trans Code");

		System.out.println("Successfully Completed Verfication for DIV Account Enquiry");

	}

	public static void Verifying_BankTransactions_Report(String excelName, String Scenario) throws Exception {

		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Operations");
		BasePage.click_hexgendash("VerfOperations");
		System.out.println("Clicked on Operations menu");

		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Financials");
		BasePage.click_hexgendash("BTFinancials");

		test.log(Status.INFO, "Click on Bank Transactions");
		BasePage.click_hexgendash("ReportBT");
		Thread.sleep(5000);

		test.log(Status.INFO, "Enter and Select Portfolio");
		BasePage.enterText("BT_PortfolioInput", "PortfolioName", excelName, Scenario);
		BasePage.click_hexgendash("BT_C16");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Begin Date");
		BasePage.enterText("BT_Begindate", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Begin Date");
		BasePage.enterText("BT_enddate", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Output Type");
		BasePage.click_hexgendash("OUTPUT_CLICK");
		BasePage.enterText("BT_OUTPUT", "OutputType", excelName, Scenario);
		Thread.sleep(2000);
		BasePage.click_hexgendash("BT_HTML");

		BasePage.click_hexgendash("BTViewReport");
		Thread.sleep(10000);
		System.out.println("1393");

		BasePage.switchTab();

		System.out.println("1396");

		Thread.sleep(2000);

		System.out.println("Started  Verfication for DIV Bank Transactions");
		System.out.println("1401");

		BasePage.switchTab();
		System.out.println("1404");

		Thread.sleep(5000);

		test.log(Status.INFO, "Verifying Portfolio");
		BasePage.AssertExcel2("BTVerfPortfolio", "BTPortfolio", excelName, Scenario, "Portfolio");

		test.log(Status.INFO, "Verifying Transaction Type");
		BasePage.AssertExcel2("BTVerfTransactionType", "Trans Code", excelName, Scenario, "Transaction Type");

		test.log(Status.INFO, "Verifying Amount Cr/Dr in Fund Currency");
		BasePage.AssertExcel2("BTverfAmountCR", "Amount Tcy", excelName, Scenario, "Amount Cr/Dr in Fund Currency");

		System.out.println("Successfuly completed Verfication for DIV Bank Transactions");

		BasePage.CloseTab();
		BasePage.click1("Panel_Arrow");
		Thread.sleep(10000);
	}

	public static void Bonus_1_2_Settlement_Transaction(String excelName, String Scenario) throws Exception {

		Thread.sleep(4000);
		test.log(Status.INFO, "Creating Settlement Transacation For Bonus 1:2");
		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");
		Thread.sleep(1000);

		test.log(Status.INFO, "Settlement");
		BasePage.click_hexgendash("Settlement_module");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Trade/benefitSettlement");
		BasePage.click_hexgendash("Trade_benefitSettlement");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Portfolio");
		BasePage.click_hexgendash("Settlementportfolio");
		BasePage.enterText("settlementportinput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Settlement_M15");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.click_hexgendash("SettlementBenefitType");
		BasePage.enterText("SettlementBTInput", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("SettlementBTBonus");
		Thread.sleep(2000);
		BasePage.scrollintoview("SettlementRetriveicon");
		System.out.println("1120");
		BasePage.click_hexgendash("SettlementRetriveicon");
		System.out.println("1122");

		BasePage.scrollintoview("Settlement_checkbox");

		BasePage.click_hexgendash("Settlement_checkbox");

		BasePage.click_hexgendash("SettlementSubmit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Settlement Transaction Message");
		BasePage.AssertExcel1("trans_message", "SettleTrans_SubmitText", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void Bonus_1_2_Settlement_Conformation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Select Company");
		// BasePage.click1("company");
		BasePage.enterText("company", "Company", excelName, Scenario);

		Thread.sleep(2000);
		BasePage.click_hexgendash("comapny_dropdown");
		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(15000);
		BasePage.click_hexgendash("Alert_Refresh");

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("Settlementconfapprove");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("Settleconfappremarkstickbutton");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);
	}

	public static void Bonus_1_2_Manual_NAVClosing_IntraDay(String excelName, String Scenario) throws Exception {
		// LoginPage.do_login(ExcelFileName,"DIVIDEND");
		// Thread.sleep(9000);

		System.out.println("Entered Successfully!");
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Manualport_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);
		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(40000);

		if (checkelementpresent("manual_override") == true) {

			BasePage.click_hexgendash("manual_override");
			Thread.sleep(1000);
			BasePage.click_hexgendash("manualremarks_tick");
			Thread.sleep(40000);
		} else {
			System.out.println("PopUp not Present");

		}

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(10000);
		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");

		Thread.sleep(3000);

	}

	public static void Bonus_1_2_HoldingStatements(String excelName, String Scenario) throws Exception {

		Thread.sleep(11000);
		test.log(Status.INFO, "Click on Reports");
		BasePage.click_hexgendash("Reportmenu");
		Thread.sleep(2000);
		test.log(Status.INFO, "Click on Operations");
		BasePage.click_hexgendash("VerfOperations");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Investments");
		BasePage.click_hexgendash("Investments");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Holding Statements");
		BasePage.click_hexgendash("Holding_Statement");
		Thread.sleep(4000);

		test.log(Status.INFO, "Enter Portfolio");
		BasePage.enterText("HS_PORTFOLIO_INPUT", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("HS_Portfolio_M15");
		Thread.sleep(1000);

		// test.log(Status.INFO, "Enter Begin Date");
		// BasePage.enterText("ASOnDate", "ASONDATE", excelName, Scenario);
		// Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Output Type");
		BasePage.click_hexgendash("HSOutputtypetextbox");
		BasePage.enterText("HS_OUTPUTTYPE_Input", "OutputType", excelName, Scenario);
		BasePage.click_hexgendash("HS_HTML");
		System.out.println("1870");
		BasePage.click_hexgendash("HS_VIEW_REPORT");
		test.log(Status.INFO, "Verifying Holding Statement Approval Message");
		BasePage.AssertExcel1("sub_assert", "HoldingStatement-MSG", excelName, Scenario);
		Thread.sleep(80000);
		BasePage.switchTab();

		Thread.sleep(2000);

		System.out.println("Started  Verfication for Bonus 1:2 Holding Statement");

		Thread.sleep(5000);

		test.log(Status.INFO, "Verifying Portfolio");
		BasePage.AssertExcel2("HS_verfPortfolio", "BTPortfolio", excelName, Scenario, "Portfolio");

		test.log(Status.INFO, "Verifying Holding Statement Date");
		BasePage.AssertExcel2("HS_verificationDate", "HoldingStatementDate", excelName, Scenario,
				"HoldingStatementDate");

		test.log(Status.INFO, "Verifying Holding Statement Security");
		BasePage.AssertExcel2("HS_verfSecurity", "Security", excelName, Scenario, "Security");

		test.log(Status.INFO, "Verifying Holding Statement Security Qunatity");
		BasePage.AssertExcel2("HS_verfQuantity", "HoldingStatement Quantity", excelName, Scenario,
				"Holding Statement Security Qunatity");

		System.out.println("Successfuly completed Verfication for Bonus 1:2 Holding Statement");
		BasePage.CloseTab();
		BasePage.click1("Panel_Arrow");
		Thread.sleep(10000);
	}

	public static void MERGER_HoldingStatements(String excelName, String Scenario) throws Exception {

		Thread.sleep(11000);

		test.log(Status.INFO, "Click on Reports");
		BasePage.click_hexgendash("Reportmenu");
		Thread.sleep(2000);
		test.log(Status.INFO, "Click on Operations");
		BasePage.click_hexgendash("VerfOperations");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Investments");
		BasePage.click_hexgendash("BTFinancials");
		Thread.sleep(1000);
		test.log(Status.INFO, "Click on Holding Statements");

		BasePage.click_hexgendash("Holding_Statement");
		Thread.sleep(4000);

		test.log(Status.INFO, "Enter Begin Date");
		BasePage.enterText("ASOnDate", "ASONDATE", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Output Type");
		BasePage.click_hexgendash("HSOutputtypetextbox");
		BasePage.enterText("HS_OUTPUTTYPE_Input", "OutputType", excelName, Scenario);
		BasePage.click_hexgendash("HS_HTML");
		System.out.println("1870");
		BasePage.click_hexgendash("HS_VIEW_REPORT");
		test.log(Status.INFO, "Verifying Holding Statement Approval Message");
		BasePage.AssertExcel1("sub_assert", "HoldingStatement-MSG", excelName, Scenario);
		Thread.sleep(48000);
		BasePage.switchTab();

		Thread.sleep(2000);

		System.out.println("Started  Verfication for MERGER Holding Statement");

		Thread.sleep(5000);

		test.log(Status.INFO, "Verifying Portfolio");
		BasePage.AssertExcel2("HS_verfPortfolio", "BTPortfolio", excelName, Scenario, "Portfolio");

		test.log(Status.INFO, "Verifying Holding Statement Date");
		BasePage.AssertExcel2("HS_verificationDate", "HoldingStatementDate", excelName, Scenario,
				"HoldingStatementDate");

		test.log(Status.INFO, "Verifying Holding Statement Security");
		BasePage.AssertExcel2("HS_verfSecurity", "New Security", excelName, Scenario, "Security");

		test.log(Status.INFO, "Verifying Holding Statement Security Qunatity");
		BasePage.AssertExcel2("HS_verfQuantity", "HoldingStatement Quantity", excelName, Scenario,
				"Holding Statement Security Qunatity");

		System.out.println("Successfuly completed Verfication for MERGER Holding Statement");

	}

	public static void DEMERGER_HoldingStatements(String excelName, String Scenario) throws Exception {

		Thread.sleep(11000);

		test.log(Status.INFO, "Click on Reports");
		BasePage.click_hexgendash("Reportmenu");
		Thread.sleep(2000);
		test.log(Status.INFO, "Click on Operations");
		BasePage.click_hexgendash("VerfOperations");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Investments");
		BasePage.click_hexgendash("BTFinancials");
		Thread.sleep(1000);
		test.log(Status.INFO, "Click on Holding Statements");

		BasePage.click_hexgendash("Holding_Statement");
		Thread.sleep(4000);

		test.log(Status.INFO, "Enter Begin Date");
		BasePage.enterText("ASOnDate", "ASONDATE", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Output Type");
		BasePage.click_hexgendash("HSOutputtypetextbox");
		BasePage.enterText("HS_OUTPUTTYPE_Input", "OutputType", excelName, Scenario);
		BasePage.click_hexgendash("HS_HTML");
		System.out.println("1870");
		BasePage.click_hexgendash("HS_VIEW_REPORT");
		test.log(Status.INFO, "Verifying Holding Statement Approval Message");
		BasePage.AssertExcel1("sub_assert", "HoldingStatement-MSG", excelName, Scenario);
		Thread.sleep(48000);
		BasePage.switchTab();

		Thread.sleep(2000);

		System.out.println("Started  Verfication for DEMERGER Holding Statement");

		Thread.sleep(5000);

		test.log(Status.INFO, "Verifying Portfolio");
		BasePage.AssertExcel2("HS_verfPortfolio", "BTPortfolio", excelName, Scenario, "Portfolio");

		test.log(Status.INFO, "Verifying Holding Statement Date");
		BasePage.AssertExcel2("HS_verificationDate", "HoldingStatementDate", excelName, Scenario,
				"HoldingStatementDate");

		test.log(Status.INFO, "Verifying Holding Statement Security");
		BasePage.AssertExcel2("HS_SecondRow_SecurityCode", "New Security", excelName, Scenario, "Security");

		test.log(Status.INFO, "Verifying Holding Statement Security Qunatity");
		BasePage.AssertExcel2("HS_SecondRow_QTY", "HoldingStatement Quantity", excelName, Scenario,
				"Holding Statement Security Qunatity");

		System.out.println("Successfuly completed Verfication for DEMERGER Holding Statement");

	}

	public static void CONVERSION_HoldingStatements(String excelName, String Scenario) throws Exception {

		Thread.sleep(11000);
		test.log(Status.INFO, "Click on Reports");
		BasePage.click_hexgendash("Reportmenu");
		Thread.sleep(2000);
		test.log(Status.INFO, "Click on Operations");
		BasePage.click_hexgendash("Operations");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Investments");
		BasePage.click_hexgendash("Investments");
		Thread.sleep(1000);
		test.log(Status.INFO, "Click on Holding Statements");

		BasePage.click_hexgendash("Holding_Statement");
		Thread.sleep(4000);

		test.log(Status.INFO, "Enter and Select Output Type");

		BasePage.click_hexgendash("HSOutputtypetextbox");
		System.out.println("65");
		BasePage.enterText("HS_OUTPUTTYPE_Input", "OutputType", excelName, Scenario);
		BasePage.click_hexgendash("HS_HTML");
		System.out.println("1870");
		Thread.sleep(1000);

		BasePage.click_hexgendash("HS_VIEW_REPORT");
		test.log(Status.INFO, "Verifying Holding Statement Approval Message");
		BasePage.AssertExcel1("sub_assert", "HoldingStatement-MSG", excelName, Scenario);

		Thread.sleep(13000);

		BasePage.switchWindow();

		Thread.sleep(2000);

		System.out.println("Started  Verfication for Bonus 1:2 Holding Statement");

		Thread.sleep(5000);

		test.log(Status.INFO, "Verifying Portfolio");
		BasePage.AssertExcel2("HS_verfPortfolio", "BTPortfolio", excelName, Scenario, "Portfolio");

		test.log(Status.INFO, "Verifying Holding Statement Date");
		BasePage.AssertExcel2("HS_verificationDate", "HoldingStatementDate", excelName, Scenario,
				"HoldingStatementDate");

		test.log(Status.INFO, "Verifying Holding Statement Security");
		BasePage.AssertExcel2("HS_verfSecurity", "Security", excelName, Scenario, "Security");

		test.log(Status.INFO, "Verifying Holding Statement Security Qunatity");
		BasePage.AssertExcel2("HS_verfQuantity", "HoldingStatement Quantity", excelName, Scenario,
				"Holding Statement Security Qunatity");

		System.out.println("Successfuly completed Verfication for Bonus 1:2 Holding Statement");

	}

	public static void SPINOF_HoldingStatements(String excelName, String Scenario) throws Exception {

		Thread.sleep(11000);
		test.log(Status.INFO, "Click on Reports");
		BasePage.click_hexgendash("Reportmenu");
		Thread.sleep(2000);
		test.log(Status.INFO, "Click on Operations");
		BasePage.click_hexgendash("Operations");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Investments");
		BasePage.click_hexgendash("Investments");
		Thread.sleep(1000);
		test.log(Status.INFO, "Click on Holding Statements");

		BasePage.click_hexgendash("Holding_Statement");
		Thread.sleep(4000);

		test.log(Status.INFO, "Enter and Select Output Type");

		BasePage.click_hexgendash("HSOutputtypetextbox");
		System.out.println("65");
		BasePage.enterText("HS_OUTPUTTYPE_Input", "OutputType", excelName, Scenario);
		BasePage.click_hexgendash("HS_HTML");
		System.out.println("1870");
		Thread.sleep(1000);

		BasePage.click_hexgendash("HS_VIEW_REPORT");
		test.log(Status.INFO, "Verifying Holding Statement Approval Message");
		BasePage.AssertExcel1("sub_assert", "HoldingStatement-MSG", excelName, Scenario);

		Thread.sleep(13000);

		BasePage.switchWindow();

		Thread.sleep(2000);

		System.out.println("Started  Verfication for Bonus 1:2 Holding Statement");

		Thread.sleep(5000);

		test.log(Status.INFO, "Verifying Portfolio");
		BasePage.AssertExcel2("HS_verfPortfolio", "BTPortfolio", excelName, Scenario, "Portfolio");

		test.log(Status.INFO, "Verifying Holding Statement Date");
		BasePage.AssertExcel2("HS_verificationDate", "HoldingStatementDate", excelName, Scenario,
				"HoldingStatementDate");

		test.log(Status.INFO, "Verifying Holding Statement Security");
		BasePage.AssertExcel2("HS_verfSecurity", "Security", excelName, Scenario, "Security");

		test.log(Status.INFO, "Verifying Holding Statement Security Qunatity");
		BasePage.AssertExcel2("HS_verfQuantity", "HoldingStatement Quantity", excelName, Scenario,
				"Holding Statement Security Qunatity");

		System.out.println("Successfuly completed Verfication for Bonus 1:2 Holding Statement");

	}

	public static void B2_1_IntradayFreeze(String excelName, String Scenario) throws Exception {
		LoginPage.do_login(ExcelFileName, "DIVIDEND");
		Thread.sleep(9000);

		System.out.println("Entered Successfully!");
		Thread.sleep(5000);
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("manualnavclosing_M15");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Dateupto");
		BasePage.enterText("ManualNAV_DateUpto", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manual_override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manualremarks_tick");
		Thread.sleep(32000);

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(10000);
		BasePage.click1("Panel_Arrow");
		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");

		Thread.sleep(3000);

	}

	public static void Bonus_2_1_Settlement_Transaction(String excelName, String Scenario) throws Exception {

		Thread.sleep(4000);
		test.log(Status.INFO, "Creating Settlement Transacation For Bonus 1:2");
		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");
		Thread.sleep(1000);

		test.log(Status.INFO, "Settlement");
		BasePage.click_hexgendash("Settlement_module");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Trade/benefitSettlement");
		BasePage.click_hexgendash("Trade_benefitSettlement");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Portfolio");
		BasePage.click_hexgendash("Settlementportfolio");
		BasePage.enterText("settlementportinput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Settlement_M15");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.click_hexgendash("SettlementBenefitType");
		BasePage.enterText("SettlementBTInput", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("SettlementBTBonus");
		Thread.sleep(2000);
		BasePage.scrollintoview("SettlementRetriveicon");
		System.out.println("1120");
		BasePage.click_hexgendash("SettlementRetriveicon");
		System.out.println("1122");

		BasePage.scrollintoview("Settlement_checkbox");
		BasePage.click_hexgendash("Settlement_checkbox");

		BasePage.click_hexgendash("SettlementSubmit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Settlement Transaction Message");
		BasePage.AssertExcel1("trans_message", "SettleTrans_SubmitText", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void Bonus_2_1_Settlement_Conformation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Select Company");
		// BasePage.click1("company");
		BasePage.enterText("company", "Company", excelName, Scenario);

		Thread.sleep(2000);
		BasePage.click_hexgendash("comapny_dropdown");

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(15000);
		BasePage.click_hexgendash("Alert_Refresh");

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("Settlementconfapprove");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("Settleconfappremarkstickbutton");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void Bonus_2_1_Manual_NAVClosing_IntraDay(String excelName, String Scenario) throws Exception {
		// LoginPage.do_login(ExcelFileName,"DIVIDEND");
		// Thread.sleep(9000);

		System.out.println("Entered Successfully!");
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Manualport_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);
		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(40000);

		if (BasePage.checkelementpresent("manual_override") == true) {
			System.out.println("PopUp Present");
			BasePage.scrollintoview("manual_override");
			BasePage.click_hexgendash("manual_override");
			Thread.sleep(1000);
			BasePage.click_hexgendash("manualremarks_tick");
			Thread.sleep(40000);
		} else {
			System.out.println("PopUp not Present");

		}

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(10000);
		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");

		Thread.sleep(3000);

	}

	public static void Bonus_2_1_HoldingStatements(String excelName, String Scenario) throws Exception {

		Thread.sleep(11000);

		test.log(Status.INFO, "Click on Reports");
		BasePage.click_hexgendash("Reportmenu");
		Thread.sleep(2000);
		test.log(Status.INFO, "Click on Operations");
		BasePage.click_hexgendash("VerfOperations");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Investments");
		BasePage.click_hexgendash("Investments");
		Thread.sleep(1000);
		test.log(Status.INFO, "Click on Holding Statements");

		BasePage.click_hexgendash("Holding_Statement");
		Thread.sleep(4000);

		test.log(Status.INFO, "Enter Portfolio");
		BasePage.enterText("HS_PORTFOLIO_INPUT", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("HS_Portfolio_M15");
		Thread.sleep(1000);
		// test.log(Status.INFO, "Enter Begin Date");
		// BasePage.enterText("ASOnDate", "ASONDATE", excelName, Scenario);
		// Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Output Type");
		BasePage.click_hexgendash("HSOutputtypetextbox");
		BasePage.enterText("HS_OUTPUTTYPE_Input", "OutputType", excelName, Scenario);
		BasePage.click_hexgendash("HS_HTML");
		System.out.println("1870");
		BasePage.click_hexgendash("HS_VIEW_REPORT");
		test.log(Status.INFO, "Verifying Holding Statement Approval Message");
		BasePage.AssertExcel1("sub_assert", "HoldingStatement-MSG", excelName, Scenario);
		Thread.sleep(80000);
		BasePage.switchTab();

		Thread.sleep(2000);

		System.out.println("Started  Verfication for Bonus 2:1 Holding Statement");

		Thread.sleep(5000);

		test.log(Status.INFO, "Verifying Portfolio");
		BasePage.AssertExcel2("HS_verfPortfolio", "BTPortfolio", excelName, Scenario, "Portfolio");

		test.log(Status.INFO, "Verifying Holding Statement Date");
		BasePage.AssertExcel2("HS_verificationDate", "HoldingStatementDate", excelName, Scenario,
				"HoldingStatementDate");

		test.log(Status.INFO, "Verifying Holding Statement Security");
		BasePage.AssertExcel2("HS_verfSecurity", "Security", excelName, Scenario, "Security");

		test.log(Status.INFO, "Verifying Holding Statement Security Qunatity");
		BasePage.AssertExcel2("HS_verfQuantity", "HoldingStatement Quantity", excelName, Scenario,
				"Holding Statement Security Qunatity");

		System.out.println("Successfuly completed Verfication for Bonus 2:1 Holding Statement");

		BasePage.CloseTab();
		BasePage.click1("Panel_Arrow");
		Thread.sleep(10000);
	}

	public static void S1_2_IntradayFreeze(String excelName, String Scenario) throws Exception {
		LoginPage.do_login(ExcelFileName, "DIVIDEND");
		Thread.sleep(9000);

		System.out.println("Entered Successfully!");
		Thread.sleep(5000);
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("manualnavclosing_M15");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Dateupto");
		BasePage.enterText("ManualNAV_DateUpto", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manual_override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manualremarks_tick");
		Thread.sleep(32000);// 25 mints for 9 days...

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(10000);
		BasePage.click1("Panel_Arrow");
		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");

		Thread.sleep(3000);
	}

	public static void Split_1_2_Settlement_Transaction(String excelName, String Scenario) throws Exception {
		Thread.sleep(4000);
		test.log(Status.INFO, "Creating Settlement Transacation For Bonus 1:2");
		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");
		Thread.sleep(1000);

		test.log(Status.INFO, "Settlement");
		BasePage.click_hexgendash("Settlement_module");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Trade/benefitSettlement");
		BasePage.click_hexgendash("Trade_benefitSettlement");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Portfolio");
		BasePage.click_hexgendash("Settlementportfolio");
		BasePage.enterText("settlementportinput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Settlement_M15");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.click_hexgendash("SettlementBenefitType");
		BasePage.enterText("SettlementBTInput", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("SplitDropdown");
		Thread.sleep(2000);
		BasePage.scrollintoview("SettlementRetriveicon");
		System.out.println("1120");
		BasePage.click_hexgendash("SettlementRetriveicon");
		System.out.println("1122");

		BasePage.scrollintoview("Settlement_checkbox");
		BasePage.click_hexgendash("Settlement_checkbox");

		BasePage.click_hexgendash("SettlementSubmit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Settlement Transaction Message");
		BasePage.AssertExcel1("trans_message", "SettleTrans_SubmitText", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);
	}

	public static void Split_1_2_Settlement_Conformation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Select Company");
		// BasePage.click1("company");
		BasePage.enterText("company", "Company", excelName, Scenario);

		Thread.sleep(2500);
		BasePage.click_hexgendash("comapny_dropdown");

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(20000);

		BasePage.click_hexgendash("Alert_Refresh");
		Thread.sleep(2000);
		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("Settlementconfapprove");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("Settleconfappremarkstickbutton");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void Split_1_2_Manual_NAVClosing_IntraDay(String excelName, String Scenario) throws Exception {
		LoginPage.do_login(ExcelFileName, "DIVIDEND");
		Thread.sleep(11000);

		System.out.println("Entered Successfully!");
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Manualport_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);
		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(40000);

		if (BasePage.checkelementpresent("manual_override") == true) {
			System.out.println("PopUp Present");
			BasePage.scrollintoview("manual_override");
			BasePage.click_hexgendash("manual_override");
			Thread.sleep(1000);
			BasePage.click_hexgendash("manualremarks_tick");
			Thread.sleep(40000);
		} else {
			System.out.println("PopUp not Present");

		}

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(10000);
		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");

		Thread.sleep(3000);

	}

	public static void Split_1_2_HoldingStatements(String excelName, String Scenario) throws Exception {

		Thread.sleep(11000);

		test.log(Status.INFO, "Click on Reports");
		BasePage.click_hexgendash("Reportmenu");
		Thread.sleep(2000);
		test.log(Status.INFO, "Click on Operations");
		BasePage.click_hexgendash("VerfOperations");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Investments");
		BasePage.click_hexgendash("Investments");
		Thread.sleep(1000);
		test.log(Status.INFO, "Click on Holding Statements");

		BasePage.click_hexgendash("Holding_Statement");
		Thread.sleep(4000);

		test.log(Status.INFO, "Enter Portfolio");
		BasePage.enterText("HS_PORTFOLIO_INPUT", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("HS_Portfolio_M15");
		Thread.sleep(1000);

		// test.log(Status.INFO, "Enter Begin Date");
		// BasePage.enterText("ASOnDate", "ASONDATE", excelName, Scenario);
		// Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Output Type");
		BasePage.click_hexgendash("HSOutputtypetextbox");
		BasePage.enterText("HS_OUTPUTTYPE_Input", "OutputType", excelName, Scenario);
		BasePage.click_hexgendash("HS_HTML");
		System.out.println("1870");
		BasePage.click_hexgendash("HS_VIEW_REPORT");
		test.log(Status.INFO, "Verifying Holding Statement Approval Message");
		BasePage.AssertExcel1("sub_assert", "HoldingStatement-MSG", excelName, Scenario);
		Thread.sleep(80000);
		BasePage.switchTab();

		Thread.sleep(2000);

		System.out.println("Started  Verfication for SPLIT 1:2 Holding Statement");

		Thread.sleep(5000);

		test.log(Status.INFO, "Verifying Portfolio");
		BasePage.AssertExcel2("HS_verfPortfolio", "BTPortfolio", excelName, Scenario, "Portfolio");

		test.log(Status.INFO, "Verifying Holding Statement Date");
		BasePage.AssertExcel2("HS_verificationDate", "HoldingStatementDate", excelName, Scenario,
				"HoldingStatementDate");

		test.log(Status.INFO, "Verifying Holding Statement Security");
		BasePage.AssertExcel2("HS_verfSecurity", "Security", excelName, Scenario, "Security");

		test.log(Status.INFO, "Verifying Holding Statement Security Qunatity");
		BasePage.AssertExcel2("HS_verfQuantity", "HoldingStatement Quantity", excelName, Scenario,
				"Holding Statement Security Qunatity");

		System.out.println("Successfuly completed Verfication for SPLIT 1:2 Holding Statement");

		BasePage.CloseTab();
		BasePage.click1("Panel_Arrow");
		Thread.sleep(10000);

	}

	public static void S_2_1_IntradayFreeze(String excelName, String Scenario) throws Exception {
		LoginPage.do_login(ExcelFileName, "DIVIDEND");
		Thread.sleep(9000);

		System.out.println("Entered Successfully!");
		Thread.sleep(5000);
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("manualnavclosing_M15");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Dateupto");
		BasePage.enterText("ManualNAV_DateUpto", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manual_override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manualremarks_tick");
		Thread.sleep(32000);// 29 mints for 10 days...

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(10000);
		BasePage.click1("Panel_Arrow");
		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");

		Thread.sleep(3000);
	}

	public static void Split_2_1_Settlement_Transaction(String excelName, String Scenario) throws Exception {

		Thread.sleep(4000);
		test.log(Status.INFO, "Creating Settlement Transacation For Bonus 1:2");
		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");
		Thread.sleep(1000);

		test.log(Status.INFO, "Settlement");
		BasePage.click_hexgendash("Settlement_module");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Trade/benefitSettlement");
		BasePage.click_hexgendash("Trade_benefitSettlement");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Portfolio");
		BasePage.click_hexgendash("Settlementportfolio");
		BasePage.enterText("settlementportinput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Settlement_M15");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.click_hexgendash("SettlementBenefitType");
		BasePage.enterText("SettlementBTInput", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("SettlementRSPLIT");
		Thread.sleep(2000);
		BasePage.scrollintoview("SettlementRetriveicon");
		System.out.println("1120");
		BasePage.click_hexgendash("SettlementRetriveicon");
		System.out.println("1122");

		BasePage.scrollintoview("Settlement_checkbox");
		BasePage.click_hexgendash("Settlement_checkbox");

		BasePage.click_hexgendash("SettlementSubmit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Settlement Transaction Message");
		BasePage.AssertExcel1("trans_message", "SettleTrans_SubmitText", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void Split_2_1_Settlement_Conformation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Select Company");
		// BasePage.click1("company");
		BasePage.enterText("company", "Company", excelName, Scenario);

		Thread.sleep(2500);
		BasePage.click_hexgendash("comapny_dropdown");

		test.log(Status.INFO, "Click on Login button");
		BasePage.click_hexgendash("loginButton");

		Thread.sleep(20000);
		BasePage.click_hexgendash("Alert_Refresh");
		Thread.sleep(2000);
		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("Settlementconfapprove");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("Settleconfappremarkstickbutton");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);
	}

	public static void Split_2_1_Manual_NAVClosing_IntraDay(String excelName, String Scenario) throws Exception {

		LoginPage.do_login(ExcelFileName, "DIVIDEND");
		Thread.sleep(9000);

		BasePage.click_hexgendash("Process");
		Thread.sleep(2000);

		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Enter and Select Portfolio Group");

		BasePage.click_hexgendash("Portfoliogrouptextbox");
		BasePage.enterText("portfolioinput", "PortfolioGroup", excelName, Scenario);
		BasePage.click_hexgendash("portfolioGlobal");
		Thread.sleep(1000);

		BasePage.click_hexgendash("portfoliotextbox");
		BasePage.enterText("portflioIntradayNAV", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("portfolioHAXAGON");
		Thread.sleep(1000);

		BasePage.click_hexgendash("INAV");
		BasePage.click_hexgendash("INAVtickbutton");

		if (BasePage.checkelementpresent(readobjectRepo("overridetickbutton"))) {
			BasePage.scrollintoview("overridetickbutton");
			System.out.println("Scrolled into view to Override Tick Button");
			BasePage.click_hexgendash("overridetickbutton");

			BasePage.click_hexgendash("overrideremarkstickbutton");
			Thread.sleep(30000);

			System.out.println("Verifying Progress Status");
			test.log(Status.INFO, "Verifying Progress Status");
			BasePage.AssertText("progress_status");
			test.log(Status.PASS, BasePage.Asserttext);
			System.out.println("Successfully verified the Progress Status");
			Thread.sleep(50000);
			System.out.println("Verification Successfully completed for IntraDay NAV closing");
		}

		else {
			Thread.sleep(30000);
			System.out.println("Verifying Progress Status");
			test.log(Status.INFO, "Verifying Progress Status");
			BasePage.AssertText("progress_status");
			test.log(Status.PASS, BasePage.Asserttext);
			System.out.println("Successfully verified the Progress Status");
			Thread.sleep(20000);
			System.out.println("Verification Successfully completed for IntraDay NAV closing");
		}

	}

	public static void Split_2_1_HoldingStatements(String excelName, String Scenario) throws Exception {

		Thread.sleep(11000);
		test.log(Status.INFO, "Click on Reports");
		BasePage.click_hexgendash("Reportmenu");
		Thread.sleep(2000);
		test.log(Status.INFO, "Click on Operations");
		BasePage.click_hexgendash("Operations");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Investments");
		BasePage.click_hexgendash("Investments");
		Thread.sleep(1000);
		test.log(Status.INFO, "Click on Holding Statements");

		BasePage.click_hexgendash("Holding_Statement");
		Thread.sleep(4000);

		test.log(Status.INFO, "Enter Portfolio");
		BasePage.enterText("HS_PORTFOLIO_INPUT", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("HS_Portfolio_M15");
		Thread.sleep(1000);
		test.log(Status.INFO, "Enter and Select Output Type");

		BasePage.click_hexgendash("HSOutputtypetextbox");
		System.out.println("65");
		BasePage.enterText("HS_OUTPUTTYPE_Input", "OutputType", excelName, Scenario);
		BasePage.click_hexgendash("HS_HTML");
		System.out.println("1870");
		Thread.sleep(1000);

		BasePage.click_hexgendash("HS_VIEW_REPORT");
		test.log(Status.INFO, "Verifying Holding Statement Approval Message");
		BasePage.AssertExcel1("sub_assert", "HoldingStatement-MSG", excelName, Scenario);

		Thread.sleep(80000);

		BasePage.switchWindow();

		Thread.sleep(2000);
		System.out.println("Started  Verfication for Split 2:1 Holding Statement");

		Thread.sleep(5000);

		test.log(Status.INFO, "Verifying Portfolio");
		BasePage.AssertExcel2("HS_verfPortfolio", "BTPortfolio", excelName, Scenario, "Portfolio");

		test.log(Status.INFO, "Verifying Holding Statement Date");
		BasePage.AssertExcel2("HS_verificationDate", "HoldingStatementDate", excelName, Scenario,
				"HoldingStatementDate");

		test.log(Status.INFO, "Verifying Holding Statement Security");
		BasePage.AssertExcel2("HS_verfSecurity", "Security", excelName, Scenario, "Security");

		test.log(Status.INFO, "Verifying Holding Statement Security Qunatity");
		BasePage.AssertExcel2("HS_verfQuantity", "HoldingStatement Quantity", excelName, Scenario,
				"Holding Statement Security Qunatity");

		System.out.println("Successfuly completed Verfication for Split 2:1 Holding Statement");

		BasePage.CloseTab();
		BasePage.click1("Panel_Arrow");
		Thread.sleep(10000);

	}

	public static void RIGHTS_HoldingStatements(String excelName, String Scenario) throws Exception {
		Thread.sleep(11000);

		test.log(Status.INFO, "Click on Reports");
		BasePage.click_hexgendash("Reportmenu");
		Thread.sleep(2000);
		test.log(Status.INFO, "Click on Operations");
		BasePage.click_hexgendash("VerfOperations");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Investments");
		BasePage.click_hexgendash("BTFinancials");
		Thread.sleep(1000);
		test.log(Status.INFO, "Click on Holding Statements");

		BasePage.click_hexgendash("Holding_Statement");
		Thread.sleep(4000);

		test.log(Status.INFO, "Enter Begin Date");
		BasePage.enterText("ASOnDate", "ASONDATE", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Output Type");
		BasePage.click_hexgendash("HSOutputtypetextbox");
		BasePage.enterText("HS_OUTPUTTYPE_Input", "OutputType", excelName, Scenario);
		BasePage.click_hexgendash("HS_HTML");
		System.out.println("1870");
		BasePage.click_hexgendash("HS_VIEW_REPORT");
		test.log(Status.INFO, "Verifying Holding Statement Approval Message");
		BasePage.AssertExcel1("sub_assert", "HoldingStatement-MSG", excelName, Scenario);
		Thread.sleep(48000);
		BasePage.switchTab();

		Thread.sleep(2000);

		System.out.println("Started  Verfication for RIGHTS Holding Statement");

		Thread.sleep(5000);

		test.log(Status.INFO, "Verifying Portfolio");
		BasePage.AssertExcel2("HS_verfPortfolio", "BTPortfolio", excelName, Scenario, "Portfolio");

		test.log(Status.INFO, "Verifying Holding Statement Date");
		BasePage.AssertExcel2("HS_verificationDate", "HoldingStatementDate", excelName, Scenario,
				"HoldingStatementDate");

		test.log(Status.INFO, "Verifying Holding Statement Security");
		BasePage.AssertExcel2("HS_verfSecurity", "Security", excelName, Scenario, "Security");

		test.log(Status.INFO, "Verifying Holding Statement Security Qunatity");
		BasePage.AssertExcel2("HS_verfQuantity", "HoldingStatement Quantity", excelName, Scenario,
				"Holding Statement Security Qunatity");

		System.out.println("Successfuly completed Verfication for RIGHTS Holding Statement");

	}

	public static void WARRANT_HoldingStatements(String excelName, String Scenario) throws Exception {
		Thread.sleep(11000);

		test.log(Status.INFO, "Click on Reports");
		BasePage.click_hexgendash("Reportmenu");
		Thread.sleep(2000);
		test.log(Status.INFO, "Click on Operations");
		BasePage.click_hexgendash("VerfOperations");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Investments");
		BasePage.click_hexgendash("BTFinancials");
		Thread.sleep(1000);
		test.log(Status.INFO, "Click on Holding Statements");

		BasePage.click_hexgendash("Holding_Statement");
		Thread.sleep(4000);

		test.log(Status.INFO, "Enter Begin Date");
		BasePage.enterText("ASOnDate", "ASONDATE", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Output Type");
		BasePage.click_hexgendash("HSOutputtypetextbox");
		BasePage.enterText("HS_OUTPUTTYPE_Input", "OutputType", excelName, Scenario);
		BasePage.click_hexgendash("HS_HTML");
		System.out.println("1870");
		BasePage.click_hexgendash("HS_VIEW_REPORT");
		test.log(Status.INFO, "Verifying Holding Statement Approval Message");
		BasePage.AssertExcel1("sub_assert", "HoldingStatement-MSG", excelName, Scenario);
		Thread.sleep(48000);
		BasePage.switchTab();

		Thread.sleep(2000);

		System.out.println("Started  Verfication for WARRANT Holding Statement");

		Thread.sleep(5000);

		test.log(Status.INFO, "Verifying Portfolio");
		BasePage.AssertExcel2("HS_verfPortfolio", "BTPortfolio", excelName, Scenario, "Portfolio");

		test.log(Status.INFO, "Verifying Holding Statement Date");
		BasePage.AssertExcel2("HS_verificationDate", "HoldingStatementDate", excelName, Scenario,
				"HoldingStatementDate");

		test.log(Status.INFO, "Verifying Holding Statement Security");
		BasePage.AssertExcel2("HS_verfSecurity", "Security", excelName, Scenario, "Security");

		test.log(Status.INFO, "Verifying Holding Statement Security Qunatity");
		BasePage.AssertExcel2("HS_verfQuantity", "HoldingStatement Quantity", excelName, Scenario,
				"Holding Statement Security Qunatity");

		System.out.println("Successfuly completed Verfication for WARRANT Holding Statement");

	}

	public static void Directplacement(String excelName, String Scenario) throws Exception {

		Thread.sleep(5000);

		test.log(Status.INFO, "Creating Direct Placement");

		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");

		test.log(Status.INFO, "Click on Investments");
		BasePage.click_hexgendash("DPInvestment");

		test.log(Status.INFO, "Click on DirectPlacement");
		BasePage.click_hexgendash("Direct_Placement");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("DP_PortfolioTextbox");
		BasePage.enterText("DP_PortfolioInput", "PortfolioName", excelName, Scenario);
		BasePage.click_hexgendash("DP_Portfolio_ROYALSUPER");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Security");
		BasePage.click_hexgendash("DP_SecurityTextBox");
		test.log(Status.INFO, "Enter and Select Security");
		BasePage.enterText("DP_SecuirtyInput", "Security", excelName, Scenario);
		BasePage.click_hexgendash("Directplacement_Security_4405");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Settlement_Date");
		BasePage.enterText("DP_Settlementdate", "Settlement_date", excelName, Scenario);
		Thread.sleep(1000);
		test.log(Status.INFO, "Enter Quantity");
		BasePage.enterText("DP_Qunatity", "DP_Quantity", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Price");
		BasePage.enterText("DP_Price", "DP_Price", excelName, Scenario);
		Thread.sleep(1000);

		BasePage.scrollintoview("DP_Price");

		test.log(Status.INFO, "Click on Counter Party");
		BasePage.click_hexgendash("DP_CounterpartyTextbox");
		test.log(Status.INFO, "Enter and Select Counter Party");
		BasePage.enterText("DP_CounterpartyInput", "DP_Counterparty", excelName, Scenario);
		BasePage.click_hexgendash("DP_ABMB_IS-HQ_FD");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Broker");
		BasePage.click_hexgendash("DP_Brokertextbox");
		test.log(Status.INFO, "Enter and Select Broker");
		BasePage.enterText("DP_Brokerinput", "DP_Broker", excelName, Scenario);
		BasePage.click_hexgendash("DP_DIRECT");

		test.log(Status.INFO, "Enter Trade Note");
		BasePage.scrollintoview("DP_TradeNote");
		BasePage.enterText("DP_TradeNote", "Trade_note", excelName, Scenario);

		Thread.sleep(3000);

		System.out.println("Started Verfication for Direct Placement");

		test.log(Status.INFO, "Verifying Security Name");
		BasePage.AssertExcel2("DP_Securityname", "Security Name", excelName, Scenario, "Security Name");

		test.log(Status.INFO, "Verifying Security Ccy");
		BasePage.AssertExcel2("DP_Securityccy", "Security Ccy", excelName, Scenario, "Security Ccy");

		test.log(Status.INFO, "Verifying Issuer");
		BasePage.AssertExcel2("DP_Issuer", "Issuer", excelName, Scenario, "Issuer");

		test.log(Status.INFO, "Verifying Asset Class");
		BasePage.AssertExcel2("DP_Assetclass", "Asset Class", excelName, Scenario, "Asset Class");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel2("DP_Facevalue", "DP_Facevalue", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying Quantity");
		BasePage.AssertExcel2("DP_VERF_QTY", "DP_QTY", excelName, Scenario, "Quantity");

		// test.log(Status.INFO, "Verifying Portfolio Name");
		// BasePage.AssertExcel2("DP_Portfolioname", "PortfolioName", excelName,
		// Scenario, "Portfolio Name");

		// test.log(Status.INFO, "Verifying Portfolio Ccy");
		// BasePage.AssertExcel2("DP_PortfolioCcy", "PortfolioCcy", excelName, Scenario,
		// "PortfolioCcy");

		BasePage.click_hexgendash("DP_Submit");
		Thread.sleep(80000);
		BasePage.click_hexgendash("DP_tickbutton");
		BasePage.click_hexgendash("DP_REMARKSApprove");
		test.log(Status.INFO, "Verifying Direct Placement Submission message");
		BasePage.AssertExcel2("DIV_MSG", "reset_conf_msg", excelName, Scenario, "Successful Message");

		Thread.sleep(3000);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void Directplacement_RIGHTS_NEWSECUIRTY(String excelName, String Scenario) throws Exception {

		Thread.sleep(9000);

		test.log(Status.INFO, "Creating Direct Placement");

		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");

		test.log(Status.INFO, "Click on Investments");
		BasePage.click_hexgendash("DPInvestment");

		test.log(Status.INFO, "Click on DirectPlacement");
		BasePage.click_hexgendash("Direct_Placement");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("DP_PortfolioTextbox");
		BasePage.enterText("DP_PortfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("DP_portfolio_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Security");
		BasePage.click_hexgendash("DP_SecurityTextBox");
		test.log(Status.INFO, "Enter and Select Security");
		BasePage.enterText("DP_SecuirtyInput", "New Security", excelName, Scenario);
		BasePage.click_hexgendash("DP_8745OR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Quantity");
		BasePage.enterText("DP_Qunatity", "DP_Quantity", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Price");
		BasePage.enterText("DP_Price", "DP_Price", excelName, Scenario);
		Thread.sleep(1000);

		BasePage.scrollintoview("DP_Price");

		test.log(Status.INFO, "Click on Counter Party");
		BasePage.click_hexgendash("DP_CounterpartyTextbox");
		test.log(Status.INFO, "Enter and Select Counter Party");
		BasePage.enterText("DP_CounterpartyInput", "DP_Counterparty", excelName, Scenario);
		BasePage.click_hexgendash("DP_ABMB_IS-HQ_FD");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Broker");
		BasePage.click_hexgendash("DP_Brokertextbox");
		test.log(Status.INFO, "Enter and Select Broker");
		BasePage.enterText("DP_Brokerinput", "DP_Broker", excelName, Scenario);
		BasePage.click_hexgendash("DP_CIMB");
		Thread.sleep(3000);

		System.out.println("Started Verfication for Direct Placement");

		test.log(Status.INFO, "Verifying Security Name");
		BasePage.AssertExcel2("DP_Securityname", "NewSecurity_name", excelName, Scenario, "Security Name");

		test.log(Status.INFO, "Verifying Security Ccy");
		BasePage.AssertExcel2("DP_Securityccy", "Security Ccy", excelName, Scenario, "Security Ccy");

		test.log(Status.INFO, "Verifying Issuer");
		BasePage.AssertExcel2("DP_Issuer", "NewSecurity_Issuer", excelName, Scenario, "Issuer");

		test.log(Status.INFO, "Verifying Asset Class");
		BasePage.AssertExcel2("DP_Assetclass", "NewSecurity_AssetClass", excelName, Scenario, "Asset Class");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel2("DP_Facevalue", "DP_Facevalue", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying Quantity");
		BasePage.AssertExcel2("DP_VERF_QTY", "DP_QTY", excelName, Scenario, "Quantity");

		test.log(Status.INFO, "Verifying Portfolio Name");
		BasePage.scrollintoview("DP_Portfolioname");
		BasePage.AssertExcel2("DP_Portfolioname", "PortfolioName", excelName, Scenario, "Portfolio Name");

		test.log(Status.INFO, "Verifying Portfolio Ccy");
		BasePage.AssertExcel2("DP_PortfolioCcy", "PortfolioCcy", excelName, Scenario, "Portfolio Ccy");

		Thread.sleep(3000);

		BasePage.click_hexgendash("DP_Submit");
		Thread.sleep(2000);

		test.log(Status.INFO, "Verifying Direct Placement Submission message");
		BasePage.AssertExcel2("DIV_MSG", "DP_Submit_msg", excelName, Scenario, "Successful Message");

		Thread.sleep(3000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void Directplacement_WARRANT_NEWSECUIRTY(String excelName, String Scenario) throws Exception {

		Thread.sleep(5000);

		test.log(Status.INFO, "Creating Direct Placement");

		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");

		test.log(Status.INFO, "Click on Investments");
		BasePage.click_hexgendash("DPInvestment");

		test.log(Status.INFO, "Click on DirectPlacement");
		BasePage.click_hexgendash("Direct_Placement");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("DP_PortfolioTextbox");
		BasePage.enterText("DP_PortfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("DP_portfolio_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Security");
		BasePage.click_hexgendash("DP_SecurityTextBox");
		test.log(Status.INFO, "Enter and Select Security");
		BasePage.enterText("DP_SecuirtyInput", "New Security", excelName, Scenario);
		BasePage.click_hexgendash("DP_4723WB");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Quantity");
		BasePage.enterText("DP_Qunatity", "DP_Quantity", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Price");
		BasePage.enterText("DP_Price", "DP_Price", excelName, Scenario);
		Thread.sleep(1000);

		BasePage.scrollintoview("DP_Price");

		test.log(Status.INFO, "Click on Counter Party");
		BasePage.click_hexgendash("DP_CounterpartyTextbox");
		test.log(Status.INFO, "Enter and Select Counter Party");
		BasePage.enterText("DP_CounterpartyInput", "DP_Counterparty", excelName, Scenario);
		BasePage.click_hexgendash("DP_ABMB_IS-HQ_FD");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Broker");
		BasePage.click_hexgendash("DP_Brokertextbox");
		test.log(Status.INFO, "Enter and Select Broker");
		BasePage.enterText("DP_Brokerinput", "DP_Broker", excelName, Scenario);
		BasePage.click_hexgendash("DP_CIMB");
		Thread.sleep(3000);

		System.out.println("Started Verfication for Direct Placement");

		test.log(Status.INFO, "Verifying Security Name");
		BasePage.AssertExcel2("DP_Securityname", "NewSecurity_name", excelName, Scenario, "Security Name");

		test.log(Status.INFO, "Verifying Security Ccy");
		BasePage.AssertExcel2("DP_Securityccy", "Security Ccy", excelName, Scenario, "Security Ccy");

		test.log(Status.INFO, "Verifying Issuer");
		BasePage.AssertExcel2("DP_Issuer", "NewSecurity_Issuer", excelName, Scenario, "Issuer");

		test.log(Status.INFO, "Verifying Asset Class");
		BasePage.AssertExcel2("DP_Assetclass", "NewSecurity_AssetClass", excelName, Scenario, "Asset Class");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel2("DP_Facevalue", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying Quantity");
		BasePage.AssertExcel2("DP_VERF_QTY", "DP_Quantity", excelName, Scenario, "Quantity");

		test.log(Status.INFO, "Verifying Portfolio Name");
		BasePage.AssertExcel2("DP_Portfolioname", "PortfolioName", excelName, Scenario, "Portfolio Name");

		test.log(Status.INFO, "Verifying Portfolio Ccy");
		BasePage.AssertExcel2("DP_PortfolioCcy", "PortfolioCcy", excelName, Scenario, "Quantity");

		Thread.sleep(3000);

		BasePage.click_hexgendash("DP_Submit");
		Thread.sleep(2000);

		test.log(Status.INFO, "Verifying Direct Placement Submission message");
		BasePage.AssertExcel2("DIV_MSG", "DP_Submit_msg", excelName, Scenario, "Successful Message");

		Thread.sleep(3000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void Directplacement_MERGER_NEWSECUIRTY(String excelName, String Scenario) throws Exception {

		Thread.sleep(5000);

		test.log(Status.INFO, "Creating Direct Placement");

		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");

		test.log(Status.INFO, "Click on Investments");
		BasePage.click_hexgendash("DPInvestment");

		test.log(Status.INFO, "Click on DirectPlacement");
		BasePage.click_hexgendash("Direct_Placement");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("DP_PortfolioTextbox");
		BasePage.enterText("DP_PortfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("DP_portfolio_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Security");
		BasePage.click_hexgendash("DP_SecurityTextBox");
		test.log(Status.INFO, "Enter and Select Security");
		BasePage.enterText("DP_SecuirtyInput", "New Security", excelName, Scenario);
		BasePage.click_hexgendash("DP_4723WB");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Quantity");
		BasePage.enterText("DP_Qunatity", "DP_Quantity", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Price");
		BasePage.enterText("DP_Price", "DP_Price", excelName, Scenario);
		Thread.sleep(1000);

		BasePage.scrollintoview("DP_Price");

		test.log(Status.INFO, "Click on Counter Party");
		BasePage.click_hexgendash("DP_CounterpartyTextbox");
		test.log(Status.INFO, "Enter and Select Counter Party");
		BasePage.enterText("DP_CounterpartyInput", "DP_Counterparty", excelName, Scenario);
		BasePage.click_hexgendash("DP_ABMB_IS-HQ_FD");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Broker");
		BasePage.click_hexgendash("DP_Brokertextbox");
		test.log(Status.INFO, "Enter and Select Broker");
		BasePage.enterText("DP_Brokerinput", "DP_Broker", excelName, Scenario);
		BasePage.click_hexgendash("DP_CIMB");
		Thread.sleep(3000);

		System.out.println("Started Verfication for Direct Placement");

		test.log(Status.INFO, "Verifying Security Name");
		BasePage.AssertExcel2("DP_Securityname", "NewSecurity_name", excelName, Scenario, "Security Name");

		test.log(Status.INFO, "Verifying Security Ccy");
		BasePage.AssertExcel2("DP_Securityccy", "Security Ccy", excelName, Scenario, "Security Ccy");

		test.log(Status.INFO, "Verifying Issuer");
		BasePage.AssertExcel2("DP_Issuer", "NewSecurity_Issuer", excelName, Scenario, "Issuer");

		test.log(Status.INFO, "Verifying Asset Class");
		BasePage.AssertExcel2("DP_Assetclass", "NewSecurity_AssetClass", excelName, Scenario, "Asset Class");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel2("DP_Facevalue", "DP_Facevalue", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying Quantity");
		BasePage.AssertExcel2("DP_VERF_QTY", "DP_Quantity", excelName, Scenario, "Quantity");

		test.log(Status.INFO, "Verifying Portfolio Name");
		BasePage.AssertExcel2("DP_Portfolioname", "PortfolioName", excelName, Scenario, "Portfolio Name");

		test.log(Status.INFO, "Verifying Portfolio Ccy");
		BasePage.AssertExcel2("DP_PortfolioCcy", "PortfolioCcy", excelName, Scenario, "Quantity");

		Thread.sleep(3000);

		BasePage.click_hexgendash("DP_Submit");
		Thread.sleep(2000);

		test.log(Status.INFO, "Verifying Direct Placement Submission message");
		BasePage.AssertExcel2("DIV_MSG", "DP_Submit_msg", excelName, Scenario, "Successful Message");

		Thread.sleep(3000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void DirectplacementConfirmation(String excelName, String Scenario)
			throws IOException, InterruptedException, Exception {

		test.log(Status.INFO, "Enter Valid Checker Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid Checker Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);
		Thread.sleep(2000);

		test.log(Status.INFO, "Select Company");
		// BasePage.click1("company");
		BasePage.enterText("company", "Company", excelName, Scenario);

		Thread.sleep(2000);
		BasePage.click_hexgendash("comapny_dropdown");

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(15000);

		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");

		test.log(Status.INFO, "Click on Comfirmation");
		BasePage.click_hexgendash("DP_Confirmation");

		test.log(Status.INFO, "Click on Transactions Comfirmation");
		BasePage.click_hexgendash("DP_Transactionsconfirmation");

		test.log(Status.INFO, "Click on CheckBox");
		BasePage.scrollintoview("DP_Selectall");
		BasePage.click_hexgendash("DP_Selectall");

		test.log(Status.INFO, "Click on Submit");
		BasePage.click_hexgendash("DP_Conformation_submit");
		Thread.sleep(2000);

		test.log(Status.INFO, "Verifying Direct Placement Confirmation message");
		BasePage.AssertExcel2("DIV_MSG", "DP_Conf_msg", excelName, Scenario, "Confirmation Message");

		Thread.sleep(5000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void ManualIntradayNAV(String excelName, String Scenario) throws Exception {

		LoginPage.do_login(ExcelFileName, "DIVIDEND");


		System.out.println("Entered Successfully!");
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(2000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "PortfolioName", excelName, Scenario);
		BasePage.click_hexgendash("manualnavclosing_M15");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.scrollintoview("Depo_Override");
		BasePage.click_hexgendash("Depo_Override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Depo_remarkstick");
	//	Thread.sleep(30000);

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		BasePage.click1("Panel_Arrow");
		Thread.sleep(5000);
		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");

		Thread.sleep(3000);

	}

	public static void Reset(String excelName, String Scenario) throws Exception {

		BasePage.click_hexgendash("Admin");
		Thread.sleep(1000);
		// BasePage.click_hexgendash("configuration");
		// Thread.sleep(1000);
		// BasePage.click_hexgendash("resettables");
		// Thread.sleep(2000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.enterText("reset_Portfolio", "PortfolioName", excelName, Scenario);
		BasePage.click_hexgendash("reset_M15");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Bussiness Date");
		BasePage.enterText("reset_BussinessDateinput", "BusinessDate", excelName, Scenario);
		Thread.sleep(1000);

		BasePage.click_hexgendash("reset_submit");
		Thread.sleep(1000);
		BasePage.click_hexgendash("resetoverride");
		Thread.sleep(1000);
		BasePage.click_hexgendash("resetfinalsubmit");

		Thread.sleep(15000);

		BasePage.click1("InfoAlert");
		Thread.sleep(3000);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void CreateDirectPlacement_for_RIGHTS(String excelName, String Scenario) throws Exception {

		Thread.sleep(6000);

		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");
		Thread.sleep(1000);

		test.log(Status.INFO, "Investment");
		BasePage.click_hexgendash("Investment_Tab");
		Thread.sleep(1000);

		test.log(Status.INFO, "Direct Placement");
		BasePage.click_hexgendash("DP_Directplacement");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Portfolio");
		BasePage.enterText("DP_Portfolio", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("DP_TESTPORTMYR");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter and Select Security");
		BasePage.enterText("DP_Security", "New Security", excelName, Scenario);
		BasePage.click_hexgendash("DP_RIGHTS_010600651");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter Qunatity");
		BasePage.enterText("DP_QTY", "QTY", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter the Price");
		BasePage.enterText("DP_Price", "Price", excelName, Scenario);
		Thread.sleep(1000);
		BasePage.scrollintoview("DP_CounterParty");
		test.log(Status.INFO, "Enter and Select Counter Party");
		BasePage.enterText("DP_CounterParty", "CounterParty", excelName, Scenario);
		BasePage.click_hexgendash("DP_1022");
		Thread.sleep(2000);
		test.log(Status.INFO, "Enter and Select Broker");
		BasePage.enterText("DP_Broker", "Broker", excelName, Scenario);
		BasePage.click_hexgendash("DP_1998");
		Thread.sleep(2000);
		test.log(Status.INFO, "Enter and Select Exchange");
		BasePage.enterText("DP_Exchange", "Exchange", excelName, Scenario);
		BasePage.click_hexgendash("DP_NSE");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter Settlement Date Stk");
		BasePage.enterText("Dp_SettlementdateStk", "SettlementDateStk", excelName, Scenario);
		Thread.sleep(1000);

		BasePage.click_hexgendash("DP_SUBMIT_BUTTON");

		if (BasePage.checkelementpresent(readobjectRepo("overridetickbutton"))) {
			BasePage.scrollintoview("overridetickbutton");
			System.out.println("Scrolled into view to Override Tick Button");
			BasePage.click_hexgendash("overridetickbutton");

			BasePage.click_hexgendash("overrideremarkstickbutton");

			test.log(Status.INFO, "Verifying Deposit placement Form Submit Message");
			BasePage.AssertExcel1("sub_assert", "DP_Overridemsg", excelName, Scenario);

		} else {
			System.out.println("No Override Popup Appeared");
			test.log(Status.INFO, "Verifying Deposit placement Form Submit Message");
			BasePage.AssertExcel1("sub_assert", "DP_SUBMITMSG", excelName, Scenario);

		}

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);
		BasePage.click_hexgendash("Backtologinscreen");
	}

	public static void Directplacement_Confirmation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(10000);

		test.log(Status.INFO, "Approving Direct Placement For RIGHTS");
		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");
		Thread.sleep(1000);

		test.log(Status.INFO, "Confirmation");
		BasePage.click_hexgendash("Confirmation");
		Thread.sleep(1000);

		test.log(Status.INFO, "MOE Confirmation");
		BasePage.click_hexgendash("MOEConfirmation");
		Thread.sleep(1000);

		BasePage.click_hexgendash("Approve_CheckBox");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Submit");
		BasePage.click_hexgendash("PM_Transaction_Submit");
		Thread.sleep(1000);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);
		BasePage.click_hexgendash("Backtologinscreen");

	}

	public static void DIRECTPLACEMENT_HoldingStatements(String excelName, String Scenario) throws Exception {

		Thread.sleep(8000);
		test.log(Status.INFO, "Click on Reports");
		BasePage.click_hexgendash("Reportmenu");
		Thread.sleep(2000);
		test.log(Status.INFO, "Click on Operations");
		BasePage.click_hexgendash("Operations");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Investments");
		BasePage.click_hexgendash("Investments");
		Thread.sleep(1000);
		test.log(Status.INFO, "Click on Holding Statements");

		BasePage.click_hexgendash("Holding_Statement");
		Thread.sleep(4000);

		test.log(Status.INFO, "Enter and Select Output Type");

		BasePage.click_hexgendash("HSOutputtypetextbox");
		System.out.println("65");
		BasePage.enterText("HS_OUTPUTTYPE_Input", "OutputType", excelName, Scenario);
		BasePage.click_hexgendash("HS_HTML");
		System.out.println("1870");
		Thread.sleep(1000);

		BasePage.click_hexgendash("HS_VIEW_REPORT");
		test.log(Status.INFO, "Verifying Holding Statement Approval Message");
		BasePage.AssertExcel1("sub_assert", "HoldingStatement-MSG", excelName, Scenario);

		Thread.sleep(13000);

		BasePage.switchTab();

		Thread.sleep(2000);

		System.out.println("Started  Verfication for Bonus 1:2 Holding Statement");

		Thread.sleep(5000);

		test.log(Status.INFO, "Verifying Portfolio");
		BasePage.AssertExcel2("HS_verfPortfolio", "BTPortfolio", excelName, Scenario, "Portfolio");

		test.log(Status.INFO, "Verifying Holding Statement Date");
		BasePage.AssertExcel2("HS_verificationDate", "HoldingStatementDate", excelName, Scenario,
				"HoldingStatementDate");

		test.log(Status.INFO, "Verifying Holding Statement Security");
		BasePage.AssertExcel2("HS_verfSecurity", "Security", excelName, Scenario, "Security");

		test.log(Status.INFO, "Verifying Holding Statement Security Qunatity");
		BasePage.AssertExcel2("HS_verfQuantity", "HoldingStatement Quantity", excelName, Scenario,
				"Holding Statement Security Qunatity");

		System.out.println("Successfuly completed Verfication for Bonus 1:2 Holding Statement");

		BasePage.CloseTab();
		Thread.sleep(6000);
	}

	public static void CorporateActionFormRIGHTS(String excelName, String Scenario) throws Exception {

		Thread.sleep(6000);
		test.log(Status.INFO, "Creating Corporate Action For RIGHTS");
		test.log(Status.INFO, "Click on Masters");
		BasePage.click_hexgendash("Masters");
		Thread.sleep(1000);

		test.log(Status.INFO, "Valuation");
		BasePage.click_hexgendash("Valuation");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Corporate Action");
		BasePage.click_hexgendash("CorporateAction");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Benefit Type");
		BasePage.enterText("BenefitType", "Benefit Type", excelName, Scenario);
		BasePage.click_hexgendash("BenefitType_RIGHTS");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter Ex Record_Date");
		BasePage.enterText("Exec_Record_Date", "Ex Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter AGM Date");
		BasePage.enterText("AGM_Date", "AGM_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Lodgement Date");
		BasePage.enterText("Lodgement_Date", "Lodgement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Record Date");
		BasePage.enterText("Record_Date", "Record_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Security");
		BasePage.enterText("Security", "Security", excelName, Scenario);
		BasePage.click_hexgendash("Security_4405");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Exp Setl Date");
		BasePage.enterText("Exp_Setl_Date", "Exp_Settlement_Date", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Exec Price Basics");
		BasePage.click_hexgendash("Pricebasisbox");
		BasePage.enterText("rightsEXECPRICEBASICS", "Exec_Price_Basis", excelName, Scenario);
		BasePage.click_hexgendash("EXEC_QTY");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter and Select New Security");
		BasePage.enterText("NEW_SECUIRTY", "New Security", excelName, Scenario);
		BasePage.click_hexgendash("Security_8745OR");
		Thread.sleep(1000);
		test.log(Status.INFO, "Enter Ratio Org");
		BasePage.enterText("Ratio_Org", "Ratio Org", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Ratio New");
		BasePage.enterText("Ratio_New", "Ratio New", excelName, Scenario);
		Thread.sleep(1000);

		System.out.println("89");

		Thread.sleep(8000);
		System.out.println("88");
		System.out.println("Started Verfication for Corporate Action RIGHTS");

		test.log(Status.INFO, "Verifying Benefit Ccy");
		BasePage.AssertExcel2("Benefit_Ccy", "Benefit Ccy", excelName, Scenario, "Benefit Ccy");

		test.log(Status.INFO, "Verifying Exec Price Basis");
		BasePage.AssertExcel2("verf_EXECpricebasics", "Exec_Price_Basis", excelName, Scenario, "Exec Price Basis");

		test.log(Status.INFO, "Verifying Exec Price");
		BasePage.AssertExcel_ByreadingTextbox("verf_exec_Price", "Exec_Price", excelName, Scenario, "Exec Price");

		test.log(Status.INFO, "Verifying Exec Price Tax");
		BasePage.AssertExcel_ByreadingTextbox("verf_Exec_PriceTax", "Exec_PriceTax", excelName, Scenario,
				"Exec Price Tax");

		test.log(Status.INFO, "Verifying Round Method");
		BasePage.AssertExcel2("Round_Method", "Round Method", excelName, Scenario, "Round Method");

		test.log(Status.INFO, "Verifying Round Decimals");
		BasePage.AssertExcel_ByreadingTextbox("Round_Decimals", "Round Decimals", excelName, Scenario,
				"Round Decimals");
		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel_ByreadingTextbox("Basicinfo_Face_VAlue", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying Cost Transfer %");
		BasePage.AssertExcel_ByreadingTextbox("Cost_Transfer%", "Cost Transfer %", excelName, Scenario,
				"Cost Transfer %");

		test.log(Status.INFO, "Verifying Withhold Tax %");
		BasePage.AssertExcel_ByreadingTextbox("WithHold_Tax", "Withhold Tax %", excelName, Scenario, "Withhold Tax %");

		test.log(Status.INFO, "Verifying Dividend Type");
		BasePage.AssertExcel2("Divended_Type", "Dividend Type", excelName, Scenario, "Dividend Type");

		test.log(Status.INFO, "Verifying Security Name");
		BasePage.AssertExcel2("CAFORM_Security_Name", "Security Name", excelName, Scenario, "Security Name");

		test.log(Status.INFO, "Verifying Security Ccy");
		BasePage.AssertExcel2("CAFORM_Security_Ccy", "Security Ccy", excelName, Scenario, "Security Ccy");

		test.log(Status.INFO, "Verifying Issuer");
		BasePage.AssertExcel2("CAFORM_issuer", "Issuer", excelName, Scenario, "Issuer");

		test.log(Status.INFO, "Verifying Asset Class");
		BasePage.AssertExcel2("CAFORM_Asset_Class", "Asset Class", excelName, Scenario, "Asset Class");

		test.log(Status.INFO, "Verifying Face Value");
		BasePage.AssertExcel2("CAFORM_face_value", "Face_Value", excelName, Scenario, "Face Value");

		test.log(Status.INFO, "Verifying ISIN");
		BasePage.AssertExcel2("CAFORM_ISIN", "ISIN", excelName, Scenario, "ISIN");

	}

	public static void CorporateAction_RIGHTS_Submit(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Click on Submit");
		BasePage.click_hexgendash("SubmitButton");

		test.log(Status.INFO, "Verifying Corporate Action Form Submission message");
		BasePage.AssertExcel2("DIV_MSG", "CAForm_Submit", excelName, Scenario, "Successful Message");

		Thread.sleep(4000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void CorporateAction_RIGHTS_Confirmation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(15000);

		test.log(Status.INFO, "Approving RIGHTS Corporate Action Form");

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("CA_approve");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Remarks");
		BasePage.enterText("approve_remarks", "CA_Approve_remarks", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");
		BasePage.click_hexgendash("approve_tick");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void RIGHTS_Manual_NAVExrecorddate(String excelName, String Scenario) throws Exception {

		System.out.println("Entered Successfully!");
		Thread.sleep(5000);
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Manualport_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Dateupto");
		BasePage.enterText("ManualNAV_DateUpto", "Ex_Rec+1", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manual_override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manualremarks_tick");
		Thread.sleep(540000);// 9 mints for 3 days...

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(8000);

		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");
		Thread.sleep(3000);
	}

	public static void RIGHTS_ManualNAVuptoSettlementdate(String excelName, String Scenario) throws Exception {

		System.out.println("Entered Successfully!");
		Thread.sleep(5000);
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Manualport_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Dateupto");
		BasePage.enterText("ManualNAV_DateUpto", "PMSettlementdate", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manual_override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manualremarks_tick");
		Thread.sleep(540000);// 9 mints for 3 days...

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(8000);

		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");
		Thread.sleep(3000);
	}

	public static void WARRANT_ManualNAVuptoSettlementdate(String excelName, String Scenario) throws Exception {

		System.out.println("Entered Successfully!");
		Thread.sleep(5000);
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Manualport_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Dateupto");
		BasePage.enterText("ManualNAV_DateUpto", "PMSettlementdate", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manual_override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manualremarks_tick");
		Thread.sleep(540000);// 9 mints for 3 days...

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(8000);

		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");
		Thread.sleep(3000);
	}

	public static void RIGHTS_Manual_NAV_Allotmentdate(String excelName, String Scenario) throws Exception {

		System.out.println("Entered Successfully!");
		Thread.sleep(5000);
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Manualport_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Dateupto");
		BasePage.enterText("ManualNAV_DateUpto", "PMExpAllotDate", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manual_override");
		Thread.sleep(1000);
		BasePage.click_hexgendash("manualremarks_tick");
		Thread.sleep(240000);// 4 mints for 1 days...

		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(8000);

		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");
		Thread.sleep(3000);
	}

	public static void WARRANT_Manual_NAV_Allotmentdate(String excelName, String Scenario) throws Exception {

		System.out.println("Entered Successfully!");
		Thread.sleep(5000);
		test.log(Status.INFO, "Click on Process");
		Thread.sleep(5000);
		BasePage.click_hexgendash("Process");
		Thread.sleep(1000);
		BasePage.click_hexgendash("Process");

		test.log(Status.INFO, "Click on Manual NAV");
		BasePage.click_hexgendash("Manual_NAV_Closing");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Portfolio");
		BasePage.click_hexgendash("ManualNAV_PortfolioTextbox");
		BasePage.enterText("Manual_portfolioInput", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Manualport_TESTPORTMYR");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Dateupto");
		BasePage.enterText("ManualNAV_DateUpto", "PMExpAllotDate", excelName, Scenario);
		Thread.sleep(1000);
		test.log(Status.INFO, "Click on Manual NAV Submit Button");
		BasePage.click_hexgendash("manual_submit");
		Thread.sleep(1000);
		test.log(Status.INFO, "Click on Manual NAV Popup Tick Button");
		BasePage.click_hexgendash("ManualNAV_popup_tick");
		Thread.sleep(1000);
		if (BasePage.checkelementpresent("manual_override") == true) {

			BasePage.click_hexgendash("manual_override");
			Thread.sleep(1000);
			BasePage.click_hexgendash("manualremarks_tick");
			Thread.sleep(240000);// 4 mints for 1 days...
		} else {
			System.out.println("PopUp not Present");

		}

		Thread.sleep(240000);// 4 mints for 1 days...
		System.out.println("Verifying Progress Status");
		test.log(Status.INFO, "Verifying Progress Status");
		Thread.sleep(8000);

		BasePage.AssertText("progress_status");
		test.log(Status.PASS, BasePage.Asserttext);
		System.out.println("Successfully verified the Progress Status");
		test.log(Status.INFO, "Successfully Completed ManualNAV Intraday Process");
		System.out.println("Successfully Completed ManualNAV Intraday Process");
		Thread.sleep(3000);
	}

	public static void RIGHTS_PrimaryMarket(String excelName, String Scenario) throws Exception {

		Thread.sleep(6000);
		test.log(Status.INFO, "Creating Primary Market For Rights");
		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");
		Thread.sleep(1000);

		test.log(Status.INFO, "Investment");
		BasePage.click_hexgendash("Investment_Tab");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Primary Market");
		BasePage.click_hexgendash("PrimaryMarket");
		Thread.sleep(5000);

		test.log(Status.INFO, "Enter and Select Applied Security");
		BasePage.enterText("AppliedSecurity", "New Security", excelName, Scenario);
		BasePage.click_hexgendash("AppliedSecurity_code");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Transaction Date");
		BasePage.enterText("Primarymarket_TransactionDate", "PMTransactiondate", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Settlement Date");
		BasePage.enterText("Primarymarket_SettlementDate", "PMSettlementdate", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Exp Allot Date");
		BasePage.enterText("Exp_Allot_Date", "PMExpAllotDate", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Issue Type");
		BasePage.click_hexgendash("Issuetype");
		BasePage.scrollintoview("Primarymarket_IssueType");
		BasePage.enterText("Primarymarket_IssueType", "PMIssueType", excelName, Scenario);
		BasePage.click_hexgendash("Primarymarket_RTGAPP");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Total Qunatity");

		BasePage.enterText("PM_TotalQunatity", "PMTotalQTY", excelName, Scenario);

		Thread.sleep(1000);
		BasePage.scrollintoview("PM_AllocationDetail_Button");

		BasePage.click_hexgendash("PM_AllocationDetail_Button");

		test.log(Status.INFO, "Enter and Select Portfolio");
		BasePage.enterText("PM_Portfolio", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("PM_PORT");
		Thread.sleep(1000);
	}

	public static void WARRANT_PrimaryMarket(String excelName, String Scenario) throws Exception {

		Thread.sleep(6000);
		test.log(Status.INFO, "Creating Primary Market For Rights");
		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");
		Thread.sleep(1000);

		test.log(Status.INFO, "Investment");
		BasePage.click_hexgendash("Investment_Tab");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Primary Market");
		BasePage.click_hexgendash("PrimaryMarket");
		Thread.sleep(5000);

		test.log(Status.INFO, "Enter and Select Applied Security");
		BasePage.enterText("AppliedSecurity", "New Security", excelName, Scenario);
		BasePage.click_hexgendash("AppliedSecurity_code");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Transaction Date");
		BasePage.enterText("Primarymarket_TransactionDate", "PMTransactiondate", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Settlement Date");
		BasePage.enterText("Primarymarket_SettlementDate", "PMSettlementdate", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Exp Allot Date");
		BasePage.enterText("Exp_Allot_Date", "PMExpAllotDate", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Issue Type");
		BasePage.click_hexgendash("Issuetype");
		BasePage.scrollintoview("Primarymarket_IssueType");
		BasePage.enterText("Primarymarket_IssueType", "PMIssueType", excelName, Scenario);
		BasePage.click_hexgendash("Primarymarket_RTGAPP");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select RGT/WARR Security");
		BasePage.enterText("RGT/WARR_Security", "RGT/WARR Security", excelName, Scenario);
		BasePage.click_hexgendash("RGTWARSECURITY");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Total Qunatity");

		BasePage.enterText("PM_TotalQunatity", "PMTotalQTY", excelName, Scenario);

		Thread.sleep(1000);
		BasePage.scrollintoview("PM_AllocationDetail_Button");

		BasePage.click_hexgendash("PM_AllocationDetail_Button");

		test.log(Status.INFO, "Enter and Select Portfolio");
		BasePage.scrollintoview("PM_Portfolio");
		BasePage.enterText("PM_Portfolio", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("PM_PORT");
		Thread.sleep(1000);
		BasePage.scrollintoview("AppliedQty");
		BasePage.enterText("AppliedQty", "PMTotalQTY", excelName, Scenario);
		BasePage.click_hexgendash("AllocationText");
		Thread.sleep(1000);

	}

	public static void CorporateAction_RIGHTS_PRIMARYMARKET_SUBMIT(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Click on Submit");
		BasePage.click_hexgendash("PM_Submitbutton");

		test.log(Status.INFO, "Verifying Primary Market Form Submission message");
		BasePage.AssertExcel2("DIV_MSG", "PM_Submit_text", excelName, Scenario, "Successful Message");

		Thread.sleep(4000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void CorporateAction_WARRANT_PRIMARYMARKET_SUBMIT(String excelName, String Scenario)
			throws Exception {

		test.log(Status.INFO, "Click on Submit");
		BasePage.click_hexgendash("PM_Submitbutton");

		test.log(Status.INFO, "Verifying Primary Market Form Submission message");
		BasePage.AssertExcel2("DIV_MSG", "PM_Submit_text", excelName, Scenario, "Successful Message");

		Thread.sleep(4000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void CorporateAction_RIGHT_PRIMARYMARKET_Confirmation(String excelName, String Scenario)
			throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(15000);

		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");

		test.log(Status.INFO, "Click on Comfirmation");
		BasePage.click_hexgendash("DP_Confirmation");

		test.log(Status.INFO, "Click on Transactions Comfirmation");
		BasePage.click_hexgendash("DP_Transactionsconfirmation");

		test.log(Status.INFO, "Click on CheckBox");
		BasePage.scrollintoview("DP_Checkbox");
		BasePage.click_hexgendash("DP_Checkbox");

		test.log(Status.INFO, "Click on Submit");
		BasePage.click_hexgendash("DP_Conformation_submit");
		Thread.sleep(2000);

		test.log(Status.INFO, "Verifying Direct Placement Confirmation message");
		BasePage.AssertExcel2("DIV_MSG", "DP_Conf_msg", excelName, Scenario, "Confirmation Message");

		Thread.sleep(5000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void CorporateAction_WARRANT_PRIMARYMARKET_Confirmation(String excelName, String Scenario)
			throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(15000);

		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("Transactions");

		test.log(Status.INFO, "Click on Comfirmation");
		BasePage.click_hexgendash("DP_Confirmation");

		test.log(Status.INFO, "Click on Transactions Comfirmation");
		BasePage.click_hexgendash("DP_Transactionsconfirmation");

		test.log(Status.INFO, "Click on CheckBox");
		BasePage.scrollintoview("DP_Checkbox");
		BasePage.click_hexgendash("DP_Checkbox");

		test.log(Status.INFO, "Click on Submit");
		BasePage.click_hexgendash("DP_Conformation_submit");
		Thread.sleep(2000);

		test.log(Status.INFO, "Verifying Direct Placement Confirmation message");
		BasePage.AssertExcel2("DIV_MSG", "DP_Conf_msg", excelName, Scenario, "Confirmation Message");

		Thread.sleep(5000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void Rights_Settlement_Transaction(String excelName, String Scenario) throws Exception {

		Thread.sleep(6000);
		test.log(Status.INFO, "Creating Settlement Transacation For RIGHTS");
		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("transactions");
		Thread.sleep(1000);

		test.log(Status.INFO, "Settlement");
		BasePage.click_hexgendash("Settlement");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Trade/benefitSettlement");
		BasePage.click_hexgendash("Trade_benefitSettlement");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Benefit Type");

		BasePage.enterText("SettlementBTInput", "BenefitType_Settlement", excelName, Scenario);
		BasePage.click_hexgendash("PMPAYSettle");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter and Select Portfolio");
		BasePage.enterText("Settleportfolio", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Settle_TESTPORTMYR");
		Thread.sleep(1000);

		BasePage.scrollintoview("SettlementRetriveicon");
		System.out.println("1120");
		BasePage.click_hexgendash("SettlementRetriveicon");
		System.out.println("1122");

		BasePage.scrollintoview("Settlement_checkbox");

		BasePage.click_hexgendash("Settlement_checkbox");

		BasePage.click_hexgendash("SettlementSubmit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Settlement Transaction Message");
		BasePage.AssertExcel1("trans_message", "SettleTrans_SubmitText", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);
	}

	public static void WARRANT_Settlement_Transaction(String excelName, String Scenario) throws Exception {

		Thread.sleep(6000);
		test.log(Status.INFO, "Creating Settlement Transacation For RIGHTS");
		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("transactions");
		Thread.sleep(1000);

		test.log(Status.INFO, "Settlement");
		BasePage.click_hexgendash("Settlement");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Trade/benefitSettlement");
		BasePage.click_hexgendash("Trade_benefitSettlement");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Benefit Type");

		BasePage.enterText("SettlementBTInput", "BenefitType_Settlement", excelName, Scenario);
		BasePage.click_hexgendash("PMPAYSettle");
		Thread.sleep(2000);

		test.log(Status.INFO, "Enter and Select Portfolio");
		BasePage.enterText("Settleportfolio", "Portfolio", excelName, Scenario);
		BasePage.click_hexgendash("Settle_TESTPORTMYR");
		Thread.sleep(1000);

		BasePage.scrollintoview("SettlementRetriveicon");
		System.out.println("1120");
		BasePage.click_hexgendash("SettlementRetriveicon");
		System.out.println("1122");

		BasePage.scrollintoview("Settlement_checkbox");

		BasePage.click_hexgendash("Settlement_checkbox");

		BasePage.click_hexgendash("SettlementSubmit");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Settlement Transaction Message");
		BasePage.AssertExcel1("trans_message", "SettleTrans_SubmitText", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);
	}

	public static void RIGHTS_Settlement_Conformation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(18000);

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("Settlementconfapprove");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("Settleconfappremarkstickbutton");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void WARRANT_Settlement_Conformation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(18000);

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("Settlementconfapprove");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");

		BasePage.click_hexgendash("Settleconfappremarkstickbutton");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void RIGHTS_PrimaryMarketAllotment(String excelName, String Scenario) throws Exception {

		Thread.sleep(6000);
		test.log(Status.INFO, "Creating Primary Market Allotment For Rights");
		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("transactions");
		Thread.sleep(1000);

		test.log(Status.INFO, "Investment");
		BasePage.click_hexgendash("Investment_Tab");
		Thread.sleep(1000);

		test.log(Status.INFO, "Primary Market Allotment");
		BasePage.click_hexgendash("Primarymarketallotment");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Application Reference");
		BasePage.enterText("Application_Reference", "Application Reference", excelName, Scenario);
		BasePage.click_hexgendash("Application_no");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Transaction Date");
		BasePage.enterText("PMA_Transdate", "PMExpAllotDate", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Security");
		BasePage.click_hexgendash("PMA_Security");
		test.log(Status.INFO, "Enter and Select Security");
		BasePage.enterText("PMA_Input", "Security", excelName, Scenario);
		BasePage.click_hexgendash("PMA_4405");
		Thread.sleep(1000);
	}

	public static void WARRANT_PrimaryMarketAllotment(String excelName, String Scenario) throws Exception {

		Thread.sleep(6000);
		test.log(Status.INFO, "Creating Primary Market Allotment For Rights");
		test.log(Status.INFO, "Click on Transactions");
		BasePage.click_hexgendash("transactions");
		Thread.sleep(1000);

		test.log(Status.INFO, "Investment");
		BasePage.click_hexgendash("Investment_Tab");
		Thread.sleep(1000);

		test.log(Status.INFO, "Primary Market Allotment");
		BasePage.click_hexgendash("Primarymarketallotment");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter and Select Application Reference");
		BasePage.enterText("Application_Reference", "Application Reference", excelName, Scenario);
		BasePage.click_hexgendash("Application_no");
		Thread.sleep(1000);

		test.log(Status.INFO, "Enter Transaction Date");
		BasePage.enterText("PMA_Transdate", "PMExpAllotDate", excelName, Scenario);
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Security");
		BasePage.click_hexgendash("PMA_Security");
		test.log(Status.INFO, "Enter and Select Security");
		BasePage.enterText("PMA_Input", "Security", excelName, Scenario);
		BasePage.click_hexgendash("PMA_4405");
		Thread.sleep(1000);

	}

	public static void CorporateAction_RIGHTS_PRIMARYMARKETALLOTMENT_SUBMIT(String excelName, String Scenario)
			throws Exception {

		test.log(Status.INFO, "Click on Submit");
		BasePage.click_hexgendash("PMA_Submitbutton");

		if (BasePage.checkelementpresent(("overridetickbutton"))) {
			BasePage.scrollintoview("overridetickbutton");
			System.out.println("Scrolled into view to Override Tick Button");
			BasePage.click_hexgendash("overridetickbutton");

			BasePage.click_hexgendash("overrideremarkstickbutton");

			test.log(Status.INFO, "Verifying Deposit placement Form Submit Message");
			BasePage.AssertExcel1("sub_assert", "reset_conf_msg", excelName, Scenario);

		} else {
			System.out.println("No Override Popup Appeared");
			test.log(Status.INFO, "Verifying Primary Market Allotment Form Submission message");
			BasePage.AssertExcel2("DIV_MSG", "PMA_Submit_text", excelName, Scenario, "Successful Message");

		}

		Thread.sleep(4000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);
	}

	public static void WARRANT_PRIMARYMARKETALLOTMENT_SUBMIT(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Click on Submit");
		BasePage.click_hexgendash("PMA_Submitbutton");

		if (BasePage.checkelementpresent(("overridetickbutton"))) {
			BasePage.scrollintoview("overridetickbutton");
			System.out.println("Scrolled into view to Override Tick Button");
			BasePage.click_hexgendash("overridetickbutton");

			BasePage.click_hexgendash("overrideremarkstickbutton");

			test.log(Status.INFO, "Verifying Deposit placement Form Submit Message");
			BasePage.AssertExcel1("sub_assert", "reset_conf_msg", excelName, Scenario);

		} else {
			System.out.println("No Override Popup Appeared");
			test.log(Status.INFO, "Verifying Primary Market Allotment Form Submission message");
			BasePage.AssertExcel2("DIV_MSG", "PMA_Submit_text", excelName, Scenario, "Successful Message");

		}

		Thread.sleep(4000);
		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);
	}

	public static void RIGHTS_PRIMARYMARKET_Allotment_Confirmation(String excelName, String Scenario) throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(15000);

		test.log(Status.INFO, "Approving RIGHTS Corporate Action Form");

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("PMA_ApproveButton");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");
		BasePage.click_hexgendash("PMA_RemarksTickButton");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

	public static void WARRANT_PRIMARYMARKET_Allotment_Confirmation(String excelName, String Scenario)
			throws Exception {

		test.log(Status.INFO, "Enter Valid BOM Username");
		BasePage.enterText("LoginUserForm_user_name", "loginUserName_conf", excelName, Scenario);

		test.log(Status.INFO, "Enter Valid BOM Password");
		BasePage.enterText("LoginUserForm_password", "loginPassword_conf", excelName, Scenario);

		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Login button");

		BasePage.click_hexgendash("loginButton");

		Thread.sleep(15000);

		test.log(Status.INFO, "Approving RIGHTS Corporate Action Form");

		test.log(Status.INFO, "Click on More Info Icon");
		BasePage.click_hexgendash("sub_moreinfo");
		Thread.sleep(4000);

		test.log(Status.INFO, "Click on Approve");
		BasePage.click_hexgendash("PMA_ApproveButton");
		Thread.sleep(1000);

		test.log(Status.INFO, "Click on Remarks Tick icon");
		BasePage.click_hexgendash("PMA_RemarksTickButton");
		Thread.sleep(1000);

		test.log(Status.INFO, "Verifying Corporate Action Form Approval Message");
		BasePage.AssertExcel1("sub_assert", "Confirm_CA", excelName, Scenario);

		BasePage.horizontalRight();

		test.log(Status.INFO, "Click on Hexgen User");
		BasePage.click_hexgendash("hexgen_user");
		Thread.sleep(2000);

		test.log(Status.INFO, "Click on Logout");
		BasePage.click_hexgendash("hexgen_logout");
		Thread.sleep(2000);

	}

}
