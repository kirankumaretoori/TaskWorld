package com.kiran.test;


import java.io.IOException;
import java.io.InputStream;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;

import com.kiran.pageobjects.landingpage;
import com.kiran.pageobjects.loginpage;



public class HomePage extends base{
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		HomePage a = new HomePage();
		a.basepagenavigation();
	}
	
	public void basepagenavigation() throws IOException, InterruptedException
	{
		Properties prop = new Properties();
		InputStream  fis =  HomePage.class.getClass().getResourceAsStream("/data.properties");
		prop.load(fis);
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		landingpage l = new landingpage(driver);
		l.selectServer().click();
		Thread.sleep(3000);
		l.selectAsia().click();
		l.enterEmail().sendKeys(prop.getProperty("email"));
		l.enterPassword().sendKeys(prop.getProperty("password"));
		l.Login().click();
		l.driver.manage().window().maximize();
		
		
		System.out.println("**********User logs into the system*************");
		Thread.sleep(7000);
		loginpage lp = new loginpage(driver);
		lp.newProject().click();
		lp.projectName().sendKeys(prop.getProperty("projectname"));
		lp.projectDescription().sendKeys(prop.getProperty("description"));
		lp.chooseTemplate().click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		lp.createProject().click();
		System.out.println("**********User creates new project*************");
		lp.taskListTitle().sendKeys(prop.getProperty("tasklisttitle"));
		lp.taskListTitle().sendKeys(Keys.ENTER);
		System.out.println("**********User creates a new tasklist*************");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		lp.taskListTitle().sendKeys(Keys.ESCAPE);
		
		Thread.sleep(3000);
		lp.addTask().click();
		Thread.sleep(3000);
		
		lp.taskListDescription().sendKeys(prop.getProperty("tasklistdescription"));
		lp.createButton().click();
		System.out.println("**********User adds a new tasklist*************");
		lp.completeTask().click();
		System.out.println("**********User marks the task as completed*************");
		lp.viewTask().click();
		System.out.println("**********User opens the completed task to see its details*************");
		System.out.println("**********END OF THE TEST*************");
		
		
		
		
		
	}

}
