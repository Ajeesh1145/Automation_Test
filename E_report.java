package EmailableReport;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class E_report {
	@Test
	public void TC1()	//1 test case or 1 test method
	{
	Reporter.log("running TC1",true);
	}

	@Test
	public void TC2()	//1 test case or 1 test method
	{
	Reporter.log("running TC2",true);
	}

	@Test
	public void TC3()	//1 test case or 1 test method
	{
	Reporter.log("running TC3",true);

}
}
