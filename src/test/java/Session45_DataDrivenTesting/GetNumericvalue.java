package Session45_DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetNumericvalue {

	public static void main(String[] args) throws IOException {


		FileInputStream file=new FileInputStream("C:\\\\Users\\\\jatin\\\\Desktop\\\\TestData2.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheetAt(2);
		int row = (int) sheet.getRow(1).getCell(0).getNumericCellValue();
		System.out.println(row);
		
	}

}
