package Test;

import org.testng.annotations.Test;

import java.io.Console;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class demo
{
	@Test(invocationCount = 5)
	  public void openyoutube()
	  {
		  WebDriver driver= null;
		  ChromeOptions co=new ChromeOptions();
		  co.addArguments("---remote-allow-origins=*");
	    System.setProperty("webdriver,driver.chrome","/Users/kirankumaryadav/eclipse/selenium/Test/drivers/chromedriver");
	     driver=new ChromeDriver(co);
	     
	     driver.get("https://www.toolsqa.com/testng/testng-interview-questions/");
	     
	     driver.navigate().to("https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml/5.2.3");
	     
	     driver.navigate().back();
	     
	     driver.navigate().forward();
	     String s1 = driver.getTitle();
	     System.out.println(s1);
	     
	     driver.close();
	  }
}
