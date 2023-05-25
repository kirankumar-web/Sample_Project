package Exceldata;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata 
{
  public static void main(String[] args) throws IOException 
  {
     XSSFWorkbook wb=new XSSFWorkbook();
     XSSFSheet sh = wb.createSheet("sheet1");
     XSSFRow rw = sh.createRow(0);
     XSSFCell cc = rw.createCell(0);
     cc.setCellValue("hello");
     
     FileOutputStream fo=new FileOutputStream("/Users/kirankumaryadav/Desktop/Resume/folder/excel.xlsx");
     wb.write(fo);
     
     
}
}
