package core.coverageTable;

import java.util.ArrayList;

import core.RiskAnalysisObject;


public class CoverageTable {
    
	
	class CoverageLink{
	  RiskAnalysisObject coveredObject;
	  RiskAnalysisObject coveringObject;
	  
	public CoverageLink(RiskAnalysisObject coveredObject,
			RiskAnalysisObject coveringObject) {
		super();
		this.coveredObject = coveredObject;
		this.coveringObject = coveringObject;
	}

	public RiskAnalysisObject getCoveredObject() {
		return coveredObject;
	}

	public RiskAnalysisObject getCoveringObject() {
		return coveringObject;
	}
	  
	  
	}
	
	ArrayList<CoverageLink> coverageTable = new ArrayList<CoverageLink>();
	
	public void addCoverage(RiskAnalysisObject coveredObject,RiskAnalysisObject coveringObject){
		CoverageLink newLink = new CoverageLink(coveredObject,coveringObject);
		this.coverageTable.add(newLink);
	}
	
	public boolean isCovered(RiskAnalysisObject coveredObject){
		for (CoverageLink link: this.coverageTable){
			if (link.getCoveredObject().equals(coveredObject)){
				return true;
			}
		}
		return false;
	}

	public ArrayList<RiskAnalysisObject> getListOfCoveredObject(RiskAnalysisObject coveringObject) {
		ArrayList<RiskAnalysisObject> result = new ArrayList<RiskAnalysisObject>();
		for (CoverageLink link: this.coverageTable){
			if (link.coveringObject.equals(coveringObject)){
				if (link.coveredObject.isEnabled()){
				  result.add(link.getCoveredObject());
				}
			}
		}
		return result;
	}

	public ArrayList<RiskAnalysisObject> listOfObjectCovering(
			RiskAnalysisObject coveredObject) {
		ArrayList<RiskAnalysisObject> result = new ArrayList<RiskAnalysisObject>();
		for (CoverageLink link: this.coverageTable){
			if (link.getCoveredObject().equals(coveredObject)){
				if (link.getCoveringObject().isEnabled()){
				  result.add(link.getCoveringObject());
				}
			}
		}
		return result;
	}
	
	
}
