package basic;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Mobile_automation {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		


		DesiredCapabilities cap=new DesiredCapabilities();

		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "VinothEmulator");
		//cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0.0");
		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		//cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		cap.setCapability("deviceName", "Nokia 6_1_Plus");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10.0.0");
		cap.setCapability("udid", "DRGID18112206722");
		cap.setCapability("appPackage","com.rs.axis");
		cap.setCapability("appActivity", "com.rs.axis.MainActivity");
		
		
	 	cap.setCapability(MobileCapabilityType.APP, "C:\\tsa\\basic\\src\\basic\\02 May 2022_Axis-live-2May.apk");
	 	
	 	
		
		@SuppressWarnings("unused")
		AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
System.out.println("Application is started");
	}

}
