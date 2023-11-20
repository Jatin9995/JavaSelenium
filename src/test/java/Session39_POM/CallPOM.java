package Session39_POM;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class CallPOM {

	Logger log;
	
	@Test
	
	public void loginPage() {
		
		
		System.setProperty("webdriver.chrome.driver", "J:\\\\eclipse_Jdrive\\\\Chrome\\\\Chrome2\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
Logger log=Logger.getLogger("loginPage");
PropertyConfigurator.configure("J:\\eclipse_Jdrive\\JavaSelenium\\Logger_folder\\log.properties");

		
		WithPOM pom= new WithPOM(driver);
		pom.enterUID();
		log.info("this is a information test");

		pom.enterPWD();
		pom.clickBTN();
		
		
	}
	

	
}
