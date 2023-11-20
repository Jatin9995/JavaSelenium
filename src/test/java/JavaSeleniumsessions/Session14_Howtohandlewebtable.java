package JavaSeleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session14_Howtohandlewebtable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/jatin/Desktop/Sample%20Table.html");

		//find second cell in the table and print
		WebElement second=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
		String text=second.getText();
		System.out.println(text);

		//find the total no. of rows in the table and print their count
		List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
		int totalrows=rows.size();
		System.out.println("No. of Rows="+ totalrows);

		//find the total no. of column in the table and print their count
		List<WebElement> Column=driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		int totalcolumn=Column.size();
		System.out.println("No. of column="+ totalcolumn);

		//Print all rows and columns, starts from row 2

		for(int r=2;r<=totalrows;r++) {

			for(int c=1;c<=totalcolumn;c++) {
				
				WebElement data=driver.findElement(By.xpath("//table/tbody/tr[" + r +"]/td["+ c + "]"));
				
				String data2=data.getText();
				System.out.print("   "+ data2); 	  
		
		
	}
System.out.println();
}
		
	}

}
