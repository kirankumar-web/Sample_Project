package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Pages;
import pages.mainpage;

public class Test2 
{
	  WebDriver driver= null;

   @BeforeTest
   public void opening()
   {
	   ChromeOptions co=new ChromeOptions();
		  co.addArguments("---remote-allow-origins=*");
	    System.setProperty("webdriver,driver.chrome","/Users/kirankumaryadav/eclipse/selenium/Test/drivers/chromedriver");
	     driver=new ChromeDriver(co);
	     
	     driver.get("https://blazedemo.com/index.php"); 
   }
   @Test
   public void navigatemainpage()
   {
	   mainpage mp=new mainpage(driver);
	     mp.clicklinktext();
	     mp.navigateback();
	     mp.enterfromcity();
	     mp.enterdestcity();
	     mp.enterclick();
	     mp.chooseflight();
   }
   @AfterTest
   public void bookingpage() throws EncryptedDocumentException, IOException
   {
	   Pages p1=new Pages(driver);
	      
	     p1.entername();
	     p1.enteradd();
	     p1.entercity();
	     p1.enterzcode();
	     //p1.enterstate();
	     //p1.entercname();
	     p1.entercyear();
	     p1.entercmonth();
	     p1.clickcbox();
	     p1.clickflightbutton();
	     
	     driver.quit();
   }
}
