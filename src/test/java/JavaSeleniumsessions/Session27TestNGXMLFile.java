package JavaSeleniumsessions;

import org.testng.annotations.Test;

public class Session27TestNGXMLFile {
	
	 //Third way of setting the priority. Convert the class into suit and under method set include ketword to set the priority

		//you can run multiple classes and under multiple classes you can set the priority of the methods using keyword include.
		
		@Test    
		public void homepage() {
			System.out.println("Home-Page");
		}

		@Test
		public void searchpage() {
			System.out.println("Searc-Page");
		}

		@Test
		public void loginpage() {
			System.out.println("Login-Page");
		}

		@Test
		public void bookingpage() {
			System.out.println("Booking-Page");
		}

		@Test
		public void paymentpage() {
			System.out.println("Payment-Page");
		}

}
