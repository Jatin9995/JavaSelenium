package JavaSeleniumsessions;

import org.testng.annotations.Test;

public class Session30TestAnnotationsAttributesPracticalDemonstration {
	
	//description attributes. We use this to give additional information about the test case,
	
		@Test(description="This is test case1")
		public void testCase1() {
			System.out.println("Mobile login testcase");
		}	
		
		//timeOut attribute- if any test case take time then the normal test case then we use timeOut attribute where we issue some 
		//time to that particular case . if its run within that timeframe then pass the test case else fail it and move to next test case execution.
		//for ex:- if its run within 200 mili seconds then it will pass else it will fail.
		
		//@Test(description="This is test case2")
		
		
		@Test (timeOut=2000, priority = 2)
		public void testCase2() {
			
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("Web login testcase");
		}
	//priority already know how to set.
		//dependsOnMethods already know how to set syntax:- @Test(dependsOnMethods="method name")
		//use enabled=false to skip the execution of any test case.
		//groups attribute already know ho to set.
		
		@Test(description="This is test case3", priority = 3)
		public void testcase3() {
			System.out.println("API login testcase");
		}

}
