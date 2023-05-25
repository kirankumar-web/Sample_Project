package JDBCdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class logindemouseDatabase 
{
  public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException 
  {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Database1", "root", "Kiran.kumar@1505");
    Statement stmt1 = conn.createStatement();
    ResultSet re = stmt1.executeQuery("Select * from credentials limit 1");
    String un = "", pw = "";
    while(re.next())
    {
      un= un+re.getString(2);
      pw= pw+re.getString(3);
    }
    
    System.out.println(un);
    System.out.println(pw);
    
    System.out.println();
    ChromeOptions co=new ChromeOptions();
    co.addArguments("---remote-allow-origins=*");
    String path = System.getProperty("user.dir");
    System.setProperty("webdriver.chrome.driver",path+"/Drivers/chromedriver 2");
     WebDriver driver = new ChromeDriver(co);
     
     driver.get("https://mvnrepository.com/");
     
     driver.navigate().to("https://www.facebook.com/");
     
     driver.findElement(By.id("email")).sendKeys(un);
     Thread.sleep(2000);
     driver.findElement(By.id("pass")).sendKeys(pw);
     Thread.sleep(2000);

     driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
     Thread.sleep(2000);
    
     driver.close();
    
}
}
