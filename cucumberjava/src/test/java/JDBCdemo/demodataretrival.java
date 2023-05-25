package JDBCdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class demodataretrival 
{
  public static void main(String[] args) throws ClassNotFoundException, SQLException 
  {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Database1", "root", "Kiran.kumar@1505");
      Statement stmt = con.createStatement();	
      ResultSet results = stmt.executeQuery("Select * FROM EmployeeLogin");
      String user="";
      List<Object> a1=new ArrayList<Object>();
      while (results.next())
      {
		 a1.add(results.getInt(1)+" "+results.getString(2)+" "+results.getString(3)+" "+results.getString(4)+" "+results.getString(5));
		user= user+" "+results.getString(2);
	}
      System.out.println(a1);
      System.out.println(a1.get(2));
      System.out.println(user);
      String[] uname = user.split(" ");
      for (int i = 0; i < uname.length; i++)
      {
		 if (user.contains("@gmail.com")) 
		 {
			System.out.println(uname[i]);
		}
	}
      String s1="   dsjfhggfhd     ";
      System.out.println(s1);
      
      System.out.println(s1.trim());
}
}
