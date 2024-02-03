package Assertion_;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals {
	@Test
	public void assertEquals() {
		
		String actResult = "Ajeesh";
		String expResult = "Ajeesh";
		
	Assert.assertEquals(actResult, expResult,"Failed: act & Exp results are diff:");
		
	}

}
