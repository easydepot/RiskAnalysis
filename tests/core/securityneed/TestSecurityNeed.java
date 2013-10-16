package core.securityneed;

import junit.framework.Assert;

import org.junit.Test;

import core.securityneed.SecurityNeed;

public class TestSecurityNeed {

	@Test
	public void test_Constructor() {
		SecurityNeed need = new SecurityNeed("integrity");
		Assert.assertEquals("integrity", need.getValue());
	}

}
