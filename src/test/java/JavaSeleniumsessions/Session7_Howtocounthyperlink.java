 package JavaSeleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session7_Howtocounthyperlink {

	public static void main(String[] args) {

		//Launch Chrome browser
				System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				

				//Maximize window
				driver.manage().window().maximize();

				//Launch webpage www.claculator.net
				driver.navigate().to("https://www.calculator.net/");

				//Need to create a list of web element to know the count of hyperlink
				List<WebElement> allLink=driver.findElements(By.tagName("a"));

				int totallinks=allLink.size();
				System.out.println("Total links count="+totallinks);

				for(int i=0;i<totallinks;i++) {
					
					String Totaltext=allLink.get(i).getText();
					System.out.println(Totaltext);
					
					
				}
				
				
///////////////////////**************For each method**********************//////////////////////////////////						

//		for(WebElement el:allLink) {
//			
//			System.out.println(el.getText());
//		}
				
				
	}

}
