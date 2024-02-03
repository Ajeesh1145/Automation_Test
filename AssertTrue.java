package Assertion_;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
	@Test
	public void assertTrue() {
		boolean actResult = false;
		
		Assert.assertTrue(actResult, "Failed-act Result is false");
	}

}
