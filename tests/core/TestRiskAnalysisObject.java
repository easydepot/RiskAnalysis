package core;


import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class TestRiskAnalysisObject {
	
	
	private static final String TAG2 = "TAG2";
	private static final String TAG = "TAG";
	private static final String ID = "ID";
	private static final String DESCRIPTION = "DESCRIPTION";
	RiskAnalysisObject sut;

	@Before
	public void setUp() throws Exception {
		sut = new RiskAnalysisObject("id");
	}
	
	
	@Test
	public void test_addEbiosWarning_test_size() {
		sut.add(new EbiosWarning());
		Assert.assertEquals(1, sut.sizeWarning());		
	}
	
	@Test
	public void test_addEbiosWarning_test_getWarning() {
		EbiosWarning e =new EbiosWarning();
		sut.add(e);
		Assert.assertEquals(e, sut.getWarning(0));		
	}
	
	@Test
	public void test_setConfig(){
		givenARiskAnalysisWithEmptyConfig();
		Assert.assertEquals(config,sut.getConfig());
	}
	

	@Test
	public void test_setDescription(){
		
		sut.setDescription(DESCRIPTION);
		Assert.assertEquals(DESCRIPTION,sut.getDescription());
	}
	
	@Test
	public void test_isEnabledbyDefault(){
		Assert.assertTrue(sut.isEnabled());
	}
	
	@Test
	public void test_disable(){
		sut.disable();
		Assert.assertFalse(sut.isEnabled());
	}
	
	@Test
	public void test_setID(){
		sut.setId(ID);
		Assert.assertEquals(ID,sut.getId());
	}
	
	@Test
	public void test_addTag_hasTag_return_true_when_tag_is_present(){
		sut.addTag(TAG);
		Assert.assertTrue(sut.hasTag(TAG));
	}
	
	@Test
	public void test_addTag_hasTag_return_false_when_tag_is_not_present(){
		sut.addTag(TAG);
		Assert.assertFalse(sut.hasTag(TAG2));
	}
	
	@Test
	public void test_getTag(){
		sut.addTag(TAG);
		Assert.assertEquals(TAG,sut.getTag(0));
	}
	
	@Test
	public void test_printTagEmpty(){
		Assert.assertEquals("",sut.printTags());
	}
	
	@Test
	public void test_printTagOneTag(){
		sut.addTag(TAG);
		Assert.assertEquals(TAG+" ",sut.printTags());
	}
	
	@Test
	public void test_printTagSeveralTags(){
		sut.addTag(TAG);
		sut.addTag(TAG2);
		Assert.assertEquals(TAG+" "+TAG2+" ",sut.printTags());
	}
	
	@Test
	public void test_belongToConfig_when_no_config_specified(){
		Assert.assertTrue(sut.belongToConfig());
	}
	
	EbiosConfig config;
	
	@Test
	public void test_belongToConfig_when_empty_config_specified(){
		givenARiskAnalysisWithEmptyConfig();
		Assert.assertTrue(sut.belongToConfig());
	}
	
	@Test
	public void test_belongToConfig_when_config_with_excluded_tag_specified(){
		givenARiskAnalysisWithEmptyConfig();
		config.addExcludedTag(TAG);
		Assert.assertTrue(sut.belongToConfig());
	}

	
	private void givenARiskAnalysisWithEmptyConfig() {
		config = new EbiosConfig();
		sut.setConfig(config);
	}
	
	

}
