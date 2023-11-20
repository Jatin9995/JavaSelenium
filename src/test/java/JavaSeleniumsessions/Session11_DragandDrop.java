package JavaSeleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Session11_DragandDrop {

	public static void main(String[] args) {

		//Launch Chrome browser
				System.setProperty("webdriver.chrome.driver", "C:\\chromedrive\\crome\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();

				//maximize window
				driver.manage().window().maximize();

				//to wait untill webelements load
				//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				//Launch webpage--http://https://demoqa.com/buttons/
				driver.navigate().to("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

				//We need to make an object of source & target webelement to save the retun web element
		WebElement source=driver.findElement(By.id("box6"));
		WebElement target=driver.findElement(By.id("box106"));

		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).build().perform();

		
		
	}

}
