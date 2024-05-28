package JavaSeleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session15_Howtohandletooltip {

	public static void main(String[] args) {

		// A tooltip is a text that appear when a mouse hover over an object/web element on a webpage.
				//the object/webelement can be a link, an image, a button, a text area etc.
			//The tooltip text often give more information about the object/web element on which the user hovers over the mouse cursor.
			
				System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome119\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
	
				driver.manage().window().maximize();
				driver.navigate().to("https://demo.opencart.com/");
				
				
				//we have taken the input box webelement location and used get attribute to capture the title bcoz title is a tooltip msg showing in inut box.
		String attribute = driver.findElement(By.xpath("//img[@title='Your Store']")).getAttribute("title");
		String expectedtooltip = "Your Store";
		
				
		System.out.println(" Tooltips:- " + attribute);
		
				if(attribute.equals(expectedtooltip)) {
					
					System.out.println("Tootltip is verified");
					}
				else {
					System.out.println("Tooltip is not verified");
				}
	driver.close();	
	}

}
