package JavaSeleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Session12_Howtouploadfiles {

	public static void main(String[] args) throws FindFailed {

		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome119\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");		
		
driver.findElement(By.xpath("//*[text()='Upload Resume']")).click();

//Screen class is used in sikuli to find anything through image because it reads the image
//Pattern is a class in which we provide the location of the image which will be read by screen class in sikuli.

//we need to provide the location of the input box so that screen class can read it.

String openbuttom = "C:\\Users\\jatin\\Desktop\\Sikuli\\openbuttton2.png";
String inputfilepath = "C:\\Users\\jatin\\Desktop\\Sikuli\\Textbox2.png";
		
//Provide the Location of the image through pattern class which will be Readable by sikuli.	

Pattern open=new Pattern(openbuttom);
Pattern file=new Pattern(inputfilepath);


Screen src=new Screen();
src.type(file, "J:\\jatin resume.docx");
src.click(open);

		
		
	}

}
