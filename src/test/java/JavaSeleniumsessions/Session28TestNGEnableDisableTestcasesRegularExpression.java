package JavaSeleniumsessions;

import org.testng.annotations.Test;

public class Session28TestNGEnableDisableTestcasesRegularExpression {
	
	//in TestNg,test cases can be enable & disabled in two ways.
			//disable test case in @Test annotations:- (enabled=false)
			//disable test cases in XML fileL- <exclude name="method name"/>
			
			//Regular expression:- means if you want to run a method with the starting word then regular expression is used.
			//ex:- for MobileLoginPerfonalLoan write code:- <include name="Mobile.*"></include>
			
			@Test(enabled=false)
			public void WebloginPerfonalLoan() {
				System.out.println("Web login Perfonal Loan");
			}
			
			@Test
			public void MobileLoginPerfonalLoan() {
				System.out.println("Mobile Login Perfonal Loan");
			}
			
			
			@Test
			public void ApiloginPerfonalLoan() {
				System.out.println("Api login Perfonal Loan");
			}

			@Test
			public void MobileloginAutomobileLoan() {
				System.out.println("Mobile login Automobile Loan");
			}
			
			
			@Test
			public void WebloginAutomobileLoan() {
				System.out.println("Web login Automobile Loan");
			
			}

			@Test
			public void ApiloginAutomobileLoan() {
				System.out.println("Api login Automobile Loan");
		}



}
