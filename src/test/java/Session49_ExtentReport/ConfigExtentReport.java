package Session49_ExtentReport;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ConfigExtentReport {
	
	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest test;
	WebDriver driver;
	
	//First we will initialize the extent report
	
	@BeforeTest  //we have used before test bcoz extenet report ko har methods se pehle execute hona hai details capture karne k liye
	             //ye sabhi classes ko cover karega jaha pe methods honge,  hum isko call karwayenge kyu ki ye class se pehle execute hota hai. 
	public void initExtentReport() {
		
		reporter=new ExtentHtmlReporter("J:\\eclipse_Jdrive\\JavaSelenium\\Extentreport\\Myreport.html");
		reporter.config().setDocumentTitle("Extent report file");
		reporter.config().setReportName("Extent Configuration Report");//we have named the report by this
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setTimeStampFormat("dd/mm/yyyy, hh:mm:ss");
		
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		
	}
	
	@Test
	public void Logintest() {
		
		test=reports.createTest("Login Test");  //we have given the name  of the method in extent report
		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome119\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		String Expectedtitle = "Swag Labs";
		Assert.assertEquals(driver.getTitle(), Expectedtitle);
		test.log(Status.PASS, "Login title verified");
		test.log(Status.PASS, MarkupHelper.createLabel("Login pass", ExtentColor.GREEN));
		
		
	}
	
	@Test
	public void Logintest2() {
		
		test=reports.createTest("Login Test2");  //we have given the name  of the method in extent report
		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome119\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		String Expectedtitle = "Swag Lab";
		Assert.assertEquals(driver.getTitle(), Expectedtitle);
		test.log(Status.PASS, "Login title verified");
	
	}

	@AfterMethod
	public void GetResult(ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			
			String myscreenshot = CaptureScreenshot.Screenshot(driver);
			test.log(Status.FAIL, result.getThrowable());
			test.log(Status.FAIL, "Login title not verified");
			test.log(Status.FAIL, MarkupHelper.createLabel("Login Failed", ExtentColor.RED));
			test.addScreenCaptureFromPath(myscreenshot);  //it is used to add the captued screenshot of failed test case in logs. 
			
		}
		driver.close();
		
	}
	
	@AfterTest
	public void closetest() {
		
		reports.flush();
	}
	
}
