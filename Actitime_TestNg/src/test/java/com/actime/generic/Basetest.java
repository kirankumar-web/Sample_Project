package com.actime.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.actime.generic.Autoconstans.autoconstants;

public abstract class Basetest implements autoconstants
	{
		public WebDriver driver;
		static
		{
			System.setProperty(chromekey, chromevalue);
			System.setProperty(firefoxkey,firefoxvalue);
		}
		@BeforeMethod
	  public void precondition()
	  {   
			ChromeOptions co=new ChromeOptions();
	  co.addArguments("---remote-allow-origins=*");
		  driver=new ChromeDriver(co);
			//driver=new FirefoxDriver();
		  driver.get("https://demo.actitime.com/login.do");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  }
		@AfterMethod
	  public void postcondition(ITestResult res) 
	  {
		 int status = res.getStatus(); 
		 if(status==2)
		 {
			String name = res.getName();
			genericutils.getscreenshot(driver, name);
			
			System.out.println(name);
		 }
		 driver.close();
	  }
	}

