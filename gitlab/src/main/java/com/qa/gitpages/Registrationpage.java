package com.qa.gitpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.gitlab.baseclass.gitlabbaseclass;

public class Registrationpage extends gitlabbaseclass{
	//pagefactory-objectrepositries
	@FindBy(xpath = "//a[contains(text(),'Register now')]")
	WebElement registernow;
	@FindBy(id = "new_user_first_name")
	WebElement firstname;
	@FindBy(id= "new_user_last_name")
	WebElement lastname;
	@FindBy(id = "new_user_username")
	WebElement username;
	@FindBy(id="new_user_email")
	WebElement email;
	@FindBy(id ="new_user_password")
	WebElement password;
	@FindBy(xpath="//input[@name='commit']")
	WebElement register;
	
	public Registrationpage() {
		PageFactory.initElements(driver, this);
	}
	public Homepage Registrationpage() {
		registernow.click();
		firstname.sendKeys("riya");
		lastname.sendKeys("roy");
		username.sendKeys("riyaroy");
		email.sendKeys("riyaroy@gmail.com");
		password.sendKeys("11111111");
		register.click();
		return null;
				
		
		
	}
	

}
