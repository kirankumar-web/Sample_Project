package com.actitime.Tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actime.generic.Basetest;
import com.actime.generic.exceldata;
import com.actitime.pages.loginpage;

public class errormessagestest extends Basetest
{
	@Test
	public void testerrormessages()
	{
		loginpage lip=new loginpage(driver);
		int rc = exceldata.getrownum(Filepath, "TC02");
		 System.out.println(rc);
		 for(int i=1;i<=rc;i++)
		 {
			 String username = exceldata.getdata(Filepath, "TC02", i, 0);
			 String password = exceldata.getdata(Filepath, "TC02", i, 1);
			 lip.enterusername(username);
			 lip.enterpassword(password);
			 lip.clickonlogin();
			 String experrmsg = exceldata.getdata(Filepath, "TC02", 1, 2);
			 String aerrmsg = lip.verifyerrormsg();
				
				AssertJUnit.assertEquals(aerrmsg, experrmsg);
				Reporter.log("Error message is matching",true);

		 }
	}

}
