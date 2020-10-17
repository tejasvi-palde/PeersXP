package com.qa.gittestcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.gitlab.baseclass.gitlabbaseclass;
import com.qa.gitpages.Createproject;
import com.qa.gitpages.Homepage;
import com.qa.gitpages.Loginpage;
import com.qa.gitpages.Newproject1;

public class createnewprojecttesting extends gitlabbaseclass {
	Createproject create;
	Homepage homepage;
	Loginpage loginpage;
	Newproject1 np1;
	
	public createnewprojecttesting() {
		super();
	}
	@BeforeMethod
	public void setup() {
		Initialization ();
		loginpage = new Loginpage();
		homepage	= loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	
	create  =  new Createproject();
		
	}
	@Test
	public void newProject() {
	homepage=  create.createnewproject();
	}
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
}
