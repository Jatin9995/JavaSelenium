package Session49_ExtentReport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class CaptureScreenshot {

  WebDriver driver;
  
	public static String Screenshot(WebDriver driver) throws IOException {
		
	TakesScreenshot srcShot= ((TakesScreenshot)driver);
File srcfile = srcShot.getScreenshotAs(OutputType.FILE);
String destination = "J:\\\\eclipse_Jdrive\\\\JavaSelenium\\\\ScreenShot\\\\myextent.png";
File destiFile=new File("J:\\\\\\\\eclipse_Jdrive\\\\\\\\JavaSelenium\\\\\\\\ScreenShot\\\\\\\\myextent.png");
FileUtils.copyFile(srcfile, destiFile);
return destination;

	}

}
