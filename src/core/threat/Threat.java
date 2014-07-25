package core.threat;

import core.RiskAnalysisObject;

public class Threat extends RiskAnalysisObject{

	public Threat(String id2) {
		super(id2);
	}

	@Override
	public String getFullId() {
		return "T"+this.getId();
	}

	

}
