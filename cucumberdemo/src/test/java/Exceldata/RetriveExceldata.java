package Exceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RetriveExceldata
{
  public static void main(String[] args) throws EncryptedDocumentException, IOException 
  {
    File f=new File("/Volumes/C/Folder1/EXCELdata/import.xlsx");
    FileInputStream fis= new FileInputStream(f);
    Workbook wb = WorkbookFactory.create(fis);
    Sheet sh = wb.getSheet("Sheet1");
    Row rw = sh.getRow(0);
    Cell cc = rw.getCell(0);
    System.out.println(cc.toString());
    
    
    

}
}
