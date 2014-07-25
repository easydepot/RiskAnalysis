package core.securityObjective;

import java.util.ArrayList;

import core.RiskAnalysisObject;
import core.printing.BasicElement;
import core.printing.SimpleText;

public class SecurityObjective extends RiskAnalysisObject {
	public SecurityObjective(String id2) {
		super(id2);
		
	}

	//String id;
	BasicElement description;
	private ArrayList<SecurityObjective> listSubObjective = new ArrayList<SecurityObjective>();
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BasicElement getDescription() {
		return description;
	}
	public void setDescription(BasicElement description) {
		this.description = description;
	}
	
	public void setDescription(String description) {
		this.description = new SimpleText(description);
	}
	
	public void add(SecurityObjective newSecurityObjective) throws Exception{
		if (newSecurityObjective.id == null){
			throw new Exception("Error: try to add a new SecurityObjective without id");
		}
		if (newSecurityObjective.description == null){
			throw new Exception("Error: try to add a new SecurityObjective without description");
		}
		this.listSubObjective.add(newSecurityObjective);
	}
	
	public ArrayList<SecurityObjective> getListSubObjective() {
		ArrayList<SecurityObjective> list = new ArrayList<SecurityObjective>();
		list.addAll(listSubObjective);
		return list;
	}
	@Override
	public String getFullId() {
		return "O."+this.getFullId();
	}

}
