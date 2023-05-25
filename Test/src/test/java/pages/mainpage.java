package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class mainpage 
{
	private WebDriver driver;
	
    private By linktext=By.xpath("//a[text()='destination of the week! The Beach!']");
    private By fcity=By.xpath("//select[@name=\"fromPort\"]");
    private By Tcity=By.xpath("//select[@name=\"toPort\"]");
    
    private By click=By.xpath("//input[@type=\"submit\"]");
    
    private By Fchoose=By.xpath("(//input[@value=\"Choose This Flight\"])[3]");
    
	public mainpage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void clicklinktext()
    {
    	driver.findElement(linktext).click();
 
    }
    public void navigateback()
    {
    	driver.navigate().back();
    }
    public void enterfromcity()
    {
    	WebElement fromc = driver.findElement(fcity);
    	Select deptcity= new Select(fromc);
        deptcity.selectByVisibleText("Mexico City");
    }
    public void enterdestcity()
    {
    	WebElement dcity = driver.findElement(Tcity);
    	Select destcity=new Select(dcity);
        destcity.selectByVisibleText("London");
    }
    public void enterclick()
    {
    	driver.findElement(click).click();
    }
    public void chooseflight()
    {
    	driver.findElement(Fchoose).click();
    }
        
        
        
        
        
        
        
        
        
        
        
}
