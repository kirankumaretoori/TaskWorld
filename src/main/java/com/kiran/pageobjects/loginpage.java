package com.kiran.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	
	public WebDriver driver;
	
	By newproject=By.className("tw-new-project-button-box__icon");
	By projectname=By.name("project-name");
	By description=By.xpath("//input[@type='text' and @name='description']");
	By template=By.className("tw-new-project__choose-workflow-button");
	By createproject=By.className("tw-choose-workflow__footer");
	By tasklisttitle=By.xpath("//input[@type='text' and @placeholder='Tasklist title']");
	By tasklistdescription=By.className("ax-task-input-panel-textfield");
	By addtask=By.xpath("//*[@id='react']/div/section/div[1]/div/div/div[2]/div/div/section/section/div/div[2]/section/section/div/div[2]/div/section/div/div/div[1]/div/section/div[1]/div/div/div[2]/div[2]");
	By createbutton=By.xpath("//span[@data-l10n-key='tasks.buttons.create' and @data-l10n-message='Create']");
	By completetask=By.xpath("//div[@class='tw-click-area tw-task-checkbox ax-task-checkbox --size-regular' and @role='button' and @tabindex='0']");
	By viewtask=By.className("tw-task__main");
	
		
	 
	public loginpage(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement newProject()
	{
		return driver.findElement(newproject);
	}
	public WebElement projectName()
	{
		return driver.findElement(projectname);
	}
	public WebElement projectDescription()
	{
		return driver.findElement(description);
	}
	public WebElement chooseTemplate()
	{
		return driver.findElement(template);
	}
	public WebElement createProject()
	{
		return driver.findElement(createproject);
	}
	public WebElement taskListTitle()
	{
		return driver.findElement(tasklisttitle);
	}
	public WebElement taskListDescription()
	{
		return driver.findElement(tasklistdescription);
	}
	public WebElement addTask()
	{
		return driver.findElement(addtask);
	}
	
	public WebElement createButton()
	{
		return driver.findElement(createbutton);
	}
	
	public WebElement completeTask()
	{
		return driver.findElement(completetask);
	}
	public WebElement viewTask()
	{
		return driver.findElement(viewtask);
	}
	
	
	
}
