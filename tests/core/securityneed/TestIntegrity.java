package core.securityneed;

import junit.framework.Assert;

import org.junit.Test;

import core.securityneed.Integrity;
import core.securityneed.SecurityNeed;

public class TestIntegrity {

	@Test
	public void test_Constructor() {
		SecurityNeed need = new Integrity();
		Assert.assertEquals("integrity", need.getValue());
	}

}
