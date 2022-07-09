package com.learn.appium.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

//import io.appium.java_client.AppiumDriver;
//import org.openqa.selenium.WebDriver;
//import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator 
{
	public static AndroidDriver driver;
	//AppiumDriver driver;
	//WebDriver driver;
	
	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities capabilities =new DesiredCapabilities();
		
		capabilities.setCapability("appium:platformName", "Android");
		capabilities.setCapability("platformVersion", "9 PKQ1.190319.001");
		capabilities.setCapability("udid", "20fa20c49807");
		capabilities.setCapability("deviceName", "Redmi");
		capabilities.setCapability("appPackage", "com.miui.calculator");
		capabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9 PKQ1.190319.001");
//		capabilities.setCapability(MobileCapabilityType.UDID, "20fa20c49807");	
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
//      Appium version 1----->/wd/hub 
//      Appium version 2----->/ 
		driver=new AndroidDriver(url,capabilities);
		capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		System.out.println("Calculator App opened");

	}

}
