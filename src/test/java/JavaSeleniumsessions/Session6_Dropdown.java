package JavaSeleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Session6_Dropdown {

	public static void main(String[] args) {

		//Launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrive\\crome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Launch opencart.com
		driver.navigate().to("https://www.opencart.com/");
		
		//Click on regiter
		driver.findElement(By.xpath("//div[@id='common-home']/preceding::a[1]")).click();
		
		//create object of Select class for dropdown
		Select Dropdown=new Select(driver.findElement(By.id("input-country")));
		
		//Select by visible text
		//Dropdown.selectByVisibleText("Algeria");
		
		//Select by index
//	Dropdown.selectByIndex(4);
		
		//Select by Value
		Dropdown.selectByValue("98");

		
		
		//ismultiple method is used to check if we are able to select multiple options or not. ismultiple method retun true or false.
		if(Dropdown.isMultiple()==true) {
			System.out.println("Dropdown is multiple");
		}
		else {
			System.out.println("Dropdown is not multiple");
		}
		
		//to print the list of webelements in dropdown we use getOption() method
		List<WebElement> alldropdownlist=Dropdown.getOptions();
		
		
		
		//to know the count of options available in dropdown, use .size() method
		System.out.println("The count of options: " + alldropdownlist.size());
		
		for(int i=0;i<alldropdownlist.size();i++) {
			
		String Countiesname=alldropdownlist.get(i).getText();
		System.out.println(Countiesname);
			
			
		}
		
		
		//for printing create variable and use getText() to print and for each method
//		for(WebElement el:alldropdownlist) {
//			System.out.println(el.getText());
//		}
		
	
		

		
		
	}

}
