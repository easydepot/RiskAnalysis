package core.asset;

import core.RiskAnalysisObject;
import core.printing.BasicElement;
import core.printing.SimpleText;

public class Functionnality extends RiskAnalysisObject {

	String name = "";
	String detailedDescription = "";

	public Functionnality(String name) {
		super(name);
	}

	

	public String getDetailedDescription() {
		return detailedDescription;
	}

	public void setDetailedDescription(String detailedDescription) {
		this.detailedDescription = detailedDescription;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BasicElement getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = new SimpleText(description);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
