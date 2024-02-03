package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Email_Report {
	@Test
	public void TC1_URL() {
		Reporter.log("running TC1_URL",true);
	}
	@Test
	public void TC2_Login() {
		Reporter.log("running TC2_Login",true);
	}
	@Test
	public void TC3_UserID() {
		Reporter.log("running TC3_UserID",true);
	}
	@Test
	public void TC4_LoginBtn() {
		Reporter.log("running TC4_LoginBtn",true);
	}
	
	
	

}
