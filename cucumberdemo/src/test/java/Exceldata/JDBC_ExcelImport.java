package Exceldata;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class JDBC_ExcelImport 
{
  public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException
  {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Kiran.kumar@1505");
        Statement stmt = con.createStatement();
        ResultSet re = stmt.executeQuery("SELECT first_name FROM sakila.actor;");
        List<Object> al1=new ArrayList<Object>();
        while(re.next())
        {
        	al1.add(re.getString(1));
        }
        System.out.println(al1);
        System.out.println(al1.get(0));
        String d1 = (String) al1.get(0);
        XSSFWorkbook wb=new XSSFWorkbook();
        XSSFSheet sh = wb.createSheet("Sheet2");
        XSSFRow rw = sh.createRow(1);
        XSSFCell cc = rw.createCell(1);
        
        cc.setCellValue(d1);
        FileOutputStream fout=new FileOutputStream("/Volumes/C/Tools/GitFolder/sheet.csv");
		 
        wb.write(fout);
        fout.close();
        wb.close();
}
}
