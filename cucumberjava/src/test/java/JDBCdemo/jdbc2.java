package JDBCdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class jdbc2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
      Class.forName("com.mysql.cj.jdbc.Driver");
      
      Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Kiran.kumar@1505");
      
      Statement stmt = connect.createStatement();
      ResultSet r1 = stmt.executeQuery("SELECT * FROM sakila.actor limit 3;");
      //String str1 ="";

      ArrayList<String> a1=new ArrayList<String>();
      while(r1.next())
      {
    	  a1.add(r1.getInt(1)+" "+r1.getString(2)+" "+r1.getString(3)+" "+r1.getTimestamp(4));
      }
      
      System.out.print(a1);
      System.out.println();
      //System.out.println(a1.get(2));
      String a22 = a1.get(2).toString();
      System.out.println(a22);
      String[] strar = a22.split(" ");
      for (int i = 0; i < strar.length; i++) 
      {
		if(strar.length==2)
		{
			System.out.println(Arrays.toString(strar));
		}
	}
      
	}

}
