package com.kiran.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage {
	
	public WebDriver driver;
	
	By server=By.className("tw-server-selection__text");
	By selectasia=By.xpath("//*[@id='react']/div[2]/div/div/div/div[2]/div[1]/div/div[2]/div/div/span");
	By email=By.name("email");
	By password=By.name("password");
	
	By loginbutton=By.className("tw-button__main-container");
	
	
	public landingpage(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement selectAsia()
	{
		return driver.findElement(selectasia);
	}
	
	public WebElement selectServer()
	{
		return driver.findElement(server);
	}
	
	public WebElement enterPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement enterEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement Login()
	{
		return driver.findElement(loginbutton);
	}
	
	
}
