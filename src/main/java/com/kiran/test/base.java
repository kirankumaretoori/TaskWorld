package com.kiran.test;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		FirefoxProfile ffprofile = new FirefoxProfile();
		ffprofile.setPreference("dom.webnotifications.enabled", false);
		FirefoxOptions foptions = new FirefoxOptions();
		foptions.setProfile(new FirefoxProfile());
		foptions.addPreference("dom.webnotifications.enabled", false);
		Properties prop = new Properties();   
		InputStream  fis =  HomePage.class.getClass().getResourceAsStream("/data.properties");
		prop.load(fis);
		String browserName= prop.getProperty("browser");
		
		
		if(browserName.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver","\\chromedriver.exe");
			driver = new ChromeDriver(options);
		}
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","\\geckodriver2.exe");
			driver = new FirefoxDriver(foptions);
		}
		else if (browserName.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","\\MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();	
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

}
