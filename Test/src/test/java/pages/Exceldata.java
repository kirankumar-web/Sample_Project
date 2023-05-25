package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldata 
{
	public String exceldatarerieve(String s1,int i, int y) throws EncryptedDocumentException, IOException
    {		
		File f=new File("/Users/kirankumaryadav/eclipse/selenium/Test/data/data1.xlsx");
	    FileInputStream fis= new FileInputStream(f);
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sh = wb.getSheet(s1);
	    Row rw = sh.getRow(i);
	    Cell cc = rw.getCell(y);
		return cc.getStringCellValue();
	    
	}
}
