package com.actitime.Tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actime.generic.Basetest;
import com.actime.generic.exceldata;
import com.actitime.pages.loginpage;

public class errormsgtest extends Basetest
{
	@Test
	public void testerrmsg()
	{
	loginpage lip=new loginpage(driver);
	String un=exceldata.getdata(Filepath, "TC02", 1, 0);
	lip.enterusername(un);
	String pw=exceldata.getdata(Filepath, "TC02", 1, 1);
	lip.enterpassword(pw);
	lip.clickonlogin();
	String experrmsg = exceldata.getdata(Filepath, "TC02", 1, 2);
	String aerrmsg = lip.verifyerrormsg();
	System.out.println(experrmsg);
	//System.out.println(aerrmsg);
	AssertJUnit.assertEquals(aerrmsg, experrmsg);
	//Reporter.log("Error message is matching",true);
	
	}
}