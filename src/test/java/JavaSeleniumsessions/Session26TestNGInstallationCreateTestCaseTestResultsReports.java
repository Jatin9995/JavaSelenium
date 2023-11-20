package JavaSeleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Session26TestNGInstallationCreateTestCaseTestResultsReports {
	
public WebDriver driver;
	
	
	
	@BeforeMethod
		public void verifyPageTitle() {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedrive\\crome\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.facebook.com/");
		}
			
			@Test
			public void myTitle() {
			
	String ExpectedTitle="Facebook – log in or sign up";   //expected title can be fetch from html codes or you can write manually to fail your test case.
	String ActualTitle=driver.getTitle();  //Actual title will be taken by the codes only.

	Assert.assertEquals(ActualTitle, ExpectedTitle);//The assert class is used to conduct the verification operations in TechNG.
	//Assertion in TectNG are a way to verify that the expected result matches with the actual result.
		
		}
		
	@Test
	public void myUrl() {
		

	String expurl="https://www.facebo.com/";
	String Acturl=driver.getCurrentUrl();
	Assert.assertEquals(Acturl, expurl);
	}

	@AfterMethod
	public void Closebrowser() {
		driver.close();
	}

}
