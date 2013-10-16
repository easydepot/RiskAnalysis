package core.asset;

import junit.framework.Assert;

import org.junit.Test;

public class TestSystemDescription {

	@Test
	public void test_Constructor() {
		SystemDescription system = new SystemDescription();
		Assert.assertNotNull(system);
	}
	
	@Test
	public void test_assetListEmpty_after_Constructor() {
		SystemDescription system = new SystemDescription();
		system.getAssetList().isEmpty();		
	}
	
	@Test
	public void test_that_an_asset_can_be_added(){
		SystemDescription system = new SystemDescription();
		Asset asset = new Asset("ident");
		system.addAsset(asset);
		Assert.assertEquals(1, system.getAssetList().size());
	}
	
	
	@Test
	public void test_that_list_asset_is_well_encapsulated(){
		SystemDescription system = new SystemDescription();
		Asset asset = new Asset("ident");
		system.getAssetList().add(asset);
		Assert.assertEquals(0, system.getAssetList().size());

	}
	
	@Test
	public void test_that_a_disable_asset_is_not_returned_in_the_list_of_assets(){
		SystemDescription system = new SystemDescription();
		Asset asset = new Asset("ident");
		asset.disable();
		system.addAsset(asset);
		Assert.assertEquals(0, system.getAssetList().size());

	}
	
	@Test
	public void test_functionlist_is_empty_after_Constructor() {
		SystemDescription system = new SystemDescription();
		Assert.assertTrue(system.getFunctionalityList().isEmpty());		
	}
	
	SystemDescription system;
	
	@Test
	public void test_functionlist_addFunctionality() {
	    givenASystemWithAFunctionnality();
	    Assert.assertFalse(system.getFunctionalityList().isEmpty());		
	}
	
	@Test
	public void test_addFunctionality_size() {
	    givenASystemWithAFunctionnality();
	    Assert.assertEquals(1, system.getFunctionalityList().size());		
	}

	private void givenASystemWithAFunctionnality() {
		system = new SystemDescription();
		Functionnality f = new Functionnality("ID");
		system.addFunctionnality(f);
	}

}
