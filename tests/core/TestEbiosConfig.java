package core;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEbiosConfig {
	
	private static final String TAG1 = "TAG1";
	EbiosConfig sut;

	@Before
	public void setUp() throws Exception {
		sut = new EbiosConfig();
	}
	
	
	@Test
	public void test_isEmpty_returns_true_when_no_configuration_is_done(){
		Assert.assertTrue(sut.isEmpty());
	}
	
	@Test
	public void test_isEmpty_returns_false_when_at_least_one_tag_is_excluded(){
		sut.addExcludedTag(TAG1);
		Assert.assertFalse(sut.isEmpty());
	}

}
