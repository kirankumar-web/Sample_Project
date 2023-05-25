package JDBCConnection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SQL_Database 
{
   public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException 
   {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Kiran.kumar@1505");
        		
				Statement stmt = con.createStatement();
				
				ResultSet rs1 = stmt.executeQuery("SELECT username FROM Database1.credentials limit 1;");
                String s1 = "";
				while(rs1.next())
                {
				 s1 = rs1.getString(1);
                }
               System.out.println(s1);
               
               XSSFWorkbook wb=new XSSFWorkbook();
               XSSFSheet sh = wb.createSheet("sheet1");
               XSSFRow rw = sh.createRow(1);
               XSSFCell cc = rw.createCell(1);
               cc.setCellValue(s1);
               
               FileOutputStream fo=new FileOutputStream("/Volumes/C/Tools/GitFolder/sheet1.csv");
            			 
            	        wb.write(fo);
            	        fo.close();
            	        wb.close();
            	}
               
}

