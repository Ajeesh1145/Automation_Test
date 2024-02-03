package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethod_ {
	@Test
	public void login()
	{
	Reporter.log("running Login TC",true);
	}
	@Test(dependsOnMethods="login") public void logout()
	{
	Reporter.log("running Logout TC",true);
	}
}
