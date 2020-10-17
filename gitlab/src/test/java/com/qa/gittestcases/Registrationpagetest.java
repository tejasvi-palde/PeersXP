package com.qa.gittestcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.gitlab.baseclass.gitlabbaseclass;
import com.qa.gitpages.Homepage;
import com.qa.gitpages.Loginpage;
import com.qa.gitpages.Registrationpage;

public class Registrationpagetest extends gitlabbaseclass{
	Registrationpage registration;
	Homepage homepage;
	public Registrationpagetest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		Initialization ();
		registration = new Registrationpage();
		
	}
	@Test
	public void Registration() {
		homepage = registration.Registrationpage();
		
	}
	
	
	
	@AfterMethod
	public void Teardown() {
		driver.quit();

}
}