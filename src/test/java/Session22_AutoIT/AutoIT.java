package Session22_AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
//AutoIT is used to handle window based application because selenium can only handle web based application and cannot handle window 
		//based application. Hence AutoIt third party application is used in seenium.
		
	//ControlFocus:- command in autoit SciTe is used to focus on an object.
		//ConrolSetText:- to set the text on any object in autoit SciTe
		//ControlClick:- to click on an object in autoit SciTe
		
		//ControlFocus("Open","","Edit1")
		//Sleep(3000)
		//ControlSetText("Open","","Edit1","C:\Users\jatin\Desktop\Praveen sir recording videos\CUCUMber-file")
		//Sleep(3000)
		//ControlClick("Open","","Button1")

//Need to install Autoit Finder and Editor in system. 
		//Finder is used to find the location of the object and scite is used as an editor to write the script.
		//then convert the scite script into exe file to run in selenium through the command.
		
		
		
		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome119\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Upload Resume']")).click();
		Runtime.getRuntime().exec("C:\\Users\\jatin\\Documents\\FileuploadAutoIT.exe");//Runtime class is used to run the autoit exe file.
		Thread.sleep(3000);
		
		
		
	}

}
