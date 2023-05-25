package Exceldata;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteintoExceldata {

	public static void main(String[] args) throws IOException
	{
     Workbook wb = new XSSFWorkbook();
     Sheet sh = wb.createSheet("sheet1");
     
     Row rw = sh.createRow(0);
     Row rw1 = sh.createRow(1);
     Row rw2 = sh.createRow(2);
     Row rw3 = sh.createRow(3);
     
     Cell cc = rw.createCell(0);
     Cell cc1 = rw.createCell(1);
     Cell cc2= rw.createCell(2);
     Cell cc3= rw.createCell(3);
     Cell cc4= rw.createCell(4);
     Cell cc5= rw.createCell(5);
     Cell cc6= rw.createCell(6);
     Cell cc7= rw.createCell(7);
     Cell cc8= rw.createCell(8);
     
     cc.setCellValue("kiran");
     cc1.setCellValue("mani");
     cc2.setCellValue("sekhar");
     cc3.setCellValue("madhu");
     cc4.setCellValue("vicky");
     cc5.setCellValue("kumar");
     cc6.setCellValue("yadav");
     cc7.setCellValue("akhil");
     cc8.setCellValue("arun");

     Cell c = rw1.createCell(0);
     Cell c1 = rw1.createCell(1);
     Cell c2= rw1.createCell(2);
     Cell c3= rw1.createCell(3);
     Cell c4= rw1.createCell(4);
     Cell c5= rw1.createCell(5);
     Cell c6= rw1.createCell(6);
     Cell c7= rw1.createCell(7);
     Cell c8= rw1.createCell(8);
     
     c.setCellValue("ki");
     c1.setCellValue("ra");
     c2.setCellValue("nk");
     c3.setCellValue("ma");
     c4.setCellValue("vi");
     c5.setCellValue("ku");
     c6.setCellValue("ya");
     c7.setCellValue("ak");
     c8.setCellValue("aru");
     
     FileOutputStream fout=new FileOutputStream("/Volumes/C/Folder1/EXCELdata/import.xlsx");
     wb.write(fout);
     
     fout.close();
     wb.close();
     
     
     String s1="AbcdBCde";

     int uppercasecount=0;
     int lowercasecount=0;

     for(int i=0; i<s1.length();i++)
     {
        char c11=s1.charAt(i);
        System.out.print(c11);
         if (Character.isUpperCase(c11))
         {
          uppercasecount++;
          }
			else if (Character.isLowerCase(c11))
			{
	             lowercasecount++;

			}
     }
     System.out.println();
        System.out.println(uppercasecount);
         System.out.println(lowercasecount);
         
         String ss="350";
         int num= Integer.parseInt(ss); 
         System.out.println(num+10);
         String ss1="abcdef";
         System.out.println(ss1+10);
         String str = "42";

         try {
             int num1 = Integer.parseInt(str);  // Attempt to parse the string as an integer
             int result = num1 + 10;  // Add 10 to the integer value
             System.out.println(result);  // Print the resulting value
         } catch (NumberFormatException e) {
             System.out.println("The string is not an integer value.");  // Handle the case where the string is not an integer value
         }


     }


}
