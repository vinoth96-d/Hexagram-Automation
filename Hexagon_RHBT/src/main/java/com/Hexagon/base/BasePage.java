package com.Hexagon.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Hexagon.pom.pages.EquityBUYPage;
import com.Hexagon.pom.pages.LoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.LogStatus;

public class BasePage extends BaseProjectMethods {
	
	//public static WebDriver driver;
	public static String Asserttext;
	public static String Transid;
	public static long time;
	public static String ExcelFileName = BasePage.readURLTestDataProp("PortfolioSubred_TestData");

	public static String readobjectRepo(String key) {
		String filename = "objectRepo";
		try {

			String path = System.getProperty("user.dir") + "/testdata/objectRepo.properties";
			if (path == null || path.length() == 0) {
				path = System.getProperty("user.dir") + "/testdata/" + filename + ".properties";
			}
			Properties p = new Properties();
			FileInputStream fs = new FileInputStream(path);
			p.load(fs);
			return (String) p.get(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportFailure("Error: " + filename + " file not found");
			System.out.println("Error: " + filename + " file not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	public static String readtransIDs(String key) {
		String filename = "TransactionIDs";
		try {

			String path = System.getProperty("user.dir") + "/testdata/TransactionIDs.properties";
			if (path == null || path.length() == 0) {
				path = System.getProperty("user.dir") + "/testdata/" + filename + ".properties";
			}
			Properties p = new Properties();
			FileInputStream fs = new FileInputStream(path);
			p.load(fs);
			return (String) p.get(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportFailure("Error: " + filename + " file not found");
			System.out.println("Error: " + filename + " file not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
public static  void loadTime(String xpath)throws Exception {
    	
		try {
   	 
 
   long start = System.currentTimeMillis();

   waitForPresenceAndVisibilityOfElementry3(readobjectRepo(xpath));
	
//	WebElement ele = driver.findElement(By.xpath(readobjectRepo(xpath)));
	
  
   long finish = System.currentTimeMillis();
   long totalTime = finish - start; 
   System.out.println("Total Time for page load - "+totalTime+" milliseconds");
   
   time =totalTime;
   
   }catch(Exception e) {
	   }
   }

	public static String convertingtodouble(double value) // Got here 6.743240136E7 or something..
	{
		DecimalFormat formatter;
		if (value - (int) value > 0.0)
			{formatter = new DecimalFormat("0.##");} // Here you can also deal with rounding if you wish..
		else
			{formatter = new DecimalFormat("0");}
		return formatter.format(value);
	}
	
	
	public static Map<String, Map<String, String>> setMapData(String excelName) throws IOException {
		String path = excelName;
		Map<String, Map<String, String>> excelFileMap = null;
		try {
			FileInputStream fis = new FileInputStream(path);
			Workbook workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet("Data");
			int lastRow = sheet.getLastRowNum();
			System.out.println(lastRow);
			int noOfColumns = sheet.getRow(0).getLastCellNum();
			System.out.println(noOfColumns);
			excelFileMap = new HashMap<String, Map<String, String>>();
			int yesCount = 0;
			String cellValue = "";
			LinkedHashMap<String, String> dataMap = new LinkedHashMap<String, String>();
			for (int columnIndex = 0; columnIndex < noOfColumns; columnIndex++) {
				if (yesCount > 10) {
					test.log(Status.INFO, "More than one yes condition found in excel file");
					break;
				}
				for (int rowIndex = 0; rowIndex <= lastRow; rowIndex++) {
					Row row = sheet.getRow(rowIndex);
					Cell cell = CellUtil.getCell(row, columnIndex);
					if (cell.getCellType() == CellType.NUMERIC) {
						cellValue = convertingtodouble(cell.getNumericCellValue());
						System.out.println("numeric :"+cellValue);
						//cellValue = cell.getNumericCellValue();

					}
				 if (cell.getCellType() == CellType.STRING) {
						cellValue = cell.getStringCellValue().trim();
						System.out.println("String :"+cellValue);
					}else if (cell.getCellType() == CellType.BLANK) {
						cellValue = "" ;
						System.out.println("blank :"+cellValue);
						//test.log(Status.FAIL,"The excel cell is blank: "+dataMap.keySet().toArray()[rowIndex].toString());						
					}

				/*	if ("No".equalsIgnoreCase(cellValue)) {
						break;
					} else if ("Yes".equalsIgnoreCase(cellValue)) {
						yesCount++;
					}
					if (yesCount > 1) {// if more than one yes condition code will break
						break;
					}*/
					if (columnIndex == 0) {
						dataMap.put(cellValue, "");
					} else {
						dataMap.put(dataMap.keySet().toArray()[rowIndex].toString(), cellValue);

					}
				}

			}
			excelFileMap.put("Data", dataMap);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			test.log(Status.FAIL, "Error: " + path + " file not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return excelFileMap;
	}

	// Method to retrieve value
	public static String readTestData1(String key, String excelName) throws IOException {
		Map<String, String> m = setMapData(excelName).get("Data");
		String value = m.get(key);
		return value;
	}

	public static void click(String xpath) throws Exception, IOException, InterruptedException {
		try {
			waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
			WebElement ele = driver.findElement(By.xpath(readobjectRepo(xpath)));
//	            test.log(Status.PASS, "Click on  '" + ele.getText() + "' is successful");
			ele.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			reportFailure("Click on element unsuccessful");
		}
	}

	
	public static void click1(String xpath) throws Exception, IOException, InterruptedException {
		try {
			
			checkelementpresent(readobjectRepo(xpath));
			//waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
			WebElement ele = driver.findElement(By.xpath(readobjectRepo(xpath)));
//	            test.log(Status.PASS, "Click on  '" + ele.getText() + "' is successful");
			ele.click();
	//		 Actions act =  new Actions(driver);
	//           act.moveToElement(driver.findElement(By.xpath(readobjectRepo(xpath)))).click().perform();
	//		Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			reportFailure("Click on element unsuccessful");
		}
	}

	
	
	
	
	
	
	 public static void click_login(String xpath) throws IOException, InterruptedException {
	        try {
	            waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
	            WebElement ele = driver.findElement(By.xpath(readobjectRepo(xpath)));
	            ele.click();
	            System.out.println("text :" + ele.getText());
	            if(ele.getText()=="")
	            {
	            	System.out.println(LoginPage.text);
	            	//test.log(Status.PASS, "Click on  '" + LoginPage.text + "' is successful");
	            }
	            else
	            {
	            test.log(Status.PASS, "Click on  '" + ele.getText() + "' is successful");
	            }
	          
	           Thread.sleep(1800);
	        } catch (Exception e) {
	            e.printStackTrace();
	            reportFailure("Click on element is unsuccessful");
	        }
	    }
	    
	    public static void click_hexgendash(String xpath) throws IOException, InterruptedException {
	        try {
	        	System.out.println(xpath);
	        	
	        	checkelementpresent(readobjectRepo(xpath));
	        //    waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
	            WebElement ele = driver.findElement(By.xpath(readobjectRepo(xpath)));
	            
	           String text= ele.getText();
	          
	    //       Actions act =  new Actions(driver);
	   //        act.moveToElement(driver.findElement(By.xpath(readobjectRepo(xpath)))).click().perform();
	            ele.click();
	            if(text=="")
	            {
	            	//test.log(Status.PASS, "Click on  '" + EquityBUYPage.text + "' is successful");
	            }
	            else
	            {
	            test.log(Status.PASS, "Click on  '" + text + "' is successful");
	            }
	           
	            Thread.sleep(1000);
	        } catch (Exception e) {
	            e.printStackTrace();
	            reportFailure("Click on element is unsuccessful");
	        }
	    }
	    
	   
	public static void select(String xpath) throws IOException, InterruptedException {
        try {
        	checkelementpresent(readobjectRepo(xpath));
           // waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
            WebElement ele = driver.findElement(By.xpath(readobjectRepo(xpath)));
            ele.click();
            test.log(Status.PASS, "Selection of '" + ele.getText() + "' is successful");
           
            Thread.sleep(1800);
        } catch (Exception e) {
            e.printStackTrace();
            reportFailure("Selection of element is unsucessful");
            
        }
    }

	public static void autoclickdropdown(String xpath, String submitxpath) throws Exception {
		boolean status = false;
		try {
			Select s = new Select(driver.findElement(By.xpath(readobjectRepo(xpath))));
			List<WebElement> options = s.getOptions();
			List<String> optionsLocators = new ArrayList<String>();
			for (WebElement option : options) {
				optionsLocators
						.add(String.format(readobjectRepo(xpath) + "//*[@value='%s']", option.getAttribute("value")));
			}

			for (String optionLocator : optionsLocators) {
				WebElement option = driver.findElement(By.xpath(optionLocator));
				option.click();
				Thread.sleep(1500);
				test.log(Status.PASS, "Selecting dropdown " + option.getText() + " is sucessful");
				BasePage.click("Search");
				// BasePage.click(readobjectRepo(submitxpath));
				Thread.sleep(1500);
			}

		} catch (Exception e) {
			e.printStackTrace();
			reportFailure("Item is not selected ");
		}
	}

	public static boolean waitForPresenceAndVisibilityOfElementry(String value) throws Exception {
		boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 60);
		List<WebElement> ele;
		
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(value)));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
		//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(value)));
			ele = driver.findElements(By.xpath(value));
			if (ele.size() == 1) {
				status = true;
			
		} 
		return status;
	}
	public static boolean waitForPresenceAndVisibilityOfElementry1(String value) throws Exception {
		boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 60);
		List<WebElement> ele;
		
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(value)));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
	//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(value)));
			ele = driver.findElements(By.xpath(value));
			if (ele.size() == 1) {
				status = true;
			
		} 
		return status;
	}
	public static boolean waitForPresenceAndVisibilityOfElementry2(String value) throws Exception {
		boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 3);
		List<WebElement> ele;
		
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(value)));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
	//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(value)));
			ele = driver.findElements(By.xpath(value));
			if (ele.size() == 1) {
				status = true;
			
		} 
		return status;
	}
	public static boolean waitForPresenceAndVisibilityOfElementry3(String value) throws Exception {
		boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 600);
		List<WebElement> ele;
		
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(value)));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
	//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(value)));
			ele = driver.findElements(By.xpath(value));
			if (ele.size() == 1) {
				status = true;
			
		} 
		return status;}
	/*
	 * public static String ReadTestdataDropDown(String key) throws IOException {
	 * 
	 * String filename = "DropDown"; String path = System.getProperty("user.dir") +
	 * "/testdata/DropDown.properties"; if (path == null || path.length() == 0) {
	 * path = System.getProperty("user.dir") + "/testdata/" + filename +
	 * ".properties"; } Properties p = new Properties(); FileInputStream fs = new
	 * FileInputStream(path); p.load(fs); return (String) p.get(key);
	 * 
	 * }
	 */

	public static void selectElementByVisibleText(String xpath, String testData, String excelName) throws Exception {
		boolean status = false;
		try {
			waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
			WebElement element = driver.findElement(By.xpath(readobjectRepo(xpath)));
			List<WebElement> List = element.findElements(By.tagName("option"));
			for (WebElement option : List) {
				if (readTestData1(testData, excelName).equals(option.getText())) {
					Thread.sleep(1500);
					option.click();
					status = true;
					Thread.sleep(1500);
					// test.log(Status.PASS, "Selection of Item in Drop down is successful");
					test.log(Status.INFO, "Dropdown Selected: " + readTestData1(testData, excelName));
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			reportFailure("Dropdown value is not selected ");
		}
	}
	
	public static void switchTab() throws Exception {
		try {
			
			// Store all currently open tabs in tabs
			Thread.sleep(3000);
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

			// Switch newly open Tab
			driver.switchTo().window(tabs.get(1));
			
			
Thread.sleep(3000);
			// Close newly open tab after performing some operations.
			

			// Switch to old(Parent) tab.
		//	driver.switchTo().window(tabs.get(0));
	    
	    }catch(Exception e) {
	    	test.log(Status.FAIL, "Error in switch tab");
	    	takeScreenShot();
	    	}
	    }
	
public static  void loadTime1()throws Exception {
    	
		try {
   	 
 
   long start = System.currentTimeMillis();

   waitForPresence_NewTab();
	
//	WebElement ele = driver.findElement(By.xpath(readobjectRepo(xpath)));
	
  
   long finish = System.currentTimeMillis();
   long totalTime = finish - start; 
   System.out.println("Total Time for page load - "+totalTime+" milliseconds");
   
   time =totalTime;
   
   }catch(Exception e) {
	   }
   }

public static void waitForPresence_NewTab() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, 120);    
			    wait.until(ExpectedConditions.numberOfWindowsToBe(2));

}
	public static void CloseTab() throws Exception {
		try {
			
			// Store all currently open tabs in tabs
			
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

			// Switch newly open Tab
			driver.switchTo().window(tabs.get(1));

			// Close newly open tab after performing some operations.
			driver.close();

			// Switch to old(Parent) tab.
			driver.switchTo().window(tabs.get(0));
	    
	    }catch(Exception e) {
	    	test.log(Status.FAIL, "Error in Close tab");
	    	takeScreenShot();
	    	}
	    }
	public static boolean checkelementpresent(String xpath) throws IOException, Exception {
    	try{
    		System.out.println(xpath);
    		waitForPresenceAndVisibilityOfElementry1(xpath);
    	boolean t = driver.findElement(By.xpath(xpath)).isDisplayed();
    
    	System.out.println(t);
        if (t==true) {
           System.out.println("Element is dispalyed");
           return true;
        } else {
           System.out.println("Element is not dispalyed");
           return false;
        }
        }catch (NoSuchElementException e) {
           // e.printStackTrace();
           // reportFailure("Element NOT found");
        	System.out.println("Element is not dispalyed");
            return false;
            
        } 
        	catch (Exception e) {
           // e.printStackTrace();
           // reportFailure("Element NOT found");
       	System.out.println("Element is not dispalyed");
            return false;
        }
	
		
    }
	public static boolean checkelementpresent1(String xpath) throws IOException, Exception {
    	try{
    		
    		System.out.println(xpath);
    		waitForPresenceAndVisibilityOfElementry2(xpath);
    	boolean t = driver.findElement(By.xpath(xpath)).isDisplayed();
    
    	System.out.println(t);
        if (t==true) {
           System.out.println("Element is dispalyed");
           return true;
        } else {
           System.out.println("Element is not dispalyed");
           return false;
        }
        }catch (NoSuchElementException e) {
           // e.printStackTrace();
           // reportFailure("Element NOT found");
        	System.out.println("Element is not dispalyed");
            return false;
            
        } 
        	catch (Exception e) {
           // e.printStackTrace();
           // reportFailure("Element NOT found");
       	System.out.println("Element is not dispalyed");
            return false;
        }
	
		
    }
	public static boolean checkelementpresent3(String xpath) throws IOException, Exception {
    	try{
    		System.out.println(xpath);
    		waitForPresenceAndVisibilityOfElementry3(xpath);
    	boolean t = driver.findElement(By.xpath(xpath)).isDisplayed();
    
    	System.out.println(t);
        if (t==true) {
           System.out.println("Element is dispalyed");
           return true;
        } else {
           System.out.println("Element is not dispalyed");
           return false;
        }
        }catch (NoSuchElementException e) {
           // e.printStackTrace();
           // reportFailure("Element NOT found");
        	System.out.println("Element is not dispalyed");
            return false;
            
        } 
        	catch (Exception e) {
           // e.printStackTrace();
           // reportFailure("Element NOT found");
       	System.out.println("Element is not dispalyed");
            return false;
        }
	
		
    }
    
	public static void verifying_banktransactions_report() throws Exception {
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
		try {
	
	    for(int i=15;i<23;i++)
	    {
	    	 loop=i;
	    	String xpath="/html/body/table/tbody/tr["+i+"]/td[5]";
	    	if(checkelementpresent1(xpath)==true) 
	    	{
	    	WebElement ele = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[5]"));
			 actual = ele.getText();
			 System.out.println(actual);
			if(actual.equals("Units Subscription - settlement - , Ref : "+Transid))
	    	{
				 expected ="Units Subscription - settlement - , Ref : "+Transid;
				Assert.assertEquals(actual, expected);
				test.log(Status.PASS,"Details = Expected: " + expected + " <-----> Actual: " + actual);
				
				WebElement ele1 = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[1]"));
				 actual1 = ele1.getText();
				 expected1 = readTestData("AE TransDate", ExcelFileName,"Current(T+0) UNSAL");
					//System.out.println(readTestData(data, excelName, Scenario));
					Assert.assertEquals(actual1, expected1);
					// Assert.assertTrue(actual.contains("Invalid Username"));
					test.log(Status.PASS,"Trans Date = Expected: " + expected1 + " <-----> Actual: " + actual1);
				
					WebElement ele2 = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[2]"));
					 actual2 = ele2.getText();
					 expected2 = readTestData("AE Transcode", ExcelFileName,"Current(T+0) UNSAL");
						//System.out.println(readTestData(data, excelName, Scenario));
						Assert.assertEquals(actual2, expected2);
						// Assert.assertTrue(actual.contains("Invalid Username"));
						test.log(Status.PASS,"Trans Code = Expected: " + expected2 + " <-----> Actual: " + actual2);
					
						WebElement ele3 = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[6]"));
						 actual3 = ele3.getText();
						 expected3 = readTestData("Bank Amount Acy", ExcelFileName,"Current(T+0) UNSAL");
							//System.out.println(readTestData(data, excelName, Scenario));
							Assert.assertEquals(actual3, expected3);
							// Assert.assertTrue(actual.contains("Invalid Username"));
							test.log(Status.PASS,"Debit = Expected: " + expected3 + " <-----> Actual: " + actual3);
						
			}
			 
			    
			}
	    	
	   
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
	
	public static void verifying_banktransactions_report_RHBT() throws Exception {
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
	    	String xpath="/html/body/table/tbody/tr["+i+"]/td[6]";
	    	if(entry==0) {
	    	if(checkelementpresent1(xpath)==true) 
	    	{
	    	WebElement ele = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[6]"));
			 actual = ele.getText();
			 System.out.println(actual);
			if(actual.equals("15,000.65"))
	    	{
				 expected ="15,000.65";
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
	public static void verifying_banktransactions_report1_RHBT() throws Exception {
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
	    	WebElement ele = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[7]"));
			 actual = ele.getText();
			 System.out.println(actual);
			 
			if(actual.equals("(15,000.65)"))
	    	{
				 expected ="(15,000.65)";
				Assert.assertEquals(actual, expected);
				test.log(Status.PASS,"Credit = Expected: " + expected + " <-----> Actual: " + actual);
				entry=1;
				
				}
			
			
}}}
	    for(int i=8;i<25;i++)
	    { 
	    	 loop=i;
	    	String xpath="/html/body/table/tbody/tr["+i+"]/td[7]";
	    	if(entry1==0) {
	    	if(checkelementpresent1(xpath)==true) 
	    	{
	    	WebElement ele = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[7]"));
			 actual = ele.getText();
			 System.out.println(actual);
			if(actual.equals("(7,875.00)"))
	    	{
				 expected ="(7,875.00)";
				Assert.assertEquals(actual, expected);
				test.log(Status.PASS,"Credit = Expected: " + expected + " <-----> Actual: " + actual);
				entry1=1;
				
				}
			
}}}
	    if(entry==0) {
			test.log(Status.FAIL,"Reversed Full Settlement Amount- 15,000.65 is not reflected in Bank Transactions Report");
			//reportFailure("Assertion Failed");
			takeScreenShot();
			}
	    if(entry1==0) {
			test.log(Status.FAIL,"Reversed Partial Settlement Amount- 7,875.00 is not reflected in Bank Transactions Report");
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
	   
	public static void verifying_Subred_report() throws Exception {
		String actual="";String expected="";String actual1="";String expected1="";String actual2="";String expected2="";String actual3="";
		String expected3="";String actual4="";String expected4="";String actual5="";String expected5="";
		String actual02="";String expected02="";String actual04="";String expected04="";String actual05="";String expected05="";String actual06="";String expected06="";String actual07="";String expected07="";
		int loop=0;
		int entry=0;
		try {
	
			
	    for(int i=7;i<50;i++)
	    {
	    	 loop=i;
	    	String xpath="/html/body/table/tbody/tr["+i+"]/td[3]";
	    	if(entry==0) {
	    	if(checkelementpresent1(xpath)==true) 
	    	{
	    	WebElement ele0 = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[3]"));
			 String t1 = ele0.getText();
			 System.out.println(t1);
			 String T1= BasePage.readtransIDs("TransactionID1");
			if(t1.equals(T1))
	    	{
				
				 try {
					 entry=1;
					 WebElement ele4 = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[3]"));
					 actual4 = ele4.getText();
					 expected4 = "HAXAGONMYR - HAXAGON MYR FUND";
						//System.out.println(readTestData(data, excelName, Scenario));
						Assert.assertEquals(actual4, expected4);
						// Assert.assertTrue(actual.contains("Invalid Username"));
						test.log(Status.PASS,"Portfolio = Expected: " + expected4 + " <-----> Actual: " + actual4);		 
					 } catch (AssertionError e) {
							
							test.log(Status.FAIL,"Portfolio = Expected: " + expected4 + " <-----> Actual: " + actual4);
							//test.log(Status.FAIL,"Error in verifying Subscription/Redemption Details");
							e.printStackTrace();
							//reportFailure("Assertion Failed");
							takeScreenShot();
					
				    	}	
				
			
				 expected =T1;
				test.log(Status.PASS,"Trans Id 1 : " + t1);
				 try {
					 WebElement ele = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[9]"));
					 actual = ele.getText();
					// expected = readTestData("Units 1", ExcelFileName,"SubRed Report");
					 expected="10,000.4325";
						//System.out.println(readTestData(data, excelName, Scenario));
						Assert.assertEquals(actual, expected);
						// Assert.assertTrue(actual.contains("Invalid Username"));
						test.log(Status.PASS,"Units Subscription = Expected: " + expected + " <-----> Actual: " + actual);		 
					 } catch (AssertionError e) {
							
							test.log(Status.FAIL,"Units Subscription = Expected: " + expected + " <-----> Actual: " + actual);
							//test.log(Status.FAIL,"Error in verifying Subscription/Redemption Details");
							e.printStackTrace();
							//reportFailure("Assertion Failed");
							takeScreenShot();	
				    	}
				
				 i=i+1;
				 WebElement ele01 = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[3]"));
				 String t2 = ele01.getText();
				 test.log(Status.PASS,"Trans Id 2 : " + t2);
				 try {
					 WebElement ele02 = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[9]"));
					 actual02 = ele02.getText();
					// expected02 = readTestData("Units 2", ExcelFileName,"SubRed Report");
					 expected02="20,000.5768";
						//System.out.println(readTestData(data, excelName, Scenario));
						Assert.assertEquals(actual02, expected02);
						// Assert.assertTrue(actual.contains("Invalid Username"));
						test.log(Status.PASS,"Units Subscription = Expected: " + expected02 + " <-----> Actual: " + actual02);		 
					 } catch (AssertionError e) {
							
							test.log(Status.FAIL,"Units Subscription = Expected: " + expected02 + " <-----> Actual: " + actual02);
							//test.log(Status.FAIL,"Error in verifying Subscription/Redemption Details");
							e.printStackTrace();
							//reportFailure("Assertion Failed");
							takeScreenShot();	
				    	} 
				 i=i+1;
				 WebElement ele03 = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[3]"));
				 String t3 = ele03.getText();
				 test.log(Status.PASS,"Trans Id 3 : " + t3);
				 try {
					 WebElement ele04 = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[9]"));
					 actual04 = ele04.getText();
					 //expected04 = readTestData("(Units)", ExcelFileName,"Upload Subred");
					 expected04="(5,000.2849)";
						//System.out.println(readTestData(data, excelName, Scenario));
						Assert.assertEquals(actual04, expected04);
						// Assert.assertTrue(actual.contains("Invalid Username"));
						test.log(Status.PASS,"Units Redemption = Expected: " + expected04 + " <-----> Actual: " + actual04);		 
					 } catch (AssertionError e) {
							
							test.log(Status.FAIL,"Units Redemption = Expected: " + expected04 + " <-----> Actual: " + actual04);
							//test.log(Status.FAIL,"Error in verifying Subscription/Redemption Details");
							e.printStackTrace();
							//reportFailure("Assertion Failed");
							takeScreenShot();	
				    	} 
 
				i=i+1;
				WebElement ele1 = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[3]"));
				 actual1 = ele1.getText();
				 System.out.println(actual1);
				 Reading_id_Subred_report("/html/body/table/tbody/tr["+i+"]/td[3]", "TransactionID4");
				 test.log(Status.PASS,"Trans Id 4 : " + actual1);
				 try {
					 WebElement ele05 = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[9]"));
					 actual05 = ele05.getText();
					// expected05 = readTestData("Units", ExcelFileName,"Upload Subred");
					 expected05="10,500.4326";
						//System.out.println(readTestData(data, excelName, Scenario));
						Assert.assertEquals(actual05, expected05);
						// Assert.assertTrue(actual.contains("Invalid Username"));
						test.log(Status.PASS,"Units Subscription = Expected: " + expected05 + " <-----> Actual: " + actual05);		 
					 } catch (AssertionError e) {
							
							test.log(Status.FAIL,"Units Subscription = Expected: " + expected05 + " <-----> Actual: " + actual05);
							//test.log(Status.FAIL,"Error in verifying Subscription/Redemption Details");
							e.printStackTrace();
							//reportFailure("Assertion Failed");
							takeScreenShot();	
				    	} 
				 
				 
				 
				 i=i+1;
				 WebElement ele2 = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[3]"));
				 actual2 = ele2.getText();
				 Reading_id_Subred_report("/html/body/table/tbody/tr["+i+"]/td[3]", "TransactionID5");
				 test.log(Status.PASS,"Trans Id 5 : " + actual2);
				 try {
					 WebElement ele06 = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[9]"));
					 actual06 = ele06.getText();
					// expected06 = readTestData("Units 1", ExcelFileName,"Upload Subred");
					 expected06="20,500.5768";
						//System.out.println(readTestData(data, excelName, Scenario));
						Assert.assertEquals(actual06, expected06);
						// Assert.assertTrue(actual.contains("Invalid Username"));
						test.log(Status.PASS,"Units Subscription = Expected: " + expected06 + " <-----> Actual: " + actual06);		 
					 } catch (AssertionError e) {
							
							test.log(Status.FAIL,"Units Subscription = Expected: " + expected06 + " <-----> Actual: " + actual06);
							//test.log(Status.FAIL,"Error in verifying Subscription/Redemption Details");
							e.printStackTrace();
							//reportFailure("Assertion Failed");
							takeScreenShot();	
				    	} 
				 
						
				 i=i+1;
                 WebElement ele3 = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[3]"));
						 actual3 = ele3.getText();
						 Reading_id_Subred_report("/html/body/table/tbody/tr["+i+"]/td[3]", "TransactionID6");	
						 test.log(Status.PASS,"Trans Id 6 : " + actual3);
						 try {
							 WebElement ele07 = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[9]"));
							 actual07 = ele07.getText();
							// expected07 = readTestData("(Units 2)", ExcelFileName,"Upload Subred");
							 expected07="(5,500.2849)";
								//System.out.println(readTestData(data, excelName, Scenario));
								Assert.assertEquals(actual07, expected07);
								// Assert.assertTrue(actual.contains("Invalid Username"));
								test.log(Status.PASS,"Units Redemption = Expected: " + expected07 + " <-----> Actual: " + actual07);		 
							 } catch (AssertionError e) {
									
									test.log(Status.FAIL,"Units Redemption = Expected: " + expected07 + " <-----> Actual: " + actual07);
									//test.log(Status.FAIL,"Error in verifying Subscription/Redemption Details");
									e.printStackTrace();
									//reportFailure("Assertion Failed");
									takeScreenShot();	
						    	}  
						 
						 
						 
						 
						 
						 
	/*					 try {
						 WebElement ele4 = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[10]"));
						 actual4 = ele4.getText();
						 expected4 = readTestData("Closing Units", ExcelFileName,"SubRed Report");
							//System.out.println(readTestData(data, excelName, Scenario));
							Assert.assertEquals(actual4, expected4);
							// Assert.assertTrue(actual.contains("Invalid Username"));
							test.log(Status.PASS,"Closing Units = Expected: " + expected4 + " <-----> Actual: " + actual4);		 
						 } catch (AssertionError e) {
								
								test.log(Status.FAIL,"Closing Units = Expected: " + expected4 + " <-----> Actual: " + actual4);
								//test.log(Status.FAIL,"Error in verifying Subscription/Redemption Details");
								e.printStackTrace();
								//reportFailure("Assertion Failed");
								takeScreenShot();
						
					    	}
						 try {
							WebElement ele5 = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[12]"));
							 actual5 = ele5.getText();
							 expected5 = readTestData("Closing Capital", ExcelFileName,"SubRed Report");
								//System.out.println(readTestData(data, excelName, Scenario));
								Assert.assertEquals(actual5, expected5);
								// Assert.assertTrue(actual.contains("Invalid Username"));
								test.log(Status.PASS,"Closing Capital = Expected: " + expected5 + " <-----> Actual: " + actual5);
			}catch (AssertionError e) {
				
				test.log(Status.FAIL,"Closing Capital = Expected: " + expected5 + " <-----> Actual: " + actual5);
				//test.log(Status.FAIL,"Error in verifying Subscription/Redemption Details");
				e.printStackTrace();
				//reportFailure("Assertion Failed");
				takeScreenShot();
		
	    	}*/
						 }
			 
			    
			}
	    	
	   
	    }}
	    if(entry==0) {
	    	test.log(Status.FAIL,"Error in verifying Subscription/Redemption Details");
			
			//reportFailure("Assertion Failed");
			takeScreenShot();
	    	
	    }
	    }catch (Exception e) {
				
				test.log(Status.FAIL,"Error in verifying Subscription/Redemption Details");
				e.printStackTrace();
				//reportFailure("Assertion Failed");
				takeScreenShot();
			} catch (AssertionError e) {
				
				//test.log(Status.FAIL,"Expected: " + expected + " <-----> Actual: " + actual);
				test.log(Status.FAIL,"Error in verifying Subscription/Redemption Details");
				e.printStackTrace();
				//reportFailure("Assertion Failed");
				takeScreenShot();
		
	    	}
			
			
	    }
	public static void verifying_NavSummary(String excelName,String Scenario) throws Exception {
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
			
	
	    for(int i=24;i<40;i++)
	    {
	    	
	    	 loop=i;
	    	String xpath="/html/body/table/tbody/tr["+i+"]/td[1]";
	    	
	    	if(entry==0) {
	    	if(checkelementpresent1(xpath)==true) 
	    	{
	    	WebElement ele = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[1]"));
			 actual = ele.getText();
			 System.out.println(actual);
			 
			if(actual.equals("Total Units in Circulation"))
	    	{
				 
				entry=1;
				scrollintoview1("/html/body/table/tbody/tr["+i+"]/td[4]");
				String path="/html/body/table/tbody/tr["+i+"]/td[4]";
				WebElement ele1 = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td[4]"));
				 actual1 = ele1.getText();
				 System.out.println(actual1);
			//	 test.log(Status.PASS,"Total Units in Circulation : "+actual1 );
				 AssertExcel1(path, "Transaction Code 2", excelName, Scenario,"Total Units in Circulation : ");
				}
			
			
}}
	  
			}
	    }catch (Exception e) {
				
				test.log(Status.FAIL,"Error in verifying Nav Summary Report");
				e.printStackTrace();
				//reportFailure("Assertion Failed");
				takeScreenShot();
			} catch (AssertionError e) {
				
				//test.log(Status.FAIL,"Expected: " + expected + " <-----> Actual: " + actual);
				test.log(Status.FAIL,"Error in verifying Nav Summary Report");
				e.printStackTrace();
				//reportFailure("Assertion Failed");
				takeScreenShot();
		
	    	}
			
			
	    }
	
	public static void verifying_SettlementID(String data) throws Exception {
		int loop=0;
		int entry=0;
		try {
	
	    for(int i=1;i<50;i++)
	    {
	    	 loop=i;
	    	String xpath="//*[@id=\"tradebenefitsettlement\"]/div/div[2]/div/div/div/div/div[5]/div/div/table/tbody["+i+"]/tr[1]/td[17]/span";
	    	if(entry==0) {
	    	if(checkelementpresent1(xpath)==true) 
	    	{
	    	WebElement ele0 = driver.findElement(By.xpath("//*[@id=\"tradebenefitsettlement\"]/div/div[2]/div/div/div/div/div[5]/div/div/table/tbody["+i+"]/tr[1]/td[17]/span"));
			 String t1 = ele0.getText();
			 System.out.println(t1);
			 String T1= BasePage.readtransIDs(data);
			if(t1.equals(T1))
	    	{
				 try {
					 entry=1;
			        	//waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
					 Thread.sleep(5000);
			            WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[6]/div/div[37]/div/div[2]/div/div/div/div/div[5]/div/div/table/tbody["+i+"]/tr[1]/td[1]/input"));
			        	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			        	Thread.sleep(3000); 
			        } catch (Exception e) {
			            e.printStackTrace();
			            reportFailure("Error to Scroll the Page");
			        }
				 try {
					 
					 
					 WebElement ele4 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[6]/div/div[37]/div/div[2]/div/div/div/div/div[5]/div/div/table/tbody["+i+"]/tr[1]/td[1]/input"));
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
				
				test.log(Status.FAIL,"Error in identifying Trans ID");
				e.printStackTrace();
				//reportFailure("Assertion Failed");
				takeScreenShot();
			} catch (AssertionError e) {
				
				//test.log(Status.FAIL,"Expected: " + expected + " <-----> Actual: " + actual);
				test.log(Status.FAIL,"Error in identifying Trans ID");
				e.printStackTrace();
				//reportFailure("Assertion Failed");
				takeScreenShot();
		
	    	}
			
			
	    }
	public static void verifying_PartialSettlementID() throws Exception {
		int loop=0;
		int entry=0;
		try {
	
	    for(int i=1;i<50;i++)
	    {
	    	 loop=i;
	    	String xpath="//*[@id=\"tradebenefitsettlement\"]/div/div[2]/div/div/div/div/div[5]/div/div/table/tbody["+i+"]/tr[1]/td[17]/span";
	    	if(entry==0) {
	    	if(checkelementpresent1(xpath)==true) 
	    	{
	    	WebElement ele0 = driver.findElement(By.xpath("//*[@id=\"tradebenefitsettlement\"]/div/div[2]/div/div/div/div/div[5]/div/div/table/tbody["+i+"]/tr[1]/td[17]/span"));
			 String t1 = ele0.getText();
			 System.out.println(t1);
			 String T1= BasePage.readtransIDs("TransactionID4");
			if(t1.equals(T1))
	    	{
				 try {
					 entry=1;
					 Thread.sleep(5000);
			        	//waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
			            WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[6]/div/div[37]/div/div[2]/div/div/div/div/div[5]/div/div/table/tbody["+i+"]/tr[1]/td[1]/input"));
			        	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			        	Thread.sleep(3000); 
			        } catch (Exception e) {
			            e.printStackTrace();
			            reportFailure("Error to Scroll the Page");
			        }
				 try {
					 WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"tradebenefitsettlement\"]/div/div[2]/div/div/div/div/div[5]/div/div/table/tbody["+i+"]/tr[1]/td[9]/span"));
					 ele1.click();
					 Thread.sleep(3000);
					 
					 WebElement element = driver.findElement(By.xpath("//*[@id=\"tradebenefitsettlement\"]/div/div[2]/div/div/div/div/div[5]/div/div/table/tbody["+i+"]/tr[2]/td/div/div[1]/div/div[1]/div[3]/input"));
				        while(!element.getAttribute("value").equals("")){
				        	element.click();
				            element.sendKeys(Keys.BACK_SPACE);
				            Thread.sleep(3000);}
				            
					 
					 WebElement ele = driver.findElement(By.xpath("//*[@id=\"tradebenefitsettlement\"]/div/div[2]/div/div/div/div/div[5]/div/div/table/tbody["+i+"]/tr[2]/td/div/div[1]/div/div[1]/div[3]/input"));
					 ele.sendKeys("5250");
					 Thread.sleep(3000);
					 
					 test.log(Status.INFO, "Click on Checkbox");
					 WebElement ele4 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[6]/div/div[37]/div/div[2]/div/div/div/div/div[5]/div/div/table/tbody["+i+"]/tr[1]/td[1]/input"));
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
				
				test.log(Status.FAIL,"Error in identifying Trans ID");
				e.printStackTrace();
				//reportFailure("Assertion Failed");
				takeScreenShot();
			} catch (AssertionError e) {
				
				//test.log(Status.FAIL,"Expected: " + expected + " <-----> Actual: " + actual);
				test.log(Status.FAIL,"Error in identifying Trans ID");
				e.printStackTrace();
				//reportFailure("Assertion Failed");
				takeScreenShot();
		
	    	}
			
			
	    }
	    
	    
	

	public static String readTestDataProp(String key) {
		String filename = "AssertTestData";
		try {

			String path = System.getProperty("user.dir") + "/testdata/AssertTestData.properties";
			if (path == null || path.length() == 0) {
				path = System.getProperty("user.dir") + "/testdata/" + filename + ".properties";
			}
			Properties p = new Properties();
			FileInputStream fs = new FileInputStream(path);
			p.load(fs);
			return (String) p.get(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportFailure("Error: " + filename + " file not found");
			System.out.println("Error: " + filename + " file not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void AssertProp(String xpath, String testData) {
		try {
			waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
			WebElement ele = driver.findElement(By.xpath(readobjectRepo(xpath)));
			String actual = ele.getText();
			String expected = readTestDataProp(testData);
			Assert.assertEquals(actual, expected);
			// Assert.assertTrue(actual.contains("Invalid Username"));
			test.log(Status.PASS,"Expected: " + expected + " <-----> Actual: " + actual);
		} catch (Exception e) {
			e.printStackTrace();
			reportFailure("Assertion Failed");
		} catch (AssertionError e) {
			e.printStackTrace();
			reportFailure("Assertion Failed");
		}
	}

	public static void AssertExcel(String key, String data, String excelName,String Scenario) throws Exception, IOException, InterruptedException{
		String actual="";
		String expected="";
		try {
			waitForPresenceAndVisibilityOfElementry(readobjectRepo(key));
			WebElement ele = driver.findElement(By.xpath(readobjectRepo(key)));
			 actual = ele.getText();
			 expected = readTestData(data, excelName,Scenario);
			System.out.println(readTestData(data, excelName, Scenario));
			Assert.assertEquals(actual, expected);
			// Assert.assertTrue(actual.contains("Invalid Username"));
			test.log(Status.PASS,BasePage.Asserttext+" = Expected: " + expected + " <-----> Actual: " + actual);
		} catch (Exception e) {
			
			test.log(Status.FAIL,BasePage.Asserttext+" = Expected: " + expected + " <-----> Actual: " + actual);
			e.printStackTrace();
			//reportFailure("Assertion Failed");
			takeScreenShot();
		} catch (AssertionError e) {
			
			test.log(Status.FAIL,BasePage.Asserttext+" = Expected: " + expected + " <-----> Actual: " + actual);
			e.printStackTrace();
			//reportFailure("Assertion Failed");
			takeScreenShot();
		}
	}
	public static void AssertExcel2(String key, String data, String excelName,String Scenario,String Title) throws Exception, IOException, InterruptedException{
		String actual="";
		String expected="";
		try {
			expected = readTestData(data, excelName,Scenario);
			waitForPresenceAndVisibilityOfElementry(readobjectRepo(key));
			WebElement ele = driver.findElement(By.xpath(readobjectRepo(key)));
			 actual = ele.getText();
			 
			System.out.println(readTestData(data, excelName, Scenario));
			Assert.assertEquals(actual, expected);
			// Assert.assertTrue(actual.contains("Invalid Username"));
			test.log(Status.PASS,Title+" = Expected: " + expected + " <-----> Actual: " + actual);
		} catch (Exception e) {
			
			test.log(Status.FAIL,Title+" = Expected: " + expected + " <-----> Actual: " + actual);
			e.printStackTrace();
			//reportFailure("Assertion Failed");
			takeScreenShot();
		} catch (AssertionError e) {
			
			test.log(Status.FAIL,Title+" = Expected: " + expected + " <-----> Actual: " + actual);
			e.printStackTrace();
			//reportFailure("Assertion Failed");
			takeScreenShot();
		}
	}
	
	public static void AssertExcel1(String key, String data, String excelName,String Scenario,String Title) throws Exception, IOException, InterruptedException{
		String actual="";
		String expected="";
		try {
			expected = readTestData(data, excelName,Scenario);
			waitForPresenceAndVisibilityOfElementry((key));
			WebElement ele = driver.findElement(By.xpath((key)));
			 actual = ele.getText();
			 
			System.out.println(readTestData(data, excelName, Scenario));
			Assert.assertEquals(actual, expected);
			// Assert.assertTrue(actual.contains("Invalid Username"));
			test.log(Status.PASS,Title+" = Expected: " + expected + " <-----> Actual: " + actual);
		} catch (Exception e) {
			
			test.log(Status.FAIL,Title+" = Expected: " + expected + " <-----> Actual: " + actual);
			e.printStackTrace();
			//reportFailure("Assertion Failed");
			takeScreenShot();
		} catch (AssertionError e) {
			
			test.log(Status.FAIL,Title+" = Expected: " + expected + " <-----> Actual: " + actual);
			e.printStackTrace();
			//reportFailure("Assertion Failed");
			takeScreenShot();
		}
	}
	
	public static void AssertTransID(String key) throws Exception, IOException, InterruptedException{
		String actual="";
		String expected="";
		try {
			waitForPresenceAndVisibilityOfElementry(readobjectRepo(key));
			WebElement ele = driver.findElement(By.xpath(readobjectRepo(key)));
			 actual = ele.getText();
			// expected = readTestData(data, excelName,Scenario);
			//System.out.println(readTestData(data, excelName, Scenario));
			Assert.assertEquals(actual, readtransIDs("TransactionID5"));
			// Assert.assertTrue(actual.contains("Invalid Username"));
			test.log(Status.PASS,"Transaction ID = Expected: " + readtransIDs("TransactionID5") + " <-----> Actual: " + actual);
		} catch (Exception e) {
			
			test.log(Status.FAIL,"Transaction ID = Expected: " + readtransIDs("TransactionID5") + " <-----> Actual: " + actual);
			e.printStackTrace();
			takeScreenShot();
			//reportFailure("Assertion Failed");
		} catch (AssertionError e) {
			
			test.log(Status.FAIL,"Trans ID = Expected: " + readtransIDs("TransactionID5") + " <-----> Actual: " + actual);
			e.printStackTrace();
			takeScreenShot();
			//reportFailure("Assertion Failed");
		}
	}
	
	public static void Reading_id(String key,String Title) throws Exception, IOException, InterruptedException{
	    Transid="";
	    FileOutputStream fileOut = null;
        FileInputStream fileIn = null;
		try {
			waitForPresenceAndVisibilityOfElementry(readobjectRepo(key));
			WebElement ele = driver.findElement(By.xpath(readobjectRepo(key)));
			 Transid = ele.getText();
			 
			
			// Assert.assertTrue(actual.contains("Invalid Username"));
			test.log(Status.PASS,Title+" = "+Transid);
		
			 String path = System.getProperty("user.dir") + "/testdata/TransactionIDs.properties";
	     
	        
			 Properties configProperty = new Properties();

	            File file = new File(path);
	            fileIn = new FileInputStream(file);
	            configProperty.load(fileIn);
	            configProperty.setProperty(Title, Transid);
	            fileOut = new FileOutputStream(file);
	            configProperty.store(fileOut, "Transaction IDs");   
			
			
		} catch (Exception e) {
			
			test.log(Status.FAIL,"Error in Reading Trans ID");
			e.printStackTrace();
			takeScreenShot();
			//reportFailure("Assertion Failed");
		} catch (AssertionError e) {
			
			test.log(Status.FAIL, "Error in reading Trans ID");
			e.printStackTrace();
			takeScreenShot();
			//reportFailure("Assertion Failed");
		}
	}
	
	public static void Reading_id_Subred_report(String key,String Title) throws Exception, IOException, InterruptedException{
	    Transid="";
	    FileOutputStream fileOut = null;
        FileInputStream fileIn = null;
		try {
			waitForPresenceAndVisibilityOfElementry((key));
			WebElement ele = driver.findElement(By.xpath(key));
			 Transid = ele.getText();
			 
			
			// Assert.assertTrue(actual.contains("Invalid Username"));
			//test.log(Status.PASS,Title+" = "+Transid);
		
			 String path = System.getProperty("user.dir") + "/testdata/TransactionIDs.properties";
	     
	        
			 Properties configProperty = new Properties();

	            File file = new File(path);
	            fileIn = new FileInputStream(file);
	            configProperty.load(fileIn);
	            configProperty.setProperty(Title, Transid);
	            fileOut = new FileOutputStream(file);
	            configProperty.store(fileOut, "Transaction IDs");   
			
			
		} catch (Exception e) {
			
			test.log(Status.FAIL,"Error in Reading Trans ID");
			e.printStackTrace();
			takeScreenShot();
			//reportFailure("Assertion Failed");
		} catch (AssertionError e) {
			
			test.log(Status.FAIL, "Error in reading Trans ID");
			e.printStackTrace();
			takeScreenShot();
			//reportFailure("Assertion Failed");
		}
	}
	
	public static void enterText(String key, String data, String excelName,String Scenario)throws Exception, IOException, InterruptedException {
		try {
			System.out.println(key);
			checkelementpresent(readobjectRepo(key));
            
		//	waitForPresenceAndVisibilityOfElementry(readobjectRepo(key));
			WebElement ele = driver.findElement(By.xpath(readobjectRepo(key)));
			 ele.click();
			ele.clear();
			Thread.sleep(1000);
			ele.sendKeys(readTestData(data, excelName,Scenario));
			System.out.println(readTestData(data, excelName,Scenario));
			test.log(Status.PASS, "Entering data '" + readTestData(data, excelName,Scenario) + "' is successful");
			
		//	Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
			reportFailure("Click on element is unsuccessful");
		}
	}
	public static void enterText1(String key, String data, String excelName,String Scenario)throws Exception, IOException, InterruptedException {
		try {
			System.out.println(key);
			checkelementpresent(readobjectRepo(key));
            
		//	waitForPresenceAndVisibilityOfElementry(readobjectRepo(key));
			WebElement ele = driver.findElement(By.xpath(readobjectRepo(key)));
			 ele.click();
			ele.clear();
			Thread.sleep(1000);
			ele.sendKeys(readTestData(data, excelName,Scenario));
			System.out.println(readTestData(data, excelName,Scenario));
			//test.log(Status.PASS, "Entering data '" + readTestData(data, excelName,Scenario) + "' is successful");
	//		Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			//reportFailure("Click on element is unsuccessful");
		}
	}
	public static void enterText_TransId(String key, String data)throws Exception, IOException, InterruptedException {
		try {
			checkelementpresent(readobjectRepo(key));
            
		//	waitForPresenceAndVisibilityOfElementry(readobjectRepo(key));
			WebElement ele = driver.findElement(By.xpath(readobjectRepo(key)));
			if(readtransIDs(data)=="")
            {
				
				reportFailure("Enter Transaction ID is unsuccessful");
            }
			else
			 ele.click();
			ele.clear();
			Thread.sleep(2000);
			
			ele.sendKeys(readtransIDs(data));
			test.log(Status.PASS, "Entering data '" + readtransIDs(data) + "' is successful");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			reportFailure("Enter Transaction ID is unsuccessful");
		}
	}
	public static void upload_file(String key)throws Exception, IOException, InterruptedException {
		try {
			//checkelementpresent(readobjectRepo(key));
			//waitForPresenceAndVisibilityOfElementry(readobjectRepo(key));
			
			
			String path = readURLTestDataProp(key);
		//	String path = "C:\Users\vinot\Downloads\Upload Portfolio Subred(UNSAL,UNPUR)\Subred_RHB_BackDate.xls";
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			 js.executeScript("document.getElementById('upload-file').style.display = 'block';");   
			 driver.findElement(By.id("upload-file")).sendKeys(path); 
			 js.executeScript("document.getElementById('upload-file').style.display = 'none';");
			//System.out.println();
			test.log(Status.PASS, "Uploading Subred Excel File is successful");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			reportFailure("Uploading Subred Excel File is unsuccessful");
		}
	}

	public static void enterTransID(String key)throws Exception, IOException, InterruptedException {
		try {
			waitForPresenceAndVisibilityOfElementry(readobjectRepo(key));
			WebElement ele = driver.findElement(By.xpath(readobjectRepo(key)));
			 ele.click();
			ele.clear();
			Thread.sleep(1000);
			ele.sendKeys(Transid);
			test.log(Status.PASS, "Entering data '" + Transid + "' is successful");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
			reportFailure("Click on element is unsuccessful");
		}
	}

	public static void reportFailure(String failureMessage) {
		try {
			test.log(Status.FAIL, failureMessage);
			passfailscreenshots();
			//takeScreenShot();
			Assert.fail(failureMessage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void passfailscreenshots() throws Exception {
	
		String screenshotname="."+takeScreenShot();
		screencapture("Fail Screenshot",screenshotname);
	}
	
	public static Object screencapture(String log,String imgpath) throws IOException {
	
		test.log(Status.INFO, log, MediaEntityBuilder.createScreenCaptureFromPath(imgpath).build());
		return test;
	}

	public static String takeScreenShot() throws Exception {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots" under src
		// folder
		String destination = "./extentreports/screenshots/" + dateName + ".png";
	//	String destination = System.getProperty("user.dir") + "/extentreports/screenshots/" + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		// test.log(Status.FAIL, "Failed Case is: " );
	//	test.addScreenCaptureFromPath(destination);
		
		InputStream is = new FileInputStream(destination);
		byte[] ssBytes=IOUtils.toByteArray(is);
		String base64=Base64.getEncoder().encodeToString(ssBytes);
		
	
		return destination;
		
	}
	
	

	 public static void clearWebField(String xpath) throws IOException, Exception{
		 try {
    	 waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
            WebElement element = driver.findElement(By.xpath(readobjectRepo(xpath)));
        while(!element.getAttribute("value").equals("")){
        	element.click();
            element.sendKeys(Keys.BACK_SPACE);
            Thread.sleep(2000);
        }}
		 catch(Exception e) {
			 e.printStackTrace();
	            reportFailure("Error in clearing Web field");
		 }
    }
	 
	 public static void clear(String xpath) throws IOException, Exception{
    	 waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
            WebElement element = driver.findElement(By.xpath(readobjectRepo(xpath)));
       element.clear();
        }
	 
	 
	 public static void scroll_dropdown(String xpath) throws IOException, Exception{
		 JavascriptExecutor je = (JavascriptExecutor) driver;
         WebElement element = driver.findElement(By.xpath(readobjectRepo(xpath)));
         je.executeScript("arguments[0].scrollIntoView(true);",element);
         Thread.sleep(3000);
	 }
	
	public static String readURLTestDataProp(String key) {
		String filename = "URLTestData";
		try {

			String path = System.getProperty("user.dir") + "/testdata/URLTestData.properties";
			if (path == null || path.length() == 0) {
				path = System.getProperty("user.dir") + "/testdata/" + filename + ".properties";
			}
			Properties p = new Properties();
			FileInputStream fs = new FileInputStream(path);
			p.load(fs);
			return (String) p.get(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			reportFailure("Error: " + filename + " file not found");
			System.out.println("Error: " + filename + " file not found");
			//System.exit(1);
		} catch (IOException e) {
			e.printStackTrace();
			// reportFailure("");
		}
		return null;
	}

	  public static void scrollintoview(String xpath) throws IOException, InterruptedException {
	        try {
	        	waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
	            WebElement element = driver.findElement(By.xpath(readobjectRepo(xpath)));
	        	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	        	Thread.sleep(500); 
	        } catch (Exception e) {
	            e.printStackTrace();
	           // reportFailure("Click on element is unsucessful");
	        }
	    }
	  public static void scrollintoview1(String xpath) throws IOException, InterruptedException {
	        try {
	        	//waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
	            WebElement element = driver.findElement(By.xpath((xpath)));
	        	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	        	Thread.sleep(500); 
	        } catch (Exception e) {
	            e.printStackTrace();
	           // reportFailure("Click on element is unsucessful");
	        }
	    }
	  
	  public static void scrollintoview_right() throws IOException, InterruptedException {
	        try {
	        	WebElement myElement = (new WebDriverWait(driver, 30))
	                    .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[7]/div/div[4]/div/div[2]/div/div/div/div[7]/div[3]/div[2]")));
	            myElement.click();
	            Actions move = new Actions(driver);
	            move.moveToElement(myElement).clickAndHold();
	            move.moveByOffset(500,0);
	            move.release();
	            move.perform();	} catch (Exception e) {
	            e.printStackTrace();
	           // reportFailure("Click on element is unsucessful");
	        }
	    }
	  
	  
	  public static void horizontalRight() throws IOException, Exception{
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(2000,0)");
	        }
	  
	  
	  public static void AssertExcel_ByreadingTextbox(String key, String data, String excelName,String Scenario,String Title) throws Exception, IOException, InterruptedException{
			
		  String actual="";
		  String expected="";
				try {
					JavascriptExecutor js = (JavascriptExecutor) driver;  
					  waitForPresenceAndVisibilityOfElementry(readobjectRepo(key));
				      WebElement element = driver.findElement(By.xpath(readobjectRepo(key)));
				      String text = (String) js.executeScript("return arguments[0].value", element);
				      System.out.println(text);
					 actual = text;
					 expected = readTestData(data, excelName,Scenario);
					System.out.println(readTestData(data, excelName,Scenario));
					Assert.assertEquals(actual, expected);
					// Assert.assertTrue(actual.contains("Invalid Username"));
					test.log(Status.PASS,Title+" = Expected: " + expected + " <-----> Actual: " + actual);
				} catch (Exception e) {
					
					test.log(Status.FAIL,Title+" = Expected: " + expected + " <-----> Actual: " + actual);
					e.printStackTrace();
					//reportFailure("Assertion Failed");
					takeScreenShot();
				} catch (AssertionError e) {
					
					test.log(Status.FAIL,Title+" = Expected: " + expected + " <-----> Actual: " + actual);
					e.printStackTrace();
					//reportFailure("Assertion Failed");
					takeScreenShot();
				}
			}
	  
	  public static void AssertText(String xpath) throws Exception {
		  try{waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
			WebElement ele = driver.findElement(By.xpath(readobjectRepo(xpath)));
		   Asserttext=ele.getText();
		   
		  }
		  catch(Exception e) {
			  test.log(Status.FAIL, "Error in get text");
		  }
			
		  }
	  
	  public static void reading_textbox(String xpath) throws Exception {
	  JavascriptExecutor js = (JavascriptExecutor) driver;  
	  waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
      WebElement element = driver.findElement(By.xpath(readobjectRepo(xpath)));
      String text = (String) js.executeScript("return arguments[0].value", element);
      System.out.println(text);
	  }
	  
	 /* public static Map<String, Map<String, String>> setMapData_columnwise(String excelName,String Scenario) throws IOException {
			String path = excelName;
			Map<String, Map<String, String>> excelFileMap = null;
			try {
				FileInputStream fis = new FileInputStream(path);
				Workbook workbook = new XSSFWorkbook(fis);
				Sheet sheet = workbook.getSheet("Data");
				int lastRow = sheet.getLastRowNum();
				System.out.println(lastRow);
				int noOfColumns = sheet.getRow(0).getLastCellNum();
				System.out.println(noOfColumns);
				excelFileMap = new HashMap<String, Map<String, String>>();
				int yesCount = 0;
				String cellValue = "";
				int c=0;
				LinkedHashMap<String, String> dataMap = new LinkedHashMap<String, String>();	
				for(int columnIndex=0;columnIndex<noOfColumns;columnIndex++)
					{					
					Row row1 = sheet.getRow(0);
					Cell cell1 = CellUtil.getCell(row1, columnIndex );
						
					 if (cell1.getCellType() == CellType.STRING) {
							cellValue = cell1.getStringCellValue().trim();
							System.out.println("string :"+cellValue);
							if(Scenario.equals(cellValue))
							{
							   c=columnIndex;
								 System.out.println("string" + columnIndex);
							}
					 }					 
					 else if (cell1.getCellType() == CellType.BLANK) {
							cellValue = "" ;
						   c= columnIndex;
						System.out.println("string"+cellValue);
						System.out.println("blank" + columnIndex);
					}	
					for (int rowIndex = 0; rowIndex <= lastRow; rowIndex++) {
						Row row = sheet.getRow(rowIndex);
						System.out.println("CI :"+c);
						
						//System.out.println(row);
						
						Cell cell = CellUtil.getCell(row, c);
						
						if (cell.getCellType() == CellType.NUMERIC) {
							cellValue = convertingtodouble(cell.getNumericCellValue());
							//cellValue = cell.getNumericCellValue();
                          System.out.println(cellValue);
						}
					 if (cell.getCellType() == CellType.STRING) {
							cellValue = cell.getStringCellValue().trim();
							System.out.println(cellValue);
						}else if (cell.getCellType() == CellType.BLANK) {
							cellValue = "" ;
							System.out.println(cellValue);
							//test.log(Status.FAIL,"The excel cell is blank: "+dataMap.keySet().toArray()[rowIndex].toString());						
						}

						if (columnIndex == 0) {
							dataMap.put(cellValue, "");
							System.out.println("Done key");
						} else {
							dataMap.put(dataMap.keySet().toArray()[rowIndex].toString(), cellValue);

						}
					}
					}
				
				excelFileMap.put("Data", dataMap);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				test.log(Status.FAIL, "Error: " + path + " file not found");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return excelFileMap;
		}*/

		// Method to retrieve value
		public static String readTestData(String key, String excelName,String Scenario) throws IOException {
			Map<String, String> m = setMapData2(excelName,Scenario).get("Data");
			String value = m.get(key);
			return value;
		}
	 
		 public static Map<String, Map<String, String>> setMapData2(String excelName,String Scenario) throws IOException {
				String path = excelName;
				Map<String, Map<String, String>> excelFileMap = null;
				try {
					FileInputStream fis = new FileInputStream(path);
					Workbook workbook = new XSSFWorkbook(fis);
					Sheet sheet = workbook.getSheet("Data");
					int lastRow = sheet.getLastRowNum();
				//	System.out.println(lastRow);
					int noOfColumns = sheet.getRow(0).getLastCellNum();
				//	System.out.println(noOfColumns);
					excelFileMap = new HashMap<String, Map<String, String>>();
					int yesCount = 0;
					String cellValue = "";
					int c=0;
					LinkedHashMap<String, String> dataMap = new LinkedHashMap<String, String>();	
					for(int columnIndex=0;columnIndex<=lastRow;columnIndex++)
						{					
						Row row1 = sheet.getRow(columnIndex);
						Cell cell1 = CellUtil.getCell(row1, 0 );
							
						 if (cell1.getCellType() == CellType.STRING) {
								cellValue = cell1.getStringCellValue().trim();
								//System.out.println("string :"+cellValue);
								if(Scenario.equals(cellValue))
								{
								   c=columnIndex;
								//	 System.out.println("string" + columnIndex);
								}
						 }					 
						 else if (cell1.getCellType() == CellType.BLANK) {
								cellValue = "" ;
							   c= columnIndex;
						//	System.out.println("string"+cellValue);
						//	System.out.println("blank" + columnIndex);
						}	
						for (int rowIndex = 0; rowIndex <noOfColumns ; rowIndex++) {
							Row row = sheet.getRow(c);
						//	System.out.println("CI :"+c);
							
							//System.out.println(row);
							
							Cell cell = CellUtil.getCell(row,rowIndex );
							
							if (cell.getCellType() == CellType.NUMERIC) {
								cellValue = convertingtodouble(cell.getNumericCellValue());
								//cellValue = cell.getNumericCellValue();
	                        //  System.out.println(cellValue);
							}
						 if (cell.getCellType() == CellType.STRING) {
								cellValue = cell.getStringCellValue().trim();
							//	System.out.println(cellValue);
							}else if (cell.getCellType() == CellType.BLANK) {
								cellValue = "" ;
							//	System.out.println(cellValue);
								//test.log(Status.FAIL,"The excel cell is blank: "+dataMap.keySet().toArray()[rowIndex].toString());						
							}

							if (columnIndex == 0) {
								dataMap.put(cellValue, "");
							//	System.out.println("Done key");
							} else {
								dataMap.put(dataMap.keySet().toArray()[rowIndex].toString(), cellValue);

							}
						}
						}
					
					excelFileMap.put("Data", dataMap);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					test.log(Status.FAIL, "Error: " + path + " file not found");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				return excelFileMap;
			}
		
		 public static void saveExcel(String key)  {
	    	 try {
	    		 
	    		 String path = readURLTestDataProp(key);
	    	//	 String path = System.getProperty("user.dir") + "/Uploads/Subred_RHB_CurrentDate.xls";
	    	  FileInputStream fis =new FileInputStream(path);
	    	    
	    	   	Workbook WorkBook= new HSSFWorkbook(fis);

	    	   //    Sheet readable_sheet= WorkBook.getSheet("MIG035-Subred");
	    	       
	    	  //     int lastRow = readable_sheet.getLastRowNum();

	    	         FileOutputStream writable_Excel= new FileOutputStream(path);

	                 WorkBook.write(writable_Excel);
	                 
	                 writable_Excel.close();
	                 
	                 System.out.println("File Saved");
	    		      }
	    			 		
	    				        catch (Exception e) {
	    						    e.printStackTrace();
	    						}
		 }	
		 
		 public static void zip() {
		        String sourceFolder = "D:\\Hexagram_RHBT\\extentreports";
		        String zipFilePath = "D:\\Hexagram_RHBT\\extentreports.zip";

		        try {
		            zipFolder(sourceFolder, zipFilePath);
		            System.out.println("Folder successfully compressed to a zip file.");
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }

		    public static void zipFolder(String sourceFolder, String zipFilePath) throws IOException {
		        FileOutputStream fos = new FileOutputStream(zipFilePath);
		        ZipOutputStream zos = new ZipOutputStream(fos);

		        File folder = new File(sourceFolder);
		        zipFiles(folder, folder.getName(), zos);

		        zos.close();
		        fos.close();
		    }

		    private static void zipFiles(File folder, String parentFolder, ZipOutputStream zos) throws IOException {
		        for (File file : folder.listFiles()) {
		            if (file.isDirectory()) {
		                zipFiles(file, parentFolder + "/" + file.getName(), zos);
		                continue;
		            }

		            ZipEntry zipEntry = new ZipEntry(parentFolder + "/" + file.getName());
		            zos.putNextEntry(zipEntry);

		            FileInputStream fis = new FileInputStream(file);
		            byte[] buffer = new byte[1024];
		            int length;
		            while ((length = fis.read(buffer)) > 0) {
		                zos.write(buffer, 0, length);
		            }

		            fis.close();
		            zos.closeEntry();
		        }
		    }
	  
}
