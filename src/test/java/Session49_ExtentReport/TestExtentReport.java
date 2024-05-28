package Session49_ExtentReport;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class TestExtentReport {

	public static void main(String[] args) {

//extent report is the way to show the data in report format in html. extent report interactive report produce karta  hai.
		//dashboard view deta hai, graphical view deta hai, screenshot capture karta hai and emailable report deta hai.
		
ExtentHtmlReporter reporter=new ExtentHtmlReporter("J:\\eclipse_Jdrive\\JavaSelenium\\Extentreport\\testreport2.html"); // This class is used to give the location of the report
ExtentReports reports=new ExtentReports();//Extent report report bnata hai.

//If you want to add environment details of the report
//reports.setSystemInfo("OS", "Windows");

//configuration to change look and feel.
reporter.config().setDocumentTitle("Extent Report Demo");
reporter.config().setReportName("Test report");
reporter.config().setTheme(Theme.STANDARD);
reporter.config().setTimeStampFormat("MM/dd/yy, hh:mm:ss ");


reports.attachReporter(reporter);// extent reports k sath reporter ko attach kr diya yaha pe.
ExtentTest test=reports.createTest("Login test report");  //Extenttest se hum logs create karte hai.reports.createTest se hum heading dete  hai test method ki
test.log(Status.INFO, "User needs to login");
test.log(Status.WARNING, "User id required");
test.log(Status.PASS, "UID available");
test.log(Status.PASS, "Login butiion is working");

ExtentTest test2=reports.createTest("Login Failed Report");
test2.log(Status.INFO, "Test login failure");
test2.log(Status.FAIL, "User unable to login");

reports.flush();


		
		
	}

}
