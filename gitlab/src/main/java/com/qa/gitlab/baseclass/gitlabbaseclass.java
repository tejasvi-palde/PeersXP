package com.qa.gitlab.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gitlabbaseclass {
public static WebDriver driver;
 public static Properties prop;
public gitlabbaseclass() {
	prop = new Properties();
	try {
		FileInputStream fis = new FileInputStream("C:\\Users\\tejas\\eclipse-workspace\\gitlab\\src\\main\\java"
				+ "\\com\\git\\utilities\\config.properties");
		prop.load(fis);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public static void Initialization ()  {
		prop.getProperty("browser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tejas\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
}

