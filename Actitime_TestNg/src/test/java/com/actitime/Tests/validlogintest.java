package com.actitime.Tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actime.generic.Basetest;
import com.actime.generic.exceldata;
import com.actitime.pages.loginpage;
import com.actitime.pages.logoutpage;

public class validlogintest extends Basetest
{
	@Test(priority=1)
	   public void testloginlogout() throws InterruptedException
	   {
		   //String user = exceldata.getdata(Filepath, "TC01", 0, 0);
		   //String password = exceldata.getdata(Filepath, "TC01", 0, 1);
		   String title = exceldata.getdata(Filepath, "TC01", 0, 2);
		   String logouttitle = exceldata.getdata(Filepath, "TC01", 0, 3);
		   String eversion=exceldata.getdata(Filepath, "TC01", 0, 4);
		 loginpage lip=new loginpage(driver);
		 logoutpage lop=new logoutpage(driver);
		 String password="trainee";
		 String user="trainee";

		 lip.enterusername(user);
		lip.enterpassword(password);
		 lip.clickonlogin();
		 lip.verifythetitle(title);
		 lop.clickonhelpicon();
		 lop.clickonaboutlink();
		 String actversion = lip.verifyversion();
		 AssertJUnit.assertEquals(actversion, eversion);
		 lop.clickonlogout();
		 Thread.sleep(2000);
	     lip.verifythetitle(logouttitle);
	 

		   
	   }
}
