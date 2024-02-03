package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout_{
	@Test(timeOut=5000,invocationCount=5) public void TC1() throws InterruptedException
	{
	Thread.sleep(4000); Reporter.log("running TC1",true);
	}
}
