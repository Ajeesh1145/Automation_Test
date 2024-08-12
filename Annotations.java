package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeClass()
	
	public void beforeClass() {
		System.out.println("Before Class...");
	}
	
	@AfterClass()
	public void afterClass() {
		System.out.println("After Class...");
	}
@BeforeMethod()

public void beforeMetd() {
	System.out.println("Before Method...");
}
@AfterMethod()

public void AfterMetd() {
	System.out.println("After Method...");
}
@Test
public void TC1() {
	System.out.println("This is First Test");
}
@Test
public void TC2() {
	System.out.println("This is Second Test");
}
}