package Assertion_;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals {
	@Test
	public void assertNotEqual() {
		String actResult = "AjeeshCP";
		String expResult = "AjeeshCP";
		
		Assert.assertEquals(actResult, expResult,"Failed-Both Results are same");
	}

}
