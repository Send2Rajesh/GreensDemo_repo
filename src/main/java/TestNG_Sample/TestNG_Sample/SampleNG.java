package TestNG_Sample.TestNG_Sample;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleNG {

	@Test
	private void test() {
		String a="Hello Worl";
		String b="Hello World";
		
		Assert.assertEquals(a,b);
		
	}
	
	
}
