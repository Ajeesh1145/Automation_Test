package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TEST_NG_Annotations {
	//test cases run alphabetically by order
		//description parameter is used to display additional information about testcases
		@Test(description="this is testcase1")
		
		
		public void testcase1()
		{
			System.out.println("Mobile Login Testcase");
		}
		@Test(description="this is testcase2")
			public void testcase2()
			{
				System.out.println("Web Login Testcase");
				
			}
		@Test(description="this is testcase3")
		
			public void testcase3()
			{
				System.out.println("API Login Testcase");
				
			}
	}
