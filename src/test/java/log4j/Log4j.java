package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j {

	public static void main(String[] args) {

		Logger log=Logger.getLogger("Log4j");
		PropertyConfigurator.configure("J:\\eclipse_Jdrive\\JavaSelenium\\Logger_folder\\log.properties");
		System.out.println("This is loggerdemo...");
		log.info("this is a information test");
		log.fatal("This is a fatal test");
		log.warn("This is for the warning test");
				
		
	}

}
