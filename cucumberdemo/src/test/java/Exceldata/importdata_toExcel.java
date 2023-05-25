package Exceldata;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class importdata_toExcel
{
  public static void main(String[] args) throws IOException 
  {
	 XSSFWorkbook wb=new XSSFWorkbook();
	 XSSFSheet sh = wb.createSheet("sheet1");
	 XSSFRow rw = sh.createRow(0);
	 XSSFCell cc = rw.createCell(0);
	 
	 cc.setCellValue("hi");
	 
	 FileOutputStream fout=new FileOutputStream("/Volumes/C/Folder1/EXCELdata/Sampledata1.xlsx");
			 
     wb.write(fout);
     fout.close();
     wb.close();     

}
}
