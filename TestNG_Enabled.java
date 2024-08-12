package TestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNG_Enabled {
	
	@Test(enabled=false)

	//if TC001 skipped for execution

	public void TC001()
	{
		System.out.println("Mobile Login Testcase");
	}
	
	@Test	
	public void TC002() {
		
			System.out.println("Web Login Testcase");
		}
	@Test
	public void TC003()
	{
			System.out.println("API Login Testcase");
			Assert.assertTrue(false);
		}
}

