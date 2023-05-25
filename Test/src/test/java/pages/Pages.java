package pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages 
{
   	private WebDriver driver;

	@FindBy(xpath = "//input[@id=\"inputName\"]")
	private WebElement name1;
	
	@FindBy (xpath="//input[@name=\"address\"]")
	private WebElement add; 
	@FindBy (xpath="//input[@name=\"city\"]")
	private WebElement city; 
	@FindBy (xpath="//input[@name=\"state\"]")
	private WebElement state; 
	@FindBy (xpath="//input[@name=\"zipCode\"]")
	private WebElement zcode; 
	@FindBy (xpath="//input[@id=\"creditCardNumber\"]")
	private WebElement cnum; 
	@FindBy (xpath="//input[@id=\"creditCardMonth\"]")
	private WebElement cmonth; 
	@FindBy (xpath="//input[@id=\"creditCardYear\"]")	
	private WebElement cyear; 
	@FindBy (xpath="//input[@id=\"nameOnCard\"]")
	private WebElement cname; 
	@FindBy (xpath="//input[@name=\"rememberMe\"]")	
	private WebElement cbox; 
	@FindBy (xpath="//input[@value=\"Purchase Flight\"]")
	private WebElement fbutton; 

	    	Exceldata e1=new Exceldata();
    public Pages(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void entername() throws EncryptedDocumentException, IOException
    {   
    	String n1 = e1.exceldatarerieve("sheet2", 0, 1);
    	name1.sendKeys(n1);
 
    }
    public void enteradd() throws EncryptedDocumentException, IOException
    {
    	String ad1 = e1.exceldatarerieve("sheet2",1,1);

    	add.sendKeys(ad1);
 
    }
    public void entercity() throws EncryptedDocumentException, IOException
    {    	String c1 = e1.exceldatarerieve("sheet2", 2,1);

    	city.sendKeys(c1);
 
    }
    public void enterstate() throws EncryptedDocumentException, IOException
    {    	String s1 = e1.exceldatarerieve("sheet2", 3,1);
    	state.sendKeys(s1);
 
    }
    public void enterzcode() throws EncryptedDocumentException, IOException
    {    	String zc = e1.exceldatarerieve("sheet2", 4,1);

    	zcode.sendKeys(zc);
 
    }
    public void entercnum() throws EncryptedDocumentException, IOException
    {    	String cn1 = e1.exceldatarerieve("sheet2", 5,1);

    	cnum.sendKeys(cn1);
 
    }
    public void entercname() throws EncryptedDocumentException, IOException
    {    	String cn = e1.exceldatarerieve("sheet2", 8,1);

    	cname.sendKeys(cn);
 
    }
    public void entercmonth() throws EncryptedDocumentException, IOException
    {    	String m1 = e1.exceldatarerieve("sheet2", 6,1);

    	cmonth.sendKeys(m1);
 
    }
    public void entercyear() throws EncryptedDocumentException, IOException
    {    	String y1 = e1.exceldatarerieve("sheet2", 7,1);

    	cyear.sendKeys(y1);
 
    }
    public void clickcbox()
    {
    	cbox.click();
 
    }
    public void clickflightbutton()
    {
    	fbutton.click();
 
    }
    
}
