
package Session45_DataDrivenTesting;

import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class Readexcelfile {

	public static void main(String[] args) throws IOException {

		//provide the location of the file to open
		FileInputStream file= new FileInputStream("C:\\Users\\jatin\\Desktop\\TestData2.xlsx");

		//Excel>workbook>sheet>row>cell
			
		//open the work and enter into it
	XSSFWorkbook wb=new XSSFWorkbook(file);
	
	//enter into the sheet of the workbook
	 XSSFSheet sheet =wb.getSheetAt(0);
	
	//row count
	int rowcount = sheet.getLastRowNum()+1;
	System.out.println("Row Count " + rowcount);
	
	//column count
	int Columncount = sheet.getRow(0).getLastCellNum();
	System.out.println("Column Count " + Columncount);
	
	//to print all the data of the excelsheet
	for(int i=0; i<=rowcount; i++) {
		
		
		for(int j=0; j<Columncount; j++) {
						
		System.out.print(sheet.getRow(i).getCell(j).toString());
			System.out.print("\t");
		}
	
		System.out.println();
	}
	
	
	
	
	
		
		
		
	}

}
