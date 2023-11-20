package Session45_DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunDataDriven {

	public static void main(String[] args) throws IOException {

		//provide the location of the file to open
FileInputStream inputStream=new FileInputStream("C:\\\\Users\\\\jatin\\\\Desktop\\\\TestData2.xlsx");

//Excel>workbook>sheet>row>cell

//open the work and enter into it
XSSFWorkbook wb=new XSSFWorkbook(inputStream);

//enter into the sheet of the workbook
XSSFSheet sheet=wb.getSheetAt(0);

//rowcount
int rows = sheet.getLastRowNum()+1;
System.out.println("Row Count " + rows);

int column = sheet.getRow(0).getLastCellNum();
System.out.println("Column Count " + column);

//read the row data
for(int i=1; i<=rows; i++ ) {
	
String username = sheet.getRow(i).getCell(0).getStringCellValue();//sheet k 1st row me se 1st cell ki value lena jo ki id hai.
String password = sheet.getRow(i).getCell(1).getStringCellValue();//sheet k 1st row me se 2nd cell ki value lena jo ki password hai.
	
System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome2\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.saucedemo.com/");
driver.findElement(By.id("user-name")).sendKeys(username);		
driver.findElement(By.id("password")).sendKeys(password);	 
driver.findElement(By.name("login-button")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.close();
	
}


		
	}

}
