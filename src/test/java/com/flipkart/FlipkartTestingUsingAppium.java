package com.flipkart;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class FlipkartTestingUsingAppium {
	@Test
	public void TestFlipkartMethod() throws MalformedURLException{
		

        URL URL = new URL("http://localhost:4723/wd/hub");
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "11");
		capabilities.setCapability("appPackage", "com.flipkart.android");
		capabilities.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
		
		AndroidDriver driver=new AndroidDriver(URL,capabilities);
		System.out.println(driver.getSessionId());

	}

}
