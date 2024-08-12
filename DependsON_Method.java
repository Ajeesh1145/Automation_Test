package TestNG;

import org.testng.annotations.Test;

public class DependsON_Method {
	//test cases run alphabetically by order
		//description parameter is used to display additional information about test cases
		//@Test(description="this is testcase1")
		
		@Test()
		//if depends on multiple test cases
		//@Test(dependsOnMethods= {"testcase2",“testcase3”})
		/*here testcase1 is depends on testcase2.so testcase2is executed first then
		execute testcase1.if in testcase2 occur any error then testcase1 is also failure*/ 
		public void TC01()
		{
			System.out.println("Mobile Login Testcase");
		}
		
		@Test(dependsOnMethods= {"TC03"})
		//at that time our test case is failure b'caz they need more time than 200ms.
		//@Test(timeOut=200)	
		public void TC02() {
		
				System.out.println("Web Login Testcase");
				
			}
		@Test
		
			public void TC03()
			{
				System.out.println("API Login Testcase");
				
			}
	}
