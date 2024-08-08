package com.Hexagon.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
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

import com.Hexagon.pom.pages.LoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.LogStatus;

public class BasePage extends BaseProjectMethods {
	
	public static String Asserttext;
	public static String Transid;
	public static String ExcelFileName = BasePage.readURLTestDataProp("HexagonEquityData");
	

	public static String readobjectRepo(String key) {
		String filename = "ObjectRepo";
		try {

			String path = System.getProperty("user.dir") + "/testdata/ObjectRepo.properties";
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
			waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
			WebElement ele = driver.findElement(By.xpath(readobjectRepo(xpath)));
//	            test.log(Status.PASS, "Click on  '" + ele.getText() + "' is successful");
			ele.click();
	//		Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		//	reportFailure("Click on element unsuccessful");
		}
	}

	
	
	
	
	
	
	 public static void click_login(String xpath) throws IOException, InterruptedException {
	        try {
	            waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
	            WebElement ele = driver.findElement(By.xpath(readobjectRepo(xpath)));
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
	            ele.click();
	           Thread.sleep(1800);
	        } catch (Exception e) {
	            e.printStackTrace();
	            reportFailure("Click on element is unsuccessful");
	        }
	    }
	    
	    public static void click_hexgendash(String xpath) throws IOException, InterruptedException {
	        try {
	        	checkelementpresent(readobjectRepo(xpath));
	         //   waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
	            WebElement ele = driver.findElement(By.xpath(readobjectRepo(xpath)));
	            if(ele.getText()=="")
	            {
	            	//test.log(Status.PASS, "Click on  '" + EquityBUYPage.text + "' is successful");
	            }
	            else
	            {
	            test.log(Status.PASS, "Click on  '" + ele.getText() + "' is successful");
	            }
	            ele.click();
	      //      Thread.sleep(1800);
	        } catch (Exception e) {
	            e.printStackTrace();
	            reportFailure("Click on element is unsuccessful");
	        }
	    }
	    
