package com.qa.gitpages;

import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.gitlab.baseclass.gitlabbaseclass;

public class Createproject extends gitlabbaseclass{
	
	@FindBy(xpath="//body/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/a[1]")
	WebElement newproject;
	@FindBy(xpath="//h3[contains(text(),'Create blank project')]")
	WebElement newblankpage;
	@FindBy(xpath="//input[@id='project_name'][@data-track-label='blank_project']")
	WebElement projectname;
	@FindBy(xpath = "//body/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/form[1]/div[1]/div[3]/input[1]")
	WebElement projectslung;
	@FindBy(id="project_visibility_level_20")
	WebElement publicbttn;
	@FindBy(id="project_initialize_with_readme")
	WebElement checkbox;
	@FindBy(xpath="//body/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/form[1]/input[3]")
	WebElement createproject;
	
public Createproject() {
	PageFactory.initElements(driver, this);
}
public Homepage createnewproject() {
	
	newproject.click();
	newblankpage.click();
	
	 projectname.sendKeys("gitlab");
	projectslung.clear();
	projectslung.sendKeys("peerxp");
	publicbttn.click();
	checkbox.click();
	createproject.click();
	return null;
	
	
	
}
}
