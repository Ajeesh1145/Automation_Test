package TestNG;

import org.testng.annotations.Test;

public class TestNG_Priority {
	//test cases run alphabetically by order
		//description parameter is used to display additional information about test cases
		//@Test(description="this is testcase1")
		
		@Test(priority=2)//range between -5000 to 5000
		public void TC01()
		{
			System.out.println("Mobile Login Testcase");
		}
		
		@Test(priority=3)
		//at that time our test case is failure b'caz they need more time than 200ms.
		//@Test(timeOut=200)	
		public void TC02() {
			try{
			Thread.sleep(400);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
				System.out.println("Web Login Testcase");
			}
		@Test(priority=1)
		
			public void TC03()
			{
				System.out.println("API Login Testcase");
				
			}
	}

