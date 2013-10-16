package core.coverageTable;

import org.junit.Assert;
import org.junit.Test;

import core.RiskAnalysisObject;
import core.coverageTable.CoverageTable;


public class TestCoverageTable {
	
	@Test
	public void test_Asset_is_covered_return_true_when_object_is_in_the_coverage_table() {
		CoverageTable table = new CoverageTable();
		RiskAnalysisObject coveringObject = new RiskAnalysisObject();
		RiskAnalysisObject coveredObject = new RiskAnalysisObject();
		table.addCoverage(coveredObject, coveringObject);
		Assert.assertTrue(table.isCovered(coveredObject));
		
	}
	
	@Test
	public void test_Asset_is_covered_return_false_when_object_is_not_in_the_coverage_table() {
		CoverageTable table = new CoverageTable();
		RiskAnalysisObject coveredObject = new RiskAnalysisObject();
		Assert.assertFalse(table.isCovered(coveredObject));
		
	}
	
	@Test
	public void test_listOfCovered_return_non_null_object() {
		CoverageTable table = new CoverageTable();
		Assert.assertNotNull(table.getListOfCoveredObject(null));
		
	}
	
	@Test
	public void test_listOfCovered_return_emptyList() {
		CoverageTable table = new CoverageTable();
		Assert.assertEquals(0,table.getListOfCoveredObject(null).size());
		
	}
	
	@Test
	public void test_listOfCovered_return_nonEmptyList_when_an_object_is_covered() {
		CoverageTable table = new CoverageTable();
		RiskAnalysisObject coveredObject = new RiskAnalysisObject();
		RiskAnalysisObject coveringObject = new RiskAnalysisObject();
		table.addCoverage(coveredObject, coveringObject);
		Assert.assertEquals(1,table.getListOfCoveredObject(coveringObject).size());
		
	}
	
	@Test
	public void test_listOfCovered_return_EmptyList_when_an_object_is_not_covered() {
		CoverageTable table = new CoverageTable();
		RiskAnalysisObject coveredObject = new RiskAnalysisObject();
		RiskAnalysisObject coveringObject = new RiskAnalysisObject();
		RiskAnalysisObject objectNotInTheTable = new RiskAnalysisObject();
		table.addCoverage(coveredObject, coveringObject);
		Assert.assertEquals(0,table.getListOfCoveredObject(objectNotInTheTable).size());
		
	}
	
	@Test
	public void test_listOfObjectCovering_return_EmptyList_when_an_object_is_not_covered() {
		CoverageTable table = new CoverageTable();
		RiskAnalysisObject coveredObject = new RiskAnalysisObject();
		RiskAnalysisObject coveringObject = new RiskAnalysisObject();
		RiskAnalysisObject objectNotInTheTable = new RiskAnalysisObject();
		table.addCoverage(coveredObject, coveringObject);
		Assert.assertEquals(0,table.listOfObjectCovering(objectNotInTheTable).size());
		
	}
	
	@Test
	public void test_listOfObjectCovering_return_list_of_covering_Object_when_an_object_is_covered() {
		CoverageTable table = new CoverageTable();
		RiskAnalysisObject coveredObject = new RiskAnalysisObject();
		RiskAnalysisObject coveringObject = new RiskAnalysisObject();
		table.addCoverage(coveredObject, coveringObject);
		Assert.assertEquals(1,table.listOfObjectCovering(coveredObject).size());
		Assert.assertEquals(coveringObject,table.listOfObjectCovering(coveredObject).get(0));
	}



}