package core;

import java.util.Vector;


public class RiskAnalysisObject {
	Tags tags = new Tags();
	EbiosConfig config;
	Vector<EbiosWarning> warnings = new Vector<EbiosWarning>();
	private boolean enable = true;
	protected String id = "";
	protected String description;
	
	
	
	
	
	public boolean add(EbiosWarning e) {
		return warnings.add(e);
	}




	public int sizeWarning() {
		return warnings.size();
	}
	




	public EbiosWarning getWarning(int index) {
		return warnings.get(index);
	}




	public EbiosConfig getConfig() {
		return config;
	}




	public void setConfig(EbiosConfig config) {
		this.config = config;
	}




	public boolean belongToConfig(){
		// if no config, all object accepted.
		if (config==null){return true;}
		if (config.isEmpty()){return true;}
		
		// exclude all object with at least one tag in the excluded list.
		for (int i = 0; i < this.tags.tags.size();i++){
			if (config.isExcluded(this.tags.tags.get(i))){return false;};
		}
		for (int i = 0; i < config.tags.tags.size();i++){
			
			if ( hasTag(config.tags.tags.get(i))){
				return true;
			}
		}
		return false;
	}
	
	
	public String getTag(int i){
		return this.tags.getTag(i);
	}
	
	public String printTags(){
		String result ="";
		for (int i = 0; i < this.tags.tags.size();i++){
			result += this.getTag(i) + " ";
		}
		return result;
	}
	
	public boolean hasTag(String tag){
		return this.tags.hasTag(tag);
	}
	
	public boolean isEnabled() {
		return enable;
	}




	public void addTag(String tag){
		this.tags.addTag(tag);
	}




	public void disable() {
	  enable = false;	
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}


}
