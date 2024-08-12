package TestNG;

import org.testng.annotations.Test;

public class TimeOut {
	//test cases run alphabetically by order
		//description parameter is used to display additional information about testcases
		@Test(description="Test Case ONE")
		
		
		public void TC01()
		{
			System.out.println("Mobile Login Testcase");
		}
		
		//@Test(description="this is testcase2")
		//at that time our test case is failure b'caz they need more time than 200ms.
		@Test(timeOut=200)	
		public void TC02() {
			try{
			Thread.sleep(400);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
				
				System.out.println("Web Login Testcase");
				
			}
		@Test(description="TEST CASE THREE")
		
			public void TC03()
			{
				System.out.println("API Login Testcase");
				
			}
	}
