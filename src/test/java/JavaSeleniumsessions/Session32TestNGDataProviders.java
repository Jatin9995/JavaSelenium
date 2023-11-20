package JavaSeleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Session32TestNGDataProviders {
	
	//similar to testNG parameter, DataProvider are a means to pass the data  to test methods in testNG. Using data provider 
	//in testNG we can inject multiple values into the same test case.It comes inbuild in testng and is popularly used in 
	//data-driven framework.
	
	//syntax:- @DataProvider(name="name of the data provider")
	//public Object[][]dataProviderfunc(){
	//}
	//return new Object[][]{value}
//}
	
//	1.India QutubMinar
//	2. Agra Tajmahal
//	3. Hydrabad charminer
	
	@DataProvider(name="dataset")  //dataprovider nme can be anything
	public Object[][] searchData(){  //dataprovider returns 2 dimensional list
		
		Object[][] searchKeyword=new Object[3][2];
		searchKeyword[0][0]="India";
		searchKeyword[0][1]="QutubMinar";
		searchKeyword[1][0]="Agra";
		searchKeyword[1][1]="Tajmahal";
		searchKeyword[2][0]="Hydrabad";	
		searchKeyword[2][1]="charminer";
		
		return searchKeyword;
}

	//Launch google.com, search data and click on submit button.
		@Test(dataProvider="dataset")  //dataprovide used here bcoz this test case is taking the data from dataprovider.
		public void Googlesearch(String State, String Monumets) {   //We have to search State and Monuments and have to take data from dataprovuider
			
			System.setProperty("webdriver.chrome.driver","J:\\eclipse_Jdrive\\Chrome\\Chrome2\\chromedriver.exe");
	
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com/");
			
			WebElement searchbox=driver.findElement(By.name("q"));
			searchbox.sendKeys(State+ " "+ Monumets );  // we have to mention the data in place of state and monuments from data provider.
			driver.findElement(By.name("btnK")).submit();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.quit();
	
	
		}
	
}