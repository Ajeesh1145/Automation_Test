package TestNG;

import org.testng.annotations.Test;

public class TestNG_GroupAttribute {
@Test(groups="Software Company")

public void infosys()
{
	System.out.println("Infosys");
}

@Test(groups="Software Company")
public void Wipro()
{
	System.out.println("Wipro");
}
@Test(groups="Automobile")
public void Maruti()
{
	System.out.println("Maruti");
}
@Test(groups="Automobile")
public void Tata()
{
	System.out.println("Tata");
}

}

