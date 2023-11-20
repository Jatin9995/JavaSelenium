package JavaSeleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session15_Howtohandletooltip {

	public static void main(String[] args) {

		// A tooltip is a text that appear when a mouse hover over an object/web element on a webpage.
				//the object/webelement can be a link, an image, a button, a text area etc.
			//The tooltip text often give more information about the object/web element on which the user hovers over the mouse cursor.
			
				System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
	
				driver.manage().window().maximize();
				driver.navigate().to("https://testautomationpractice.blogspot.com/");
				
				
				//we have taken the input box webelement location and used get attribute to capture the title bcoz title is a tooltip msg showing in inut box.
		String attribute = driver.findElement(By.xpath("//input[@id='age']")).getAttribute("title");//actual attribute
		String expectedtooltip = "We ask for your age only for statistical purposes.";
				
				if(attribute.equals(expectedtooltip)) {
					
					System.out.println("Tootltip is verified");
					}
				else {
					System.out.println("Tooltip is not verified");
				}
		
	}

}
