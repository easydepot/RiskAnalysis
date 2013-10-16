package core.securityneed;


import junit.framework.Assert;

import org.junit.Test;



public class TestOrigin {

	
	@Test
	public void test_getValue() throws Exception {
		Origin origin = new Origin();
		Assert.assertEquals("origin authentication", origin.getValue());
	}
}
