package com.qa.gittestcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.gitlab.baseclass.gitlabbaseclass;
import com.qa.gitpages.Homepage;
import com.qa.gitpages.Loginpage;

public class Logintest extends gitlabbaseclass {
	Loginpage loginpage;
	Homepage homepage;
	public Logintest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		Initialization ();
		loginpage = new Loginpage();
		
	}
	@Test
	public void logintest() {
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		//this method is returning homepage varibale that's why we are storing as home page
	}
	@Test
	public void loginwithemail() {
		homepage = loginpage.login(prop.getProperty("email"),prop.getProperty("password"));
	}
	@AfterMethod
	public void Teardown() {
		driver.quit();
		
	}

}
