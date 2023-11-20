package JavaSeleniumsessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session16_Howtocapturescreenshot {

	public static void main(String[] args) throws IOException {
		//WebDriver driver;

		//Screenshot is captured for the bug analysis during runtime.
				//to Capture the screenshot we will use method "getsScreenShotAs()" of special interface called "TakeScreenShotAs".
		//Step1:- Convert web driver object to "TakeScreenShot" interface
				//TakesScreenshot scrShot=((TakesScreenshot)driver);
				
				//Step 2:-Call getScreenShotAs method to create image file.
				//File SrcFile=scrShot.getScreenShotAs(OutputType.FILE)
				
				//Step 3:-Copy file to desired location by using library "Apache Commons IO-fileUtils".
				
				//Launch Chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\chromedrive\\crome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
						
				//Maximize the window
			driver.manage().window().maximize();
						
			//Launch opencart.com
			driver.navigate().to("http://uitestpractice.com/");
			
			//Capture full page screenshot
			
		//Step1:- Convert web driver object to "TakeScreenShot" interface because webdriver object don't have the access to take the screenshot.
			//thats why we need to convert webdriver object to take screenshot.
			//TakesScreenshot screenshot=((TakesScreenshot)driver);
			
			//Step 2:-Call getScreenShotAs method to create image file.
			//thi will return an image which we will store in src file type and import the  package
		//File src=screenshot.getScreenshotAs(OutputType.FILE);

		//Prepare a destintion where you want to save the image file.
		//File Destination=new File("C:\\Users\\jatin\\eclipse-workspace\\Newprojest\\Screenshot\\Fullscreenpage.png");


		//Step 3:-Copy file to desired location by using library "Apache Commons IO-fileUtils". 
		// Now copy the src file to destination.

		//FileUtils.copyFile(src, Destination);


			
			
		              //Taking the screenshot of the section.

		//Step1:- To take the screenshot of section, you have to create an object of that section.A section work as an webelement
			//WebElement section=driver.findElement(By.xpath("//div[@class='container red']"));
			
			//Step 2:-Call getScreenShotAs method to create image file.
			//this will return an image which we will store in src file type and import the  package
		//File src=section.getScreenshotAs(OutputType.FILE);

		//Prepare a destintion where you want to save the image file.
		//File Destination=new File("C:\\Users\\jatin\\eclipse-workspace\\Newprojest\\Screenshot\\section.png");


		//Step 3:-Copy file to desired location by using library "Apache Commons IO-fileUtils". 
		//Now copy the src file to destination.

		//FileUtils.copyFile(src, Destination);
			
			
			
		         //Taking the screenshot of the Webelement.


		//Step1:- To take the screenshot of webelement, you have to create an object of that webelement.A element work as an webelement
			WebElement section=driver.findElement(By.xpath("//button[@name='dblClick']"));
			
			//Step 2:-Call getScreenShotAs method to create image file.
			//this will return an image which we will store in src file type and import the  package
		File src=section.getScreenshotAs(OutputType.FILE);

		//Prepare a destintion where you want to save the image file.
		File Destination=new File("C:\\Users\\jatin\\eclipse-workspace\\Newprojest\\Screenshot\\webelement.png");


		//Step 3:-Copy file to desired location by using library "Apache Commons IO-fileUtils". 
		//Now copy the src file to destination.

		FileUtils.copyFile(src, Destination);
		
	}

}
