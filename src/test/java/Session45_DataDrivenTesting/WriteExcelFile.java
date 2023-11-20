package Session45_DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public static void main(String[] args) throws IOException {

		File file=new File("C:\\\\\\\\Users\\\\\\\\jatin\\\\\\\\Desktop\\\\\\\\TestData2.xlsx");
		
FileInputStream inputStream=new FileInputStream(file);
XSSFWorkbook wb=new XSSFWorkbook(inputStream);
XSSFSheet sheet=wb.getSheetAt(3);
XSSFRow row=sheet.createRow(0);
row.createCell(0).setCellValue("TC ID");
row.createCell(1).setCellValue("TC Scenario");
row.createCell(2).setCellValue("TC Description");
row.createCell(3).setCellValue("TC result");
row.createCell(4).setCellValue("TC expected result");

FileOutputStream myFileOutputStream=new FileOutputStream(file);//FileOutputStream class is used to write the data in workbook
wb.write(myFileOutputStream);


			
		
	}

}
