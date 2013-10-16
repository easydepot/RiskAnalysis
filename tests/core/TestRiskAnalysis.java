package core;

import junit.framework.Assert;

import org.junit.Test;


import core.asset.Functionnality;
import core.threat.Threat;

public class TestRiskAnalysis {

	@Test
	public void test_BienEssentiel() {
		RiskAnalysis p = new RiskAnalysis();
		Functionnality b =  new Functionnality("identifiant");
		p.addBienEssentiel(b);
		Assert.assertEquals(1,p.getNumberOfBienEssentiel());
		Assert.assertEquals(b, p.getBienEssentiel(0));
	}
	
	@Test
	public void test_add_Functionality() {
		RiskAnalysis p = new RiskAnalysis();
		Functionnality b =  new Functionnality("identifiant");
		p.addBienEssentiel(b);
		Assert.assertEquals(1,p.getNumberOfBienEssentiel());
		Assert.assertEquals(b, p.getBienEssentiel(0));
	}
	
	@Test
	public void test_addThreat(){
		RiskAnalysis p = new RiskAnalysis();
		Threat t = new Threat();
		p.addThreat(t);
		Assert.assertTrue(p.listeMenaceBienEssentiel.contains(t));
	}
	
	
	@Test
	public void test_searchContreMesure_unknown() {
		RiskAnalysis p = new RiskAnalysis();
	
		Assert.assertNull(p.searchContreMesure("unknown"));
		Assert.assertNull(p.searchNewContreMesure("unknown"));
	}
	
	

}
