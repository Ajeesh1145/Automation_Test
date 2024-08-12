package TestNG;

import org.testng.annotations.*;

public class TestNG_Parameters{

	@Test
	@Parameters ({"Ajeesh","Mahesh"})
	
	public void add(int a,int b)
	{
		System.out.println("Addition="+ (a+b));
	}
	@Test
	@Parameters ({"Ajeesh","Mahesh"})
	public void sub(int a,int b)
	{
		System.out.println("subtraction=" + (a-b));
	}
	
	@Test
	@Parameters({"Ajeesh","Mahesh"})
	
	public void multi(int a,int b)
	{
		System.out.println("multiplication="+ (a*b));
	}
	
}
