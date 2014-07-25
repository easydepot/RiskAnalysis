package core.asset;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import core.RiskAnalysisObject;
import core.TestRiskAnalysisObject;
import core.securityneed.Origin;

public class TestAsset extends TestRiskAnalysisObject {

	@Before
	public void setUp() throws Exception {
		sut = new Asset("id");
	}
	
	Asset sut;
	
	
	@Test
	public void test_Asset() {
		RiskAnalysisObject bs = new Asset("identifiant");
		Assert.assertNotNull(bs);
	}
	
	@Test
	public void test_that_an_Asset_shall_be_enabled_by_default() {
		RiskAnalysisObject bs = new Asset("identifiant");
		Assert.assertTrue(bs.isEnabled());
	}
	
	
	
	@Test
	public void test_that_an_Asset_may_be_disabled() {
		RiskAnalysisObject bs = new Asset("identifiant");
		bs.disable();
		Assert.assertFalse(bs.isEnabled());
	}
	
	@Test
	public void test_Asset_enabled() {
		RiskAnalysisObject bs = new Asset("identifiant");
		Assert.assertTrue(bs.isEnabled());
	}
	
	@Test
	public void test_Asset_functionShallNotBeNull() {
		Asset bs = new Asset("identifiant");
		Assert.assertNotNull(bs.getListeBienEssentiels());
		
	}
	
	
	@Test
	public void test_Asset_securityNeedShallNotBeNull() {
		Asset bs = new Asset("identifiant");
		Assert.assertNotNull(bs.getListOfSecurityNeed());
	}
	
	@Test
	public void test_Asset_addSecurityNeed() {
		Asset bs = new Asset("identifiant");
		Origin o = new Origin();
		bs.addSecurityNeed(o);
		Assert.assertEquals(o, bs.getListOfSecurityNeed().get(0));
	}
	
	@Test
	public void test_Asset_listOfSecurityNeedEncapsulationd() {
		Asset bs = new Asset("identifiant");
		Origin o = new Origin();
		bs.getListOfSecurityNeed().add(o);
		Assert.assertEquals(0, bs.getListOfSecurityNeed().size());
	}
	
	
	
}
