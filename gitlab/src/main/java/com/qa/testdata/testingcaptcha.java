package com.qa.testdata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingcaptcha {
	public static void main( String[] args ) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tejas\\Downloads\\"
				+ "chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://gitlab.com/users/sign_up");
		driver.findElement(By.className("recaptcha-checkbox-border")).click();;
	}
}
