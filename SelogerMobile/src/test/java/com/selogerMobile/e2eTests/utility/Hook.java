/**
 * 
 */
package com.selogerMobile.e2eTests.utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @author Chaima MOSBEHI
 *
 */
public class Hook {

	private static WebDriver driver;
	
	@Before()
	public void setUpAppium() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability("platformVersion", "8.0.0");
		cap.setCapability("udid", "32002c89c05595e5"); //Give Device ID of your mobile phone
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung A7");
		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\chaima.mosbehi\\Desktop\\Application Mobile Seloger\\SeLoger.apk");
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
