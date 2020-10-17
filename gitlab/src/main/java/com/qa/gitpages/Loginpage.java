package com.qa.gitpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.gitlab.baseclass.gitlabbaseclass;

public class Loginpage extends gitlabbaseclass {
	
	//pagefactory-objectrepositories
	@FindBy(id = "user_login")
	WebElement username;
	@FindBy(id = "user_password")
	WebElement password;
	@FindBy(id = "user_remember_me")
	WebElement rememberme;
	@FindBy(xpath = "//input[@class='btn btn-success']")
	WebElement signinbttn;
	
	//create constructor to initialize pagefactory elements
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
//Actions
	public Homepage login(String un,String psswd) {
		username.sendKeys(un);
		password.sendKeys(psswd);
		rememberme.click();
		signinbttn.click();
		return new Homepage();
		
	}

}
