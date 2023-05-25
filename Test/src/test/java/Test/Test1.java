package Test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.Pages;
import pages.mainpage;

public class Test1 
{
	
	
  @Test
  public void flightbooking() throws EncryptedDocumentException, IOException
  {
	  WebDriver driver= null;
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("---remote-allow-origins=*");
    System.setProperty("webdriver,driver.chrome","/Users/kirankumaryadav/eclipse/selenium/Test/drivers/chromedriver");
     driver=new ChromeDriver(co);
     
     driver.get("https://blazedemo.com/index.php");
     
     mainpage mp=new mainpage(driver);
     mp.clicklinktext();
     mp.navigateback();
     mp.enterfromcity();
     mp.enterdestcity();
     mp.enterclick();
     mp.chooseflight();
       
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
