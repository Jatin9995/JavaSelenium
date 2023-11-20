package JavaSeleniumsessions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class Session38_Log4j {
	
	
	@Test
	public void setuplog() {
		
		//logging means hamare system ne during runtime kaise behave kiya,uske input ko, output ko, uska record ek seperate file me rakhna jisko hum post executing
		//analyse kar sakte hai.
		
	//Log4j:-Log4j is a logging framework which is written in java.It is an open source logging API for java.
		
		
		Logger log=Logger.getLogger("setuplog");  //object of logger created
		PropertyConfigurator.configure("J:\\eclipse_Jdrive\\JavaSelenium\\Logger_folder\\log.properties"); //Path given of the log property file
		System.out.println("This is logger demo...");
		log.info("this is a information test");
		log.fatal("This is a fatal test");
		log.notify();
		log.debug("This is for debug test");
		log.warn("This is for the warning test");
		
		
	}
	

	
	
}