	    public static void click_hexgendash3(String xpath) throws IOException, InterruptedException {
	        try {
	        //	checkelementpresent(readobjectRepo(xpath));
	         //   waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
	        	 Thread.sleep(1800);
	            WebElement ele = driver.findElement(By.cssSelector(readobjectRepo(xpath)));
	            if(ele.getText()=="")
	            {
	            	//test.log(Status.PASS, "Click on  '" + EquityBUYPage.text + "' is successful");
	            }
	            else
	            {
	            test.log(Status.PASS, "Click on  '" + ele.getText() + "' is successful");
	            }
	            ele.click();
	      //      Thread.sleep(1800);
	        } catch (Exception e) {
	            e.printStackTrace();
	            reportFailure("Click on element is unsuccessful");
	        }
	    }
	public static void select(String xpath) throws IOException, InterruptedException {
        try {
            waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
            WebElement ele = driver.findElement(By.xpath(readobjectRepo(xpath)));
            test.log(Status.PASS, "Selection of '" + ele.getText() + "' is successful");
            ele.click();
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
		WebDriverWait wait = new WebDriverWait(driver, 50);
		List<WebElement> ele;
		
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(value)));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
			ele = driver.findElements(By.xpath(value));
			if (ele.size() == 1) {
				status = true;
			
		} 
		return status;
	}
	
	public static boolean waitForPresenceAndVisibilityOfElementry1(String value) throws Exception {
		boolean status = false;
		WebDriverWait wait = new WebDriverWait(driver, 5);
		List<WebElement> ele;
		
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(value)));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
			ele = driver.findElements(By.xpath(value));
			if (ele.size() == 1) {
				status = true;
			
		} 
		return status;
	}


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
	
	public static void switchWindow() throws Exception {
		try {
			
			// Store all currently open tabs in tabs
			
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

			// Switch newly open Tab
			driver.switchTo().window(tabs.get(1));

			// Close newly open tab after performing some operations.
			

			// Switch to old(Parent) tab.
		//	driver.switchTo().window(tabs.get(0));
	    
	    }catch(Exception e) {
	    	test.log(Status.FAIL, "Error in switch tab");
	    	takeScreenShot();
	    	}
	    }
	public static boolean checkelementpresent(String xpath) throws IOException, Exception {
    	try{
    		System.out.println(xpath);
    		waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
    	boolean t = driver.findElement(By.xpath(readobjectRepo(xpath))).isDisplayed();
    
    	System.out.println(t);
        if (t==true) {
       
           System.out.println("Element is dispalyed");
           return true;
        } else {
        	System.out.println(t);
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
    		waitForPresenceAndVisibilityOfElementry1(readobjectRepo(xpath));
    	boolean t = driver.findElement(By.xpath(readobjectRepo(xpath))).isDisplayed();
    
    	System.out.println(t);
        if (t==true) {
       
           System.out.println("Element is dispalyed");
           return true;
        } else {
        	System.out.println(t);
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
	    	if(checkelementpresent(xpath)==true) 
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
			waitForPresenceAndVisibilityOfElementry(readobjectRepo(key));
			WebElement ele = driver.findElement(By.xpath(readobjectRepo(key)));
			 actual = ele.getText();
			 expected = readTestData(data, excelName,Scenario);
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
	
	public static void AssertExcel1(String key, String data, String excelName,String Scenario) throws Exception, IOException, InterruptedException{
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
			test.log(Status.PASS,"Expected: " + expected + " <-----> Actual: " + actual);
		} catch (Exception e) {
			
			test.log(Status.FAIL,"Expected: " + expected + " <-----> Actual: " + actual);
			e.printStackTrace();
			takeScreenShot();
			//reportFailure("Assertion Failed");
		} catch (AssertionError e) {
			
			test.log(Status.FAIL,"Expected: " + expected + " <-----> Actual: " + actual);
			e.printStackTrace();
			takeScreenShot();
			//reportFailure("Assertion Failed");
		}
	}
	public static void switchTab() throws Exception {
		try {
			
			// Store all currently open tabs in tabs
			Thread.sleep(5000);
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

			// Switch newly open Tab
			driver.switchTo().window(tabs.get(2));
			
			
              Thread.sleep(3000);
			// Close newly open tab after performing some operations.
			

			// Switch to old(Parent) tab.
		//	driver.switchTo().window(tabs.get(0));
	    
	    }catch(Exception e) {
	    	test.log(Status.FAIL, "Error in switch tab");
	    	takeScreenShot();
	    	}
	    }
	
	
	public static void CloseTab() throws Exception {
		try {
			
			// Store all currently open tabs in tabs
			
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

			// Switch newly open Tab
			driver.switchTo().window(tabs.get(2));

			// Close newly open tab after performing some operations.
			driver.close();

			// Switch to old(Parent) tab.
			driver.switchTo().window(tabs.get(1));
			System.out.println("Jumped to 1st Window");
	    
	    }catch(Exception e) {
	    	test.log(Status.FAIL, "Error in Close tab");
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
			Assert.assertEquals(actual, Transid);
			// Assert.assertTrue(actual.contains("Invalid Username"));
			test.log(Status.PASS,"Trans ID = Expected: " + Transid + " <-----> Actual: " + actual);
		} catch (Exception e) {
			
			test.log(Status.FAIL,"Trans ID = Expected: " + Transid + " <-----> Actual: " + actual);
			e.printStackTrace();
			takeScreenShot();
			//reportFailure("Assertion Failed");
		} catch (AssertionError e) {
			
			test.log(Status.FAIL,"Trans ID = Expected: " + Transid + " <-----> Actual: " + actual);
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
	
	public static void enterText(String key, String data, String excelName,String Scenario)throws Exception, IOException, InterruptedException {
		try {
			checkelementpresent(readobjectRepo(key));
            
		//	waitForPresenceAndVisibilityOfElementry(readobjectRepo(key));
			WebElement ele = driver.findElement(By.xpath(readobjectRepo(key)));
			 ele.click();
			ele.clear();
		//	Thread.sleep(1000);
			ele.clear();
			ele.clear();
			ele.clear();
		//	Thread.sleep(1000);
			ele.click();
            ele.sendKeys(Keys.BACK_SPACE);

			Thread.sleep(2000);
			ele.sendKeys(readTestData(data, excelName,Scenario));
			System.out.println(readTestData(data, excelName,Scenario));
			test.log(Status.PASS, "Entering data '" + readTestData(data, excelName,Scenario) + "' is successful");
	//		Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			reportFailure("Click on element is unsuccessful");
		}
	}
	public static void enterText2(String key, String data, String excelName,String Scenario)throws Exception, IOException, InterruptedException {
		try {
			checkelementpresent(readobjectRepo(key));
            
		//	waitForPresenceAndVisibilityOfElementry(readobjectRepo(key));
			WebElement ele = driver.findElement(By.xpath(readobjectRepo(key)));
			 ele.click();
			ele.clear();
            ele.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(2000);
			ele.sendKeys(readTestData(data, excelName,Scenario));
			System.out.println(readTestData(data, excelName,Scenario));
			test.log(Status.PASS, "Entering data '" + readTestData(data, excelName,Scenario) + "' is successful");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			reportFailure("Click on element is unsuccessful");
		}
	}
	public static void upload_file(String key)throws Exception, IOException, InterruptedException {
		try {
			//checkelementpresent(readobjectRepo(key));
			//waitForPresenceAndVisibilityOfElementry(readobjectRepo(key));
			WebElement ele = driver.findElement(By.xpath(readobjectRepo(key)));
			ele.sendKeys("C:\\Users\\vinot\\Downloads\\Subred.xls");
		//	 ele.click();
			 Thread.sleep(5000);
			 
			 
		//	ele.clear();
			Thread.sleep(2000);
			System.out.println("677");
			System.out.println("h14");
			
			String path = "C:\\Users\\vinot\\Downloads\\Subred.xls";

			// File f = detector.getLocalFile(path);
			//((RemoteWebElement)fileInput).setFileDetector(detector);
			System.out.println("h16");

			//fileInput.sendKeys(f.getAbsolutePath());
			//ele.sendKeys(path);
			//ele.sendKeys("C:\\Users\\vinot\\Downloads\\Subred.xls");
			
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
			takeScreenShot();
			Assert.fail(failureMessage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void takeScreenShot() throws Exception {
		// Generate a screenshot name and capture the screenshot
		String Screenshotname = "." + FailScreenshot();

		// Log the screenshot in the test report
		ScreenCapture("Screenshot", Screenshotname);
	}
	
	public static String FailScreenshot() throws Exception {
	    try {
	        // Generate a timestamp for the screenshot file name
	        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

	        // Cast the driver to TakesScreenshot to capture the screenshot
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);

	        // Define the destination path for the first screenshot file
	        String destination1 = "./extentreports/screenshots/" + dateName + ".png";
	        File finalDestination1 = new File(destination1);

	        // Copy the source (screenshot) to the first final destination
	        FileUtils.copyFile(source, finalDestination1);
     // Return the file path of the captured screenshot
	        return destination1;
	    } catch (Exception e) {
	        e.printStackTrace();
	        // Handle exceptions and return null or an appropriate value based on your requirement
	        return null;
	    }
	}
	
	public static Object ScreenCapture(String logdetails, String imgpath) throws IOException {
		// Log the screenshot in the test report using ExtentReports
		test.log(Status.FAIL, logdetails, MediaEntityBuilder.createScreenCaptureFromPath(imgpath).build());

		// Return the test object
		return test;
	}

	 public static void clearWebField(String xpath) throws IOException, Exception{
    	 waitForPresenceAndVisibilityOfElementry(readobjectRepo(xpath));
            WebElement element = driver.findElement(By.xpath(readobjectRepo(xpath)));
        while(!element.getAttribute("value").equals("")){
        	element.click();
            element.sendKeys(Keys.BACK_SPACE);
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
			
		  String actual="";   //From Application(Screen)
		  String expected=""; //From ExcelSheet
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
			 Thread.sleep(2000);
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
		
	  
	  
}
